// $ANTLR 3.4 C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g 2012-09-05 21:38:01

	package nl.wietmazairac.bimql;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BimQLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int INTEGER=4;
    public static final int REAL=5;
    public static final int STRING=6;
    public static final int VARIABLE=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BimQLLexer() {} 
    public BimQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BimQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:11:6: ( '.Attribute.' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:11:8: '.Attribute.'
            {
            match(".Attribute."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:12:7: ( '.EntityType' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:12:9: '.EntityType'
            {
            match(".EntityType"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:13:7: ( '.Property.' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:13:9: '.Property.'
            {
            match(".Property."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:14:7: ( '/=' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:14:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:15:7: ( ':=' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:15:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:16:7: ( '<' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:16:9: '<'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:17:7: ( '<=' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:17:9: '<='
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:18:7: ( '=' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:18:9: '='
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:19:7: ( '>' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:19:9: '>'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:20:7: ( '>=' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:20:9: '>='
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:21:7: ( 'And' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:21:9: 'And'
            {
            match("And"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:22:7: ( 'Or' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:22:9: 'Or'
            {
            match("Or"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:23:7: ( 'Select' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:23:9: 'Select'
            {
            match("Select"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:24:7: ( 'Set' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:24:9: 'Set'
            {
            match("Set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:25:7: ( 'Where' )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:25:9: 'Where'
            {
            match("Where"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:198:2: ( '$' STRING )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:198:4: '$' STRING
            {
            match('$'); 

            mSTRING(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:202:2: ( ( '0' .. '9' )+ )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:202:4: ( '0' .. '9' )+
            {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:202:4: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:2: ( ( INTEGER )+ ( '.' ( INTEGER )+ )? )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:4: ( INTEGER )+ ( '.' ( INTEGER )+ )?
            {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:4: ( INTEGER )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:4: INTEGER
            	    {
            	    mINTEGER(); 


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


            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:13: ( '.' ( INTEGER )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:14: '.' ( INTEGER )+
                    {
                    match('.'); 

                    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:18: ( INTEGER )+
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
                    	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:206:18: INTEGER
                    	    {
                    	    mINTEGER(); 


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
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:210:2: ( ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+ )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:210:4: ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+
            {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:210:4: ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*'||(LA5_0 >= '0' && LA5_0 <= '9')||LA5_0=='?'||(LA5_0 >= 'A' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:
            	    {
            	    if ( input.LA(1)=='*'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'z') ) {
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
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:220:2: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:220:4: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:220:4: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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


            _channel = HIDDEN;

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
        // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | VARIABLE | INTEGER | REAL | STRING | WS )
        int alt7=20;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:63: T__18
                {
                mT__18(); 


                }
                break;
            case 11 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:69: T__19
                {
                mT__19(); 


                }
                break;
            case 12 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:75: T__20
                {
                mT__20(); 


                }
                break;
            case 13 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:81: T__21
                {
                mT__21(); 


                }
                break;
            case 14 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:87: T__22
                {
                mT__22(); 


                }
                break;
            case 15 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:93: T__23
                {
                mT__23(); 


                }
                break;
            case 16 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:99: VARIABLE
                {
                mVARIABLE(); 


                }
                break;
            case 17 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:108: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 18 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:116: REAL
                {
                mREAL(); 


                }
                break;
            case 19 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:121: STRING
                {
                mSTRING(); 


                }
                break;
            case 20 :
                // C:\\Users\\Wiet\\Dropbox\\workspace\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:128: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\4\uffff\1\23\1\uffff\1\25\4\15\1\uffff\1\32\11\uffff\1\15\1\35"+
        "\2\15\2\uffff\1\41\1\uffff\1\15\1\43\1\15\1\uffff\1\15\1\uffff\2"+
        "\15\1\50\1\51\2\uffff";
    static final String DFA7_eofS =
        "\52\uffff";
    static final String DFA7_minS =
        "\1\11\1\101\2\uffff\1\75\1\uffff\1\75\1\156\1\162\1\145\1\150\1"+
        "\uffff\1\52\11\uffff\1\144\1\52\1\154\1\145\2\uffff\1\52\1\uffff"+
        "\1\145\1\52\1\162\1\uffff\1\143\1\uffff\1\145\1\164\2\52\2\uffff";
    static final String DFA7_maxS =
        "\1\172\1\120\2\uffff\1\75\1\uffff\1\75\1\156\1\162\1\145\1\150\1"+
        "\uffff\1\172\11\uffff\1\144\1\172\1\164\1\145\2\uffff\1\172\1\uffff"+
        "\1\145\1\172\1\162\1\uffff\1\143\1\uffff\1\145\1\164\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\4\1\5\1\uffff\1\10\5\uffff\1\20\1\uffff\1\23\1\24\1\1"+
        "\1\2\1\3\1\7\1\6\1\12\1\11\4\uffff\1\21\1\22\1\uffff\1\14\3\uffff"+
        "\1\13\1\uffff\1\16\4\uffff\1\17\1\15";
    static final String DFA7_specialS =
        "\52\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\3\uffff\1\13\5\uffff\1\15\3"+
            "\uffff\1\1\1\2\12\14\1\3\1\uffff\1\4\1\5\1\6\1\15\1\uffff\1"+
            "\7\15\15\1\10\3\15\1\11\3\15\1\12\43\15",
            "\1\17\3\uffff\1\20\12\uffff\1\21",
            "",
            "",
            "\1\22",
            "",
            "\1\24",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\15\3\uffff\1\33\1\uffff\12\14\5\uffff\1\15\1\uffff\72\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "\1\36\7\uffff\1\37",
            "\1\40",
            "",
            "",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "",
            "\1\42",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "\1\44",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | VARIABLE | INTEGER | REAL | STRING | WS );";
        }
    }
 

}