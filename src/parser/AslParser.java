// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 10:01:18

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ASSIGNDURATION", "ASSIGNNOTE", "BOOLEAN", "CLOSEC", "COMMENT", "COMPAS", "DIV", "DO", "DOUBLE", "DP", "DURATION", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINUS", "MOD", "MUL", "NOT", "NOTE", "NOT_EQUAL", "OPENC", "OR", "PARAMS", "PLAY", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'"
    };

    public static final int EOF=-1;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int MINUS=36;
    public static final int MOD=37;
    public static final int MUL=38;
    public static final int NOT=39;
    public static final int NOTE=40;
    public static final int NOT_EQUAL=41;
    public static final int OPENC=42;
    public static final int OR=43;
    public static final int PARAMS=44;
    public static final int PLAY=45;
    public static final int PLUS=46;
    public static final int PREF=47;
    public static final int PVALUE=48;
    public static final int READ=49;
    public static final int RETURN=50;
    public static final int STRING=51;
    public static final int THEN=52;
    public static final int TRUE=53;
    public static final int WHILE=54;
    public static final int WRITE=55;
    public static final int WS=56;

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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:8: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:10: '(' ( paramlist )? ')'
            {
            char_literal8=(Token)match(input,58,FOLLOW_58_in_params252);  
            stream_58.add(char_literal8);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:70:14: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==57) ) {
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


            char_literal10=(Token)match(input,59,FOLLOW_59_in_params257);  
            stream_59.add(char_literal10);


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

                if ( (LA3_0==60) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:74:19: ',' ! param
            	    {
            	    char_literal12=(Token)match(input,60,FOLLOW_60_in_paramlist286); 

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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:79:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
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
                    char_literal14=(Token)match(input,57,FOLLOW_57_in_param314);  
                    stream_57.add(char_literal14);


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
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
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

                if ( (LA5_0==61) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:85:25: ';' instruction
            	    {
            	    char_literal16=(Token)match(input,61,FOLLOW_61_in_block_instructions378);  
            	    stream_61.add(char_literal16);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:90:1: instruction : ( play | assignnote | assignduration | assigncompas | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
    public final AslParser.instruction_return instruction() throws RecognitionException {
        AslParser.instruction_return retval = new AslParser.instruction_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.play_return play18 =null;

        AslParser.assignnote_return assignnote19 =null;

        AslParser.assignduration_return assignduration20 =null;

        AslParser.assigncompas_return assigncompas21 =null;

        AslParser.assign_return assign22 =null;

        AslParser.ite_stmt_return ite_stmt23 =null;

        AslParser.while_stmt_return while_stmt24 =null;

        AslParser.funcall_return funcall25 =null;

        AslParser.return_stmt_return return_stmt26 =null;

        AslParser.read_return read27 =null;

        AslParser.write_return write28 =null;



        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:91:9: ( play | assignnote | assignduration | assigncompas | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
            int alt6=12;
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
            case COMPAS:
                {
                alt6=4;
                }
                break;
            case ID:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==EQUAL) ) {
                    alt6=5;
                }
                else if ( (LA6_5==58) ) {
                    alt6=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=6;
                }
                break;
            case WHILE:
                {
                alt6=7;
                }
                break;
            case RETURN:
                {
                alt6=9;
                }
                break;
            case READ:
                {
                alt6=10;
                }
                break;
            case WRITE:
                {
                alt6=11;
                }
                break;
            case ELSE:
            case ENDFUNC:
            case ENDIF:
            case ENDWHILE:
            case 61:
                {
                alt6=12;
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:94:11: assigncompas
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assigncompas_in_instruction475);
                    assigncompas21=assigncompas();

                    state._fsp--;

                    adaptor.addChild(root_0, assigncompas21.getTree());

                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:95:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction487);
                    assign22=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 6 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:96:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction499);
                    ite_stmt23=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:97:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction519);
                    while_stmt24=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt24.getTree());

                    }
                    break;
                case 8 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:98:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction539);
                    funcall25=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall25.getTree());

                    }
                    break;
                case 9 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:99:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction560);
                    return_stmt26=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt26.getTree());

                    }
                    break;
                case 10 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:100:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction577);
                    read27=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read27.getTree());

                    }
                    break;
                case 11 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:101:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction602);
                    write28=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write28.getTree());

                    }
                    break;
                case 12 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:103:9: 
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:108:1: assign : ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) ;
    public final AslParser.assign_return assign() throws RecognitionException {
        AslParser.assign_return retval = new AslParser.assign_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token ID29=null;
        AslParser.expr_return expr30 =null;


        AslTree eq_tree=null;
        AslTree ID29_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:108:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:108:10: ID eq= EQUAL expr
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_assign662);  
            stream_ID.add(ID29);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign666);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign668);
            expr30=expr();

            state._fsp--;

            stream_expr.add(expr30.getTree());

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
            // 108:27: -> ^( ASSIGN[$eq,\":=\"] ID expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:108:30: ^( ASSIGN[$eq,\":=\"] ID expr )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:111:1: assignnote : note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) ;
    public final AslParser.assignnote_return assignnote() throws RecognitionException {
        AslParser.assignnote_return retval = new AslParser.assignnote_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        AslParser.note_return note31 =null;

        AslParser.expr_return expr32 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:111:13: ( note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:111:17: note eq= EQUAL expr
            {
            pushFollow(FOLLOW_note_in_assignnote699);
            note31=note();

            state._fsp--;

            stream_note.add(note31.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignnote703);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignnote705);
            expr32=expr();

            state._fsp--;

            stream_expr.add(expr32.getTree());

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
            // 111:36: -> ^( ASSIGNNOTE[$eq,\":=\"] note expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:111:39: ^( ASSIGNNOTE[$eq,\":=\"] note expr )
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:114:1: assignduration : DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) ;
    public final AslParser.assignduration_return assignduration() throws RecognitionException {
        AslParser.assignduration_return retval = new AslParser.assignduration_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token eq=null;
        Token DURATION33=null;
        AslParser.expr_return expr34 =null;


        AslTree eq_tree=null;
        AslTree DURATION33_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_DURATION=new RewriteRuleTokenStream(adaptor,"token DURATION");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:114:15: ( DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:114:17: DURATION eq= EQUAL expr
            {
            DURATION33=(Token)match(input,DURATION,FOLLOW_DURATION_in_assignduration732);  
            stream_DURATION.add(DURATION33);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignduration736);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignduration738);
            expr34=expr();

            state._fsp--;

            stream_expr.add(expr34.getTree());

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
            // 114:40: -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:114:43: ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr )
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


    public static class assigncompas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigncompas"
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:1: assigncompas : COMPAS ^ ID expr DP ! expr DP ! expr OPENC ! ( NOTE ',' ! DURATION DP !)* ( NOTE ',' ! DURATION ) CLOSEC !;
    public final AslParser.assigncompas_return assigncompas() throws RecognitionException {
        AslParser.assigncompas_return retval = new AslParser.assigncompas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COMPAS35=null;
        Token ID36=null;
        Token DP38=null;
        Token DP40=null;
        Token OPENC42=null;
        Token NOTE43=null;
        Token char_literal44=null;
        Token DURATION45=null;
        Token DP46=null;
        Token NOTE47=null;
        Token char_literal48=null;
        Token DURATION49=null;
        Token CLOSEC50=null;
        AslParser.expr_return expr37 =null;

        AslParser.expr_return expr39 =null;

        AslParser.expr_return expr41 =null;


        AslTree COMPAS35_tree=null;
        AslTree ID36_tree=null;
        AslTree DP38_tree=null;
        AslTree DP40_tree=null;
        AslTree OPENC42_tree=null;
        AslTree NOTE43_tree=null;
        AslTree char_literal44_tree=null;
        AslTree DURATION45_tree=null;
        AslTree DP46_tree=null;
        AslTree NOTE47_tree=null;
        AslTree char_literal48_tree=null;
        AslTree DURATION49_tree=null;
        AslTree CLOSEC50_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:13: ( COMPAS ^ ID expr DP ! expr DP ! expr OPENC ! ( NOTE ',' ! DURATION DP !)* ( NOTE ',' ! DURATION ) CLOSEC !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:15: COMPAS ^ ID expr DP ! expr DP ! expr OPENC ! ( NOTE ',' ! DURATION DP !)* ( NOTE ',' ! DURATION ) CLOSEC !
            {
            root_0 = (AslTree)adaptor.nil();


            COMPAS35=(Token)match(input,COMPAS,FOLLOW_COMPAS_in_assigncompas759); 
            COMPAS35_tree = 
            (AslTree)adaptor.create(COMPAS35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(COMPAS35_tree, root_0);


            ID36=(Token)match(input,ID,FOLLOW_ID_in_assigncompas762); 
            ID36_tree = 
            (AslTree)adaptor.create(ID36)
            ;
            adaptor.addChild(root_0, ID36_tree);


            pushFollow(FOLLOW_expr_in_assigncompas764);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DP38=(Token)match(input,DP,FOLLOW_DP_in_assigncompas766); 

            pushFollow(FOLLOW_expr_in_assigncompas769);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            DP40=(Token)match(input,DP,FOLLOW_DP_in_assigncompas771); 

            pushFollow(FOLLOW_expr_in_assigncompas774);
            expr41=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr41.getTree());

            OPENC42=(Token)match(input,OPENC,FOLLOW_OPENC_in_assigncompas776); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:56: ( NOTE ',' ! DURATION DP !)*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NOTE) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==60) ) {
                        int LA7_2 = input.LA(3);

                        if ( (LA7_2==DURATION) ) {
                            int LA7_3 = input.LA(4);

                            if ( (LA7_3==DP) ) {
                                alt7=1;
                            }


                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:57: NOTE ',' ! DURATION DP !
            	    {
            	    NOTE43=(Token)match(input,NOTE,FOLLOW_NOTE_in_assigncompas780); 
            	    NOTE43_tree = 
            	    (AslTree)adaptor.create(NOTE43)
            	    ;
            	    adaptor.addChild(root_0, NOTE43_tree);


            	    char_literal44=(Token)match(input,60,FOLLOW_60_in_assigncompas782); 

            	    DURATION45=(Token)match(input,DURATION,FOLLOW_DURATION_in_assigncompas785); 
            	    DURATION45_tree = 
            	    (AslTree)adaptor.create(DURATION45)
            	    ;
            	    adaptor.addChild(root_0, DURATION45_tree);


            	    DP46=(Token)match(input,DP,FOLLOW_DP_in_assigncompas787); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:82: ( NOTE ',' ! DURATION )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:117:83: NOTE ',' ! DURATION
            {
            NOTE47=(Token)match(input,NOTE,FOLLOW_NOTE_in_assigncompas793); 
            NOTE47_tree = 
            (AslTree)adaptor.create(NOTE47)
            ;
            adaptor.addChild(root_0, NOTE47_tree);


            char_literal48=(Token)match(input,60,FOLLOW_60_in_assigncompas795); 

            DURATION49=(Token)match(input,DURATION,FOLLOW_DURATION_in_assigncompas798); 
            DURATION49_tree = 
            (AslTree)adaptor.create(DURATION49)
            ;
            adaptor.addChild(root_0, DURATION49_tree);


            }


            CLOSEC50=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_assigncompas801); 

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
    // $ANTLR end "assigncompas"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:1: ite_stmt : IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !;
    public final AslParser.ite_stmt_return ite_stmt() throws RecognitionException {
        AslParser.ite_stmt_return retval = new AslParser.ite_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token IF51=null;
        Token THEN53=null;
        Token ELSE55=null;
        Token ENDIF57=null;
        AslParser.expr_return expr52 =null;

        AslParser.block_instructions_return block_instructions54 =null;

        AslParser.block_instructions_return block_instructions56 =null;


        AslTree IF51_tree=null;
        AslTree THEN53_tree=null;
        AslTree ELSE55_tree=null;
        AslTree ENDIF57_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF51=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt813); 
            IF51_tree = 
            (AslTree)adaptor.create(IF51)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF51_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt816);
            expr52=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr52.getTree());

            THEN53=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt818); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt821);
            block_instructions54=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions54.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:46: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:121:47: ELSE ! block_instructions
                    {
                    ELSE55=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt824); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt827);
                    block_instructions56=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions56.getTree());

                    }
                    break;

            }


            ENDIF57=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt831); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:1: while_stmt : WHILE ^ expr DO ! block_instructions ENDWHILE !;
    public final AslParser.while_stmt_return while_stmt() throws RecognitionException {
        AslParser.while_stmt_return retval = new AslParser.while_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WHILE58=null;
        Token DO60=null;
        Token ENDWHILE62=null;
        AslParser.expr_return expr59 =null;

        AslParser.block_instructions_return block_instructions61 =null;


        AslTree WHILE58_tree=null;
        AslTree DO60_tree=null;
        AslTree ENDWHILE62_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:125:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE58=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt854); 
            WHILE58_tree = 
            (AslTree)adaptor.create(WHILE58)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE58_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt857);
            expr59=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr59.getTree());

            DO60=(Token)match(input,DO,FOLLOW_DO_in_while_stmt859); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt862);
            block_instructions61=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions61.getTree());

            ENDWHILE62=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt864); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:1: return_stmt : RETURN ^ ( expr )? ;
    public final AslParser.return_stmt_return return_stmt() throws RecognitionException {
        AslParser.return_stmt_return retval = new AslParser.return_stmt_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token RETURN63=null;
        AslParser.expr_return expr64 =null;


        AslTree RETURN63_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:13: ( RETURN ^ ( expr )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN63=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt887); 
            RETURN63_tree = 
            (AslTree)adaptor.create(RETURN63)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN63_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:23: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOUBLE||LA9_0==DURATION||LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==58) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:129:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt890);
                    expr64=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr64.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:1: read : READ ^ ID ;
    public final AslParser.read_return read() throws RecognitionException {
        AslParser.read_return retval = new AslParser.read_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token READ65=null;
        Token ID66=null;

        AslTree READ65_tree=null;
        AslTree ID66_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:6: ( READ ^ ID )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:133:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ65=(Token)match(input,READ,FOLLOW_READ_in_read909); 
            READ65_tree = 
            (AslTree)adaptor.create(READ65)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ65_tree, root_0);


            ID66=(Token)match(input,ID,FOLLOW_ID_in_read912); 
            ID66_tree = 
            (AslTree)adaptor.create(ID66)
            ;
            adaptor.addChild(root_0, ID66_tree);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:1: write : WRITE ^ ( expr | STRING ) ;
    public final AslParser.write_return write() throws RecognitionException {
        AslParser.write_return retval = new AslParser.write_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token WRITE67=null;
        Token STRING69=null;
        AslParser.expr_return expr68 =null;


        AslTree WRITE67_tree=null;
        AslTree STRING69_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:7: ( WRITE ^ ( expr | STRING ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE67=(Token)match(input,WRITE,FOLLOW_WRITE_in_write932); 
            WRITE67_tree = 
            (AslTree)adaptor.create(WRITE67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE67_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:18: ( expr | STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOUBLE||LA10_0==DURATION||LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==58) ) {
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write936);
                    expr68=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr68.getTree());

                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:137:26: STRING
                    {
                    STRING69=(Token)match(input,STRING,FOLLOW_STRING_in_write940); 
                    STRING69_tree = 
                    (AslTree)adaptor.create(STRING69)
                    ;
                    adaptor.addChild(root_0, STRING69_tree);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:141:1: expr : boolterm ( OR ^ boolterm )* ;
    public final AslParser.expr_return expr() throws RecognitionException {
        AslParser.expr_return retval = new AslParser.expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token OR71=null;
        AslParser.boolterm_return boolterm70 =null;

        AslParser.boolterm_return boolterm72 =null;


        AslTree OR71_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:141:9: ( boolterm ( OR ^ boolterm )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:141:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr965);
            boolterm70=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm70.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:141:22: ( OR ^ boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:141:23: OR ^ boolterm
            	    {
            	    OR71=(Token)match(input,OR,FOLLOW_OR_in_expr968); 
            	    OR71_tree = 
            	    (AslTree)adaptor.create(OR71)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR71_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr971);
            	    boolterm72=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm72.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:144:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final AslParser.boolterm_return boolterm() throws RecognitionException {
        AslParser.boolterm_return retval = new AslParser.boolterm_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token AND74=null;
        AslParser.boolfact_return boolfact73 =null;

        AslParser.boolfact_return boolfact75 =null;


        AslTree AND74_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:144:9: ( boolfact ( AND ^ boolfact )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:144:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm991);
            boolfact73=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact73.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:144:22: ( AND ^ boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:144:23: AND ^ boolfact
            	    {
            	    AND74=(Token)match(input,AND,FOLLOW_AND_in_boolterm994); 
            	    AND74_tree = 
            	    (AslTree)adaptor.create(AND74)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND74_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm997);
            	    boolfact75=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact75.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:1: boolfact : num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final AslParser.boolfact_return boolfact() throws RecognitionException {
        AslParser.boolfact_return retval = new AslParser.boolfact_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token EQUAL77=null;
        Token NOT_EQUAL78=null;
        Token LT79=null;
        Token LE80=null;
        Token GT81=null;
        Token GE82=null;
        AslParser.num_expr_return num_expr76 =null;

        AslParser.num_expr_return num_expr83 =null;


        AslTree EQUAL77_tree=null;
        AslTree NOT_EQUAL78_tree=null;
        AslTree LT79_tree=null;
        AslTree LE80_tree=null;
        AslTree GT81_tree=null;
        AslTree GE82_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1017);
            num_expr76=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr76.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==EQUAL||(LA14_0 >= GE && LA14_0 <= GT)||LA14_0==LE||LA14_0==LT||LA14_0==NOT_EQUAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:24: EQUAL ^
                            {
                            EQUAL77=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1021); 
                            EQUAL77_tree = 
                            (AslTree)adaptor.create(EQUAL77)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL77_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL78=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1026); 
                            NOT_EQUAL78_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL78)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL78_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:46: LT ^
                            {
                            LT79=(Token)match(input,LT,FOLLOW_LT_in_boolfact1031); 
                            LT79_tree = 
                            (AslTree)adaptor.create(LT79)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT79_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:52: LE ^
                            {
                            LE80=(Token)match(input,LE,FOLLOW_LE_in_boolfact1036); 
                            LE80_tree = 
                            (AslTree)adaptor.create(LE80)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE80_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:58: GT ^
                            {
                            GT81=(Token)match(input,GT,FOLLOW_GT_in_boolfact1041); 
                            GT81_tree = 
                            (AslTree)adaptor.create(GT81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT81_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:147:64: GE ^
                            {
                            GE82=(Token)match(input,GE,FOLLOW_GE_in_boolfact1046); 
                            GE82_tree = 
                            (AslTree)adaptor.create(GE82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE82_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1050);
                    num_expr83=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr83.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final AslParser.num_expr_return num_expr() throws RecognitionException {
        AslParser.num_expr_return retval = new AslParser.num_expr_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLUS85=null;
        Token MINUS86=null;
        AslParser.term_return term84 =null;

        AslParser.term_return term87 =null;


        AslTree PLUS85_tree=null;
        AslTree MINUS86_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1070);
            term84=term();

            state._fsp--;

            adaptor.addChild(root_0, term84.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:18: ( ( PLUS ^| MINUS ^) term )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MINUS||LA16_0==PLUS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:20: ( PLUS ^| MINUS ^)
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
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:21: PLUS ^
            	            {
            	            PLUS85=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1075); 
            	            PLUS85_tree = 
            	            (AslTree)adaptor.create(PLUS85)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS85_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:150:29: MINUS ^
            	            {
            	            MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1080); 
            	            MINUS86_tree = 
            	            (AslTree)adaptor.create(MINUS86)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS86_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1084);
            	    term87=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term87.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final AslParser.term_return term() throws RecognitionException {
        AslParser.term_return retval = new AslParser.term_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token MUL89=null;
        Token DIV90=null;
        Token MOD91=null;
        AslParser.factor_return factor88 =null;

        AslParser.factor_return factor92 =null;


        AslTree MUL89_tree=null;
        AslTree DIV90_tree=null;
        AslTree MOD91_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1108);
            factor88=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor88.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DIV||(LA18_0 >= MOD && LA18_0 <= MUL)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:23: MUL ^
            	            {
            	            MUL89=(Token)match(input,MUL,FOLLOW_MUL_in_term1113); 
            	            MUL89_tree = 
            	            (AslTree)adaptor.create(MUL89)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL89_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:30: DIV ^
            	            {
            	            DIV90=(Token)match(input,DIV,FOLLOW_DIV_in_term1118); 
            	            DIV90_tree = 
            	            (AslTree)adaptor.create(DIV90)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV90_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:153:37: MOD ^
            	            {
            	            MOD91=(Token)match(input,MOD,FOLLOW_MOD_in_term1123); 
            	            MOD91_tree = 
            	            (AslTree)adaptor.create(MOD91)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD91_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1127);
            	    factor92=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor92.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final AslParser.factor_return factor() throws RecognitionException {
        AslParser.factor_return retval = new AslParser.factor_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOT93=null;
        Token PLUS94=null;
        Token MINUS95=null;
        AslParser.atom_return atom96 =null;


        AslTree NOT93_tree=null;
        AslTree PLUS94_tree=null;
        AslTree MINUS95_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:14: NOT ^
                    {
                    NOT93=(Token)match(input,NOT,FOLLOW_NOT_in_factor1150); 
                    NOT93_tree = 
                    (AslTree)adaptor.create(NOT93)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT93_tree, root_0);


                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:21: PLUS ^
                    {
                    PLUS94=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1155); 
                    PLUS94_tree = 
                    (AslTree)adaptor.create(PLUS94)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS94_tree, root_0);


                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:156:29: MINUS ^
                    {
                    MINUS95=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1160); 
                    MINUS95_tree = 
                    (AslTree)adaptor.create(MINUS95)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS95_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1165);
            atom96=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom96.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:1: atom : ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final AslParser.atom_return atom() throws RecognitionException {
        AslParser.atom_return retval = new AslParser.atom_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token b=null;
        Token DURATION97=null;
        Token ID98=null;
        Token INT99=null;
        Token DOUBLE100=null;
        Token char_literal102=null;
        Token char_literal104=null;
        AslParser.funcall_return funcall101 =null;

        AslParser.expr_return expr103 =null;


        AslTree b_tree=null;
        AslTree DURATION97_tree=null;
        AslTree ID98_tree=null;
        AslTree INT99_tree=null;
        AslTree DOUBLE100_tree=null;
        AslTree char_literal102_tree=null;
        AslTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:9: ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
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

                if ( (LA21_2==58) ) {
                    alt21=6;
                }
                else if ( (LA21_2==AND||(LA21_2 >= DIV && LA21_2 <= DO)||LA21_2==DP||(LA21_2 >= ELSE && LA21_2 <= EQUAL)||(LA21_2 >= GE && LA21_2 <= GT)||LA21_2==LE||(LA21_2 >= LT && LA21_2 <= MUL)||(LA21_2 >= NOT_EQUAL && LA21_2 <= OR)||LA21_2==PLUS||LA21_2==THEN||(LA21_2 >= 59 && LA21_2 <= 61)) ) {
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
            case 58:
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:163:12: DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DURATION97=(Token)match(input,DURATION,FOLLOW_DURATION_in_atom1190); 
                    DURATION97_tree = 
                    (AslTree)adaptor.create(DURATION97)
                    ;
                    adaptor.addChild(root_0, DURATION97_tree);


                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:164:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID98=(Token)match(input,ID,FOLLOW_ID_in_atom1198); 
                    ID98_tree = 
                    (AslTree)adaptor.create(ID98)
                    ;
                    adaptor.addChild(root_0, ID98_tree);


                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:165:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT99=(Token)match(input,INT,FOLLOW_INT_in_atom1213); 
                    INT99_tree = 
                    (AslTree)adaptor.create(INT99)
                    ;
                    adaptor.addChild(root_0, INT99_tree);


                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:166:13: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE100=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1227); 
                    DOUBLE100_tree = 
                    (AslTree)adaptor.create(DOUBLE100)
                    ;
                    adaptor.addChild(root_0, DOUBLE100_tree);


                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:167:13: (b= TRUE |b= FALSE )
                    {
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:167:13: (b= TRUE |b= FALSE )
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
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:167:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1244);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:167:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1250);  
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
                    // 167:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:167:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:168:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1273);
                    funcall101=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall101.getTree());

                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal102=(Token)match(input,58,FOLLOW_58_in_atom1287); 

                    pushFollow(FOLLOW_expr_in_atom1290);
                    expr103=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr103.getTree());

                    char_literal104=(Token)match(input,59,FOLLOW_59_in_atom1292); 

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final AslParser.funcall_return funcall() throws RecognitionException {
        AslParser.funcall_return retval = new AslParser.funcall_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token ID105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        AslParser.expr_list_return expr_list107 =null;


        AslTree ID105_tree=null;
        AslTree char_literal106_tree=null;
        AslTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:13: ID '(' ( expr_list )? ')'
            {
            ID105=(Token)match(input,ID,FOLLOW_ID_in_funcall1313);  
            stream_ID.add(ID105);


            char_literal106=(Token)match(input,58,FOLLOW_58_in_funcall1315);  
            stream_58.add(char_literal106);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:20: ( expr_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==DOUBLE||LA22_0==DURATION||LA22_0==FALSE||LA22_0==ID||LA22_0==INT||LA22_0==MINUS||LA22_0==NOT||LA22_0==PLUS||LA22_0==TRUE||LA22_0==58) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1317);
                    expr_list107=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list107.getTree());

                    }
                    break;

            }


            char_literal108=(Token)match(input,59,FOLLOW_59_in_funcall1320);  
            stream_59.add(char_literal108);


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
            // 173:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:51: ^( ARGLIST ( expr_list )? )
                {
                AslTree root_2 = (AslTree)adaptor.nil();
                root_2 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:61: ( expr_list )?
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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:1: expr_list : expr ( ',' ! expr )* ;
    public final AslParser.expr_list_return expr_list() throws RecognitionException {
        AslParser.expr_list_return retval = new AslParser.expr_list_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal110=null;
        AslParser.expr_return expr109 =null;

        AslParser.expr_return expr111 =null;


        AslTree char_literal110_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:10: ( expr ( ',' ! expr )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1353);
            expr109=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr109.getTree());

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:18: ( ',' ! expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==60) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:19: ',' ! expr
            	    {
            	    char_literal110=(Token)match(input,60,FOLLOW_60_in_expr_list1356); 

            	    pushFollow(FOLLOW_expr_in_expr_list1359);
            	    expr111=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr111.getTree());

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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:1: note : NOTE ^ ( INT )? ;
    public final AslParser.note_return note() throws RecognitionException {
        AslParser.note_return retval = new AslParser.note_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token NOTE112=null;
        Token INT113=null;

        AslTree NOTE112_tree=null;
        AslTree INT113_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:6: ( NOTE ^ ( INT )? )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:8: NOTE ^ ( INT )?
            {
            root_0 = (AslTree)adaptor.nil();


            NOTE112=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1377); 
            NOTE112_tree = 
            (AslTree)adaptor.create(NOTE112)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE112_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:14: ( INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:15: INT
                    {
                    INT113=(Token)match(input,INT,FOLLOW_INT_in_note1381); 
                    INT113_tree = 
                    (AslTree)adaptor.create(INT113)
                    ;
                    adaptor.addChild(root_0, INT113_tree);


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
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:1: play : PLAY ^ ( note DURATION | ID ) ;
    public final AslParser.play_return play() throws RecognitionException {
        AslParser.play_return retval = new AslParser.play_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token PLAY114=null;
        Token DURATION116=null;
        Token ID117=null;
        AslParser.note_return note115 =null;


        AslTree PLAY114_tree=null;
        AslTree DURATION116_tree=null;
        AslTree ID117_tree=null;

        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:6: ( PLAY ^ ( note DURATION | ID ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:8: PLAY ^ ( note DURATION | ID )
            {
            root_0 = (AslTree)adaptor.nil();


            PLAY114=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1391); 
            PLAY114_tree = 
            (AslTree)adaptor.create(PLAY114)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(PLAY114_tree, root_0);


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:14: ( note DURATION | ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NOTE) ) {
                alt25=1;
            }
            else if ( (LA25_0==ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:15: note DURATION
                    {
                    pushFollow(FOLLOW_note_in_play1395);
                    note115=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note115.getTree());

                    DURATION116=(Token)match(input,DURATION,FOLLOW_DURATION_in_play1397); 
                    DURATION116_tree = 
                    (AslTree)adaptor.create(DURATION116)
                    ;
                    adaptor.addChild(root_0, DURATION116_tree);


                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:31: ID
                    {
                    ID117=(Token)match(input,ID,FOLLOW_ID_in_play1401); 
                    ID117_tree = 
                    (AslTree)adaptor.create(ID117)
                    ;
                    adaptor.addChild(root_0, ID117_tree);


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
    // $ANTLR end "play"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog182 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_prog185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func224 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_func227 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_params_in_func229 = new BitSet(new long[]{0x20C6210060021000L});
    public static final BitSet FOLLOW_block_instructions_in_func231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_func233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_params252 = new BitSet(new long[]{0x0A00000020000000L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_paramlist286 = new BitSet(new long[]{0x0200000020000000L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_57_in_param314 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_param318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions375 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_block_instructions378 = new BitSet(new long[]{0x20C6210060021000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions380 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_play_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignnote_in_instruction441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignduration_in_instruction463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigncompas_in_instruction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assign666 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assign668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_assignnote699 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignnote703 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assignnote705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_assignduration732 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignduration736 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assignduration738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPAS_in_assigncompas759 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_assigncompas762 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assigncompas764 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DP_in_assigncompas766 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assigncompas769 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DP_in_assigncompas771 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_assigncompas774 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_OPENC_in_assigncompas776 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOTE_in_assigncompas780 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_assigncompas782 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_assigncompas785 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DP_in_assigncompas787 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOTE_in_assigncompas793 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_assigncompas795 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_assigncompas798 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CLOSEC_in_assigncompas801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt813 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt816 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt818 = new BitSet(new long[]{0x20C6210060021000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt821 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt824 = new BitSet(new long[]{0x20C6210060021000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt827 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt854 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_while_stmt857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_stmt859 = new BitSet(new long[]{0x20C6210060021000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt862 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt887 = new BitSet(new long[]{0x04204090A1028002L});
    public static final BitSet FOLLOW_expr_in_return_stmt890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read909 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_read912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write932 = new BitSet(new long[]{0x04284090A1028000L});
    public static final BitSet FOLLOW_expr_in_write936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr965 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_OR_in_expr968 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_boolterm_in_expr971 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm991 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm994 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm997 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1017 = new BitSet(new long[]{0x0000020918400002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1021 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1026 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_LT_in_boolfact1031 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_LE_in_boolfact1036 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_GT_in_boolfact1041 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_GE_in_boolfact1046 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1070 = new BitSet(new long[]{0x0000401000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1075 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1080 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_term_in_num_expr1084 = new BitSet(new long[]{0x0000401000000002L});
    public static final BitSet FOLLOW_factor_in_term1108 = new BitSet(new long[]{0x0000006000002002L});
    public static final BitSet FOLLOW_MUL_in_term1113 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_DIV_in_term1118 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_MOD_in_term1123 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_factor_in_term1127 = new BitSet(new long[]{0x0000006000002002L});
    public static final BitSet FOLLOW_NOT_in_factor1150 = new BitSet(new long[]{0x04200000A1028000L});
    public static final BitSet FOLLOW_PLUS_in_factor1155 = new BitSet(new long[]{0x04200000A1028000L});
    public static final BitSet FOLLOW_MINUS_in_factor1160 = new BitSet(new long[]{0x04200000A1028000L});
    public static final BitSet FOLLOW_atom_in_factor1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_atom1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_atom1287 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_atom1290 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_atom1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1313 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_funcall1315 = new BitSet(new long[]{0x0C204090A1028000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1317 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funcall1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1353 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_expr_list1356 = new BitSet(new long[]{0x04204090A1028000L});
    public static final BitSet FOLLOW_expr_in_expr_list1359 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1377 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INT_in_note1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1391 = new BitSet(new long[]{0x0000010020000000L});
    public static final BitSet FOLLOW_note_in_play1395 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_play1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_play1401 = new BitSet(new long[]{0x0000000000000002L});

}