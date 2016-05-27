<<<<<<< HEAD
// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 10:01:19
=======
// $ANTLR 3.4 /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-23 11:39:53
>>>>>>> ed712379087d33229baabfa7b546342b7bee0dc9

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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
    public String getGrammarFileName() { return "/home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g"; }

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:6:7: ( '&' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:6:9: '&'
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:7:7: ( '(' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:7:9: '('
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:8:7: ( ')' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:8:9: ')'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:9:7: ( ',' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:9:9: ','
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:10:7: ( ';' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:10:9: ';'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:11:7: ( '|' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:11:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:192:7: ( '=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:192:9: '='
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:193:10: ( '!=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:193:12: '!='
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:194:7: ( '[' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:194:9: '['
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:195:9: ( ']' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:195:11: ']'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:5: ( ':' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:7: ':'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:197:8: ( '<' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:197:10: '<'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:198:8: ( '<=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:198:10: '<='
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:199:8: ( '>' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:199:10: '>'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:200:8: ( '>=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:200:10: '>='
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:201:6: ( '+' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:201:8: '+'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:202:7: ( '-' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:202:9: '-'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:203:9: ( '*' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:203:11: '*'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:204:9: ( '/' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:204:11: '/'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:205:9: ( '%' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:205:11: '%'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:9: ( 'not' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:11: 'not'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:207:9: ( 'and' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:207:11: 'and'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:208:8: ( 'or' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:208:10: 'or'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:209:6: ( 'if' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:209:8: 'if'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:210:6: ( 'then' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:210:8: 'then'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:6: ( 'else' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:8: 'else'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:212:7: ( 'endif' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:212:9: 'endif'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:213:7: ( 'while' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:213:9: 'while'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:9: ( ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:12: 'rodona'
                    {
                    match("rodona"); 



                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:22: 'negra'
                    {
                    match("negra"); 



                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:31: 'blanca'
                    {
                    match("blanca"); 



                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:41: 'corxera'
                    {
                    match("corxera"); 



                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:53: 'semicorxera'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:215:8: ( 'do' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:215:10: 'do'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:216:9: ( 'endwhile' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:216:11: 'endwhile'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:217:6: ( 'func' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:217:8: 'func'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:218:9: ( 'endfunc' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:218:11: 'endfunc'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:8: ( 'return' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:10: 'return'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:220:6: ( 'read' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:220:8: 'read'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:221:7: ( 'write' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:221:9: 'write'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:222:9: ( 'true' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:222:11: 'true'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:223:9: ( 'false' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:223:11: 'false'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:9: ( 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:11: 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            {
            match('n'); 

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:15: ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:16: 'do'
                    {
                    match("do"); 



                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:21: 're'
                    {
                    match("re"); 



                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:26: 'mi'
                    {
                    match("mi"); 



                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:31: 'fa'
                    {
                    match("fa"); 



                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:36: 'sol'
                    {
                    match("sol"); 



                    }
                    break;
                case 6 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:42: 'la'
                    {
                    match("la"); 



                    }
                    break;
                case 7 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:224:47: 'si'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:225:6: ( 'play' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:225:8: 'play'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:226:8: ( 'compas' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:226:10: 'compas'
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:227:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:227:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:227:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:229:6: ( ( '0' .. '9' )+ )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:229:8: ( '0' .. '9' )+
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:229:8: ( '0' .. '9' )+
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
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:230:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:230:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:230:10: ( '0' .. '9' )+
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
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:
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

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:230:24: ( '0' .. '9' )+
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
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:233:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:233:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:233:16: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:
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


                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:233:30: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:233:30: '\\r'
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:234:8: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:234:13: ( options {greedy=false; } : . )*
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
                    	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:234:41: .
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:238:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:238:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:238:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:238:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:238:28: ~ ( '\\\\' | '\"' )
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:244:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:244:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:247:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:247:8: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:8: ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | EQUAL | NOT_EQUAL | OPENC | CLOSEC | DP | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | PLAY | COMPAS | ID | INT | DOUBLE | COMMENT | STRING | WS )
        int alt12=47;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:10: T__58
                {
                mT__58(); 


                }
                break;
            case 2 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:16: T__59
                {
                mT__59(); 


                }
                break;
            case 3 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:22: T__60
                {
                mT__60(); 


                }
                break;
            case 4 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:28: T__61
                {
                mT__61(); 


                }
                break;
            case 5 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:34: T__62
                {
                mT__62(); 


                }
                break;
            case 6 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:40: T__63
                {
                mT__63(); 


                }
                break;
            case 7 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:46: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 8 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:52: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 9 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:62: OPENC
                {
                mOPENC(); 


                }
                break;
            case 10 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:68: CLOSEC
                {
                mCLOSEC(); 


                }
                break;
            case 11 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:75: DP
                {
                mDP(); 


                }
                break;
            case 12 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:78: LT
                {
                mLT(); 


                }
                break;
            case 13 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:81: LE
                {
                mLE(); 


                }
                break;
            case 14 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:84: GT
                {
                mGT(); 


                }
                break;
            case 15 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:87: GE
                {
                mGE(); 


                }
                break;
            case 16 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:90: PLUS
                {
                mPLUS(); 


                }
                break;
            case 17 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:95: MINUS
                {
                mMINUS(); 


                }
                break;
            case 18 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:101: MUL
                {
                mMUL(); 


                }
                break;
            case 19 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:105: DIV
                {
                mDIV(); 


                }
                break;
            case 20 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:109: MOD
                {
                mMOD(); 


                }
                break;
            case 21 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:113: NOT
                {
                mNOT(); 


                }
                break;
            case 22 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:117: AND
                {
                mAND(); 


                }
                break;
            case 23 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:121: OR
                {
                mOR(); 


                }
                break;
            case 24 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:124: IF
                {
                mIF(); 


                }
                break;
            case 25 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:127: THEN
                {
                mTHEN(); 


                }
                break;
            case 26 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:132: ELSE
                {
                mELSE(); 


                }
                break;
            case 27 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:137: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 28 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:143: WHILE
                {
                mWHILE(); 


                }
                break;
            case 29 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:149: DURATION
                {
                mDURATION(); 


                }
                break;
            case 30 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:158: DO
                {
                mDO(); 


                }
                break;
            case 31 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:161: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 32 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:170: FUNC
                {
                mFUNC(); 


                }
                break;
            case 33 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:175: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 34 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:183: RETURN
                {
                mRETURN(); 


                }
                break;
            case 35 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:190: READ
                {
                mREAD(); 


                }
                break;
            case 36 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:195: WRITE
                {
                mWRITE(); 


                }
                break;
            case 37 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:201: TRUE
                {
                mTRUE(); 


                }
                break;
            case 38 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:206: FALSE
                {
                mFALSE(); 


                }
                break;
            case 39 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:212: NOTE
                {
                mNOTE(); 


                }
                break;
            case 40 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:217: PLAY
                {
                mPLAY(); 


                }
                break;
            case 41 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:222: COMPAS
                {
                mCOMPAS(); 


                }
                break;
            case 42 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:229: ID
                {
                mID(); 


                }
                break;
            case 43 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:232: INT
                {
                mINT(); 


                }
                break;
            case 44 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:236: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 45 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:243: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 46 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:251: STRING
                {
                mSTRING(); 


                }
                break;
            case 47 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:258: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\14\uffff\1\46\1\50\3\uffff\1\52\1\uffff\16\41\1\uffff\1\105\10"+
        "\uffff\11\41\1\121\1\122\13\41\1\140\3\41\2\uffff\1\144\1\41\4\146"+
        "\1\41\2\146\1\150\2\uffff\15\41\1\uffff\3\41\1\uffff\1\41\1\uffff"+
        "\1\146\1\uffff\1\174\1\175\1\176\7\41\1\u0086\4\41\1\u008b\1\41"+
        "\1\u008d\1\u008e\3\uffff\1\u008f\2\41\1\u0092\1\u0093\2\41\1\uffff"+
        "\4\41\1\uffff\1\u009a\3\uffff\2\41\2\uffff\1\u008e\1\u009d\1\u008e"+
        "\1\41\1\u009f\1\41\1\uffff\1\41\1\u00a2\1\uffff\1\u008e\1\uffff"+
        "\1\41\1\u00a4\1\uffff\1\41\1\uffff\2\41\1\u008e";
    static final String DFA12_eofS =
        "\u00a8\uffff";
    static final String DFA12_minS =
        "\1\11\13\uffff\2\75\3\uffff\1\52\1\uffff\1\144\1\156\1\162\1\146"+
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
        "\1\174\13\uffff\2\75\3\uffff\1\57\1\uffff\1\163\1\156\1\162\1\146"+
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
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff"+
        "\1\20\1\21\1\22\1\uffff\1\24\16\uffff\1\52\1\uffff\1\56\1\57\1\15"+
        "\1\14\1\17\1\16\1\55\1\23\32\uffff\1\53\1\54\12\uffff\1\27\1\30"+
        "\15\uffff\1\36\3\uffff\1\25\1\uffff\1\47\1\uffff\1\26\23\uffff\1"+
        "\31\1\45\1\32\7\uffff\1\43\4\uffff\1\40\1\uffff\1\50\1\35\1\33\2"+
        "\uffff\1\34\1\44\6\uffff\1\46\2\uffff\1\42\1\uffff\1\51\2\uffff"+
        "\1\41\1\uffff\1\37\3\uffff";
    static final String DFA12_specialS =
        "\u00a8\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\10\1\43\2\uffff\1\22\1\1"+
            "\1\uffff\1\2\1\3\1\20\1\16\1\4\1\17\1\uffff\1\21\12\42\1\13"+
            "\1\5\1\14\1\7\1\15\2\uffff\32\41\1\11\1\uffff\1\12\1\uffff\1"+
            "\41\1\uffff\1\24\1\33\1\34\1\36\1\30\1\37\2\41\1\26\4\41\1\23"+
            "\1\25\1\40\1\41\1\32\1\35\1\27\2\41\1\31\3\41\1\uffff\1\6",
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
            "",
            "\1\45",
            "\1\47",
            "",
            "",
            "",
            "\1\51\4\uffff\1\51",
            "",
            "\1\55\1\54\1\60\5\uffff\1\62\1\57\1\uffff\1\53\2\uffff\1\56"+
            "\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\11\uffff\1\67",
            "\1\70\1\uffff\1\71",
            "\1\72\11\uffff\1\73",
            "\1\75\11\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\103\23\uffff\1\102",
            "\1\104",
            "",
            "\1\106\1\uffff\12\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\116\5\uffff\1\115",
            "\1\117",
            "\1\120",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\133\22\uffff\1\132",
            "\1\134",
            "\1\136\4\uffff\1\135",
            "\1\137",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\145",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\147",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\156\2\uffff\1\154\15\uffff\1\155",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\173",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0090",
            "\1\u0091",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "\1\u009b",
            "\1\u009c",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009e",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00a3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41"
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
            return "1:1: Tokens : ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | EQUAL | NOT_EQUAL | OPENC | CLOSEC | DP | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | PLAY | COMPAS | ID | INT | DOUBLE | COMMENT | STRING | WS );";
        }
    }
 

}