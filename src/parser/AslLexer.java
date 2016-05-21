<<<<<<< HEAD
// $ANTLR 3.4 /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-21 18:38:53
=======
// $ANTLR 3.4 /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g 2016-05-21 15:19:25
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AslLexer extends Lexer {
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

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:172:7: ( '=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:172:9: '='
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:177:7: ( '=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:177:9: '='
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:10: ( '!=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:173:12: '!='
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:178:10: ( '!=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:178:12: '!='
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:174:8: ( '<' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:174:10: '<'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:179:8: ( '<' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:179:10: '<'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:8: ( '<=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:175:10: '<='
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:8: ( '<=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:180:10: '<='
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:176:8: ( '>' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:176:10: '>'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:181:8: ( '>' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:181:10: '>'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:8: ( '>=' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:177:10: '>='
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:182:8: ( '>=' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:182:10: '>='
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:178:6: ( '+' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:178:8: '+'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:183:6: ( '+' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:183:8: '+'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:7: ( '-' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:179:9: '-'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:7: ( '-' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:184:9: '-'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:180:9: ( '*' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:180:11: '*'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:185:9: ( '*' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:185:11: '*'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:9: ( '/' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:181:11: '/'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:9: ( '/' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:186:11: '/'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:182:9: ( '%' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:182:11: '%'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:187:9: ( '%' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:187:11: '%'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:183:9: ( 'not' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:183:11: 'not'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:9: ( 'not' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:188:11: 'not'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:184:9: ( 'and' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:184:11: 'and'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:189:9: ( 'and' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:189:11: 'and'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:8: ( 'or' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:185:10: 'or'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:190:8: ( 'or' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:190:10: 'or'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:6: ( 'if' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:186:8: 'if'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:191:6: ( 'if' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:191:8: 'if'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:6: ( 'then' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:187:8: 'then'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:192:6: ( 'then' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:192:8: 'then'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:6: ( 'else' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:188:8: 'else'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:193:6: ( 'else' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:193:8: 'else'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:7: ( 'endif' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:189:9: 'endif'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:194:7: ( 'endif' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:194:9: 'endif'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:7: ( 'while' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:190:9: 'while'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:195:7: ( 'while' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:195:9: 'while'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:9: ( ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
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
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:12: 'rodona'
                    {
                    match("rodona"); 



                    }
                    break;
                case 2 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:22: 'negra'
                    {
                    match("negra"); 



                    }
                    break;
                case 3 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:31: 'blanca'
                    {
                    match("blanca"); 



                    }
                    break;
                case 4 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:41: 'corxera'
                    {
                    match("corxera"); 



                    }
                    break;
                case 5 :
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:196:53: 'semicorxera'
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:8: ( 'do' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:191:10: 'do'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:197:8: ( 'do' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:197:10: 'do'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:9: ( 'endwhile' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:192:11: 'endwhile'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:198:9: ( 'endwhile' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:198:11: 'endwhile'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:6: ( 'func' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:193:8: 'func'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:199:6: ( 'func' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:199:8: 'func'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:9: ( 'endfunc' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:194:11: 'endfunc'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:200:9: ( 'endfunc' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:200:11: 'endfunc'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:8: ( 'return' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:195:10: 'return'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:201:8: ( 'return' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:201:10: 'return'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:6: ( 'read' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:196:8: 'read'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:202:6: ( 'read' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:202:8: 'read'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:7: ( 'write' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:197:9: 'write'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:203:7: ( 'write' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:203:9: 'write'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:9: ( 'true' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:198:11: 'true'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:204:9: ( 'true' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:204:11: 'true'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:9: ( 'false' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:199:11: 'false'
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:205:9: ( 'false' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:205:11: 'false'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:9: ( 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:11: 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            {
            match('n'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:15: ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            int alt1=7;
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:9: ( 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:11: 'n' ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            {
            match('n'); 

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:15: ( 'do' | 're' | 'mi' | 'fa' | 'sol' | 'la' | 'si' )
            int alt2=7;
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:16: 'do'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:16: 'do'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("do"); 



                    }
                    break;
                case 2 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:21: 're'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:21: 're'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("re"); 



                    }
                    break;
                case 3 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:26: 'mi'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:26: 'mi'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("mi"); 



                    }
                    break;
                case 4 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:31: 'fa'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:31: 'fa'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("fa"); 



                    }
                    break;
                case 5 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:36: 'sol'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:36: 'sol'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("sol"); 



                    }
                    break;
                case 6 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:42: 'la'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:42: 'la'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("la"); 



                    }
                    break;
                case 7 :
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:200:47: 'si'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:206:47: 'si'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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

<<<<<<< HEAD
    // $ANTLR start "DURATION"
    public final void mDURATION() throws RecognitionException {
        try {
            int _type = DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:9: ( ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:11: ( 'rodona' | 'negra' | 'blanca' | 'corxera' | 'semicorxera' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'r':
                {
                alt2=1;
                }
                break;
            case 'n':
                {
                alt2=2;
                }
                break;
            case 'b':
                {
                alt2=3;
                }
                break;
            case 'c':
                {
                alt2=4;
                }
                break;
            case 's':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:13: 'rodona'
                    {
                    match("rodona"); 



                    }
                    break;
                case 2 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:23: 'negra'
                    {
                    match("negra"); 



                    }
                    break;
                case 3 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:32: 'blanca'
                    {
                    match("blanca"); 



                    }
                    break;
                case 4 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:42: 'corxera'
                    {
                    match("corxera"); 



                    }
                    break;
                case 5 :
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:201:54: 'semicorxera'
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

=======
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:202:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:202:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:208:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:208:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:202:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:208:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:6: ( ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:8: ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:203:8: ( '0' .. '9' )+
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:210:6: ( ( '0' .. '9' )+ )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:210:8: ( '0' .. '9' )+
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:210:8: ( '0' .. '9' )+
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:10: ( '0' .. '9' )+
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:8: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:10: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:10: ( '0' .. '9' )+
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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

<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:204:24: ( '0' .. '9' )+
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:211:24: ( '0' .. '9' )+
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("//"); 



<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:16: (~ ( '\\n' | '\\r' ) )*
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:16: (~ ( '\\n' | '\\r' ) )*
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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


<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:30: ( '\\r' )?
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:30: ( '\\r' )?
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
<<<<<<< HEAD
                            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:207:30: '\\r'
=======
                            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:214:30: '\\r'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:8: '/*' ( options {greedy=false; } : . )* '*/'
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:215:8: '/*' ( options {greedy=false; } : . )* '*/'
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
                    {
                    match("/*"); 



<<<<<<< HEAD
                    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:13: ( options {greedy=false; } : . )*
=======
                    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:215:13: ( options {greedy=false; } : . )*
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
                    	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:208:41: .
=======
                    	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:215:41: .
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:18: ESC_SEQ
=======
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:18: ESC_SEQ
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
<<<<<<< HEAD
            	    // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:212:28: ~ ( '\\\\' | '\"' )
=======
            	    // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:219:28: ~ ( '\\\\' | '\"' )
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:218:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:218:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:225:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:225:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
<<<<<<< HEAD
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:221:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/cristianpinto/iCloud/CL/CL-MusicInterpreter/src/parser/Asl.g:221:8: ( ' ' | '\\t' | '\\r' | '\\n' )
=======
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:228:6: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:228:8: ( ' ' | '\\t' | '\\r' | '\\n' )
>>>>>>> 5b58addaefa2c2da8f7d18343f75503fcd73e23e
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
        // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:8: ( T__52 | T__53 | T__54 | T__55 | T__56 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | ID | INT | DOUBLE | COMMENT | STRING | WS )
        int alt12=41;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:10: T__52
                {
                mT__52(); 


                }
                break;
            case 2 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:16: T__53
                {
                mT__53(); 


                }
                break;
            case 3 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:22: T__54
                {
                mT__54(); 


                }
                break;
            case 4 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:28: T__55
                {
                mT__55(); 


                }
                break;
            case 5 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:34: T__56
                {
                mT__56(); 


                }
                break;
            case 6 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:40: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 7 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:46: NOT_EQUAL
                {
                mNOT_EQUAL(); 


                }
                break;
            case 8 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:56: LT
                {
                mLT(); 


                }
                break;
            case 9 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:59: LE
                {
                mLE(); 


                }
                break;
            case 10 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:62: GT
                {
                mGT(); 


                }
                break;
            case 11 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:65: GE
                {
                mGE(); 


                }
                break;
            case 12 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:68: PLUS
                {
                mPLUS(); 


                }
                break;
            case 13 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:73: MINUS
                {
                mMINUS(); 


                }
                break;
            case 14 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:79: MUL
                {
                mMUL(); 


                }
                break;
            case 15 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:83: DIV
                {
                mDIV(); 


                }
                break;
            case 16 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:87: MOD
                {
                mMOD(); 


                }
                break;
            case 17 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:91: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:95: AND
                {
                mAND(); 


                }
                break;
            case 19 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:99: OR
                {
                mOR(); 


                }
                break;
            case 20 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:102: IF
                {
                mIF(); 


                }
                break;
            case 21 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:105: THEN
                {
                mTHEN(); 


                }
                break;
            case 22 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:110: ELSE
                {
                mELSE(); 


                }
                break;
            case 23 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:115: ENDIF
                {
                mENDIF(); 


                }
                break;
            case 24 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:121: WHILE
                {
                mWHILE(); 


                }
                break;
            case 25 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:127: DURATION
                {
                mDURATION(); 


                }
                break;
            case 26 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:136: DO
                {
                mDO(); 


                }
                break;
            case 27 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:139: ENDWHILE
                {
                mENDWHILE(); 


                }
                break;
            case 28 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:148: FUNC
                {
                mFUNC(); 


                }
                break;
            case 29 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:153: ENDFUNC
                {
                mENDFUNC(); 


                }
                break;
            case 30 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:161: RETURN
                {
                mRETURN(); 


                }
                break;
            case 31 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:168: READ
                {
                mREAD(); 


                }
                break;
            case 32 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:173: WRITE
                {
                mWRITE(); 


                }
                break;
            case 33 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:179: TRUE
                {
                mTRUE(); 


                }
                break;
            case 34 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:184: FALSE
                {
                mFALSE(); 


                }
                break;
            case 35 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:190: NOTE
                {
                mNOTE(); 


                }
                break;
            case 36 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:195: ID
                {
                mID(); 


                }
                break;
            case 37 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:198: INT
                {
                mINT(); 


                }
                break;
            case 38 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:202: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 39 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:209: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 40 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:217: STRING
                {
                mSTRING(); 


                }
                break;
            case 41 :
                // /home/albert-ubuntu/Universidad/Actual/CL/CL-MusicInterpreter/src/parser/Asl.g:1:224: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\10\uffff\1\41\1\43\3\uffff\1\45\1\uffff\15\34\1\uffff\1\77\10\uffff"+
        "\11\34\1\113\1\114\13\34\1\131\2\34\2\uffff\1\134\1\34\4\136\1\34"+
        "\2\136\1\140\2\uffff\14\34\1\uffff\2\34\1\uffff\1\34\1\uffff\1\136"+
        "\1\uffff\1\162\1\163\1\164\7\34\1\174\3\34\1\u0080\1\34\1\u0082"+
        "\3\uffff\1\u0083\2\34\1\u0086\1\u0087\2\34\1\uffff\3\34\1\uffff"+
        "\1\u008d\2\uffff\2\34\2\uffff\1\u0082\1\u0090\1\u0082\2\34\1\uffff"+
        "\1\34\1\u0094\1\uffff\1\u0082\1\34\1\u0096\1\uffff\1\34\1\uffff"+
        "\2\34\1\u0082";
    static final String DFA12_eofS =
        "\u009a\uffff";
    static final String DFA12_minS =
        "\1\11\7\uffff\2\75\3\uffff\1\52\1\uffff\1\144\1\156\1\162\1\146"+
        "\1\150\1\154\1\150\1\145\1\154\1\157\1\145\1\157\1\141\1\uffff\1"+
        "\56\10\uffff\1\164\1\147\1\157\1\145\1\151\1\141\1\151\1\141\1\144"+
        "\2\60\1\145\1\165\1\163\1\144\2\151\1\144\2\141\1\162\1\155\1\60"+
        "\1\156\1\154\2\uffff\1\60\1\162\4\60\1\154\3\60\2\uffff\1\156\2"+
        "\145\1\146\1\154\1\164\1\157\1\165\1\144\1\156\1\170\1\151\1\uffff"+
        "\1\143\1\163\1\uffff\1\141\1\uffff\1\60\1\uffff\3\60\1\146\1\150"+
        "\1\165\2\145\1\156\1\162\1\60\1\143\1\145\1\143\1\60\1\145\1\60"+
        "\3\uffff\1\60\1\151\1\156\2\60\1\141\1\156\1\uffff\1\141\1\162\1"+
        "\157\1\uffff\1\60\2\uffff\1\154\1\143\2\uffff\3\60\1\141\1\162\1"+
        "\uffff\1\145\1\60\1\uffff\1\60\1\170\1\60\1\uffff\1\145\1\uffff"+
        "\1\162\1\141\1\60";
    static final String DFA12_maxS =
        "\1\172\7\uffff\2\75\3\uffff\1\57\1\uffff\1\163\1\156\1\162\1\146"+
        "\1\162\1\156\1\162\1\157\1\154\1\157\1\145\1\157\1\165\1\uffff\1"+
        "\71\10\uffff\1\164\1\147\1\157\1\145\1\151\1\141\1\157\1\141\1\144"+
        "\2\172\1\145\1\165\1\163\1\144\2\151\1\144\1\164\1\141\1\162\1\155"+
        "\1\172\1\156\1\154\2\uffff\1\172\1\162\4\172\1\154\3\172\2\uffff"+
        "\1\156\2\145\1\167\1\154\1\164\1\157\1\165\1\144\1\156\1\170\1\151"+
        "\1\uffff\1\143\1\163\1\uffff\1\141\1\uffff\1\172\1\uffff\3\172\1"+
        "\146\1\150\1\165\2\145\1\156\1\162\1\172\1\143\1\145\1\143\1\172"+
        "\1\145\1\172\3\uffff\1\172\1\151\1\156\2\172\1\141\1\156\1\uffff"+
        "\1\141\1\162\1\157\1\uffff\1\172\2\uffff\1\154\1\143\2\uffff\3\172"+
        "\1\141\1\162\1\uffff\1\145\1\172\1\uffff\1\172\1\170\1\172\1\uffff"+
        "\1\145\1\uffff\1\162\1\141\1\172";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\14\1\15\1\16\1\uffff"+
        "\1\20\15\uffff\1\44\1\uffff\1\50\1\51\1\11\1\10\1\13\1\12\1\47\1"+
        "\17\31\uffff\1\45\1\46\12\uffff\1\23\1\24\14\uffff\1\32\2\uffff"+
        "\1\21\1\uffff\1\43\1\uffff\1\22\21\uffff\1\25\1\41\1\26\7\uffff"+
        "\1\37\3\uffff\1\34\1\uffff\1\31\1\27\2\uffff\1\30\1\40\5\uffff\1"+
        "\42\2\uffff\1\36\3\uffff\1\35\1\uffff\1\33\3\uffff";
    static final String DFA12_specialS =
        "\u009a\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\7\1\36\2\uffff\1\16\1\1\1"+
            "\uffff\1\2\1\3\1\14\1\12\1\4\1\13\1\uffff\1\15\12\35\1\uffff"+
            "\1\5\1\10\1\6\1\11\2\uffff\32\34\4\uffff\1\34\1\uffff\1\20\1"+
            "\27\1\30\1\32\1\24\1\33\2\34\1\22\4\34\1\17\1\21\2\34\1\26\1"+
            "\31\1\23\2\34\1\25\3\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\42",
            "",
            "",
            "",
            "\1\44\4\uffff\1\44",
            "",
            "\1\50\1\47\1\53\5\uffff\1\55\1\52\1\uffff\1\46\2\uffff\1\51"+
            "\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61\11\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65\11\uffff\1\66",
            "\1\70\11\uffff\1\67",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76\23\uffff\1\75",
            "",
            "\1\100\1\uffff\12\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\110\5\uffff\1\107",
            "\1\111",
            "\1\112",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\125\22\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\132",
            "\1\133",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\135",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\137",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\146\2\uffff\1\144\15\uffff\1\145",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0081",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0084",
            "\1\u0085",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0088",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0095",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34"
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
            return "1:1: Tokens : ( T__52 | T__53 | T__54 | T__55 | T__56 | EQUAL | NOT_EQUAL | LT | LE | GT | GE | PLUS | MINUS | MUL | DIV | MOD | NOT | AND | OR | IF | THEN | ELSE | ENDIF | WHILE | DURATION | DO | ENDWHILE | FUNC | ENDFUNC | RETURN | READ | WRITE | TRUE | FALSE | NOTE | ID | INT | DOUBLE | COMMENT | STRING | WS );";
        }
    }
 

}