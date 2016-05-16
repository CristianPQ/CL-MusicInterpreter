// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-16 18:35:58

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int ASSIGNNOTE=7;
    public static final int BOOLEAN=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int DO=11;
    public static final int DOUBLE=12;
    public static final int ELSE=13;
    public static final int ENDFUNC=14;
    public static final int ENDIF=15;
    public static final int ENDWHILE=16;
    public static final int EQUAL=17;
    public static final int ESC_SEQ=18;
    public static final int FALSE=19;
    public static final int FUNC=20;
    public static final int FUNCALL=21;
    public static final int GE=22;
    public static final int GT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INT=26;
    public static final int LE=27;
    public static final int LIST_FUNCTIONS=28;
    public static final int LIST_INSTR=29;
    public static final int LT=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NOT=34;
    public static final int NOTE=35;
    public static final int NOT_EQUAL=36;
    public static final int OR=37;
    public static final int PARAMS=38;
    public static final int PLUS=39;
    public static final int PREF=40;
    public static final int PVALUE=41;
    public static final int READ=42;
    public static final int RETURN=43;
    public static final int STRING=44;
    public static final int THEN=45;
    public static final int TRUE=46;
    public static final int WHILE=47;
    public static final int WRITE=48;
    public static final int WS=49;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AslLexer() {} 
    public AslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g"; }

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:6:7: ( '&' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:7:7: ( '(' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:8:7: ( ')' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:9:7: ( ',' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:10:7: ( ';' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:7: ( '=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:169:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:170:10: ( '!=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:170:12: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:171:8: ( '<' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:171:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:172:8: ( '<=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:172:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:8: ( '>' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:174:8: ( '>=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:174:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:6: ( '+' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:176:7: ( '-' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:176:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:9: ( '*' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:178:9: ( '/' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:178:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:9: ( '%' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:11: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:180:9: ( 'not' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:180:11: 'not'
            {
            match("not"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:9: ( 'and' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:11: 'and'
            {
            match("and"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:182:8: ( 'or' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:182:10: 'or'
            {
            match("or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:183:6: ( 'if' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:183:8: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:184:6: ( 'then' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:184:8: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:6: ( 'else' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:8: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDIF"
    public final void mENDIF() throws RecognitionException {
        try {
            int _type = ENDIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:7: ( 'endif' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDIF"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:7: ( 'while' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:8: ( 'do' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ENDWHILE"
    public final void mENDWHILE() throws RecognitionException {
        try {
            int _type = ENDWHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:9: ( 'endwhile' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:11: 'endwhile'
            {
            match("endwhile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDWHILE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:6: ( 'func' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:8: 'func'
            {
            match("func"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "ENDFUNC"
    public final void mENDFUNC() throws RecognitionException {
        try {
            int _type = ENDFUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:9: ( 'endfunc' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:11: 'endfunc'
            {
            match("endfunc"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDFUNC"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:8: ( 'return' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:6: ( 'read' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:7: ( 'write' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:9: ( 'true' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:9: ( 'false' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:9: ( 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:11: 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            {
            match('n'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:15: ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 'd':
                {
                alt1=1;
                }
                break;
            case 'r':
                {
                alt1=2;
                }
                break;
            case 'm':
                {
                alt1=3;
                }
                break;
            case 'f':
                {
                alt1=4;
                }
                break;
            case 's':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='o') ) {
                    alt1=5;
                }
                else if ( (LA1_5=='i') ) {
                    alt1=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'l':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:16: 'do'
                    {
                    match("do"); 



                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:21: 're'
                    {
                    match("re"); 



                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:26: 'mi'
                    {
                    match("mi"); 



                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:31: 'fa'
                    {
                    match("fa"); 



                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:36: 'sol'
                    {
                    match("sol"); 



                    }
                    break;
                case 6 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:42: 'la'
                    {
                    match("la"); 



                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:47: 'si'
                    {
                    match("si"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:6: ( ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:8: ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:8: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:10: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            match('.'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:24: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='/') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='/') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='*') ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:16: (~ ( '\\n' | '\\r' ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:30: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:13: ( options {greedy=false; } : . )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='*') ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1=='/') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '!')||(LA10_0 >= '#' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:214:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:214:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:8: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:8: ( T__50 | T__51 | T__52 | T__53 | T__54 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | ID | INT | DOUBLE | COMMENT | STRING | WS )
        int alt11=40;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:10: T__50
                {
                mT__50(); 


                }
                break;
            case 2 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:16: T__51
                {
                mT__51(); 


                }
                break;
            case 3 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:22: T__52
                {
                mT__52(); 


                }
                break;
            case 4 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:28: T__53
                {
                mT__53(); 


                }
                break;
            case 5 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:34: T__54
                {
                mT__54(); 


                }
                break;
            case 6 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:91: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:95: AND
                {
                mAND(); 


                }
                break;
            case 19 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:99: OR
                {
                mOR(); 


                }
                break;
            case 20 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:102: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:105: THEN
                {
                mTHEN(); 


                }
                break;
            case 22 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:110: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:115: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 24 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:121: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:127: DO
                {
                mDO(); 


                }
                break;
            case 26 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:130: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 27 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:139: FUNC
                {
                mFUNC(); 


                }
                break;
            case 28 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:144: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 29 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:152: RETURN
                {
                mRETURN(); 


                }
                break;
            case 30 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:159: READ
                {
                mREAD(); 


                }
                break;
            case 31 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:164: WRITE
                {
                mWRITE(); 


                }
                break;
            case 32 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:170: TRUE
                {
                mTRUE(); 


                }
                break;
            case 33 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:175: FALSE
                {
                mFALSE(); 


                }
                break;
            case 34 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:181: NOTE
                {
                mNOTE(); 


                }
                break;
            case 35 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:186: ID
                {
                mID(); 


                }
                break;
            case 36 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:189: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:193: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 38 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:200: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 39 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:208: STRING
                {
                mSTRING(); 


                }
                break;
            case 40 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:215: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\10\uffff\1\36\1\40\3\uffff\1\42\1\uffff\12\31\1\uffff\1\67\10\uffff"+
        "\10\31\1\102\1\103\6\31\1\112\3\31\2\uffff\1\117\4\120\1\31\2\120"+
        "\1\122\2\uffff\6\31\1\uffff\4\31\2\uffff\1\120\1\uffff\1\137\1\140"+
        "\1\141\5\31\1\147\2\31\1\152\3\uffff\1\153\2\31\1\156\1\157\1\uffff"+
        "\1\160\1\31\2\uffff\2\31\3\uffff\1\164\1\31\1\166\1\uffff\1\167"+
        "\2\uffff";
    static final String DFA11_eofS =
        "\170\uffff";
    static final String DFA11_minS =
        "\1\11\7\uffff\2\75\3\uffff\1\52\1\uffff\1\144\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\157\1\141\1\145\1\uffff\1\56\10\uffff\1\164"+
        "\1\157\1\145\1\151\1\141\1\151\1\141\1\144\2\60\1\145\1\165\1\163"+
        "\1\144\2\151\1\60\1\156\1\154\1\141\2\uffff\5\60\1\154\3\60\2\uffff"+
        "\1\156\2\145\1\146\1\154\1\164\1\uffff\1\143\1\163\1\165\1\144\2"+
        "\uffff\1\60\1\uffff\3\60\1\146\1\150\1\165\2\145\1\60\1\145\1\162"+
        "\1\60\3\uffff\1\60\1\151\1\156\2\60\1\uffff\1\60\1\156\2\uffff\1"+
        "\154\1\143\3\uffff\1\60\1\145\1\60\1\uffff\1\60\2\uffff";
    static final String DFA11_maxS =
        "\1\172\7\uffff\2\75\3\uffff\1\57\1\uffff\1\163\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\165\1\145\1\uffff\1\71\10\uffff\1\164"+
        "\1\157\1\145\1\151\1\141\1\157\1\141\1\144\2\172\1\145\1\165\1\163"+
        "\1\144\2\151\1\172\1\156\1\154\1\164\2\uffff\5\172\1\154\3\172\2"+
        "\uffff\1\156\2\145\1\167\1\154\1\164\1\uffff\1\143\1\163\1\165\1"+
        "\144\2\uffff\1\172\1\uffff\3\172\1\146\1\150\1\165\2\145\1\172\1"+
        "\145\1\162\1\172\3\uffff\1\172\1\151\1\156\2\172\1\uffff\1\172\1"+
        "\156\2\uffff\1\154\1\143\3\uffff\1\172\1\145\1\172\1\uffff\1\172"+
        "\2\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\15\1\16\1\uffff"+
        "\1\20\12\uffff\1\43\1\uffff\1\47\1\50\1\11\1\10\1\13\1\12\1\46\1"+
        "\17\24\uffff\1\44\1\45\11\uffff\1\23\1\24\6\uffff\1\31\4\uffff\1"+
        "\21\1\42\1\uffff\1\22\14\uffff\1\25\1\40\1\26\5\uffff\1\33\2\uffff"+
        "\1\36\1\27\2\uffff\1\30\1\37\1\41\3\uffff\1\35\1\uffff\1\34\1\32";
    static final String DFA11_specialS =
        "\170\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\7\1\33\2\uffff\1\16\1\1\1"+
            "\uffff\1\2\1\3\1\14\1\12\1\4\1\13\1\uffff\1\15\12\32\1\uffff"+
            "\1\5\1\10\1\6\1\11\2\uffff\32\31\4\uffff\1\31\1\uffff\1\20\2"+
            "\31\1\26\1\24\1\27\2\31\1\22\4\31\1\17\1\21\2\31\1\30\1\31\1"+
            "\23\2\31\1\25\3\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\37",
            "",
            "",
            "",
            "\1\41\4\uffff\1\41",
            "",
            "\1\44\1\uffff\1\47\5\uffff\1\51\1\46\1\uffff\1\43\2\uffff\1"+
            "\45\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55\11\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63",
            "\1\65\23\uffff\1\64",
            "\1\66",
            "",
            "\1\70\1\uffff\12\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\5\uffff\1\76",
            "\1\100",
            "\1\101",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\113",
            "\1\114",
            "\1\116\22\uffff\1\115",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\121",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\130\2\uffff\1\126\15\uffff\1\127",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\150",
            "\1\151",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\154",
            "\1\155",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\161",
            "",
            "",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\165",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__50 | T__51 | T__52 | T__53 | T__54 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | ID | INT | DOUBLE | COMMENT | STRING | WS );";
        }
    }
 

}