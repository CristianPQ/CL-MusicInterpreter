/**
 * Copyright (c) 2011, Jordi Cortadella
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *    * Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *    * Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *    * Neither the name of the <organization> nor the
 *      names of its contributors may be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import javax.sound.midi.*;

/** Class that implements the interpreter of the language. */

public class Interp {

    /** Memory of the virtual machine. */
    private Stack Stack;

    /**
     * Map between function names (keys) and ASTs (values).
     * Each entry of the map stores the root of the AST
     * correponding to the function.
     */
    private HashMap<String,AslTree> FuncName2Tree;

    /** Standard input of the interpreter (System.in). */
    private Scanner stdin;

    /**
     * Stores the line number of the current statement.
     * The line number is used to report runtime errors.
     */
    private int linenumber = -1;

    /** File to write the trace of function calls. */
    private PrintWriter trace = null;

    /** Nested levels of function calls. */
    private int function_nesting = -1;
    
    /**
     * Constructor of the interpreter. It prepares the main
     * data structures for the execution of the main program.
     */
    public Interp(AslTree T, String tracefile) {
        assert T != null;
        MapFunctions(T);  // Creates the table to map function names into AST nodes
        PreProcessAST(T); // Some internal pre-processing ot the AST
        Stack = new Stack(); // Creates the memory of the virtual machine
        // Initializes the standard input of the program
        stdin = new Scanner (new BufferedReader(new InputStreamReader(System.in)));
        if (tracefile != null) {
            try {
                trace = new PrintWriter(new FileWriter(tracefile));
            } catch (IOException e) {
                System.err.println(e);
                System.exit(1);
            }
        }
        function_nesting = -1;
    }

    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        executeFunction ("main", null);
    }

    /** Returns the contents of the stack trace */
    public String getStackTrace() {
        return Stack.getStackTrace(lineNumber());
    }

    /** Returns a summarized contents of the stack trace */
    public String getStackTrace(int nitems) {
        return Stack.getStackTrace(lineNumber(), nitems);
    }
    
    /**
     * Gathers information from the AST and creates the map from
     * function names to the corresponding AST nodes.
     */
    private void MapFunctions(AslTree T) {
        assert T != null && T.getType() == AslLexer.LIST_FUNCTIONS;
        FuncName2Tree = new HashMap<String,AslTree> ();
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) {
            AslTree f = T.getChild(i);
            assert f.getType() == AslLexer.FUNC;
            String fname = f.getChild(0).getText();
            if (FuncName2Tree.containsKey(fname)) {
                throw new RuntimeException("Multiple definitions of function " + fname);
            }
            FuncName2Tree.put(fname, f);
        } 
    }

    /**
     * Performs some pre-processing on the AST. Basically, it
     * calculates the value of the literals and stores a simpler
     * representation. See AslTree.java for details.
     */
    private void PreProcessAST(AslTree T) {
        if (T == null) return;
        switch(T.getType()) {
            case AslLexer.INT: T.setIntValue(); break;
            case AslLexer.DOUBLE: T.setDoubleValue(); break;
            case AslLexer.STRING: T.setStringValue(); break;
            case AslLexer.BOOLEAN: T.setBooleanValue(); break;
            default: break;
        }
        int n = T.getChildCount();
        for (int i = 0; i < n; ++i) PreProcessAST(T.getChild(i));
    }

    /**
     * Gets the current line number. In case of a runtime error,
     * it returns the line number of the statement causing the
     * error.
     */
    public int lineNumber() { return linenumber; }

    /** Defines the current line number associated to an AST node. */
    private void setLineNumber(AslTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    private void setLineNumber(int l) { linenumber = l;}
    
    /**
     * Executes a function.
     * @param funcname The name of the function.
     * @param args The AST node representing the list of arguments of the caller.
     * @return The data returned by the function.
     */
    private Data executeFunction (String funcname, AslTree args) {
        // Get the AST of the function
        AslTree f = FuncName2Tree.get(funcname);
        if (f == null) throw new RuntimeException(" function " + funcname + " not declared");

        // Gather the list of arguments of the caller. This function
        // performs all the checks required for the compatibility of
        // parameters.
        ArrayList<Data> Arg_values = listArguments(f, args);

        // Dumps trace information (function call and arguments)
        if (trace != null) traceFunctionCall(f, Arg_values);
        
        // List of parameters of the callee
        AslTree p = f.getChild(1);
        int nparam = p.getChildCount(); // Number of parameters

        // Create the activation record in memory
        Stack.pushActivationRecord(funcname, lineNumber());

        // Track line number
        setLineNumber(f);
         
        // Copy the parameters to the current activation record
        for (int i = 0; i < nparam; ++i) {
            String param_name = p.getChild(i).getText();
            Stack.defineVariable(param_name, Arg_values.get(i));
        }

        // Execute the instructions
        Data result = executeListInstructions (f.getChild(2));

        // If the result is null, then the function returns void
        if (result == null) result = new Data();
        
        // Dumps trace information
        if (trace != null) traceReturn(f, result, Arg_values);
        
        // Destroy the activation record
        Stack.popActivationRecord();

        return result;
    }

    /**
     * Executes a block of instructions. The block is terminated
     * as soon as an instruction returns a non-null result.
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the block of instructions.
     * @return The data returned by the instructions (null if no return
     * statement has been executed).
     */
    private Data executeListInstructions (AslTree t) {
        assert t != null;
        Data result = null;
        int ninstr = t.getChildCount();
        for (int i = 0; i < ninstr; ++i) {
            result = executeInstruction (t.getChild(i));
            if (result != null) return result;
        }
        return null;
    }
    
    /**
     * Executes an instruction. 
     * Non-null results are only returned by "return" statements.
     * @param t The AST of the instruction.
     * @return The data returned by the instruction. The data will be
     * non-null only if a return statement is executed or a block
     * of instructions executing a return.
     */
    private Data executeInstruction (AslTree t) {
        assert t != null;
        
        setLineNumber(t);
        Data value; // The returned value

        int channel = 0; // 0 is a piano, 9 is percussion, other channels are for other instruments

        int volume = 127; // between 0 et 127
        int duration = 1000; // in milliseconds

        // A big switch for all type of instructions
        switch (t.getType()) {
            case AslLexer.PLAY:
                //System.out.println("IN PLAY");

                if (t.getChildCount() == 2) {
                    System.out.println("note + duration");

                    Data noteData = evaluateExpression(t.getChild(0));
                
                    Data auxDo = new Data(Stack.getVariable("do"));

                    double auxNoteData = auxDo.getDoubleValue() + noteData.getDoubleValue();

                    noteData.setValue(auxNoteData);

                    //System.out.println("before duration");
                    Data durationData = evaluateExpression(t.getChild(1));
                    //System.out.println(durationData.getDoubleValue());

                    System.out.println("    NOTE");
                    System.out.println("    " + noteData.toString());
                    System.out.println("    DURATION");
                    System.out.println("    " + durationData.toString());
                    try {
                        Synthesizer synth = MidiSystem.getSynthesizer();
                        synth.open();
                        MidiChannel[] channels = synth.getChannels();

                        channels[channel].noteOn( 60 + ((int)(noteData.getDoubleValue() * 2)), volume ); // C note
                        Thread.sleep( (int)(duration *(durationData.getDoubleValue())));



                        synth.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                    
                } else if (t.getChildCount() == 1) {
                    //System.out.println("COMPAS");
                    value = evaluateExpression(t.getChild(0));

                    String[] compasArray = value.toString().split(",");

                    try {
                        Synthesizer synth = MidiSystem.getSynthesizer();
                        synth.open();
                        MidiChannel[] channels = synth.getChannels();


                        for (int i = 0; i < compasArray.length; i=i+2) {
                            int j = i+1;
                            //System.out.println(compasArray[i]);
                            //System.out.println(compasArray[j]);
                            double auxDouble = getNoteValue(compasArray[i]);

                            Data durationData = new Data(Stack.getVariable(compasArray[j]));

                            System.out.println("note + duration");
                            System.out.println("    NOTE");
                            System.out.print("    ");
                            System.out.println(auxDouble);
                            System.out.println("    DURATION");
                            System.out.println("    " + durationData.toString());

                            //System.out.print("Note value: ");
                            //System.out.println(auxDouble);

                            channels[channel].noteOn( 60 + ((int)(auxDouble * 2)), volume ); // C note
                            Thread.sleep( (int)(duration *(durationData.getDoubleValue())));
                        }

                        synth.close();
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }

                    

                    return null;
                }

                
			
			case AslLexer.COMPAS:

                int numFills = t.getChildCount();
				String nom = t.getChild(0).getText();
				int num = (evaluateExpression(t.getChild(1))).getIntegerValue();
				int den = (evaluateExpression(t.getChild(2))).getIntegerValue();
				String comp = "";
				String tempNote = "";
				if(den == 1) tempNote = "rodona";
				if(den == 2) tempNote = "blanca";
				if(den == 4) tempNote = "negra";
				if(den == 8) tempNote = "corxera";
				if(den == 16) tempNote = "semicorxera";

				
				double compasValue = (Stack.getVariable(tempNote)).getDoubleValue();
				compasValue *= num;
				boolean first = true;
				for(int i = 3; (i < numFills);i++){
						checkCompass(compasValue, t.getChild(i));	
					if(first){
						comp = comp + obtainCompasString(t.getChild(i));
						first = false;
					}
					else comp = comp + ',' + obtainCompasString(t.getChild(i));
				}
				value = new Data(comp);
				Stack.defineVariable(nom, value);
				return null;
			
            case AslLexer.ASSIGNNOTE:
                //System.out.println("ASSIGNNOTE");


                Data aux = evaluateExpression(t.getChild(0));

                
                //System.out.println(aux.toString());

                value = evaluateExpression(t.getChild(1));

                
                
                if (value.isInteger()) {
                    double auxVal = (double) value.getIntegerValue();
                    value.setValue(auxVal);
                }

                double auxFinalValue = value.getDoubleValue() - aux.getDoubleValue();
                

                value.setValue(auxFinalValue);
                Stack.defineVariable ("do", value);
                //System.out.println(value.getDoubleValue());



                return null;
			//Assignment of a Duration
			case AslLexer.ASSIGNDURATION:
				value = evaluateExpression(t.getChild(1));
				double valueRodona;
				if(value.isInteger()) valueRodona = (double) value.getIntegerValue();
				else valueRodona = value.getDoubleValue();

				String note = t.getChild(0).getText();
				if(note.equals("blanca")){
					valueRodona *=2;
				}
				else if(note.equals("negra")){
					valueRodona *=4;
				}
				else if(note.equals("corxera")){
					valueRodona *=8;
				}
				else if(note.equals("semicorxera")){
					valueRodona *=16;
				}
				Data temp = new Data(valueRodona);
				Data tempb = new Data(valueRodona / 2);
				Data tempn = new Data(valueRodona / 4);
				Data tempc = new Data(valueRodona / 8);
				Data tempsc = new Data(valueRodona / 16);
				
				Stack.defineVariable ("rodona", temp);
				Stack.defineVariable ("blanca", tempb);
				Stack.defineVariable ("negra", tempn);
				Stack.defineVariable ("corxera", tempc);
				Stack.defineVariable ("semicorxera", tempsc);
				
				//System.out.println("Rodona: " + (Stack.getVariable("rodona")).getDoubleValue());
				//System.out.println("Blanca: " +(Stack.getVariable("blanca")).getDoubleValue());
				//System.out.println("Negra: " +(Stack.getVariable("negra")).getDoubleValue());
				//System.out.println("Corxera: " +(Stack.getVariable("corxera")).getDoubleValue());
				//System.out.println("SemiCorxera: " +(Stack.getVariable("semicorxera")).getDoubleValue());
				//System.out.println("----------------------------------------------------------------");
				
				return null;
            // Assignment
            case AslLexer.ASSIGN:
                value = evaluateExpression(t.getChild(1));
                Stack.defineVariable (t.getChild(0).getText(), value);
                return null;

            // If-then-else
            case AslLexer.IF:
                value = evaluateExpression(t.getChild(0));
                checkBoolean(value);
                if (value.getBooleanValue()) return executeListInstructions(t.getChild(1));
                // Is there else statement ?
                if (t.getChildCount() == 3) return executeListInstructions(t.getChild(2));
                return null;

            // While
            case AslLexer.WHILE:
                while (true) {
                    value = evaluateExpression(t.getChild(0));
                    checkBoolean(value);
                    if (!value.getBooleanValue()) return null;
                    Data r = executeListInstructions(t.getChild(1));
                    if (r != null) return r;
                }

            // Return
            case AslLexer.RETURN:
                if (t.getChildCount() != 0) {
                    return evaluateExpression(t.getChild(0));
                }
                return new Data(); // No expression: returns void data

            // Read statement: reads a variable and raises an exception
            // in case of a format error.
            case AslLexer.READ:
                String token = null;
                Data val = new Data(0);;
                try {
                    token = stdin.next();
                    val.setValue(Integer.parseInt(token)); 
                } catch (NumberFormatException ex) {
                    throw new RuntimeException ("Format error when reading a number: " + token);
                }
                Stack.defineVariable (t.getChild(0).getText(), val);
                return null;

            // Write statement: it can write an expression or a string.
            case AslLexer.WRITE:
                AslTree v = t.getChild(0);
                //System.out.println("IN WRITE");
                // Special case for strings
                if (v.getType() == AslLexer.STRING) {
                    System.out.format(v.getStringValue());
                    return null;
                }
                if (v.getType() == AslLexer.NOTE) {
                    //System.out.println("IN WRITE NOTE");

                    Data auxAux = evaluateExpression(v);

                    Data preAuxDo = new Data(Stack.getVariable("do"));

                    Double auxDo = preAuxDo.getDoubleValue();

                    auxAux.setValue(auxAux.getDoubleValue() + auxDo);

                    System.out.println(auxAux.toString());
                    return null;
                }

                // Write an expression
                System.out.println(evaluateExpression(v).toString());
                return null;

            // Function call
            case AslLexer.FUNCALL:
                executeFunction(t.getChild(0).getText(), t.getChild(1));
                return null;

            default: assert false; // Should never happen
        }

        // All possible instructions should have been treated.
        assert false;
        return null;
    }

    /**
     * Evaluates the expression represented in the AST t.
     * @param t The AST of the expression
     * @return The value of the expression.
     */
     
    private Data evaluateExpression(AslTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        int type = t.getType();

        Data value = null;
        // Atoms
        switch (type) {
            // A variable
            case AslLexer.ID:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            case AslLexer.NOTE:
                //System.out.println("IN NOTE");
                double aux = 0;
                if (t.getChildCount() == 1) {

                    //System.out.println("child child value");
                    //System.out.println(t.getChild(0).getChild(0).getText());

                    Data dataAux = evaluateExpression(t.getChild(0));

                    if (dataAux.isInteger()) {
                        double auxAux = (double) dataAux.getIntegerValue();
                        dataAux.setValue(auxAux);
                        
                    }

                    aux = dataAux.getDoubleValue();
                    //System.out.print("aux value: ");
                    //System.out.println(aux);
                }

                String auxStr = t.getText();
                String auxStr2 = auxStr.substring(1);
                //System.out.println(auxStr2);
                //System.out.println("child 1 ");
                double auxFinalValue = 0;
                //System.out.println(value.getDoubleValue());

                switch(auxStr2) {
                    case "re":
                        auxFinalValue = auxFinalValue +1;
                        break;
                    case "mi":
                        auxFinalValue = auxFinalValue +2;
                        break;
                    case "fa":
                        auxFinalValue = auxFinalValue +2.5;
                        break;
                    case "sol":
                        auxFinalValue = auxFinalValue +3.5;
                        break;
                    case "la":
                        auxFinalValue = auxFinalValue +4.5;
                        break;
                    case "si":
                        auxFinalValue = auxFinalValue +5.5;
                        break;
                    default:
                        break;
                }

                

                auxFinalValue = auxFinalValue + (6*aux);

                value = new Data(auxFinalValue);
                //System.out.println(value.getDoubleValue());
                break;
            case AslLexer.DURATION:
                value = new Data(Stack.getVariable(t.getText()));
                break;
            
            // An integer literal
            case AslLexer.INT:
                value = new Data(t.getIntValue());
                break;
            // An double literal
            case AslLexer.DOUBLE:
                value = new Data(t.getDoubleValue());
                break;
            // A Boolean literal
            case AslLexer.BOOLEAN:
                value = new Data(t.getBooleanValue());
                break;
            case AslLexer.STRING:
				value = new Data(t.getStringValue());
				break;
            
            // A function call. Checks that the function returns a result.
            case AslLexer.FUNCALL:
                value = executeFunction(t.getChild(0).getText(), t.getChild(1));
                assert value != null;
                if (value.isVoid()) {
                    throw new RuntimeException ("function expected to return a value");
                }
                break;
            default: break;
        }

        // Retrieve the original line and return
        if (value != null) {
            setLineNumber(previous_line);
            return value;
        }
        
        // Unary operators
        value = evaluateExpression(t.getChild(0));
        if (t.getChildCount() == 1) {
            switch (type) {
                case AslLexer.PLUS:
                    checkNumeric(value);
                    break;
                case AslLexer.MINUS:
                    checkNumeric(value);
                    value.setValue(-value.getIntegerValue());
                    break;
                case AslLexer.NOT:
                    checkBoolean(value);
                    value.setValue(!value.getBooleanValue());
                    break;
                default: assert false; // Should never happen
            }
            setLineNumber(previous_line);
            return value;
        }

        // Two operands
        Data value2;
        switch (type) {
            // Relational operators
            case AslLexer.EQUAL:
            case AslLexer.NOT_EQUAL:
            case AslLexer.LT:
            case AslLexer.LE:
            case AslLexer.GT:
            case AslLexer.GE:
                value2 = evaluateExpression(t.getChild(1));
                if (value.getType() != value2.getType()) {
                  throw new RuntimeException ("Incompatible types in relational expression");
                }
                value = value.evaluateRelational(type, value2);
                break;

            // Arithmetic operators
            case AslLexer.PLUS:
            case AslLexer.MINUS:
            case AslLexer.MUL:
            case AslLexer.DIV:
            case AslLexer.MOD:
                value2 = evaluateExpression(t.getChild(1));
                checkNumeric(value); checkNumeric(value2);
                value.evaluateArithmetic(type, value2);
                break;

            // Boolean operators
            case AslLexer.AND:
            case AslLexer.OR:
                // The first operand is evaluated, but the second
                // is deferred (lazy, short-circuit evaluation).
                checkBoolean(value);
                value = evaluateBoolean(type, value, t.getChild(1));
                break;

            default: assert false; // Should never happen
        }
        
        setLineNumber(previous_line);
        return value;
    }
    
    /**
     * Evaluation of Boolean expressions. This function implements
     * a short-circuit evaluation. The second operand is still a tree
     * and is only evaluated if the value of the expression cannot be
     * determined by the first operand.
     * @param type Type of operator (token).
     * @param v First operand.
     * @param t AST node of the second operand.
     * @return An Boolean data with the value of the expression.
     */
    private Data evaluateBoolean (int type, Data v, AslTree t) {
        // Boolean evaluation with short-circuit

        switch (type) {
            case AslLexer.AND:
                // Short circuit if v is false
                if (!v.getBooleanValue()) return v;
                break;
        
            case AslLexer.OR:
                // Short circuit if v is true
                if (v.getBooleanValue()) return v;
                break;
                
            default: assert false;
        }

        // Return the value of the second expression
        v = evaluateExpression(t);
        checkBoolean(v);
        return v;
    }

    /** Checks that the data is Boolean and raises an exception if it is not. */
    private void checkBoolean (Data b) {
        if (!b.isBoolean()) {
            throw new RuntimeException ("Expecting Boolean expression");
        }
    }
    
    /** Checks that the data is integer and raises an exception if it is not. */
    private void checkInteger (Data b) {
        if (!b.isInteger()) {
            throw new RuntimeException ("Expecting numerical(Int) expression");
        }
    }
    
    private void checkDouble (Data b){
		if(!b.isDouble()){
			throw new RuntimeException ("Expecting numerical(Double) expression");
		}
	}
	
	private void checkNumeric(Data b){
		if(!b.isDouble() && !b.isInteger()){
			throw new RuntimeException ("Expecting numerical expression");
		}
	}
    
    private String obtainCompasString(AslTree t){
		String result = "";
		int numChild = t.getChildCount();
		for(int i = 0; i < numChild; i++){			
			result += (t.getChild(i)).getText();
			if((t.getChild(i)).getChildCount() > 0) result += ((t.getChild(i)).getChild(0)).getText();
			if(i + 1 < numChild)result += ',';
		}
		return result; 
	}
   
	private void checkCompass(double numComp, AslTree t){
		int numChild = t.getChildCount();
		double acum=0;
		boolean wrong = false;
		for(int i = 1; i < numChild; i=i+2){
			String note = (t.getChild(i)).getText();
			acum += (Stack.getVariable(note)).getDoubleValue();
			if(acum > numComp)  throw new RuntimeException ("Compas is not correct composed");
			else if (numComp - acum < 0.00001) wrong = false; //Java no multiplica be Ex: 2.2 * 3 = 6.60000005
			else wrong = true;
		}		
		if(wrong) throw new RuntimeException ("Compas is not correct composed");
		
	}
    

    /**
     * Gathers the list of arguments of a function call. It also checks
     * that the arguments are compatible with the parameters. In particular,
     * it checks that the number of parameters is the same and that no
     * expressions are passed as parametres by reference.
     * @param AstF The AST of the callee.
     * @param args The AST of the list of arguments passed by the caller.
     * @return The list of evaluated arguments.
     */
     
    private ArrayList<Data> listArguments (AslTree AstF, AslTree args) {
        if (args != null) setLineNumber(args);
        AslTree pars = AstF.getChild(1);   // Parameters of the function
        
        // Create the list of parameters
        ArrayList<Data> Params = new ArrayList<Data> ();
        int n = pars.getChildCount();

        // Check that the number of parameters is the same
        int nargs = (args == null) ? 0 : args.getChildCount();
        if (n != nargs) {
            throw new RuntimeException ("Incorrect number of parameters calling function " +
                                        AstF.getChild(0).getText());
        }

        // Checks the compatibility of the parameters passed by
        // reference and calculates the values and references of
        // the parameters.
        for (int i = 0; i < n; ++i) {
            AslTree p = pars.getChild(i); // Parameters of the callee
            AslTree a = args.getChild(i); // Arguments passed by the caller
            setLineNumber(a);
            if (p.getType() == AslLexer.PVALUE) {
                // Pass by value: evaluate the expression
                Params.add(i,evaluateExpression(a));
            } else {
                // Pass by reference: check that it is a variable
                if (a.getType() != AslLexer.ID) {
                    throw new RuntimeException("Wrong argument for pass by reference");
                }
                // Find the variable and pass the reference
                Data v = Stack.getVariable(a.getText());
                Params.add(i,v);
            }
        }
        return Params;
    }

    /**
     * Writes trace information of a function call in the trace file.
     * The information is the name of the function, the value of the
     * parameters and the line number where the function call is produced.
     * @param f AST of the function
     * @param arg_values Values of the parameters passed to the function
     */
    private void traceFunctionCall(AslTree f, ArrayList<Data> arg_values) {
        function_nesting++;
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");

        // Print function name and parameters
        trace.print(f.getChild(0) + "(");
        for (int i = 0; i < nargs; ++i) {
            if (i > 0) trace.print(", ");
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PREF) trace.print("&");
            trace.print(p.getText() + "=" + arg_values.get(i));
        }
        trace.print(") ");
        
        if (function_nesting == 0) trace.println("<entry point>");
        else trace.println("<line " + lineNumber() + ">");
    }

    /**
     * Writes the trace information about the return of a function.
     * The information is the value of the returned value and of the
     * variables passed by reference. It also reports the line number
     * of the return.
     * @param f AST of the function
     * @param result The value of the result
     * @param arg_values The value of the parameters passed to the function
     */
    private void traceReturn(AslTree f, Data result, ArrayList<Data> arg_values) {
        for (int i=0; i < function_nesting; ++i) trace.print("|   ");
        function_nesting--;
        trace.print("return");
        if (!result.isVoid()) trace.print(" " + result);
        
        // Print the value of arguments passed by reference
        AslTree params = f.getChild(1);
        int nargs = params.getChildCount();
        for (int i = 0; i < nargs; ++i) {
            AslTree p = params.getChild(i);
            if (p.getType() == AslLexer.PVALUE) continue;
            trace.print(", &" + p.getText() + "=" + arg_values.get(i));
        }
        
        trace.println(" <line " + lineNumber() + ">");
        if (function_nesting < 0) trace.close();
    }



    private double getNoteValue(String strToParse) {

        //System.out.println("In getNoteValue");
        //System.out.println(strToParse);
        double aux = 0;

        char auxNum = strToParse.charAt(strToParse.length()-1);

        if (Character.isDigit(auxNum)) {
            aux = (double) Character.digit(auxNum, 10);
            strToParse = strToParse.substring(0, strToParse.length()-1);

            char auxSig = strToParse.charAt(strToParse.length()-1);
            if (auxSig == '-') {
                aux *= -1.0;
            }
        }
        String auxStr2 = strToParse.substring(1);

        //System.out.println(auxStr2);

        //System.out.println(auxStr2);
        //System.out.println("child 1 ");
        double auxFinalValue = 0;
        //System.out.println(value.getDoubleValue());

        switch(auxStr2) {
            case "re":
                auxFinalValue = auxFinalValue +1;
                break;
            case "mi":
                auxFinalValue = auxFinalValue +2;
                break;
            case "fa":
                auxFinalValue = auxFinalValue +2.5;
                break;
            case "sol":
                auxFinalValue = auxFinalValue +3.5;
                break;
            case "la":
                auxFinalValue = auxFinalValue +4.5;
                break;
            case "si":
                auxFinalValue = auxFinalValue +5.5;
                break;
            default:
                break;
        }

        
        auxFinalValue = auxFinalValue + (6*aux);

        Data auxDo = new Data(Stack.getVariable("do"));

        if (auxDo.isDouble()) {
            auxFinalValue += auxDo.getDoubleValue();
        }
        return auxFinalValue;
    }
}
