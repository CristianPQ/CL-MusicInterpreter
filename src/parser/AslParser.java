// $ANTLR 3.4 /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 10:11:28

package parser;
import interp.AslTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


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
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ASSIGNDURATION", "ASSIGNNOTE", "BOOLEAN", "CLOSEC", "COMMENT", "COMPAS", "DIV", "DO", "DOUBLE", "DP", "DURATION", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINICOMPAS", "MINUS", "MOD", "MUL", "NOT", "NOTE", "NOT_EQUAL", "OPENC", "OR", "PARAMS", "PLAY", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ASSIGNDURATION=7;
    public static final int ASSIGNNOTE=8;
    public static final int BOOLEAN=9;
    public static final int CLOSEC=10;
    public static final int COMMENT=11;
    public static final int COMPAS=12;
    public static final int DIV=13;
    public static final int DO=14;
    public static final int DOUBLE=15;
    public static final int DP=16;
    public static final int DURATION=17;
    public static final int ELSE=18;
    public static final int ENDFUNC=19;
    public static final int ENDIF=20;
    public static final int ENDWHILE=21;
    public static final int EQUAL=22;
    public static final int ESC_SEQ=23;
    public static final int FALSE=24;
    public static final int FUNC=25;
    public static final int FUNCALL=26;
    public static final int GE=27;
    public static final int GT=28;
    public static final int ID=29;
    public static final int IF=30;
    public static final int INT=31;
    public static final int LE=32;
    public static final int LIST_FUNCTIONS=33;
    public static final int LIST_INSTR=34;
    public static final int LT=35;
    public static final int MINICOMPAS=36;
    public static final int MINUS=37;
    public static final int MOD=38;
    public static final int MUL=39;
    public static final int NOT=40;
    public static final int NOTE=41;
    public static final int NOT_EQUAL=42;
    public static final int OPENC=43;
    public static final int OR=44;
    public static final int PARAMS=45;
    public static final int PLAY=46;
    public static final int PLUS=47;
    public static final int PREF=48;
    public static final int PVALUE=49;
    public static final int READ=50;
    public static final int RETURN=51;
    public static final int STRING=52;
    public static final int THEN=53;
    public static final int TRUE=54;
    public static final int WHILE=55;
    public static final int WRITE=56;
    public static final int WS=57;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AslParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AslParser.tokenNames; }
    public String getGrammarFileName() { return "/home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final AslParser.prog_return prog() throws RecognitionException {
        AslParser.prog_return retval = new AslParser.prog_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EOF2=null;
        AslParser.func_return func1 =null;


        AslTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:8: ( func )+ EOF
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:8: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog191);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog194);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 63:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:63:21: ^( LIST_FUNCTIONS ( func )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:67:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
    public final AslParser.func_return func() throws RecognitionException {
        AslParser.func_return retval = new AslParser.func_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token ENDFUNC7=null;
        AslParser.params_return params5 =null;

        AslParser.block_instructions_return block_instructions6 =null;


        AslTree FUNC3_tree=null;
        AslTree ID4_tree=null;
        AslTree ENDFUNC7_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:67:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:67:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func233); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func236); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func238);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func240);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func242); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,59,FOLLOW_59_in_params261);  
            stream_59.add(char_literal8);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==58) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params263);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,60,FOLLOW_60_in_params266);  
            stream_60.add(char_literal10);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 71:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:71:41: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:75:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:75:10: ( param ( ',' ! param )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:75:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist292);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:75:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==61) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:75:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,61,FOLLOW_61_in_paramlist295); 

            	    pushFollow(FOLLOW_param_in_paramlist298);
            	    param13=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param13.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==58) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,58,FOLLOW_58_in_param323);  
                    stream_58.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param327);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 80:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:26: ^( PREF[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:81:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param350);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 81:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:81:22: ^( PVALUE[$id,$id.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:85:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:86:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:86:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions384);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:86:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==62) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:86:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,62,FOLLOW_62_in_block_instructions387);  
            	    stream_62.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions389);
            	    instruction17=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction17.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 87:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:87:16: ^( LIST_INSTR ( instruction )+ )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:91:1: instruction : ( play | assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.play_return play18 =null;

        AslParser.assignnote_return assignnote19 =null;

        AslParser.assignduration_return assignduration20 =null;

        AslParser.assign_return assign21 =null;

        AslParser.ite_stmt_return ite_stmt22 =null;

        AslParser.while_stmt_return while_stmt23 =null;

        AslParser.funcall_return funcall24 =null;

        AslParser.return_stmt_return return_stmt25 =null;

        AslParser.read_return read26 =null;

        AslParser.write_return write27 =null;



        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:92:9: ( play | assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=11;
            switch ( input.LA(1) ) {
            case PLAY:
                {
                alt6=1;
                }
                break;
            case NOTE:
                {
                alt6=2;
                }
                break;
            case DURATION:
                {
                alt6=3;
                }
                break;
            case ID:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==EQUAL) ) {
                    alt6=4;
                }
                else if ( (LA6_4==59) ) {
                    alt6=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=5;
                }
                break;
            case WHILE:
                {
                alt6=6;
                }
                break;
            case RETURN:
                {
                alt6=8;
                }
                break;
            case READ:
                {
                alt6=9;
                }
                break;
            case WRITE:
                {
                alt6=10;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 62:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:92:11: play
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_play_in_instruction438);
                    play18=play();

                    state._fsp--;

                    adaptor.addChild(root_0, play18.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:93:11: assignnote
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignnote_in_instruction450);
                    assignnote19=assignnote();

                    state._fsp--;

                    adaptor.addChild(root_0, assignnote19.getTree());

                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:94:11: assignduration
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignduration_in_instruction472);
                    assignduration20=assignduration();

                    state._fsp--;

                    adaptor.addChild(root_0, assignduration20.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:96:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction487);
                    assign21=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign21.getTree());

                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:97:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction499);
                    ite_stmt22=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:98:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction519);
                    while_stmt23=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:99:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction539);
                    funcall24=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall24.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:100:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction560);
                    return_stmt25=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:101:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction577);
                    read26=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read26.getTree());

                    }
                    break;
                case 10 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:102:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction602);
                    write27=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write27.getTree());

                    }
                    break;
                case 11 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:104:9: 
                    {
                    root_0 = (AslTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID28=null;
        AslParser.expr_return expr29 =null;


        AslTree eq_tree=null;
        AslTree ID28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:10: ID eq= EQUAL expr
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_assign662);  
            stream_ID.add(ID28);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign666);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign668);
            expr29=expr();

            state._fsp--;

            stream_expr.add(expr29.getTree());

            // AST REWRITE
            // elements: ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 109:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:30: ^( ASSIGN[$eq,\":=\"] ID expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class assignnote_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignnote"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:1: assignnote : note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) ;
    public final AslParser.assignnote_return assignnote() throws RecognitionException {
        AslParser.assignnote_return retval = new AslParser.assignnote_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.note_return note30 =null;

        AslParser.expr_return expr31 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:13: ( note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:17: note eq= EQUAL expr
            {
            pushFollow(FOLLOW_note_in_assignnote699);
            note30=note();

            state._fsp--;

            stream_note.add(note30.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignnote703);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignnote705);
            expr31=expr();

            state._fsp--;

            stream_expr.add(expr31.getTree());

            // AST REWRITE
            // elements: expr, note
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 112:36: -> ^( ASSIGNNOTE[$eq,\":=\"] note expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:39: ^( ASSIGNNOTE[$eq,\":=\"] note expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGNNOTE, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_note.nextTree());

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignnote"


    public static class assignduration_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignduration"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:1: assignduration : DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) ;
    public final AslParser.assignduration_return assignduration() throws RecognitionException {
        AslParser.assignduration_return retval = new AslParser.assignduration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token DURATION32=null;
        AslParser.expr_return expr33 =null;


        AslTree eq_tree=null;
        AslTree DURATION32_tree=null;
        RewriteRuleTokenStream stream_DURATION=new RewriteRuleTokenStream(adaptor,"token DURATION");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:15: ( DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:17: DURATION eq= EQUAL expr
            {
            DURATION32=(Token)match(input,DURATION,FOLLOW_DURATION_in_assignduration732);  
            stream_DURATION.add(DURATION32);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignduration736);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignduration738);
            expr33=expr();

            state._fsp--;

            stream_expr.add(expr33.getTree());

            // AST REWRITE
            // elements: DURATION, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 115:40: -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:43: ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ASSIGNDURATION, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, 
                stream_DURATION.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignduration"


    public static class exprmus_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprmus"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:1: exprmus : ( note ',' ! DURATION DP !)* ( note ',' ! DURATION ) ;
    public final AslParser.exprmus_return exprmus() throws RecognitionException {
        AslParser.exprmus_return retval = new AslParser.exprmus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal35=null;
        Token DURATION36=null;
        Token DP37=null;
        Token char_literal39=null;
        Token DURATION40=null;
        AslParser.note_return note34 =null;

        AslParser.note_return note38 =null;


        AslTree char_literal35_tree=null;
        AslTree DURATION36_tree=null;
        AslTree DP37_tree=null;
        AslTree char_literal39_tree=null;
        AslTree DURATION40_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:8: ( ( note ',' ! DURATION DP !)* ( note ',' ! DURATION ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:10: ( note ',' ! DURATION DP !)* ( note ',' ! DURATION )
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:10: ( note ',' ! DURATION DP !)*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NOTE) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==INT) ) {
                        int LA7_2 = input.LA(3);

                        if ( (LA7_2==61) ) {
                            int LA7_3 = input.LA(4);

                            if ( (LA7_3==DURATION) ) {
                                int LA7_4 = input.LA(5);

                                if ( (LA7_4==DP) ) {
                                    alt7=1;
                                }


                            }


                        }


                    }
                    else if ( (LA7_1==61) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==DURATION) ) {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==DP) ) {
                                alt7=1;
                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:11: note ',' ! DURATION DP !
            	    {
            	    pushFollow(FOLLOW_note_in_exprmus768);
            	    note34=note();

            	    state._fsp--;

            	    adaptor.addChild(root_0, note34.getTree());

            	    char_literal35=(Token)match(input,61,FOLLOW_61_in_exprmus770); 

            	    DURATION36=(Token)match(input,DURATION,FOLLOW_DURATION_in_exprmus773); 
            	    DURATION36_tree = 
            	    (AslTree)adaptor.create(DURATION36)
            	    ;
            	    adaptor.addChild(root_0, DURATION36_tree);


            	    DP37=(Token)match(input,DP,FOLLOW_DP_in_exprmus775); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:36: ( note ',' ! DURATION )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:37: note ',' ! DURATION
            {
            pushFollow(FOLLOW_note_in_exprmus781);
            note38=note();

            state._fsp--;

            adaptor.addChild(root_0, note38.getTree());

            char_literal39=(Token)match(input,61,FOLLOW_61_in_exprmus783); 

            DURATION40=(Token)match(input,DURATION,FOLLOW_DURATION_in_exprmus786); 
            DURATION40_tree = 
            (AslTree)adaptor.create(DURATION40)
            ;
            adaptor.addChild(root_0, DURATION40_tree);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exprmus"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF41=null;
        Token THEN43=null;
        Token ELSE45=null;
        Token ENDIF47=null;
        AslParser.expr_return expr42 =null;

        AslParser.block_instructions_return block_instructions44 =null;

        AslParser.block_instructions_return block_instructions46 =null;


        AslTree IF41_tree=null;
        AslTree THEN43_tree=null;
        AslTree ELSE45_tree=null;
        AslTree ENDIF47_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF41=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt798); 
            IF41_tree = 
            (AslTree)adaptor.create(IF41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF41_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt801);
            expr42=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr42.getTree());

            THEN43=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt803); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt806);
            block_instructions44=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions44.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:47: ELSE ! block_instructions
                    {
                    ELSE45=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt809); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt812);
                    block_instructions46=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions46.getTree());

                    }
                    break;

            }


            ENDIF47=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt816); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE48=null;
        Token DO50=null;
        Token ENDWHILE52=null;
        AslParser.expr_return expr49 =null;

        AslParser.block_instructions_return block_instructions51 =null;


        AslTree WHILE48_tree=null;
        AslTree DO50_tree=null;
        AslTree ENDWHILE52_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE48=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt839); 
            WHILE48_tree = 
            (AslTree)adaptor.create(WHILE48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE48_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt842);
            expr49=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr49.getTree());

            DO50=(Token)match(input,DO,FOLLOW_DO_in_while_stmt844); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt847);
            block_instructions51=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions51.getTree());

            ENDWHILE52=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt849); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN53=null;
        AslParser.expr_return expr54 =null;


        AslTree RETURN53_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:13: ( RETURN ^ ( expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN53=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt872); 
            RETURN53_tree = 
            (AslTree)adaptor.create(RETURN53)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN53_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOUBLE||LA9_0==DURATION||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==59) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt875);
                    expr54=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr54.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class read_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:140:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ55=null;
        Token ID56=null;

        AslTree READ55_tree=null;
        AslTree ID56_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:140:6: ( READ ^ ID )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:140:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ55=(Token)match(input,READ,FOLLOW_READ_in_read894); 
            READ55_tree = 
            (AslTree)adaptor.create(READ55)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ55_tree, root_0);


            ID56=(Token)match(input,ID,FOLLOW_ID_in_read897); 
            ID56_tree = 
            (AslTree)adaptor.create(ID56)
            ;
            adaptor.addChild(root_0, ID56_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE57=null;
        Token STRING59=null;
        AslParser.expr_return expr58 =null;


        AslTree WRITE57_tree=null;
        AslTree STRING59_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:7: ( WRITE ^ ( expr | STRING ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE57=(Token)match(input,WRITE,FOLLOW_WRITE_in_write917); 
            WRITE57_tree = 
            (AslTree)adaptor.create(WRITE57)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE57_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOUBLE||LA10_0==DURATION||LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==59) ) {
                alt10=1;
            }
            else if ( (LA10_0==STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write921);
                    expr58=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr58.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:26: STRING
                    {
                    STRING59=(Token)match(input,STRING,FOLLOW_STRING_in_write925); 
                    STRING59_tree = 
                    (AslTree)adaptor.create(STRING59)
                    ;
                    adaptor.addChild(root_0, STRING59_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "write"


    public static class expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR61=null;
        AslParser.boolterm_return boolterm60 =null;

        AslParser.boolterm_return boolterm62 =null;


        AslTree OR61_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:9: ( boolterm ( OR ^ boolterm )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr950);
            boolterm60=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm60.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:23: OR ^ boolterm
            	    {
            	    OR61=(Token)match(input,OR,FOLLOW_OR_in_expr953); 
            	    OR61_tree = 
            	    (AslTree)adaptor.create(OR61)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR61_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr956);
            	    boolterm62=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm62.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND64=null;
        AslParser.boolfact_return boolfact63 =null;

        AslParser.boolfact_return boolfact65 =null;


        AslTree AND64_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:9: ( boolfact ( AND ^ boolfact )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm976);
            boolfact63=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact63.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:23: AND ^ boolfact
            	    {
            	    AND64=(Token)match(input,AND,FOLLOW_AND_in_boolterm979); 
            	    AND64_tree = 
            	    (AslTree)adaptor.create(AND64)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND64_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm982);
            	    boolfact65=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact65.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL67=null;
        Token NOT_EQUAL68=null;
        Token LT69=null;
        Token LE70=null;
        Token GT71=null;
        Token GE72=null;
        AslParser.num_expr_return num_expr66 =null;

        AslParser.num_expr_return num_expr73 =null;


        AslTree EQUAL67_tree=null;
        AslTree NOT_EQUAL68_tree=null;
        AslTree LT69_tree=null;
        AslTree LE70_tree=null;
        AslTree GT71_tree=null;
        AslTree GE72_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1002);
            num_expr66=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr66.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt13=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt13=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LT:
                        {
                        alt13=3;
                        }
                        break;
                    case LE:
                        {
                        alt13=4;
                        }
                        break;
                    case GT:
                        {
                        alt13=5;
                        }
                        break;
                    case GE:
                        {
                        alt13=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:24: EQUAL ^
                            {
                            EQUAL67=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1006); 
                            EQUAL67_tree = 
                            (AslTree)adaptor.create(EQUAL67)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL67_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL68=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1011); 
                            NOT_EQUAL68_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL68)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL68_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:46: LT ^
                            {
                            LT69=(Token)match(input,LT,FOLLOW_LT_in_boolfact1016); 
                            LT69_tree = 
                            (AslTree)adaptor.create(LT69)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT69_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:52: LE ^
                            {
                            LE70=(Token)match(input,LE,FOLLOW_LE_in_boolfact1021); 
                            LE70_tree = 
                            (AslTree)adaptor.create(LE70)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE70_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:58: GT ^
                            {
                            GT71=(Token)match(input,GT,FOLLOW_GT_in_boolfact1026); 
                            GT71_tree = 
                            (AslTree)adaptor.create(GT71)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT71_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:64: GE ^
                            {
                            GE72=(Token)match(input,GE,FOLLOW_GE_in_boolfact1031); 
                            GE72_tree = 
                            (AslTree)adaptor.create(GE72)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE72_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1035);
                    num_expr73=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr73.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS75=null;
        Token MINUS76=null;
        AslParser.term_return term74 =null;

        AslParser.term_return term77 =null;


        AslTree PLUS75_tree=null;
        AslTree MINUS76_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1055);
            term74=term();

            state._fsp--;

            adaptor.addChild(root_0, term74.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:20: ( PLUS ^| MINUS ^)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==PLUS) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==MINUS) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:21: PLUS ^
            	            {
            	            PLUS75=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1060); 
            	            PLUS75_tree = 
            	            (AslTree)adaptor.create(PLUS75)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS75_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:29: MINUS ^
            	            {
            	            MINUS76=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1065); 
            	            MINUS76_tree = 
            	            (AslTree)adaptor.create(MINUS76)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS76_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1069);
            	    term77=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term77.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL79=null;
        Token DIV80=null;
        Token MOD81=null;
        AslParser.factor_return factor78 =null;

        AslParser.factor_return factor82 =null;


        AslTree MUL79_tree=null;
        AslTree DIV80_tree=null;
        AslTree MOD81_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1093);
            factor78=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor78.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:23: MUL ^
            	            {
            	            MUL79=(Token)match(input,MUL,FOLLOW_MUL_in_term1098); 
            	            MUL79_tree = 
            	            (AslTree)adaptor.create(MUL79)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL79_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:30: DIV ^
            	            {
            	            DIV80=(Token)match(input,DIV,FOLLOW_DIV_in_term1103); 
            	            DIV80_tree = 
            	            (AslTree)adaptor.create(DIV80)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV80_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:37: MOD ^
            	            {
            	            MOD81=(Token)match(input,MOD,FOLLOW_MOD_in_term1108); 
            	            MOD81_tree = 
            	            (AslTree)adaptor.create(MOD81)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD81_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1112);
            	    factor82=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor82.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT83=null;
        Token PLUS84=null;
        Token MINUS85=null;
        AslParser.atom_return atom86 =null;


        AslTree NOT83_tree=null;
        AslTree PLUS84_tree=null;
        AslTree MINUS85_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt19=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case MINUS:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:14: NOT ^
                    {
                    NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_factor1135); 
                    NOT83_tree = 
                    (AslTree)adaptor.create(NOT83)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT83_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:21: PLUS ^
                    {
                    PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1140); 
                    PLUS84_tree = 
                    (AslTree)adaptor.create(PLUS84)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS84_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:29: MINUS ^
                    {
                    MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1145); 
                    MINUS85_tree = 
                    (AslTree)adaptor.create(MINUS85)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS85_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1150);
            atom86=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom86.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:170:1: atom : ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token DURATION87=null;
        Token ID88=null;
        Token INT89=null;
        Token DOUBLE90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        AslParser.funcall_return funcall91 =null;

        AslParser.expr_return expr93 =null;


        AslTree b_tree=null;
        AslTree DURATION87_tree=null;
        AslTree ID88_tree=null;
        AslTree INT89_tree=null;
        AslTree DOUBLE90_tree=null;
        AslTree char_literal92_tree=null;
        AslTree char_literal94_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:170:9: ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt21=7;
            switch ( input.LA(1) ) {
            case DURATION:
                {
                alt21=1;
                }
                break;
            case ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==59) ) {
                    alt21=6;
                }
                else if ( (LA21_2==AND||(LA21_2 >= DIV && LA21_2 <= DO)||(LA21_2 >= ELSE && LA21_2 <= EQUAL)||(LA21_2 >= GE && LA21_2 <= GT)||LA21_2==LE||LA21_2==LT||(LA21_2 >= MINUS && LA21_2 <= MUL)||LA21_2==NOT_EQUAL||LA21_2==OR||LA21_2==PLUS||LA21_2==THEN||(LA21_2 >= 60 && LA21_2 <= 62)) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt21=3;
                }
                break;
            case DOUBLE:
                {
                alt21=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt21=5;
                }
                break;
            case 59:
                {
                alt21=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:170:12: DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DURATION87=(Token)match(input,DURATION,FOLLOW_DURATION_in_atom1175); 
                    DURATION87_tree = 
                    (AslTree)adaptor.create(DURATION87)
                    ;
                    adaptor.addChild(root_0, DURATION87_tree);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:171:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID88=(Token)match(input,ID,FOLLOW_ID_in_atom1183); 
                    ID88_tree = 
                    (AslTree)adaptor.create(ID88)
                    ;
                    adaptor.addChild(root_0, ID88_tree);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT89=(Token)match(input,INT,FOLLOW_INT_in_atom1198); 
                    INT89_tree = 
                    (AslTree)adaptor.create(INT89)
                    ;
                    adaptor.addChild(root_0, INT89_tree);


                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:173:13: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE90=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1212); 
                    DOUBLE90_tree = 
                    (AslTree)adaptor.create(DOUBLE90)
                    ;
                    adaptor.addChild(root_0, DOUBLE90_tree);


                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==FALSE) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
                    switch (alt20) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1229);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1235);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (AslTree)adaptor.nil();
                    // 174:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        AslTree root_1 = (AslTree)adaptor.nil();
                        root_1 = (AslTree)adaptor.becomeRoot(
                        (AslTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:175:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1258);
                    funcall91=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall91.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:176:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal92=(Token)match(input,59,FOLLOW_59_in_atom1272); 

                    pushFollow(FOLLOW_expr_in_atom1275);
                    expr93=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr93.getTree());

                    char_literal94=(Token)match(input,60,FOLLOW_60_in_atom1277); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        AslParser.expr_list_return expr_list97 =null;


        AslTree ID95_tree=null;
        AslTree char_literal96_tree=null;
        AslTree char_literal98_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:13: ID '(' ( expr_list )? ')'
            {
            ID95=(Token)match(input,ID,FOLLOW_ID_in_funcall1298);  
            stream_ID.add(ID95);


            char_literal96=(Token)match(input,59,FOLLOW_59_in_funcall1300);  
            stream_59.add(char_literal96);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE||LA22_0==DURATION||LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==59) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1302);
                    expr_list97=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list97.getTree());

                    }
                    break;

            }


            char_literal98=(Token)match(input,60,FOLLOW_60_in_funcall1305);  
            stream_60.add(char_literal98);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 180:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal100=null;
        AslParser.expr_return expr99 =null;

        AslParser.expr_return expr101 =null;


        AslTree char_literal100_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:10: ( expr ( ',' ! expr )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1338);
            expr99=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr99.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:19: ',' ! expr
            	    {
            	    char_literal100=(Token)match(input,61,FOLLOW_61_in_expr_list1341); 

            	    pushFollow(FOLLOW_expr_in_expr_list1344);
            	    expr101=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr101.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class note_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "note"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:1: note : NOTE ^ ( INT )? ;
    public final AslParser.note_return note() throws RecognitionException {
        AslParser.note_return retval = new AslParser.note_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOTE102=null;
        Token INT103=null;

        AslTree NOTE102_tree=null;
        AslTree INT103_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:6: ( NOTE ^ ( INT )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:8: NOTE ^ ( INT )?
            {
            root_0 = (AslTree)adaptor.nil();


            NOTE102=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1362); 
            NOTE102_tree = 
            (AslTree)adaptor.create(NOTE102)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE102_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:14: ( INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:15: INT
                    {
                    INT103=(Token)match(input,INT,FOLLOW_INT_in_note1366); 
                    INT103_tree = 
                    (AslTree)adaptor.create(INT103)
                    ;
                    adaptor.addChild(root_0, INT103_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "note"


    public static class play_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "play"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:1: play : ( PLAY ^ note DURATION | PLAY ^ ID );
    public final AslParser.play_return play() throws RecognitionException {
        AslParser.play_return retval = new AslParser.play_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLAY104=null;
        Token DURATION106=null;
        Token PLAY107=null;
        Token ID108=null;
        AslParser.note_return note105 =null;


        AslTree PLAY104_tree=null;
        AslTree DURATION106_tree=null;
        AslTree PLAY107_tree=null;
        AslTree ID108_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:6: ( PLAY ^ note DURATION | PLAY ^ ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==PLAY) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==ID) ) {
                    alt25=2;
                }
                else if ( (LA25_1==NOTE) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:8: PLAY ^ note DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PLAY104=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1376); 
                    PLAY104_tree = 
                    (AslTree)adaptor.create(PLAY104)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLAY104_tree, root_0);


                    pushFollow(FOLLOW_note_in_play1379);
                    note105=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note105.getTree());

                    DURATION106=(Token)match(input,DURATION,FOLLOW_DURATION_in_play1381); 
                    DURATION106_tree = 
                    (AslTree)adaptor.create(DURATION106)
                    ;
                    adaptor.addChild(root_0, DURATION106_tree);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:30: PLAY ^ ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PLAY107=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1385); 
                    PLAY107_tree = 
                    (AslTree)adaptor.create(PLAY107)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLAY107_tree, root_0);


                    ID108=(Token)match(input,ID,FOLLOW_ID_in_play1388); 
                    ID108_tree = 
                    (AslTree)adaptor.create(ID108)
                    ;
                    adaptor.addChild(root_0, ID108_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (AslTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (AslTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "play"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_prog194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func233 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_func236 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_params_in_func238 = new BitSet(new long[]{0x418C420060020000L});
    public static final BitSet FOLLOW_block_instructions_in_func240 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_params261 = new BitSet(new long[]{0x1400000020000000L});
    public static final BitSet FOLLOW_paramlist_in_params263 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_params266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist292 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_paramlist295 = new BitSet(new long[]{0x0400000020000000L});
    public static final BitSet FOLLOW_param_in_paramlist298 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_58_in_param323 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_param327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions384 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_block_instructions387 = new BitSet(new long[]{0x418C420060020000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions389 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_play_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignnote_in_instruction450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignduration_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assign666 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assign668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_assignnote699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignnote703 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assignnote705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_assignduration732 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignduration736 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assignduration738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_exprmus768 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exprmus770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_exprmus773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DP_in_exprmus775 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_note_in_exprmus781 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exprmus783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_exprmus786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt798 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt801 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt803 = new BitSet(new long[]{0x418C420060020000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt806 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt809 = new BitSet(new long[]{0x418C420060020000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt839 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_while_stmt842 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_stmt844 = new BitSet(new long[]{0x418C420060020000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt847 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt872 = new BitSet(new long[]{0x08408120A1028002L});
    public static final BitSet FOLLOW_expr_in_return_stmt875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read894 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_read897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write917 = new BitSet(new long[]{0x08508120A1028000L});
    public static final BitSet FOLLOW_expr_in_write921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr950 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr953 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_boolterm_in_expr956 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm976 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm979 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm982 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1002 = new BitSet(new long[]{0x0000040918400002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1006 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1011 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_LT_in_boolfact1016 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_LE_in_boolfact1021 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_GT_in_boolfact1026 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_GE_in_boolfact1031 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1055 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1060 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1065 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_term_in_num_expr1069 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_factor_in_term1093 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_MUL_in_term1098 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_DIV_in_term1103 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_MOD_in_term1108 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_factor_in_term1112 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_NOT_in_factor1135 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_PLUS_in_factor1140 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_MINUS_in_factor1145 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_atom_in_factor1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_atom1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_atom1272 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_atom1275 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_atom1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1298 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funcall1300 = new BitSet(new long[]{0x18408120A1028000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1302 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_funcall1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1338 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_expr_list1341 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_expr_list1344 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1362 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INT_in_note1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1376 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_note_in_play1379 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_play1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1385 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_play1388 = new BitSet(new long[]{0x0000000000000002L});

}