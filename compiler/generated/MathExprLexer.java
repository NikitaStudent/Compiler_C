// $ANTLR 3.2 Sep 23, 2009 12:02:23 MathExpr.g 2020-04-25 17:02:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MathExprLexer extends Lexer {
    public static final int CALL=14;
    public static final int LETTER=18;
    public static final int ARGS=13;
    public static final int FUNC_DECL=12;
    public static final int DO=7;
    public static final int RETURN=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int ELSE=6;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int ARGS_DECL=11;
    public static final int INDEX=16;
    public static final int WS=22;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int IF=5;
    public static final int TYPE=10;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int NUMBER=19;
    public static final int BLOCK=15;
    public static final int DIGIT=17;
    public static final int T__26=26;
    public static final int IDENT=21;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__23=23;
    public static final int STRING=20;
    public static final int T__24=24;
    public static final int WHILE=8;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int PROGRAM=9;

    // delegates
    // delegators

    public MathExprLexer() {;} 
    public MathExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MathExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "MathExpr.g"; }

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:7:8: ( 'return' )
            // MathExpr.g:7:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:8:4: ( 'if' )
            // MathExpr.g:8:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:9:6: ( 'else' )
            // MathExpr.g:9:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:10:4: ( 'do' )
            // MathExpr.g:10:6: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:11:7: ( 'while' )
            // MathExpr.g:11:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:12:7: ( '[' )
            // MathExpr.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:13:7: ( ']' )
            // MathExpr.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:14:7: ( '(' )
            // MathExpr.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:15:7: ( ')' )
            // MathExpr.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:16:7: ( ',' )
            // MathExpr.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:17:7: ( '*' )
            // MathExpr.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:18:7: ( '/' )
            // MathExpr.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:19:7: ( '+' )
            // MathExpr.g:19:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:20:7: ( '-' )
            // MathExpr.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:21:7: ( '%' )
            // MathExpr.g:21:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:22:7: ( '==' )
            // MathExpr.g:22:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:23:7: ( '!=' )
            // MathExpr.g:23:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:24:7: ( '>' )
            // MathExpr.g:24:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:25:7: ( '<' )
            // MathExpr.g:25:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:26:7: ( '>=' )
            // MathExpr.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:27:7: ( '<=' )
            // MathExpr.g:27:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:28:7: ( '=' )
            // MathExpr.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:29:7: ( ';' )
            // MathExpr.g:29:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:30:7: ( '{' )
            // MathExpr.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:31:7: ( '}' )
            // MathExpr.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // MathExpr.g:27:15: ( '0' .. '9' )
            // MathExpr.g:28:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // MathExpr.g:31:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // MathExpr.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:35:7: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? )
            // MathExpr.g:36:3: ( DIGIT )+ ( '.' ( DIGIT )+ )?
            {
            // MathExpr.g:36:3: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // MathExpr.g:36:3: DIGIT
            	    {
            	    mDIGIT(); 

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

            // MathExpr.g:36:10: ( '.' ( DIGIT )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // MathExpr.g:36:11: '.' ( DIGIT )+
                    {
                    match('.'); 
                    // MathExpr.g:36:15: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // MathExpr.g:36:15: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:39:7: ( '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"' )
            // MathExpr.g:40:3: '\"' ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )* '\"'
            {
            match('\"'); 
            // MathExpr.g:40:7: ( '\\\\\"' | '\\\\\\\\' | ~ '\"' )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\\') ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2=='\"') ) {
                        int LA4_4 = input.LA(3);

                        if ( ((LA4_4>='\u0000' && LA4_4<='\uFFFF')) ) {
                            alt4=1;
                        }

                        else {
                            alt4=3;
                        }

                    }
                    else if ( (LA4_2=='\\') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_2>='\u0000' && LA4_2<='!')||(LA4_2>='#' && LA4_2<='[')||(LA4_2>=']' && LA4_2<='\uFFFF')) ) {
                        alt4=3;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // MathExpr.g:40:8: '\\\\\"'
            	    {
            	    match("\\\""); 


            	    }
            	    break;
            	case 2 :
            	    // MathExpr.g:40:16: '\\\\\\\\'
            	    {
            	    match("\\\\"); 


            	    }
            	    break;
            	case 3 :
            	    // MathExpr.g:40:25: ~ '\"'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:43:6: ( LETTER ( LETTER | DIGIT )* )
            // MathExpr.g:44:3: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // MathExpr.g:44:10: ( LETTER | DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // MathExpr.g:124:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // MathExpr.g:125:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // MathExpr.g:125:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||(LA6_0>='\f' && LA6_0<='\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // MathExpr.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // MathExpr.g:1:8: ( RETURN | IF | ELSE | DO | WHILE | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | NUMBER | STRING | IDENT | WS )
        int alt7=29;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // MathExpr.g:1:10: RETURN
                {
                mRETURN(); 

                }
                break;
            case 2 :
                // MathExpr.g:1:17: IF
                {
                mIF(); 

                }
                break;
            case 3 :
                // MathExpr.g:1:20: ELSE
                {
                mELSE(); 

                }
                break;
            case 4 :
                // MathExpr.g:1:25: DO
                {
                mDO(); 

                }
                break;
            case 5 :
                // MathExpr.g:1:28: WHILE
                {
                mWHILE(); 

                }
                break;
            case 6 :
                // MathExpr.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // MathExpr.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // MathExpr.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // MathExpr.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // MathExpr.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // MathExpr.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // MathExpr.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // MathExpr.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // MathExpr.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // MathExpr.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // MathExpr.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // MathExpr.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // MathExpr.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // MathExpr.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // MathExpr.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // MathExpr.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // MathExpr.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // MathExpr.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // MathExpr.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // MathExpr.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // MathExpr.g:1:154: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 27 :
                // MathExpr.g:1:161: STRING
                {
                mSTRING(); 

                }
                break;
            case 28 :
                // MathExpr.g:1:168: IDENT
                {
                mIDENT(); 

                }
                break;
            case 29 :
                // MathExpr.g:1:174: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\5\31\12\uffff\1\41\1\uffff\1\43\1\45\7\uffff\1\31\1\47"+
        "\1\31\1\51\1\31\6\uffff\1\31\1\uffff\1\31\1\uffff\2\31\1\57\2\31"+
        "\1\uffff\1\62\1\63\2\uffff";
    static final String DFA7_eofS =
        "\64\uffff";
    static final String DFA7_minS =
        "\1\11\1\145\1\146\1\154\1\157\1\150\12\uffff\1\75\1\uffff\2\75"+
        "\7\uffff\1\164\1\60\1\163\1\60\1\151\6\uffff\1\165\1\uffff\1\145"+
        "\1\uffff\1\154\1\162\1\60\1\145\1\156\1\uffff\2\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\1\145\1\146\1\154\1\157\1\150\12\uffff\1\75\1\uffff\2\75"+
        "\7\uffff\1\164\1\172\1\163\1\172\1\151\6\uffff\1\165\1\uffff\1\145"+
        "\1\uffff\1\154\1\162\1\172\1\145\1\156\1\uffff\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\6\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff"+
        "\1\21\2\uffff\1\27\1\30\1\31\1\32\1\33\1\34\1\35\5\uffff\1\20\1"+
        "\26\1\24\1\22\1\25\1\23\1\uffff\1\2\1\uffff\1\4\5\uffff\1\3\2\uffff"+
        "\1\5\1\1";
    static final String DFA7_specialS =
        "\64\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\32\1\uffff\2\32\22\uffff\1\32\1\21\1\30\2\uffff\1\17\2\uffff"+
            "\1\10\1\11\1\13\1\15\1\12\1\16\1\uffff\1\14\12\27\1\uffff\1"+
            "\24\1\23\1\20\1\22\2\uffff\32\31\1\6\1\uffff\1\7\1\uffff\1\31"+
            "\1\uffff\3\31\1\4\1\3\3\31\1\2\10\31\1\1\4\31\1\5\3\31\1\25"+
            "\1\uffff\1\26",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
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
            "\1\40",
            "",
            "\1\42",
            "\1\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\50",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
            "",
            "\1\55",
            "\1\56",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\60",
            "\1\61",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RETURN | IF | ELSE | DO | WHILE | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | NUMBER | STRING | IDENT | WS );";
        }
    }
 

}