// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-22 15:18:20

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ASSIGNDURATION", "ASSIGNNOTE", "BOOLEAN", "COMMENT", "DIV", "DO", "DOUBLE", "DURATION", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOTE", "NOT_EQUAL", "OR", "PARAMS", "PLAY", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
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
    public static final int PLAY=41;
    public static final int PLUS=42;
    public static final int PREF=43;
    public static final int PVALUE=44;
    public static final int READ=45;
    public static final int RETURN=46;
    public static final int STRING=47;
    public static final int THEN=48;
    public static final int TRUE=49;
    public static final int WHILE=50;
    public static final int WRITE=51;
    public static final int WS=52;

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
    public String getGrammarFileName() { return "/Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:6: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: ( func )+ EOF
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: ( func )+
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
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:8: func
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
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:62:21: ^( LIST_FUNCTIONS ( func )+ )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:66:1: func : FUNC ^ ID params block_instructions ENDFUNC !;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:66:6: ( FUNC ^ ID params block_instructions ENDFUNC !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:66:8: FUNC ^ ID params block_instructions ENDFUNC !
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final AslParser.params_return params() throws RecognitionException {
        AslParser.params_return retval = new AslParser.params_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        AslParser.paramlist_return paramlist9 =null;


        AslTree char_literal8_tree=null;
        AslTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,54,FOLLOW_54_in_params252);  
            stream_54.add(char_literal8);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==53) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:14: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params254);
                    paramlist9=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,55,FOLLOW_55_in_params257);  
            stream_55.add(char_literal10);


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
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:32: ^( PARAMS ( paramlist )? )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:41: ( paramlist )?
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:1: paramlist : param ( ',' ! param )* ;
    public final AslParser.paramlist_return paramlist() throws RecognitionException {
        AslParser.paramlist_return retval = new AslParser.paramlist_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal12=null;
        AslParser.param_return param11 =null;

        AslParser.param_return param13 =null;


        AslTree char_literal12_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:10: ( param ( ',' ! param )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:12: param ( ',' ! param )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist283);
            param11=param();

            state._fsp--;

            adaptor.addChild(root_0, param11.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==56) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,56,FOLLOW_56_in_paramlist286); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:79:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final AslParser.param_return param() throws RecognitionException {
        AslParser.param_return retval = new AslParser.param_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token id=null;
        Token char_literal14=null;

        AslTree id_tree=null;
        AslTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:79:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:79:13: '&' id= ID
                    {
                    char_literal14=(Token)match(input,53,FOLLOW_53_in_param314);  
                    stream_53.add(char_literal14);


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
                        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:79:26: ^( PREF[$id,$id.text] )
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:80:13: id= ID
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
                        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:80:22: ^( PVALUE[$id,$id.text] )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:84:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final AslParser.block_instructions_return block_instructions() throws RecognitionException {
        AslParser.block_instructions_return retval = new AslParser.block_instructions_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal16=null;
        AslParser.instruction_return instruction15 =null;

        AslParser.instruction_return instruction17 =null;


        AslTree char_literal16_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:85:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:85:12: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions375);
            instruction15=instruction();

            state._fsp--;

            stream_instruction.add(instruction15.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:85:24: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==57) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:85:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,57,FOLLOW_57_in_block_instructions378);  
            	    stream_57.add(char_literal16);


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
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:86:16: ^( LIST_INSTR ( instruction )+ )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:90:1: instruction : ( play | assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:91:9: ( play | assignnote | assignduration | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
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
                else if ( (LA6_4==54) ) {
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
            case 57:
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:91:11: play
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_play_in_instruction429);
                    play18=play();

                    state._fsp--;

                    adaptor.addChild(root_0, play18.getTree());

                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:92:11: assignnote
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignnote_in_instruction441);
                    assignnote19=assignnote();

                    state._fsp--;

                    adaptor.addChild(root_0, assignnote19.getTree());

                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:93:11: assignduration
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assignduration_in_instruction463);
                    assignduration20=assignduration();

                    state._fsp--;

                    adaptor.addChild(root_0, assignduration20.getTree());

                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:94:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction475);
                    assign21=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign21.getTree());

                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:95:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction487);
                    ite_stmt22=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt22.getTree());

                    }
                    break;
                case 6 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:96:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction507);
                    while_stmt23=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:97:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction527);
                    funcall24=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall24.getTree());

                    }
                    break;
                case 8 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:98:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction548);
                    return_stmt25=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;
                case 9 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:99:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction565);
                    read26=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read26.getTree());

                    }
                    break;
                case 10 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:100:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction590);
                    write27=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write27.getTree());

                    }
                    break;
                case 11 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:102:9: 
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:107:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID28=null;
        AslParser.expr_return expr29 =null;


        AslTree eq_tree=null;
        AslTree ID28_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:107:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:107:10: ID eq= EQUAL expr
            {
            ID28=(Token)match(input,ID,FOLLOW_ID_in_assign650);  
            stream_ID.add(ID28);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign654);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign656);
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
            // 107:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:107:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:110:1: assignnote : note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) ;
    public final AslParser.assignnote_return assignnote() throws RecognitionException {
        AslParser.assignnote_return retval = new AslParser.assignnote_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.note_return note30 =null;

        AslParser.expr_return expr31 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:110:13: ( note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:110:17: note eq= EQUAL expr
            {
            pushFollow(FOLLOW_note_in_assignnote687);
            note30=note();

            state._fsp--;

            stream_note.add(note30.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignnote691);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignnote693);
            expr31=expr();

            state._fsp--;

            stream_expr.add(expr31.getTree());

            // AST REWRITE
            // elements: note, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 110:36: -> ^( ASSIGNNOTE[$eq,\":=\"] note expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:110:39: ^( ASSIGNNOTE[$eq,\":=\"] note expr )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:113:1: assignduration : DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) ;
    public final AslParser.assignduration_return assignduration() throws RecognitionException {
        AslParser.assignduration_return retval = new AslParser.assignduration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token DURATION32=null;
        AslParser.expr_return expr33 =null;


        AslTree eq_tree=null;
        AslTree DURATION32_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_DURATION=new RewriteRuleTokenStream(adaptor,"token DURATION");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:113:15: ( DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:113:17: DURATION eq= EQUAL expr
            {
            DURATION32=(Token)match(input,DURATION,FOLLOW_DURATION_in_assignduration720);  
            stream_DURATION.add(DURATION32);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignduration724);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignduration726);
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
            // 113:40: -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:113:43: ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF34=null;
        Token THEN36=null;
        Token ELSE38=null;
        Token ENDIF40=null;
        AslParser.expr_return expr35 =null;

        AslParser.block_instructions_return block_instructions37 =null;

        AslParser.block_instructions_return block_instructions39 =null;


        AslTree IF34_tree=null;
        AslTree THEN36_tree=null;
        AslTree ELSE38_tree=null;
        AslTree ENDIF40_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF34=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt748); 
            IF34_tree = 
            (AslTree)adaptor.create(IF34)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF34_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt751);
            expr35=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr35.getTree());

            THEN36=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt753); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt756);
            block_instructions37=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions37.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:46: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:47: ELSE ! block_instructions
                    {
                    ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt759); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt762);
                    block_instructions39=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions39.getTree());

                    }
                    break;

            }


            ENDIF40=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt766); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE41=null;
        Token DO43=null;
        Token ENDWHILE45=null;
        AslParser.expr_return expr42 =null;

        AslParser.block_instructions_return block_instructions44 =null;


        AslTree WHILE41_tree=null;
        AslTree DO43_tree=null;
        AslTree ENDWHILE45_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE41=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt789); 
            WHILE41_tree = 
            (AslTree)adaptor.create(WHILE41)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE41_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt792);
            expr42=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr42.getTree());

            DO43=(Token)match(input,DO,FOLLOW_DO_in_while_stmt794); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt797);
            block_instructions44=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions44.getTree());

            ENDWHILE45=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt799); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN46=null;
        AslParser.expr_return expr47 =null;


        AslTree RETURN46_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:13: ( RETURN ^ ( expr )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN46=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt822); 
            RETURN46_tree = 
            (AslTree)adaptor.create(RETURN46)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN46_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:23: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= DOUBLE && LA8_0 <= DURATION)||LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==NOT||LA8_0==PLUS||LA8_0==TRUE||LA8_0==54) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt825);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ48=null;
        Token ID49=null;

        AslTree READ48_tree=null;
        AslTree ID49_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:6: ( READ ^ ID )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ48=(Token)match(input,READ,FOLLOW_READ_in_read844); 
            READ48_tree = 
            (AslTree)adaptor.create(READ48)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ48_tree, root_0);


            ID49=(Token)match(input,ID,FOLLOW_ID_in_read847); 
            ID49_tree = 
            (AslTree)adaptor.create(ID49)
            ;
            adaptor.addChild(root_0, ID49_tree);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE50=null;
        Token STRING52=null;
        AslParser.expr_return expr51 =null;


        AslTree WRITE50_tree=null;
        AslTree STRING52_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:7: ( WRITE ^ ( expr | STRING ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE50=(Token)match(input,WRITE,FOLLOW_WRITE_in_write867); 
            WRITE50_tree = 
            (AslTree)adaptor.create(WRITE50)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE50_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:18: ( expr | STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0 >= DOUBLE && LA9_0 <= DURATION)||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==54) ) {
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write871);
                    expr51=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr51.getTree());

                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:26: STRING
                    {
                    STRING52=(Token)match(input,STRING,FOLLOW_STRING_in_write875); 
                    STRING52_tree = 
                    (AslTree)adaptor.create(STRING52)
                    ;
                    adaptor.addChild(root_0, STRING52_tree);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR54=null;
        AslParser.boolterm_return boolterm53 =null;

        AslParser.boolterm_return boolterm55 =null;


        AslTree OR54_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:9: ( boolterm ( OR ^ boolterm )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr900);
            boolterm53=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm53.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:22: ( OR ^ boolterm )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==OR) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:23: OR ^ boolterm
            	    {
            	    OR54=(Token)match(input,OR,FOLLOW_OR_in_expr903); 
            	    OR54_tree = 
            	    (AslTree)adaptor.create(OR54)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR54_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr906);
            	    boolterm55=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm55.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:140:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND57=null;
        AslParser.boolfact_return boolfact56 =null;

        AslParser.boolfact_return boolfact58 =null;


        AslTree AND57_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:140:9: ( boolfact ( AND ^ boolfact )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:140:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm926);
            boolfact56=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact56.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:140:22: ( AND ^ boolfact )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:140:23: AND ^ boolfact
            	    {
            	    AND57=(Token)match(input,AND,FOLLOW_AND_in_boolterm929); 
            	    AND57_tree = 
            	    (AslTree)adaptor.create(AND57)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND57_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm932);
            	    boolfact58=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact58.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL60=null;
        Token NOT_EQUAL61=null;
        Token LT62=null;
        Token LE63=null;
        Token GT64=null;
        Token GE65=null;
        AslParser.num_expr_return num_expr59 =null;

        AslParser.num_expr_return num_expr66 =null;


        AslTree EQUAL60_tree=null;
        AslTree NOT_EQUAL61_tree=null;
        AslTree LT62_tree=null;
        AslTree LE63_tree=null;
        AslTree GT64_tree=null;
        AslTree GE65_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact952);
            num_expr59=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr59.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==EQUAL||(LA13_0 >= GE && LA13_0 <= GT)||LA13_0==LE||LA13_0==LT||LA13_0==NOT_EQUAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:24: EQUAL ^
                            {
                            EQUAL60=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact956); 
                            EQUAL60_tree = 
                            (AslTree)adaptor.create(EQUAL60)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL60_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL61=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact961); 
                            NOT_EQUAL61_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL61)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL61_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:46: LT ^
                            {
                            LT62=(Token)match(input,LT,FOLLOW_LT_in_boolfact966); 
                            LT62_tree = 
                            (AslTree)adaptor.create(LT62)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT62_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:52: LE ^
                            {
                            LE63=(Token)match(input,LE,FOLLOW_LE_in_boolfact971); 
                            LE63_tree = 
                            (AslTree)adaptor.create(LE63)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE63_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:58: GT ^
                            {
                            GT64=(Token)match(input,GT,FOLLOW_GT_in_boolfact976); 
                            GT64_tree = 
                            (AslTree)adaptor.create(GT64)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT64_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:143:64: GE ^
                            {
                            GE65=(Token)match(input,GE,FOLLOW_GE_in_boolfact981); 
                            GE65_tree = 
                            (AslTree)adaptor.create(GE65)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE65_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact985);
                    num_expr66=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr66.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS68=null;
        Token MINUS69=null;
        AslParser.term_return term67 =null;

        AslParser.term_return term70 =null;


        AslTree PLUS68_tree=null;
        AslTree MINUS69_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1005);
            term67=term();

            state._fsp--;

            adaptor.addChild(root_0, term67.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:18: ( ( PLUS ^| MINUS ^) term )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==MINUS||LA15_0==PLUS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:20: ( PLUS ^| MINUS ^)
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
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:21: PLUS ^
            	            {
            	            PLUS68=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1010); 
            	            PLUS68_tree = 
            	            (AslTree)adaptor.create(PLUS68)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS68_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:146:29: MINUS ^
            	            {
            	            MINUS69=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1015); 
            	            MINUS69_tree = 
            	            (AslTree)adaptor.create(MINUS69)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS69_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1019);
            	    term70=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term70.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL72=null;
        Token DIV73=null;
        Token MOD74=null;
        AslParser.factor_return factor71 =null;

        AslParser.factor_return factor75 =null;


        AslTree MUL72_tree=null;
        AslTree DIV73_tree=null;
        AslTree MOD74_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1043);
            factor71=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor71.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DIV||(LA17_0 >= MOD && LA17_0 <= MUL)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:23: MUL ^
            	            {
            	            MUL72=(Token)match(input,MUL,FOLLOW_MUL_in_term1048); 
            	            MUL72_tree = 
            	            (AslTree)adaptor.create(MUL72)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL72_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:30: DIV ^
            	            {
            	            DIV73=(Token)match(input,DIV,FOLLOW_DIV_in_term1053); 
            	            DIV73_tree = 
            	            (AslTree)adaptor.create(DIV73)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV73_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:149:37: MOD ^
            	            {
            	            MOD74=(Token)match(input,MOD,FOLLOW_MOD_in_term1058); 
            	            MOD74_tree = 
            	            (AslTree)adaptor.create(MOD74)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD74_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1062);
            	    factor75=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor75.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT76=null;
        Token PLUS77=null;
        Token MINUS78=null;
        AslParser.atom_return atom79 =null;


        AslTree NOT76_tree=null;
        AslTree PLUS77_tree=null;
        AslTree MINUS78_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:14: NOT ^
                    {
                    NOT76=(Token)match(input,NOT,FOLLOW_NOT_in_factor1085); 
                    NOT76_tree = 
                    (AslTree)adaptor.create(NOT76)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT76_tree, root_0);


                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:21: PLUS ^
                    {
                    PLUS77=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1090); 
                    PLUS77_tree = 
                    (AslTree)adaptor.create(PLUS77)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS77_tree, root_0);


                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:152:29: MINUS ^
                    {
                    MINUS78=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1095); 
                    MINUS78_tree = 
                    (AslTree)adaptor.create(MINUS78)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS78_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1100);
            atom79=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom79.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:159:1: atom : ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
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
        AslParser.funcall_return funcall84 =null;

        AslParser.expr_return expr86 =null;


        AslTree b_tree=null;
        AslTree DURATION80_tree=null;
        AslTree ID81_tree=null;
        AslTree INT82_tree=null;
        AslTree DOUBLE83_tree=null;
        AslTree char_literal85_tree=null;
        AslTree char_literal87_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:159:9: ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt20=7;
            switch ( input.LA(1) ) {
            case DURATION:
                {
                alt20=1;
                }
                break;
            case ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==54) ) {
                    alt20=6;
                }
                else if ( (LA20_2==AND||(LA20_2 >= DIV && LA20_2 <= DO)||(LA20_2 >= ELSE && LA20_2 <= EQUAL)||(LA20_2 >= GE && LA20_2 <= GT)||LA20_2==LE||(LA20_2 >= LT && LA20_2 <= MUL)||(LA20_2 >= NOT_EQUAL && LA20_2 <= OR)||LA20_2==PLUS||LA20_2==THEN||(LA20_2 >= 55 && LA20_2 <= 57)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt20=3;
                }
                break;
            case DOUBLE:
                {
                alt20=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt20=5;
                }
                break;
            case 54:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:159:12: DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DURATION80=(Token)match(input,DURATION,FOLLOW_DURATION_in_atom1125); 
                    DURATION80_tree = 
                    (AslTree)adaptor.create(DURATION80)
                    ;
                    adaptor.addChild(root_0, DURATION80_tree);


                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:160:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID81=(Token)match(input,ID,FOLLOW_ID_in_atom1133); 
                    ID81_tree = 
                    (AslTree)adaptor.create(ID81)
                    ;
                    adaptor.addChild(root_0, ID81_tree);


                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:161:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT82=(Token)match(input,INT,FOLLOW_INT_in_atom1148); 
                    INT82_tree = 
                    (AslTree)adaptor.create(INT82)
                    ;
                    adaptor.addChild(root_0, INT82_tree);


                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:162:13: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE83=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1162); 
                    DOUBLE83_tree = 
                    (AslTree)adaptor.create(DOUBLE83)
                    ;
                    adaptor.addChild(root_0, DOUBLE83_tree);


                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: (b= TRUE |b= FALSE )
                    {
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: (b= TRUE |b= FALSE )
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
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1179);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1185);  
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
                    // 163:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:164:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1208);
                    funcall84=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall84.getTree());

                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:165:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal85=(Token)match(input,54,FOLLOW_54_in_atom1222); 

                    pushFollow(FOLLOW_expr_in_atom1225);
                    expr86=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr86.getTree());

                    char_literal87=(Token)match(input,55,FOLLOW_55_in_atom1227); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
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
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:13: ID '(' ( expr_list )? ')'
            {
            ID88=(Token)match(input,ID,FOLLOW_ID_in_funcall1248);  
            stream_ID.add(ID88);


            char_literal89=(Token)match(input,54,FOLLOW_54_in_funcall1250);  
            stream_54.add(char_literal89);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:20: ( expr_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0 >= DOUBLE && LA21_0 <= DURATION)||LA21_0==FALSE||LA21_0==ID||LA21_0==INT||LA21_0==MINUS||LA21_0==NOT||LA21_0==PLUS||LA21_0==TRUE||LA21_0==54) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1252);
                    expr_list90=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list90.getTree());

                    }
                    break;

            }


            char_literal91=(Token)match(input,55,FOLLOW_55_in_funcall1255);  
            stream_55.add(char_literal91);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 169:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:61: ( expr_list )?
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal93=null;
        AslParser.expr_return expr92 =null;

        AslParser.expr_return expr94 =null;


        AslTree char_literal93_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:10: ( expr ( ',' ! expr )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1288);
            expr92=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr92.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:18: ( ',' ! expr )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==56) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:19: ',' ! expr
            	    {
            	    char_literal93=(Token)match(input,56,FOLLOW_56_in_expr_list1291); 

            	    pushFollow(FOLLOW_expr_in_expr_list1294);
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:1: note : NOTE ^ ( INT )? ;
    public final AslParser.note_return note() throws RecognitionException {
        AslParser.note_return retval = new AslParser.note_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOTE95=null;
        Token INT96=null;

        AslTree NOTE95_tree=null;
        AslTree INT96_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:6: ( NOTE ^ ( INT )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:8: NOTE ^ ( INT )?
            {
            root_0 = (AslTree)adaptor.nil();


            NOTE95=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1312); 
            NOTE95_tree = 
            (AslTree)adaptor.create(NOTE95)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE95_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:14: ( INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:15: INT
                    {
                    INT96=(Token)match(input,INT,FOLLOW_INT_in_note1316); 
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


    public static class play_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "play"
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:1: play : PLAY ^ note DURATION ;
    public final AslParser.play_return play() throws RecognitionException {
        AslParser.play_return retval = new AslParser.play_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLAY97=null;
        Token DURATION99=null;
        AslParser.note_return note98 =null;


        AslTree PLAY97_tree=null;
        AslTree DURATION99_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:6: ( PLAY ^ note DURATION )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:8: PLAY ^ note DURATION
            {
            root_0 = (AslTree)adaptor.nil();


            PLAY97=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1326); 
            PLAY97_tree = 
            (AslTree)adaptor.create(PLAY97)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PLAY97_tree, root_0);


            pushFollow(FOLLOW_note_in_play1329);
            note98=note();

            state._fsp--;

            adaptor.addChild(root_0, note98.getTree());

            DURATION99=(Token)match(input,DURATION,FOLLOW_DURATION_in_play1331); 
            DURATION99_tree = 
            (AslTree)adaptor.create(DURATION99)
            ;
            adaptor.addChild(root_0, DURATION99_tree);


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


 

    public static final BitSet FOLLOW_func_in_prog182 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EOF_in_prog185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func224 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_func227 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_params_in_func229 = new BitSet(new long[]{0x020C62200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_func231 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_params252 = new BitSet(new long[]{0x00A0000004000000L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_paramlist286 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_53_in_param314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_param318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions375 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_block_instructions378 = new BitSet(new long[]{0x020C62200C004000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions380 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_play_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignnote_in_instruction441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignduration_in_instruction463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign650 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assign654 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_assign656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_assignnote687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assignnote691 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_assignnote693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_assignduration720 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EQUAL_in_assignduration724 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_assignduration726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt748 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt751 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt753 = new BitSet(new long[]{0x020C62200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt756 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt759 = new BitSet(new long[]{0x020C62200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt762 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt789 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_while_stmt792 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DO_in_while_stmt794 = new BitSet(new long[]{0x020C62200C004000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt797 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt822 = new BitSet(new long[]{0x0042041214206002L});
    public static final BitSet FOLLOW_expr_in_return_stmt825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read844 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_read847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write867 = new BitSet(new long[]{0x0042841214206000L});
    public static final BitSet FOLLOW_expr_in_write871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr900 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_expr903 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_boolterm_in_expr906 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm926 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm929 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm932 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact952 = new BitSet(new long[]{0x0000004123080002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact956 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact961 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_LT_in_boolfact966 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_LE_in_boolfact971 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_GT_in_boolfact976 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_GE_in_boolfact981 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1005 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1010 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1015 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_term_in_num_expr1019 = new BitSet(new long[]{0x0000040200000002L});
    public static final BitSet FOLLOW_factor_in_term1043 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_MUL_in_term1048 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_DIV_in_term1053 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_MOD_in_term1058 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_factor_in_term1062 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_NOT_in_factor1085 = new BitSet(new long[]{0x0042000014206000L});
    public static final BitSet FOLLOW_PLUS_in_factor1090 = new BitSet(new long[]{0x0042000014206000L});
    public static final BitSet FOLLOW_MINUS_in_factor1095 = new BitSet(new long[]{0x0042000014206000L});
    public static final BitSet FOLLOW_atom_in_factor1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_atom1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_atom1222 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_atom1225 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_atom1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1248 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_funcall1250 = new BitSet(new long[]{0x00C2041214206000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1252 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_funcall1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1288 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_expr_list1291 = new BitSet(new long[]{0x0042041214206000L});
    public static final BitSet FOLLOW_expr_in_expr_list1294 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1312 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_INT_in_note1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1326 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_note_in_play1329 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DURATION_in_play1331 = new BitSet(new long[]{0x0000000000000002L});

}