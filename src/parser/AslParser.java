// $ANTLR 3.4 /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-21 15:19:24

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ASSIGNDURATION", "ASSIGNNOTE", "BOOLEAN", "COMMENT", "DIV", "DO", "DOUBLE", "DURATION", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOTE", "NOT_EQUAL", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ASSIGNDURATION=7;
    public static final int ASSIGNNOTE=8;
    public static final int BOOLEAN=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int DO=12;
    public static final int DOUBLE=13;
    public static final int DURATION=14;
    public static final int ELSE=15;
    public static final int ENDFUNC=16;
    public static final int ENDIF=17;
    public static final int ENDWHILE=18;
    public static final int EQUAL=19;
    public static final int ESC_SEQ=20;
    public static final int FALSE=21;
    public static final int FUNC=22;
    public static final int FUNCALL=23;
    public static final int GE=24;
    public static final int GT=25;
    public static final int ID=26;
    public static final int IF=27;
    public static final int INT=28;
    public static final int LE=29;
    public static final int LIST_FUNCTIONS=30;
    public static final int LIST_INSTR=31;
    public static final int LT=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int MUL=35;
    public static final int NOT=36;
    public static final int NOTE=37;
    public static final int NOT_EQUAL=38;
    public static final int OR=39;
    public static final int PARAMS=40;
    public static final int PLUS=41;
    public static final int PREF=42;
    public static final int PVALUE=43;
    public static final int READ=44;
    public static final int RETURN=45;
    public static final int STRING=46;
    public static final int THEN=47;
    public static final int TRUE=48;
    public static final int WHILE=49;
    public static final int WRITE=50;
    public static final int WS=51;

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: ( func )+ EOF
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: ( func )+
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
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog182);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog185);  
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
            // 62:18: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:62:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:66:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:66:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:66:8: FUNC ^ ID params block_instructions ENDFUNC !
            {
            root_0 = (AslTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func224); 
            FUNC3_tree = 
            (AslTree)adaptor.create(FUNC3)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func227); 
            ID4_tree = 
            (AslTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func229);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            pushFollow(FOLLOW_block_instructions_in_func231);
            block_instructions6=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions6.getTree());

            ENDFUNC7=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_func233); 

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,53,FOLLOW_53_in_params252);  
            stream_53.add(char_literal8);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==52) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params254);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,54,FOLLOW_54_in_params257);  
            stream_54.add(char_literal10);


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
            // 70:29: -> ^( PARAMS ( paramlist )? )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:70:41: ( paramlist )?
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:74:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:74:10: ( param ( ',' ! param )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:74:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist283);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:74:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==55) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:74:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,55,FOLLOW_55_in_paramlist286); 

            	    pushFollow(FOLLOW_param_in_paramlist289);
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:79:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:79:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:79:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,52,FOLLOW_52_in_param314);  
                    stream_52.add(char_literal14);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param318);  
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
                    // 79:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:79:26: ^( PREF[$id,$id.text] )
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param341);  
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
                    // 80:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:80:22: ^( PVALUE[$id,$id.text] )
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:84:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:85:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:85:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions375);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:85:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==56) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:85:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,56,FOLLOW_56_in_block_instructions378);  
            	    stream_56.add(char_literal16);


            	    pushFollow(FOLLOW_instruction_in_block_instructions380);
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
            // 86:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:86:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:90:1: instruction : ( assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.assignnote_return assignnote18 =null;

        AslParser.assignduration_return assignduration19 =null;

        AslParser.assign_return assign20 =null;

        AslParser.ite_stmt_return ite_stmt21 =null;

        AslParser.while_stmt_return while_stmt22 =null;

        AslParser.funcall_return funcall23 =null;

        AslParser.return_stmt_return return_stmt24 =null;

        AslParser.read_return read25 =null;

        AslParser.write_return write26 =null;



        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:91:9: ( assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=10;
            switch ( input.LA(1) ) {
            case NOTE:
                {
                alt6=1;
                }
                break;
            case DURATION:
                {
                alt6=2;
                }
                break;
            case ID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EQUAL) ) {
                    alt6=3;
                }
                else if ( (LA6_3==53) ) {
                    alt6=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=4;
                }
                break;
            case WHILE:
                {
                alt6=5;
                }
                break;
            case RETURN:
                {
                alt6=7;
                }
                break;
            case READ:
                {
                alt6=8;
                }
                break;
            case WRITE:
                {
                alt6=9;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 56:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:91:11: assignnote
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignnote_in_instruction429);
                    assignnote18=assignnote();

                    state._fsp--;

                    adaptor.addChild(root_0, assignnote18.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:92:11: assignduration
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignduration_in_instruction451);
                    assignduration19=assignduration();

                    state._fsp--;

                    adaptor.addChild(root_0, assignduration19.getTree());

                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:93:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction463);
                    assign20=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign20.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:94:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction475);
                    ite_stmt21=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt21.getTree());

                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:95:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction495);
                    while_stmt22=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:96:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction515);
                    funcall23=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall23.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:97:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction536);
                    return_stmt24=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt24.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:98:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction553);
                    read25=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read25.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:99:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction578);
                    write26=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write26.getTree());

                    }
                    break;
                case 10 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:101:9: 
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:106:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID27=null;
        AslParser.expr_return expr28 =null;


        AslTree eq_tree=null;
        AslTree ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:106:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:106:10: ID eq= EQUAL expr
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_assign638);  
            stream_ID.add(ID27);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign642);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign644);
            expr28=expr();

            state._fsp--;

            stream_expr.add(expr28.getTree());

            // AST REWRITE
            // elements: expr, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 106:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:106:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:1: assignnote : note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) ;
    public final AslParser.assignnote_return assignnote() throws RecognitionException {
        AslParser.assignnote_return retval = new AslParser.assignnote_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.note_return note29 =null;

        AslParser.expr_return expr30 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:13: ( note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:17: note eq= EQUAL expr
            {
            pushFollow(FOLLOW_note_in_assignnote675);
            note29=note();

            state._fsp--;

            stream_note.add(note29.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignnote679);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignnote681);
            expr30=expr();

            state._fsp--;

            stream_expr.add(expr30.getTree());

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
            // 109:36: -> ^( ASSIGNNOTE[$eq,\":=\"] note expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:39: ^( ASSIGNNOTE[$eq,\":=\"] note expr )
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:1: assignduration : DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) ;
    public final AslParser.assignduration_return assignduration() throws RecognitionException {
        AslParser.assignduration_return retval = new AslParser.assignduration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token DURATION31=null;
        AslParser.expr_return expr32 =null;


        AslTree eq_tree=null;
        AslTree DURATION31_tree=null;
        RewriteRuleTokenStream stream_DURATION=new RewriteRuleTokenStream(adaptor,"token DURATION");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:15: ( DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:17: DURATION eq= EQUAL expr
            {
            DURATION31=(Token)match(input,DURATION,FOLLOW_DURATION_in_assignduration708);  
            stream_DURATION.add(DURATION31);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignduration712);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignduration714);
            expr32=expr();

            state._fsp--;

            stream_expr.add(expr32.getTree());

            // AST REWRITE
            // elements: expr, DURATION
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 112:40: -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:43: ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
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


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:116:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF33=null;
        Token THEN35=null;
        Token ELSE37=null;
        Token ENDIF39=null;
        AslParser.expr_return expr34 =null;

        AslParser.block_instructions_return block_instructions36 =null;

        AslParser.block_instructions_return block_instructions38 =null;


        AslTree IF33_tree=null;
        AslTree THEN35_tree=null;
        AslTree ELSE37_tree=null;
        AslTree ENDIF39_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:116:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:116:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF33=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt736); 
            IF33_tree = 
            (AslTree)adaptor.create(IF33)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF33_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt739);
            expr34=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr34.getTree());

            THEN35=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt741); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt744);
            block_instructions36=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions36.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:116:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:116:47: ELSE ! block_instructions
                    {
                    ELSE37=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt747); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt750);
                    block_instructions38=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions38.getTree());

                    }
                    break;

            }


            ENDIF39=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt754); 

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:120:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE40=null;
        Token DO42=null;
        Token ENDWHILE44=null;
        AslParser.expr_return expr41 =null;

        AslParser.block_instructions_return block_instructions43 =null;


        AslTree WHILE40_tree=null;
        AslTree DO42_tree=null;
        AslTree ENDWHILE44_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:120:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:120:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE40=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt777); 
            WHILE40_tree = 
            (AslTree)adaptor.create(WHILE40)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE40_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt780);
            expr41=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr41.getTree());

            DO42=(Token)match(input,DO,FOLLOW_DO_in_while_stmt782); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt785);
            block_instructions43=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions43.getTree());

            ENDWHILE44=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt787); 

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN45=null;
        AslParser.expr_return expr46 =null;


        AslTree RETURN45_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:13: ( RETURN ^ ( expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN45=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt810); 
            RETURN45_tree = 
            (AslTree)adaptor.create(RETURN45)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN45_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= DOUBLE && LA8_0 <= DURATION)||LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||(LA8_0 >= NOT && LA8_0 <= NOTE)||LA8_0==PLUS||LA8_0==TRUE||LA8_0==53) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt813);
                    expr46=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr46.getTree());

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ47=null;
        Token ID48=null;

        AslTree READ47_tree=null;
        AslTree ID48_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:6: ( READ ^ ID )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ47=(Token)match(input,READ,FOLLOW_READ_in_read832); 
            READ47_tree = 
            (AslTree)adaptor.create(READ47)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ47_tree, root_0);


            ID48=(Token)match(input,ID,FOLLOW_ID_in_read835); 
            ID48_tree = 
            (AslTree)adaptor.create(ID48)
            ;
            adaptor.addChild(root_0, ID48_tree);


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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE49=null;
        Token STRING51=null;
        AslParser.expr_return expr50 =null;


        AslTree WRITE49_tree=null;
        AslTree STRING51_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:7: ( WRITE ^ ( expr | STRING ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE49=(Token)match(input,WRITE,FOLLOW_WRITE_in_write855); 
            WRITE49_tree = 
            (AslTree)adaptor.create(WRITE49)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE49_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= DOUBLE && LA9_0 <= DURATION)||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||(LA9_0 >= NOT && LA9_0 <= NOTE)||LA9_0==PLUS||LA9_0==TRUE||LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write859);
                    expr50=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr50.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:26: STRING
                    {
                    STRING51=(Token)match(input,STRING,FOLLOW_STRING_in_write863); 
                    STRING51_tree = 
                    (AslTree)adaptor.create(STRING51)
                    ;
                    adaptor.addChild(root_0, STRING51_tree);


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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR53=null;
        AslParser.boolterm_return boolterm52 =null;

        AslParser.boolterm_return boolterm54 =null;


        AslTree OR53_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:9: ( boolterm ( OR ^ boolterm )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr888);
            boolterm52=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm52.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:22: ( OR ^ boolterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:23: OR ^ boolterm
            	    {
            	    OR53=(Token)match(input,OR,FOLLOW_OR_in_expr891); 
            	    OR53_tree = 
            	    (AslTree)adaptor.create(OR53)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR53_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr894);
            	    boolterm54=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm54.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:139:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND56=null;
        AslParser.boolfact_return boolfact55 =null;

        AslParser.boolfact_return boolfact57 =null;


        AslTree AND56_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:139:9: ( boolfact ( AND ^ boolfact )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:139:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm914);
            boolfact55=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact55.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:139:22: ( AND ^ boolfact )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:139:23: AND ^ boolfact
            	    {
            	    AND56=(Token)match(input,AND,FOLLOW_AND_in_boolterm917); 
            	    AND56_tree = 
            	    (AslTree)adaptor.create(AND56)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND56_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm920);
            	    boolfact57=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact57.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL59=null;
        Token NOT_EQUAL60=null;
        Token LT61=null;
        Token LE62=null;
        Token GT63=null;
        Token GE64=null;
        AslParser.num_expr_return num_expr58 =null;

        AslParser.num_expr_return num_expr65 =null;


        AslTree EQUAL59_tree=null;
        AslTree NOT_EQUAL60_tree=null;
        AslTree LT61_tree=null;
        AslTree LE62_tree=null;
        AslTree GT63_tree=null;
        AslTree GE64_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact940);
            num_expr58=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr58.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NOT_EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt12=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt12=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt12=2;
                        }
                        break;
                    case LT:
                        {
                        alt12=3;
                        }
                        break;
                    case LE:
                        {
                        alt12=4;
                        }
                        break;
                    case GT:
                        {
                        alt12=5;
                        }
                        break;
                    case GE:
                        {
                        alt12=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }

                    switch (alt12) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:24: EQUAL ^
                            {
                            EQUAL59=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact944); 
                            EQUAL59_tree = 
                            (AslTree)adaptor.create(EQUAL59)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL59_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL60=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact949); 
                            NOT_EQUAL60_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL60_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:46: LT ^
                            {
                            LT61=(Token)match(input,LT,FOLLOW_LT_in_boolfact954); 
                            LT61_tree = 
                            (AslTree)adaptor.create(LT61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT61_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:52: LE ^
                            {
                            LE62=(Token)match(input,LE,FOLLOW_LE_in_boolfact959); 
                            LE62_tree = 
                            (AslTree)adaptor.create(LE62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE62_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:58: GT ^
                            {
                            GT63=(Token)match(input,GT,FOLLOW_GT_in_boolfact964); 
                            GT63_tree = 
                            (AslTree)adaptor.create(GT63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT63_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:142:64: GE ^
                            {
                            GE64=(Token)match(input,GE,FOLLOW_GE_in_boolfact969); 
                            GE64_tree = 
                            (AslTree)adaptor.create(GE64)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE64_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact973);
                    num_expr65=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr65.getTree());

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS67=null;
        Token MINUS68=null;
        AslParser.term_return term66 =null;

        AslParser.term_return term69 =null;


        AslTree PLUS67_tree=null;
        AslTree MINUS68_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr993);
            term66=term();

            state._fsp--;

            adaptor.addChild(root_0, term66.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:18: ( ( PLUS ^| MINUS ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:20: ( PLUS ^| MINUS ^)
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==PLUS) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==MINUS) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:21: PLUS ^
            	            {
            	            PLUS67=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr998); 
            	            PLUS67_tree = 
            	            (AslTree)adaptor.create(PLUS67)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS67_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:145:29: MINUS ^
            	            {
            	            MINUS68=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1003); 
            	            MINUS68_tree = 
            	            (AslTree)adaptor.create(MINUS68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS68_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1007);
            	    term69=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term69.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL71=null;
        Token DIV72=null;
        Token MOD73=null;
        AslParser.factor_return factor70 =null;

        AslParser.factor_return factor74 =null;


        AslTree MUL71_tree=null;
        AslTree DIV72_tree=null;
        AslTree MOD73_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1031);
            factor70=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor70.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DIV||(LA17_0 >= MOD && LA17_0 <= MUL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt16=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:23: MUL ^
            	            {
            	            MUL71=(Token)match(input,MUL,FOLLOW_MUL_in_term1036); 
            	            MUL71_tree = 
            	            (AslTree)adaptor.create(MUL71)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL71_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:30: DIV ^
            	            {
            	            DIV72=(Token)match(input,DIV,FOLLOW_DIV_in_term1041); 
            	            DIV72_tree = 
            	            (AslTree)adaptor.create(DIV72)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV72_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:37: MOD ^
            	            {
            	            MOD73=(Token)match(input,MOD,FOLLOW_MOD_in_term1046); 
            	            MOD73_tree = 
            	            (AslTree)adaptor.create(MOD73)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD73_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1050);
            	    factor74=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor74.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT75=null;
        Token PLUS76=null;
        Token MINUS77=null;
        AslParser.atom_return atom78 =null;


        AslTree NOT75_tree=null;
        AslTree PLUS76_tree=null;
        AslTree MINUS77_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt18=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt18=1;
                    }
                    break;
                case PLUS:
                    {
                    alt18=2;
                    }
                    break;
                case MINUS:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:14: NOT ^
                    {
                    NOT75=(Token)match(input,NOT,FOLLOW_NOT_in_factor1073); 
                    NOT75_tree = 
                    (AslTree)adaptor.create(NOT75)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT75_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:21: PLUS ^
                    {
                    PLUS76=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1078); 
                    PLUS76_tree = 
                    (AslTree)adaptor.create(PLUS76)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS76_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:29: MINUS ^
                    {
                    MINUS77=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1083); 
                    MINUS77_tree = 
                    (AslTree)adaptor.create(MINUS77)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS77_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1088);
            atom78=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom78.getTree());

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:1: atom : ( note | DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token DURATION80=null;
        Token ID81=null;
        Token INT82=null;
        Token DOUBLE83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        AslParser.note_return note79 =null;

        AslParser.funcall_return funcall84 =null;

        AslParser.expr_return expr86 =null;


        AslTree b_tree=null;
        AslTree DURATION80_tree=null;
        AslTree ID81_tree=null;
        AslTree INT82_tree=null;
        AslTree DOUBLE83_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:9: ( note | DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt20=8;
            switch ( input.LA(1) ) {
            case NOTE:
                {
                alt20=1;
                }
                break;
            case DURATION:
                {
                alt20=2;
                }
                break;
            case ID:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==53) ) {
                    alt20=7;
                }
                else if ( (LA20_3==AND||(LA20_3 >= DIV && LA20_3 <= DO)||(LA20_3 >= ELSE && LA20_3 <= EQUAL)||(LA20_3 >= GE && LA20_3 <= GT)||LA20_3==LE||(LA20_3 >= LT && LA20_3 <= MUL)||(LA20_3 >= NOT_EQUAL && LA20_3 <= OR)||LA20_3==PLUS||LA20_3==THEN||(LA20_3 >= 54 && LA20_3 <= 56)) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt20=4;
                }
                break;
            case DOUBLE:
                {
                alt20=5;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt20=6;
                }
                break;
            case 53:
                {
                alt20=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:12: note
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_note_in_atom1112);
                    note79=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note79.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:158:7: DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DURATION80=(Token)match(input,DURATION,FOLLOW_DURATION_in_atom1120); 
                    DURATION80_tree = 
                    (AslTree)adaptor.create(DURATION80)
                    ;
                    adaptor.addChild(root_0, DURATION80_tree);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:159:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_atom1128); 
                    ID81_tree = 
                    (AslTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT82=(Token)match(input,INT,FOLLOW_INT_in_atom1143); 
                    INT82_tree = 
                    (AslTree)adaptor.create(INT82)
                    ;
                    adaptor.addChild(root_0, INT82_tree);


                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:161:13: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE83=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1157); 
                    DOUBLE83_tree = 
                    (AslTree)adaptor.create(DOUBLE83)
                    ;
                    adaptor.addChild(root_0, DOUBLE83_tree);


                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:162:13: (b= TRUE |b= FALSE )
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:162:13: (b= TRUE |b= FALSE )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TRUE) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==FALSE) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:162:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1174);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:162:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1180);  
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
                    // 162:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:162:36: ^( BOOLEAN[$b,$b.text] )
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
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1203);
                    funcall84=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall84.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:164:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal85=(Token)match(input,53,FOLLOW_53_in_atom1217); 

                    pushFollow(FOLLOW_expr_in_atom1220);
                    expr86=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr86.getTree());

                    char_literal87=(Token)match(input,54,FOLLOW_54_in_atom1222); 

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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        AslParser.expr_list_return expr_list90 =null;


        AslTree ID88_tree=null;
        AslTree char_literal89_tree=null;
        AslTree char_literal91_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:13: ID '(' ( expr_list )? ')'
            {
            ID88=(Token)match(input,ID,FOLLOW_ID_in_funcall1243);  
            stream_ID.add(ID88);


            char_literal89=(Token)match(input,53,FOLLOW_53_in_funcall1245);  
            stream_53.add(char_literal89);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:20: ( expr_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= DOUBLE && LA21_0 <= DURATION)||LA21_0==FALSE||LA21_0==ID||LA21_0==INT||LA21_0==MINUS||(LA21_0 >= NOT && LA21_0 <= NOTE)||LA21_0==PLUS||LA21_0==TRUE||LA21_0==53) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1247);
                    expr_list90=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list90.getTree());

                    }
                    break;

            }


            char_literal91=(Token)match(input,54,FOLLOW_54_in_funcall1250);  
            stream_54.add(char_literal91);


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
            // 168:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:168:61: ( expr_list )?
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal93=null;
        AslParser.expr_return expr92 =null;

        AslParser.expr_return expr94 =null;


        AslTree char_literal93_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:10: ( expr ( ',' ! expr )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1283);
            expr92=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr92.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:18: ( ',' ! expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==55) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:19: ',' ! expr
            	    {
            	    char_literal93=(Token)match(input,55,FOLLOW_55_in_expr_list1286); 

            	    pushFollow(FOLLOW_expr_in_expr_list1289);
            	    expr94=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr94.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:1: note : NOTE ^ ( INT )? ;
    public final AslParser.note_return note() throws RecognitionException {
        AslParser.note_return retval = new AslParser.note_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOTE95=null;
        Token INT96=null;

        AslTree NOTE95_tree=null;
        AslTree INT96_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:6: ( NOTE ^ ( INT )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:8: NOTE ^ ( INT )?
            {
            root_0 = (AslTree)adaptor.nil();


            NOTE95=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1307); 
            NOTE95_tree = 
            (AslTree)adaptor.create(NOTE95)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE95_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:14: ( INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:15: INT
                    {
                    INT96=(Token)match(input,INT,FOLLOW_INT_in_note1311); 
                    INT96_tree = 
                    (AslTree)adaptor.create(INT96)
                    ;
                    adaptor.addChild(root_0, INT96_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_prog185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_func227 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_params_in_func229 = new BitSet(new long[]{0x010630200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_func231 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_params252 = new BitSet(new long[]{0x0050000004000000L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_paramlist286 = new BitSet(new long[]{0x0010000004000000L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_52_in_param314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions375 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_block_instructions378 = new BitSet(new long[]{0x010630200C004000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions380 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_assignnote_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignduration_in_instruction451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign638 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assign642 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_assign644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_assignnote675 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assignnote679 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_assignnote681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_assignduration708 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assignduration712 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_assignduration714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt736 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt739 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt741 = new BitSet(new long[]{0x010630200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt744 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt747 = new BitSet(new long[]{0x010630200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt750 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt777 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_while_stmt780 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt782 = new BitSet(new long[]{0x010630200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt785 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt810 = new BitSet(new long[]{0x0021023214206002L});
    public static final BitSet FOLLOW_expr_in_return_stmt813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read832 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_read835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write855 = new BitSet(new long[]{0x0021423214206000L});
    public static final BitSet FOLLOW_expr_in_write859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr888 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_expr891 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_boolterm_in_expr894 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm914 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm917 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm920 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact940 = new BitSet(new long[]{0x0000004123080002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact944 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact949 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_LT_in_boolfact954 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_LE_in_boolfact959 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_GT_in_boolfact964 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_GE_in_boolfact969 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr993 = new BitSet(new long[]{0x0000020200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr998 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1003 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_term_in_num_expr1007 = new BitSet(new long[]{0x0000020200000002L});
    public static final BitSet FOLLOW_factor_in_term1031 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_MUL_in_term1036 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_DIV_in_term1041 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_MOD_in_term1046 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_factor_in_term1050 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_NOT_in_factor1073 = new BitSet(new long[]{0x0021002014206000L});
    public static final BitSet FOLLOW_PLUS_in_factor1078 = new BitSet(new long[]{0x0021002014206000L});
    public static final BitSet FOLLOW_MINUS_in_factor1083 = new BitSet(new long[]{0x0021002014206000L});
    public static final BitSet FOLLOW_atom_in_factor1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_atom1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_atom1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_atom1217 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_atom1220 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_atom1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1243 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_funcall1245 = new BitSet(new long[]{0x0061023214206000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1247 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funcall1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1283 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_expr_list1286 = new BitSet(new long[]{0x0021023214206000L});
    public static final BitSet FOLLOW_expr_in_expr_list1289 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1307 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_INT_in_note1311 = new BitSet(new long[]{0x0000000000000002L});

}