// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 08:48:43

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:7: ( '=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:9: '='
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:10: ( '!=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:12: '!='
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

    // $ANTLR start "OPENC"
    public final void mOPENC() throws RecognitionException {
        try {
            int _type = OPENC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:7: ( '[' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPENC"

    // $ANTLR start "CLOSEC"
    public final void mCLOSEC() throws RecognitionException {
        try {
            int _type = CLOSEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:9: ( ']' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CLOSEC"

    // $ANTLR start "DP"
    public final void mDP() throws RecognitionException {
        try {
            int _type = DP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:5: ( ':' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:7: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DP"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:8: ( '<' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:10: '<'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:8: ( '<=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:10: '<='
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:8: ( '>' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:10: '>'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:8: ( '>=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:10: '>='
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:6: ( '+' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:8: '+'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:7: ( '-' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:9: '-'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:9: ( '*' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:11: '*'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:9: ( '/' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:11: '/'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:9: ( '%' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:11: '%'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:9: ( 'not' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:11: 'not'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:9: ( 'and' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:11: 'and'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:8: ( 'or' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:10: 'or'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:202:6: ( 'if' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:202:8: 'if'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:6: ( 'then' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:8: 'then'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:6: ( 'else' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:8: 'else'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:205:7: ( 'endif' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:205:9: 'endif'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:206:7: ( 'while' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:206:9: 'while'
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

    // $ANTLR start "DURATION"
    public final void mDURATION() throws RecognitionException {
        try {
            int _type = DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:9: ( ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt1=1;
                }
                break;
            case 'n':
                {
                alt1=2;
                }
                break;
            case 'b':
                {
                alt1=3;
                }
                break;
            case 'c':
                {
                alt1=4;
                }
                break;
            case 's':
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:12: 'rodona'
                    {
                    match("rodona"); 



                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:22: 'negra'
                    {
                    match("negra"); 



                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:31: 'blanca'
                    {
                    match("blanca"); 



                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:41: 'corxera'
                    {
                    match("corxera"); 



                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:53: 'semicorxera'
                    {
                    match("semicorxera"); 



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
    // $ANTLR end "DURATION"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:8: ( 'do' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:10: 'do'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:209:9: ( 'endwhile' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:209:11: 'endwhile'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:210:6: ( 'func' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:210:8: 'func'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:211:9: ( 'endfunc' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:211:11: 'endfunc'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:8: ( 'return' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:10: 'return'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:213:6: ( 'read' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:213:8: 'read'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:214:7: ( 'write' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:214:9: 'write'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:215:9: ( 'true' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:215:11: 'true'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:216:9: ( 'false' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:216:11: 'false'
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:9: ( 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:11: 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            {
            match('n'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:15: ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 'd':
                {
                alt2=1;
                }
                break;
            case 'r':
                {
                alt2=2;
                }
                break;
            case 'm':
                {
                alt2=3;
                }
                break;
            case 'f':
                {
                alt2=4;
                }
                break;
            case 's':
                {
                int LA2_5 = input.LA(2);

                if ( (LA2_5=='o') ) {
                    alt2=5;
                }
                else if ( (LA2_5=='i') ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'l':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:16: 'do'
                    {
                    match("do"); 



                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:21: 're'
                    {
                    match("re"); 



                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:26: 'mi'
                    {
                    match("mi"); 



                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:31: 'fa'
                    {
                    match("fa"); 



                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:36: 'sol'
                    {
                    match("sol"); 



                    }
                    break;
                case 6 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:42: 'la'
                    {
                    match("la"); 



                    }
                    break;
                case 7 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:217:47: 'si'
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

    // $ANTLR start "PLAY"
    public final void mPLAY() throws RecognitionException {
        try {
            int _type = PLAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:218:6: ( 'play' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:218:8: 'play'
            {
            match("play"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLAY"

    // $ANTLR start "COMPAS"
    public final void mCOMPAS() throws RecognitionException {
        try {
            int _type = COMPAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:219:8: ( 'compas' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:219:10: 'compas'
            {
            match("compas"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPAS"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:220:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:220:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:220:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:222:6: ( ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:222:8: ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:222:8: ( '0' .. '9' )+
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:223:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:223:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:223:10: ( '0' .. '9' )+
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


            match('.'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:223:24: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:226:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='/') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='*') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:226:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:226:16: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
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
                    	    break loop7;
                        }
                    } while (true);


                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:226:30: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:226:30: '\\r'
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
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:227:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:227:13: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:227:41: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:231:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:231:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:231:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:231:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:231:28: ~ ( '\\\\' | '\"' )
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
            	    break loop11;
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:237:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:237:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:240:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:240:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:8: ( T__57 | T__58 | T__59 | T__60 | T__61 | EQUAL | NOT_EQUAL | OPENC | CLOSEC | DP | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | PLAY | COMPAS | ID | INT | DOUBLE | COMMENT | STRING | WS )
        int alt12=46;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:10: T__57
                {
                mT__57(); 


                }
                break;
            case 2 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:16: T__58
                {
                mT__58(); 


                }
                break;
            case 3 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:22: T__59
                {
                mT__59(); 


                }
                break;
            case 4 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:28: T__60
                {
                mT__60(); 


                }
                break;
            case 5 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:34: T__61
                {
                mT__61(); 


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
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:56: OPENC
                {
                mOPENC(); 


                }
                break;
            case 9 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:62: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 10 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:69: DP
                {
                mDP(); 


                }
                break;
            case 11 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:72: LT
                {
                mLT(); 


                }
                break;
            case 12 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:75: LE
                {
                mLE(); 


                }
                break;
            case 13 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:78: GT
                {
                mGT(); 


                }
                break;
            case 14 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:81: GE
                {
                mGE(); 


                }
                break;
            case 15 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:84: PLUS
                {
                mPLUS(); 


                }
                break;
            case 16 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:89: MINUS
                {
                mMINUS(); 


                }
                break;
            case 17 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:95: MUL
                {
                mMUL(); 


                }
                break;
            case 18 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:99: DIV
                {
                mDIV(); 


                }
                break;
            case 19 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:103: MOD
                {
                mMOD(); 


                }
                break;
            case 20 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:107: NOT
                {
                mNOT(); 


                }
                break;
            case 21 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:111: AND
                {
                mAND(); 


                }
                break;
            case 22 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:115: OR
                {
                mOR(); 


                }
                break;
            case 23 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:118: IF
                {
                mIF(); 


                }
                break;
            case 24 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:121: THEN
                {
                mTHEN(); 


                }
                break;
            case 25 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:126: ELSE
                {
                mELSE(); 


                }
                break;
            case 26 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:131: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 27 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:137: WHILE
                {
                mWHILE(); 


                }
                break;
            case 28 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:143: DURATION
                {
                mDURATION(); 


                }
                break;
            case 29 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:152: DO
                {
                mDO(); 


                }
                break;
            case 30 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:155: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 31 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:164: FUNC
                {
                mFUNC(); 


                }
                break;
            case 32 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:169: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 33 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:177: RETURN
                {
                mRETURN(); 


                }
                break;
            case 34 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:184: READ
                {
                mREAD(); 


                }
                break;
            case 35 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:189: WRITE
                {
                mWRITE(); 


                }
                break;
            case 36 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:195: TRUE
                {
                mTRUE(); 


                }
                break;
            case 37 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:200: FALSE
                {
                mFALSE(); 


                }
                break;
            case 38 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:206: NOTE
                {
                mNOTE(); 


                }
                break;
            case 39 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:211: PLAY
                {
                mPLAY(); 


                }
                break;
            case 40 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:216: COMPAS
                {
                mCOMPAS(); 


                }
                break;
            case 41 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:223: ID
                {
                mID(); 


                }
                break;
            case 42 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:226: INT
                {
                mINT(); 


                }
                break;
            case 43 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:230: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 44 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:237: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 45 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:245: STRING
                {
                mSTRING(); 


                }
                break;
            case 46 :
                // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:1:252: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\13\uffff\1\45\1\47\3\uffff\1\51\1\uffff\16\40\1\uffff\1\104\10"+
        "\uffff\11\40\1\120\1\121\13\40\1\137\3\40\2\uffff\1\143\1\40\4\145"+
        "\1\40\2\145\1\147\2\uffff\15\40\1\uffff\3\40\1\uffff\1\40\1\uffff"+
        "\1\145\1\uffff\1\173\1\174\1\175\7\40\1\u0085\4\40\1\u008a\1\40"+
        "\1\u008c\1\u008d\3\uffff\1\u008e\2\40\1\u0091\1\u0092\2\40\1\uffff"+
        "\4\40\1\uffff\1\u0099\3\uffff\2\40\2\uffff\1\u008d\1\u009c\1\u008d"+
        "\1\40\1\u009e\1\40\1\uffff\1\40\1\u00a1\1\uffff\1\u008d\1\uffff"+
        "\1\40\1\u00a3\1\uffff\1\40\1\uffff\2\40\1\u008d";
    static final String DFA12_eofS =
        "\u00a7\uffff";
    static final String DFA12_minS =
        "\1\11\12\uffff\2\75\3\uffff\1\52\1\uffff\1\144\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\145\1\154\1\157\1\145\1\157\1\141\1\154\1\uffff"+
        "\1\56\10\uffff\1\164\1\147\1\157\1\145\1\151\1\141\1\151\1\141\1"+
        "\144\2\60\1\145\1\165\1\163\1\144\2\151\1\144\2\141\2\155\1\60\1"+
        "\156\1\154\1\141\2\uffff\1\60\1\162\4\60\1\154\3\60\2\uffff\1\156"+
        "\2\145\1\146\1\154\1\164\1\157\1\165\1\144\1\156\1\170\1\160\1\151"+
        "\1\uffff\1\143\1\163\1\171\1\uffff\1\141\1\uffff\1\60\1\uffff\3"+
        "\60\1\146\1\150\1\165\2\145\1\156\1\162\1\60\1\143\1\145\1\141\1"+
        "\143\1\60\1\145\2\60\3\uffff\1\60\1\151\1\156\2\60\1\141\1\156\1"+
        "\uffff\1\141\1\162\1\163\1\157\1\uffff\1\60\3\uffff\1\154\1\143"+
        "\2\uffff\3\60\1\141\1\60\1\162\1\uffff\1\145\1\60\1\uffff\1\60\1"+
        "\uffff\1\170\1\60\1\uffff\1\145\1\uffff\1\162\1\141\1\60";
    static final String DFA12_maxS =
        "\1\172\12\uffff\2\75\3\uffff\1\57\1\uffff\1\163\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\154\1\157\1\145\1\157\1\165\1\154\1\uffff"+
        "\1\71\10\uffff\1\164\1\147\1\157\1\145\1\151\1\141\1\157\1\141\1"+
        "\144\2\172\1\145\1\165\1\163\1\144\2\151\1\144\1\164\1\141\1\162"+
        "\1\155\1\172\1\156\1\154\1\141\2\uffff\1\172\1\162\4\172\1\154\3"+
        "\172\2\uffff\1\156\2\145\1\167\1\154\1\164\1\157\1\165\1\144\1\156"+
        "\1\170\1\160\1\151\1\uffff\1\143\1\163\1\171\1\uffff\1\141\1\uffff"+
        "\1\172\1\uffff\3\172\1\146\1\150\1\165\2\145\1\156\1\162\1\172\1"+
        "\143\1\145\1\141\1\143\1\172\1\145\2\172\3\uffff\1\172\1\151\1\156"+
        "\2\172\1\141\1\156\1\uffff\1\141\1\162\1\163\1\157\1\uffff\1\172"+
        "\3\uffff\1\154\1\143\2\uffff\3\172\1\141\1\172\1\162\1\uffff\1\145"+
        "\1\172\1\uffff\1\172\1\uffff\1\170\1\172\1\uffff\1\145\1\uffff\1"+
        "\162\1\141\1\172";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff\1\17"+
        "\1\20\1\21\1\uffff\1\23\16\uffff\1\51\1\uffff\1\55\1\56\1\14\1\13"+
        "\1\16\1\15\1\54\1\22\32\uffff\1\52\1\53\12\uffff\1\26\1\27\15\uffff"+
        "\1\35\3\uffff\1\24\1\uffff\1\46\1\uffff\1\25\23\uffff\1\30\1\44"+
        "\1\31\7\uffff\1\42\4\uffff\1\37\1\uffff\1\47\1\34\1\32\2\uffff\1"+
        "\33\1\43\6\uffff\1\45\2\uffff\1\41\1\uffff\1\50\2\uffff\1\40\1\uffff"+
        "\1\36\3\uffff";
    static final String DFA12_specialS =
        "\u00a7\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\43\2\uffff\1\43\22\uffff\1\43\1\7\1\42\2\uffff\1\21\1\1\1"+
            "\uffff\1\2\1\3\1\17\1\15\1\4\1\16\1\uffff\1\20\12\41\1\12\1"+
            "\5\1\13\1\6\1\14\2\uffff\32\40\1\10\1\uffff\1\11\1\uffff\1\40"+
            "\1\uffff\1\23\1\32\1\33\1\35\1\27\1\36\2\40\1\25\4\40\1\22\1"+
            "\24\1\37\1\40\1\31\1\34\1\26\2\40\1\30\3\40",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\46",
            "",
            "",
            "",
            "\1\50\4\uffff\1\50",
            "",
            "\1\54\1\53\1\57\5\uffff\1\61\1\56\1\uffff\1\52\2\uffff\1\55"+
            "\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65\11\uffff\1\66",
            "\1\67\1\uffff\1\70",
            "\1\71\11\uffff\1\72",
            "\1\74\11\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\23\uffff\1\101",
            "\1\103",
            "",
            "\1\105\1\uffff\12\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\115\5\uffff\1\114",
            "\1\116",
            "\1\117",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\132\22\uffff\1\131",
            "\1\133",
            "\1\135\4\uffff\1\134",
            "\1\136",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\155\2\uffff\1\153\15\uffff\1\154",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008b",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008f",
            "\1\u0090",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009f",
            "",
            "\1\u00a0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00a2",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__57 | T__58 | T__59 | T__60 | T__61 | EQUAL | NOT_EQUAL | OPENC | CLOSEC | DP | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | PLAY | COMPAS | ID | INT | DOUBLE | COMMENT | STRING | WS );";
        }
    }
 

}