<<<<<<< HEAD
// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 10:01:18
=======
// $ANTLR 3.4 /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 11:39:53
>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "ASSIGNDURATION", "ASSIGNNOTE", "BOOLEAN", "CLOSEC", "COMMENT", "COMPAS", "DIV", "DO", "DOUBLE", "DP", "DURATION", "ELSE", "ENDFUNC", "ENDIF", "ENDWHILE", "EQUAL", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LT", "MINICOMPAS", "MINUS", "MOD", "MUL", "NOT", "NOTE", "NOT_EQUAL", "OPENC", "OR", "PARAMS", "PLAY", "PLUS", "PREF", "PVALUE", "READ", "RETURN", "STRING", "THEN", "TRUE", "WHILE", "WRITE", "WS", "'&'", "'('", "')'", "','", "';'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
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
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:91:1: instruction : ( play | assignnote | assignduration | assigncompas | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |);
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:92:9: ( play | assignnote | assignduration | assigncompas | assign | ite_stmt | while_stmt | funcall | return_stmt | read | write |)
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
                else if ( (LA6_5==59) ) {
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
            case 62:
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:95:11: assigncompas
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assigncompas_in_instruction484);
                    assigncompas21=assigncompas();

                    state._fsp--;

                    adaptor.addChild(root_0, assigncompas21.getTree());

                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:96:11: assign
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction496);
                    assign22=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:97:11: ite_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction508);
                    ite_stmt23=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt23.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:98:11: while_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction528);
                    while_stmt24=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt24.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:99:13: funcall
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction548);
                    funcall25=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall25.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:100:11: return_stmt
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction569);
                    return_stmt26=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt26.getTree());

                    }
                    break;
                case 10 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:101:11: read
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction586);
                    read27=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read27.getTree());

                    }
                    break;
                case 11 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:102:12: write
                    {
                    root_0 = (AslTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction611);
                    write28=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write28.getTree());

                    }
                    break;
                case 12 :
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
        Token ID29=null;
        AslParser.expr_return expr30 =null;


        AslTree eq_tree=null;
        AslTree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:8: ( ID eq= EQUAL expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:109:10: ID eq= EQUAL expr
            {
            ID29=(Token)match(input,ID,FOLLOW_ID_in_assign671);  
            stream_ID.add(ID29);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assign675);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assign677);
            expr30=expr();

            state._fsp--;

            stream_expr.add(expr30.getTree());

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
        AslParser.note_return note31 =null;

        AslParser.expr_return expr32 =null;


        AslTree eq_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_note=new RewriteRuleSubtreeStream(adaptor,"rule note");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:13: ( note eq= EQUAL expr -> ^( ASSIGNNOTE[$eq,\":=\"] note expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:112:17: note eq= EQUAL expr
            {
            pushFollow(FOLLOW_note_in_assignnote708);
            note31=note();

            state._fsp--;

            stream_note.add(note31.getTree());

            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignnote712);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignnote714);
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
        Token DURATION33=null;
        AslParser.expr_return expr34 =null;


        AslTree eq_tree=null;
        AslTree DURATION33_tree=null;
        RewriteRuleTokenStream stream_DURATION=new RewriteRuleTokenStream(adaptor,"token DURATION");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:15: ( DURATION eq= EQUAL expr -> ^( ASSIGNDURATION[$eq,\":=\"] DURATION expr ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:115:17: DURATION eq= EQUAL expr
            {
            DURATION33=(Token)match(input,DURATION,FOLLOW_DURATION_in_assignduration741);  
            stream_DURATION.add(DURATION33);


            eq=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_assignduration745);  
            stream_EQUAL.add(eq);


            pushFollow(FOLLOW_expr_in_assignduration747);
            expr34=expr();

            state._fsp--;

            stream_expr.add(expr34.getTree());

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


    public static class assigncompas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigncompas"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:118:1: assigncompas : COMPAS ^ ID expr DP ! expr OPENC ! minicompas ( '|' ! minicompas )* CLOSEC !;
    public final AslParser.assigncompas_return assigncompas() throws RecognitionException {
        AslParser.assigncompas_return retval = new AslParser.assigncompas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token COMPAS35=null;
        Token ID36=null;
        Token DP38=null;
        Token OPENC40=null;
        Token char_literal42=null;
        Token CLOSEC44=null;
        AslParser.expr_return expr37 =null;

        AslParser.expr_return expr39 =null;

        AslParser.minicompas_return minicompas41 =null;

        AslParser.minicompas_return minicompas43 =null;


        AslTree COMPAS35_tree=null;
        AslTree ID36_tree=null;
        AslTree DP38_tree=null;
        AslTree OPENC40_tree=null;
        AslTree char_literal42_tree=null;
        AslTree CLOSEC44_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:118:13: ( COMPAS ^ ID expr DP ! expr OPENC ! minicompas ( '|' ! minicompas )* CLOSEC !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:118:15: COMPAS ^ ID expr DP ! expr OPENC ! minicompas ( '|' ! minicompas )* CLOSEC !
            {
            root_0 = (AslTree)adaptor.nil();


            COMPAS35=(Token)match(input,COMPAS,FOLLOW_COMPAS_in_assigncompas768); 
            COMPAS35_tree = 
            (AslTree)adaptor.create(COMPAS35)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(COMPAS35_tree, root_0);


            ID36=(Token)match(input,ID,FOLLOW_ID_in_assigncompas771); 
            ID36_tree = 
            (AslTree)adaptor.create(ID36)
            ;
            adaptor.addChild(root_0, ID36_tree);


            pushFollow(FOLLOW_expr_in_assigncompas773);
            expr37=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr37.getTree());

            DP38=(Token)match(input,DP,FOLLOW_DP_in_assigncompas775); 

            pushFollow(FOLLOW_expr_in_assigncompas778);
            expr39=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr39.getTree());

            OPENC40=(Token)match(input,OPENC,FOLLOW_OPENC_in_assigncompas780); 

            pushFollow(FOLLOW_minicompas_in_assigncompas783);
            minicompas41=minicompas();

            state._fsp--;

            adaptor.addChild(root_0, minicompas41.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:118:58: ( '|' ! minicompas )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==63) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:118:59: '|' ! minicompas
            	    {
            	    char_literal42=(Token)match(input,63,FOLLOW_63_in_assigncompas786); 

            	    pushFollow(FOLLOW_minicompas_in_assigncompas789);
            	    minicompas43=minicompas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, minicompas43.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            CLOSEC44=(Token)match(input,CLOSEC,FOLLOW_CLOSEC_in_assigncompas793); 

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


    public static class minicompas_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "minicompas"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:121:1: minicompas : exprmus -> ^( MINICOMPAS exprmus ) ;
    public final AslParser.minicompas_return minicompas() throws RecognitionException {
        AslParser.minicompas_return retval = new AslParser.minicompas_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        AslParser.exprmus_return exprmus45 =null;


        RewriteRuleSubtreeStream stream_exprmus=new RewriteRuleSubtreeStream(adaptor,"rule exprmus");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:121:11: ( exprmus -> ^( MINICOMPAS exprmus ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:121:13: exprmus
            {
            pushFollow(FOLLOW_exprmus_in_minicompas804);
            exprmus45=exprmus();

            state._fsp--;

            stream_exprmus.add(exprmus45.getTree());

            // AST REWRITE
            // elements: exprmus
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (AslTree)adaptor.nil();
            // 121:21: -> ^( MINICOMPAS exprmus )
            {
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:121:24: ^( MINICOMPAS exprmus )
                {
                AslTree root_1 = (AslTree)adaptor.nil();
                root_1 = (AslTree)adaptor.becomeRoot(
                (AslTree)adaptor.create(MINICOMPAS, "MINICOMPAS")
                , root_1);

                adaptor.addChild(root_1, stream_exprmus.nextTree());

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
    // $ANTLR end "minicompas"


    public static class exprmus_return extends ParserRuleReturnScope {
        AslTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exprmus"
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:1: exprmus : ( note ',' ! DURATION ) ( DP ! note ',' ! DURATION )* ;
    public final AslParser.exprmus_return exprmus() throws RecognitionException {
        AslParser.exprmus_return retval = new AslParser.exprmus_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

        Token char_literal47=null;
        Token DURATION48=null;
        Token DP49=null;
        Token char_literal51=null;
        Token DURATION52=null;
        AslParser.note_return note46 =null;

        AslParser.note_return note50 =null;


        AslTree char_literal47_tree=null;
        AslTree DURATION48_tree=null;
        AslTree DP49_tree=null;
        AslTree char_literal51_tree=null;
        AslTree DURATION52_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:8: ( ( note ',' ! DURATION ) ( DP ! note ',' ! DURATION )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:10: ( note ',' ! DURATION ) ( DP ! note ',' ! DURATION )*
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:10: ( note ',' ! DURATION )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:11: note ',' ! DURATION
            {
            pushFollow(FOLLOW_note_in_exprmus823);
            note46=note();

            state._fsp--;

            adaptor.addChild(root_0, note46.getTree());

            char_literal47=(Token)match(input,61,FOLLOW_61_in_exprmus825); 

            DURATION48=(Token)match(input,DURATION,FOLLOW_DURATION_in_exprmus828); 
            DURATION48_tree = 
            (AslTree)adaptor.create(DURATION48)
            ;
            adaptor.addChild(root_0, DURATION48_tree);


            }


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:31: ( DP ! note ',' ! DURATION )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:124:32: DP ! note ',' ! DURATION
            	    {
            	    DP49=(Token)match(input,DP,FOLLOW_DP_in_exprmus832); 

            	    pushFollow(FOLLOW_note_in_exprmus835);
            	    note50=note();

            	    state._fsp--;

            	    adaptor.addChild(root_0, note50.getTree());

            	    char_literal51=(Token)match(input,61,FOLLOW_61_in_exprmus837); 

            	    DURATION52=(Token)match(input,DURATION,FOLLOW_DURATION_in_exprmus840); 
            	    DURATION52_tree = 
            	    (AslTree)adaptor.create(DURATION52)
            	    ;
            	    adaptor.addChild(root_0, DURATION52_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
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

        Token IF53=null;
        Token THEN55=null;
        Token ELSE57=null;
        Token ENDIF59=null;
        AslParser.expr_return expr54 =null;

        AslParser.block_instructions_return block_instructions56 =null;

        AslParser.block_instructions_return block_instructions58 =null;


        AslTree IF53_tree=null;
        AslTree THEN55_tree=null;
        AslTree ELSE57_tree=null;
        AslTree ENDIF59_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:10: ( IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:12: IF ^ expr THEN ! block_instructions ( ELSE ! block_instructions )? ENDIF !
            {
            root_0 = (AslTree)adaptor.nil();


            IF53=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt853); 
            IF53_tree = 
            (AslTree)adaptor.create(IF53)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(IF53_tree, root_0);


            pushFollow(FOLLOW_expr_in_ite_stmt856);
            expr54=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr54.getTree());

            THEN55=(Token)match(input,THEN,FOLLOW_THEN_in_ite_stmt858); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt861);
            block_instructions56=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions56.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:46: ( ELSE ! block_instructions )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:128:47: ELSE ! block_instructions
                    {
                    ELSE57=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt864); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt867);
                    block_instructions58=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions58.getTree());

                    }
                    break;

            }


            ENDIF59=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ite_stmt871); 

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

        Token WHILE60=null;
        Token DO62=null;
        Token ENDWHILE64=null;
        AslParser.expr_return expr61 =null;

        AslParser.block_instructions_return block_instructions63 =null;


        AslTree WHILE60_tree=null;
        AslTree DO62_tree=null;
        AslTree ENDWHILE64_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:12: ( WHILE ^ expr DO ! block_instructions ENDWHILE !)
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:132:14: WHILE ^ expr DO ! block_instructions ENDWHILE !
            {
            root_0 = (AslTree)adaptor.nil();


            WHILE60=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt894); 
            WHILE60_tree = 
            (AslTree)adaptor.create(WHILE60)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WHILE60_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt897);
            expr61=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr61.getTree());

            DO62=(Token)match(input,DO,FOLLOW_DO_in_while_stmt899); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt902);
            block_instructions63=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions63.getTree());

            ENDWHILE64=(Token)match(input,ENDWHILE,FOLLOW_ENDWHILE_in_while_stmt904); 

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

        Token RETURN65=null;
        AslParser.expr_return expr66 =null;


        AslTree RETURN65_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:13: ( RETURN ^ ( expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:15: RETURN ^ ( expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            RETURN65=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt927); 
            RETURN65_tree = 
            (AslTree)adaptor.create(RETURN65)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(RETURN65_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:23: ( expr )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOUBLE||LA10_0==DURATION||LA10_0==FALSE||LA10_0==ID||LA10_0==INT||LA10_0==MINUS||LA10_0==NOT||LA10_0==PLUS||LA10_0==TRUE||LA10_0==59) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:136:23: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt930);
                    expr66=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr66.getTree());

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

        Token READ67=null;
        Token ID68=null;

        AslTree READ67_tree=null;
        AslTree ID68_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:140:6: ( READ ^ ID )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:140:8: READ ^ ID
            {
            root_0 = (AslTree)adaptor.nil();


            READ67=(Token)match(input,READ,FOLLOW_READ_in_read949); 
            READ67_tree = 
            (AslTree)adaptor.create(READ67)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(READ67_tree, root_0);


            ID68=(Token)match(input,ID,FOLLOW_ID_in_read952); 
            ID68_tree = 
            (AslTree)adaptor.create(ID68)
            ;
            adaptor.addChild(root_0, ID68_tree);


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

        Token WRITE69=null;
        Token STRING71=null;
        AslParser.expr_return expr70 =null;


        AslTree WRITE69_tree=null;
        AslTree STRING71_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:7: ( WRITE ^ ( expr | STRING ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (AslTree)adaptor.nil();


            WRITE69=(Token)match(input,WRITE,FOLLOW_WRITE_in_write972); 
            WRITE69_tree = 
            (AslTree)adaptor.create(WRITE69)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(WRITE69_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:18: ( expr | STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DOUBLE||LA11_0==DURATION||LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE||LA11_0==59) ) {
                alt11=1;
            }
            else if ( (LA11_0==STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write976);
                    expr70=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr70.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:144:26: STRING
                    {
                    STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_write980); 
                    STRING71_tree = 
                    (AslTree)adaptor.create(STRING71)
                    ;
                    adaptor.addChild(root_0, STRING71_tree);


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

        Token OR73=null;
        AslParser.boolterm_return boolterm72 =null;

        AslParser.boolterm_return boolterm74 =null;


        AslTree OR73_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:9: ( boolterm ( OR ^ boolterm )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1005);
            boolterm72=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm72.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:22: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:148:23: OR ^ boolterm
            	    {
            	    OR73=(Token)match(input,OR,FOLLOW_OR_in_expr1008); 
            	    OR73_tree = 
            	    (AslTree)adaptor.create(OR73)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(OR73_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1011);
            	    boolterm74=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm74.getTree());

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

        Token AND76=null;
        AslParser.boolfact_return boolfact75 =null;

        AslParser.boolfact_return boolfact77 =null;


        AslTree AND76_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:9: ( boolfact ( AND ^ boolfact )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1031);
            boolfact75=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact75.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:22: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:151:23: AND ^ boolfact
            	    {
            	    AND76=(Token)match(input,AND,FOLLOW_AND_in_boolterm1034); 
            	    AND76_tree = 
            	    (AslTree)adaptor.create(AND76)
            	    ;
            	    root_0 = (AslTree)adaptor.becomeRoot(AND76_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1037);
            	    boolfact77=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact77.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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

        Token EQUAL79=null;
        Token NOT_EQUAL80=null;
        Token LT81=null;
        Token LE82=null;
        Token GT83=null;
        Token GE84=null;
        AslParser.num_expr_return num_expr78 =null;

        AslParser.num_expr_return num_expr85 =null;


        AslTree EQUAL79_tree=null;
        AslTree NOT_EQUAL80_tree=null;
        AslTree LT81_tree=null;
        AslTree LE82_tree=null;
        AslTree GT83_tree=null;
        AslTree GE84_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:9: ( num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:13: num_expr ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1057);
            num_expr78=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr78.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:22: ( ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EQUAL||(LA15_0 >= GE && LA15_0 <= GT)||LA15_0==LE||LA15_0==LT||LA15_0==NOT_EQUAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:23: ( EQUAL ^| NOT_EQUAL ^| LT ^| LE ^| GT ^| GE ^)
                    int alt14=6;
                    switch ( input.LA(1) ) {
                    case EQUAL:
                        {
                        alt14=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt14=2;
                        }
                        break;
                    case LT:
                        {
                        alt14=3;
                        }
                        break;
                    case LE:
                        {
                        alt14=4;
                        }
                        break;
                    case GT:
                        {
                        alt14=5;
                        }
                        break;
                    case GE:
                        {
                        alt14=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:24: EQUAL ^
                            {
                            EQUAL79=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_boolfact1061); 
                            EQUAL79_tree = 
                            (AslTree)adaptor.create(EQUAL79)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(EQUAL79_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:33: NOT_EQUAL ^
                            {
                            NOT_EQUAL80=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1066); 
                            NOT_EQUAL80_tree = 
                            (AslTree)adaptor.create(NOT_EQUAL80)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(NOT_EQUAL80_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:46: LT ^
                            {
                            LT81=(Token)match(input,LT,FOLLOW_LT_in_boolfact1071); 
                            LT81_tree = 
                            (AslTree)adaptor.create(LT81)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LT81_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:52: LE ^
                            {
                            LE82=(Token)match(input,LE,FOLLOW_LE_in_boolfact1076); 
                            LE82_tree = 
                            (AslTree)adaptor.create(LE82)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(LE82_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:58: GT ^
                            {
                            GT83=(Token)match(input,GT,FOLLOW_GT_in_boolfact1081); 
                            GT83_tree = 
                            (AslTree)adaptor.create(GT83)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GT83_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:154:64: GE ^
                            {
                            GE84=(Token)match(input,GE,FOLLOW_GE_in_boolfact1086); 
                            GE84_tree = 
                            (AslTree)adaptor.create(GE84)
                            ;
                            root_0 = (AslTree)adaptor.becomeRoot(GE84_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1090);
                    num_expr85=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr85.getTree());

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

        Token PLUS87=null;
        Token MINUS88=null;
        AslParser.term_return term86 =null;

        AslParser.term_return term89 =null;


        AslTree PLUS87_tree=null;
        AslTree MINUS88_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1110);
            term86=term();

            state._fsp--;

            adaptor.addChild(root_0, term86.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:18: ( ( PLUS ^| MINUS ^) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:20: ( PLUS ^| MINUS ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:21: PLUS ^
            	            {
            	            PLUS87=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1115); 
            	            PLUS87_tree = 
            	            (AslTree)adaptor.create(PLUS87)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(PLUS87_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:157:29: MINUS ^
            	            {
            	            MINUS88=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1120); 
            	            MINUS88_tree = 
            	            (AslTree)adaptor.create(MINUS88)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MINUS88_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1124);
            	    term89=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term89.getTree());

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

        Token MUL91=null;
        Token DIV92=null;
        Token MOD93=null;
        AslParser.factor_return factor90 =null;

        AslParser.factor_return factor94 =null;


        AslTree MUL91_tree=null;
        AslTree DIV92_tree=null;
        AslTree MOD93_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1148);
            factor90=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor90.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||(LA19_0 >= MOD && LA19_0 <= MUL)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:23: MUL ^
            	            {
            	            MUL91=(Token)match(input,MUL,FOLLOW_MUL_in_term1153); 
            	            MUL91_tree = 
            	            (AslTree)adaptor.create(MUL91)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MUL91_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:30: DIV ^
            	            {
            	            DIV92=(Token)match(input,DIV,FOLLOW_DIV_in_term1158); 
            	            DIV92_tree = 
            	            (AslTree)adaptor.create(DIV92)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(DIV92_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:160:37: MOD ^
            	            {
            	            MOD93=(Token)match(input,MOD,FOLLOW_MOD_in_term1163); 
            	            MOD93_tree = 
            	            (AslTree)adaptor.create(MOD93)
            	            ;
            	            root_0 = (AslTree)adaptor.becomeRoot(MOD93_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1167);
            	    factor94=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor94.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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

        Token NOT95=null;
        Token PLUS96=null;
        Token MINUS97=null;
        AslParser.atom_return atom98 =null;


        AslTree NOT95_tree=null;
        AslTree PLUS96_tree=null;
        AslTree MINUS97_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (AslTree)adaptor.nil();


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt20=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt20=1;
                    }
                    break;
                case PLUS:
                    {
                    alt20=2;
                    }
                    break;
                case MINUS:
                    {
                    alt20=3;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:14: NOT ^
                    {
                    NOT95=(Token)match(input,NOT,FOLLOW_NOT_in_factor1190); 
                    NOT95_tree = 
                    (AslTree)adaptor.create(NOT95)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(NOT95_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:21: PLUS ^
                    {
                    PLUS96=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1195); 
                    PLUS96_tree = 
                    (AslTree)adaptor.create(PLUS96)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLUS96_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:163:29: MINUS ^
                    {
                    MINUS97=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1200); 
                    MINUS97_tree = 
                    (AslTree)adaptor.create(MINUS97)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(MINUS97_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1205);
            atom98=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom98.getTree());

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
        Token DURATION99=null;
        Token ID100=null;
        Token INT101=null;
        Token DOUBLE102=null;
        Token char_literal104=null;
        Token char_literal106=null;
        AslParser.funcall_return funcall103 =null;

        AslParser.expr_return expr105 =null;


        AslTree b_tree=null;
        AslTree DURATION99_tree=null;
        AslTree ID100_tree=null;
        AslTree INT101_tree=null;
        AslTree DOUBLE102_tree=null;
        AslTree char_literal104_tree=null;
        AslTree char_literal106_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:170:9: ( DURATION | ID | INT | DOUBLE | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt22=7;
            switch ( input.LA(1) ) {
            case DURATION:
                {
                alt22=1;
                }
                break;
            case ID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==59) ) {
                    alt22=6;
                }
                else if ( (LA22_2==AND||(LA22_2 >= DIV && LA22_2 <= DO)||LA22_2==DP||(LA22_2 >= ELSE && LA22_2 <= EQUAL)||(LA22_2 >= GE && LA22_2 <= GT)||LA22_2==LE||LA22_2==LT||(LA22_2 >= MINUS && LA22_2 <= MUL)||(LA22_2 >= NOT_EQUAL && LA22_2 <= OR)||LA22_2==PLUS||LA22_2==THEN||(LA22_2 >= 60 && LA22_2 <= 62)) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt22=3;
                }
                break;
            case DOUBLE:
                {
                alt22=4;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt22=5;
                }
                break;
            case 59:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:170:12: DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DURATION99=(Token)match(input,DURATION,FOLLOW_DURATION_in_atom1230); 
                    DURATION99_tree = 
                    (AslTree)adaptor.create(DURATION99)
                    ;
                    adaptor.addChild(root_0, DURATION99_tree);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:171:7: ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    ID100=(Token)match(input,ID,FOLLOW_ID_in_atom1238); 
                    ID100_tree = 
                    (AslTree)adaptor.create(ID100)
                    ;
                    adaptor.addChild(root_0, ID100_tree);


                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:172:13: INT
                    {
                    root_0 = (AslTree)adaptor.nil();


                    INT101=(Token)match(input,INT,FOLLOW_INT_in_atom1253); 
                    INT101_tree = 
                    (AslTree)adaptor.create(INT101)
                    ;
                    adaptor.addChild(root_0, INT101_tree);


                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:173:13: DOUBLE
                    {
                    root_0 = (AslTree)adaptor.nil();


                    DOUBLE102=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1267); 
                    DOUBLE102_tree = 
                    (AslTree)adaptor.create(DOUBLE102)
                    ;
                    adaptor.addChild(root_0, DOUBLE102_tree);


                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    {
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:13: (b= TRUE |b= FALSE )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==TRUE) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==FALSE) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1284);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:174:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1290);  
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


                    pushFollow(FOLLOW_funcall_in_atom1313);
                    funcall103=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall103.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:176:13: '(' ! expr ')' !
                    {
                    root_0 = (AslTree)adaptor.nil();


                    char_literal104=(Token)match(input,59,FOLLOW_59_in_atom1327); 

                    pushFollow(FOLLOW_expr_in_atom1330);
                    expr105=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr105.getTree());

                    char_literal106=(Token)match(input,60,FOLLOW_60_in_atom1332); 

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

        Token ID107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        AslParser.expr_list_return expr_list109 =null;


        AslTree ID107_tree=null;
        AslTree char_literal108_tree=null;
        AslTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:13: ID '(' ( expr_list )? ')'
            {
            ID107=(Token)match(input,ID,FOLLOW_ID_in_funcall1353);  
            stream_ID.add(ID107);


            char_literal108=(Token)match(input,59,FOLLOW_59_in_funcall1355);  
            stream_59.add(char_literal108);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:20: ( expr_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==DOUBLE||LA23_0==DURATION||LA23_0==FALSE||LA23_0==ID||LA23_0==INT||LA23_0==MINUS||LA23_0==NOT||LA23_0==PLUS||LA23_0==TRUE||LA23_0==59) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1357);
                    expr_list109=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list109.getTree());

                    }
                    break;

            }


            char_literal110=(Token)match(input,60,FOLLOW_60_in_funcall1360);  
            stream_60.add(char_literal110);


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

        Token char_literal112=null;
        AslParser.expr_return expr111 =null;

        AslParser.expr_return expr113 =null;


        AslTree char_literal112_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:10: ( expr ( ',' ! expr )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:13: expr ( ',' ! expr )*
            {
            root_0 = (AslTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1393);
            expr111=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr111.getTree());

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:18: ( ',' ! expr )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==61) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:19: ',' ! expr
            	    {
            	    char_literal112=(Token)match(input,61,FOLLOW_61_in_expr_list1396); 

            	    pushFollow(FOLLOW_expr_in_expr_list1399);
            	    expr113=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr113.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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

        Token NOTE114=null;
        Token INT115=null;

        AslTree NOTE114_tree=null;
        AslTree INT115_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:6: ( NOTE ^ ( INT )? )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:8: NOTE ^ ( INT )?
            {
            root_0 = (AslTree)adaptor.nil();


            NOTE114=(Token)match(input,NOTE,FOLLOW_NOTE_in_note1417); 
            NOTE114_tree = 
            (AslTree)adaptor.create(NOTE114)
            ;
            root_0 = (AslTree)adaptor.becomeRoot(NOTE114_tree, root_0);


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:14: ( INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==INT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:15: INT
                    {
                    INT115=(Token)match(input,INT,FOLLOW_INT_in_note1421); 
                    INT115_tree = 
                    (AslTree)adaptor.create(INT115)
                    ;
                    adaptor.addChild(root_0, INT115_tree);


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
<<<<<<< HEAD
    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:1: play : PLAY ^ ( note DURATION | ID ) ;
=======
    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:1: play : ( PLAY ^ note DURATION | PLAY ^ ID );
>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9
    public final AslParser.play_return play() throws RecognitionException {
        AslParser.play_return retval = new AslParser.play_return();
        retval.start = input.LT(1);


        AslTree root_0 = null;

<<<<<<< HEAD
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
=======
        Token PLAY116=null;
        Token DURATION118=null;
        Token PLAY119=null;
        Token ID120=null;
        AslParser.note_return note117 =null;


        AslTree PLAY116_tree=null;
        AslTree DURATION118_tree=null;
        AslTree PLAY119_tree=null;
        AslTree ID120_tree=null;

        try {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:6: ( PLAY ^ note DURATION | PLAY ^ ID )
            int alt26=2;
            int LA26_0 = input.LA(1);
>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9

            if ( (LA26_0==PLAY) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==ID) ) {
                    alt26=2;
                }
                else if ( (LA26_1==NOTE) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

<<<<<<< HEAD
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
=======
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:8: PLAY ^ note DURATION
                    {
                    root_0 = (AslTree)adaptor.nil();

>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9

                    PLAY116=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1431); 
                    PLAY116_tree = 
                    (AslTree)adaptor.create(PLAY116)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLAY116_tree, root_0);


                    pushFollow(FOLLOW_note_in_play1434);
                    note117=note();

                    state._fsp--;

                    adaptor.addChild(root_0, note117.getTree());

                    DURATION118=(Token)match(input,DURATION,FOLLOW_DURATION_in_play1436); 
                    DURATION118_tree = 
                    (AslTree)adaptor.create(DURATION118)
                    ;
                    adaptor.addChild(root_0, DURATION118_tree);


                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:30: PLAY ^ ID
                    {
                    root_0 = (AslTree)adaptor.nil();


                    PLAY119=(Token)match(input,PLAY,FOLLOW_PLAY_in_play1440); 
                    PLAY119_tree = 
                    (AslTree)adaptor.create(PLAY119)
                    ;
                    root_0 = (AslTree)adaptor.becomeRoot(PLAY119_tree, root_0);


                    ID120=(Token)match(input,ID,FOLLOW_ID_in_play1443); 
                    ID120_tree = 
                    (AslTree)adaptor.create(ID120)
                    ;
                    adaptor.addChild(root_0, ID120_tree);


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


 

<<<<<<< HEAD
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
=======
    public static final BitSet FOLLOW_func_in_prog191 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EOF_in_prog194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func233 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_func236 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_params_in_func238 = new BitSet(new long[]{0x418C420060021000L});
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
    public static final BitSet FOLLOW_62_in_block_instructions387 = new BitSet(new long[]{0x418C420060021000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions389 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_play_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignnote_in_instruction450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignduration_in_instruction472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigncompas_in_instruction484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assign675 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assign677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_assignnote708 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignnote712 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assignnote714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_assignduration741 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_assignduration745 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assignduration747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPAS_in_assigncompas768 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_assigncompas771 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assigncompas773 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DP_in_assigncompas775 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_assigncompas778 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_OPENC_in_assigncompas780 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_minicompas_in_assigncompas783 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_63_in_assigncompas786 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_minicompas_in_assigncompas789 = new BitSet(new long[]{0x8000000000000400L});
    public static final BitSet FOLLOW_CLOSEC_in_assigncompas793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprmus_in_minicompas804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_note_in_exprmus823 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exprmus825 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_exprmus828 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DP_in_exprmus832 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_note_in_exprmus835 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exprmus837 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_exprmus840 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt853 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt856 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_THEN_in_ite_stmt858 = new BitSet(new long[]{0x418C420060021000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt861 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt864 = new BitSet(new long[]{0x418C420060021000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt867 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ite_stmt871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt894 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_while_stmt897 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DO_in_while_stmt899 = new BitSet(new long[]{0x418C420060021000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt902 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDWHILE_in_while_stmt904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt927 = new BitSet(new long[]{0x08408120A1028002L});
    public static final BitSet FOLLOW_expr_in_return_stmt930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read949 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_read952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write972 = new BitSet(new long[]{0x08508120A1028000L});
    public static final BitSet FOLLOW_expr_in_write976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1005 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_OR_in_expr1008 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_boolterm_in_expr1011 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1031 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1034 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1037 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1057 = new BitSet(new long[]{0x0000040918400002L});
    public static final BitSet FOLLOW_EQUAL_in_boolfact1061 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1066 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_LT_in_boolfact1071 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_LE_in_boolfact1076 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_GT_in_boolfact1081 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_GE_in_boolfact1086 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1110 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1115 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1120 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_term_in_num_expr1124 = new BitSet(new long[]{0x0000802000000002L});
    public static final BitSet FOLLOW_factor_in_term1148 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_MUL_in_term1153 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_DIV_in_term1158 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_MOD_in_term1163 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_factor_in_term1167 = new BitSet(new long[]{0x000000C000002002L});
    public static final BitSet FOLLOW_NOT_in_factor1190 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_PLUS_in_factor1195 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_MINUS_in_factor1200 = new BitSet(new long[]{0x08400000A1028000L});
    public static final BitSet FOLLOW_atom_in_factor1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_atom1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_atom1327 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_atom1330 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_atom1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1353 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_funcall1355 = new BitSet(new long[]{0x18408120A1028000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1357 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_funcall1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1393 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_expr_list1396 = new BitSet(new long[]{0x08408120A1028000L});
    public static final BitSet FOLLOW_expr_in_expr_list1399 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_NOTE_in_note1417 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_INT_in_note1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1431 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_note_in_play1434 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DURATION_in_play1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLAY_in_play1440 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ID_in_play1443 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9

}