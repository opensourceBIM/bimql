// $ANTLR 3.1.1 D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g 2013-02-08 10:33:59

	package nl.wietmazairac.bimql;
	

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class BimQLLexer extends Lexer {
    public static final int INTEGER=6;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int REAL=7;
    public static final int T__19=19;
    public static final int WS=9;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int VARIABLE=4;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int PLUGIN=8;
    public static final int STRING=5;

    // delegates
    // delegators

    public BimQLLexer() {;} 
    public BimQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BimQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:11:7: ( 'Select' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:11:9: 'Select'
            {
            match("Select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:12:7: ( ':=' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:12:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:13:7: ( '.Attribute.' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:13:9: '.Attribute.'
            {
            match(".Attribute."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:14:7: ( '.Property.' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:14:9: '.Property.'
            {
            match(".Property."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:15:7: ( 'Where' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:15:9: 'Where'
            {
            match("Where"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:16:7: ( 'Set' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:16:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:17:7: ( 'And' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:17:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:18:7: ( 'Or' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:18:9: 'Or'
            {
            match("Or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:19:7: ( '=' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:20:7: ( '/=' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:20:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:21:7: ( '<' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:21:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:22:7: ( '<=' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:23:7: ( '>=' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:24:7: ( '>' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:24:9: '>'
            {
            match('>'); 

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
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:25:7: ( '.EntityType' )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:25:9: '.EntityType'
            {
            match(".EntityType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:260:2: ( '$' STRING )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:260:4: '$' STRING
            {
            match('$'); 
            mSTRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "PLUGIN"
    public final void mPLUGIN() throws RecognitionException {
        try {
            int _type = PLUGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:264:3: ( ':' STRING )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:264:5: ':' STRING
            {
            match(':'); 
            mSTRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUGIN"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:268:2: ( ( '0' .. '9' )+ )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:268:4: ( '0' .. '9' )+
            {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:268:4: ( '0' .. '9' )+
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
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:268:5: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:2: ( ( INTEGER )+ ( '.' ( INTEGER )+ )? )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:4: ( INTEGER )+ ( '.' ( INTEGER )+ )?
            {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:4: ( INTEGER )+
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
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:4: INTEGER
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

            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:13: ( '.' ( INTEGER )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:14: '.' ( INTEGER )+
                    {
                    match('.'); 
                    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:18: ( INTEGER )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:272:18: INTEGER
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
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:276:2: ( ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+ )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:276:4: ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+
            {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:276:4: ( '\\u002A' .. '\\u002A' | '\\u003F' .. '\\u003F' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005A' | '\\u005B' .. '\\u0060' | '\\u0061' .. '\\u007A' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*'||(LA5_0>='0' && LA5_0<='9')||LA5_0=='?'||(LA5_0>='A' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:
            	    {
            	    if ( input.LA(1)=='*'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:286:2: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:286:4: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:286:4: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:
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

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | VARIABLE | PLUGIN | INTEGER | REAL | STRING | WS )
        int alt7=21;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:100: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 17 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:109: PLUGIN
                {
                mPLUGIN(); 

                }
                break;
            case 18 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:116: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 19 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:124: REAL
                {
                mREAL(); 

                }
                break;
            case 20 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:129: STRING
                {
                mSTRING(); 

                }
                break;
            case 21 :
                // D:\\src\\bimql\\BimQL\\src\\nl\\wietmazairac\\bimql\\BimQL.g:1:136: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\15\2\uffff\3\15\2\uffff\1\31\1\33\1\uffff\1\34\2\uffff"+
        "\1\15\5\uffff\2\15\1\42\6\uffff\1\15\1\44\1\15\1\46\1\uffff\1\15"+
        "\1\uffff\1\15\1\uffff\1\15\1\52\1\53\2\uffff";
    static final String DFA7_eofS =
        "\54\uffff";
    static final String DFA7_minS =
        "\1\11\1\145\1\52\1\101\1\150\1\156\1\162\2\uffff\2\75\1\uffff\1"+
        "\52\2\uffff\1\154\5\uffff\1\145\1\144\1\52\6\uffff\1\145\1\52\1"+
        "\162\1\52\1\uffff\1\143\1\uffff\1\145\1\uffff\1\164\2\52\2\uffff";
    static final String DFA7_maxS =
        "\1\172\1\145\1\172\1\120\1\150\1\156\1\162\2\uffff\2\75\1\uffff"+
        "\1\172\2\uffff\1\164\5\uffff\1\145\1\144\1\172\6\uffff\1\145\1\172"+
        "\1\162\1\172\1\uffff\1\143\1\uffff\1\145\1\uffff\1\164\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\7\uffff\1\11\1\12\2\uffff\1\20\1\uffff\1\24\1\25\1\uffff\1\2\1"+
        "\21\1\3\1\4\1\17\3\uffff\1\14\1\13\1\15\1\16\1\22\1\23\4\uffff\1"+
        "\10\1\uffff\1\6\1\uffff\1\7\3\uffff\1\5\1\1";
    static final String DFA7_specialS =
        "\54\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\16\1\uffff\2\16\22\uffff\1\16\3\uffff\1\13\5\uffff\1\15"+
            "\3\uffff\1\3\1\10\12\14\1\2\1\uffff\1\11\1\7\1\12\1\15\1\uffff"+
            "\1\5\15\15\1\6\3\15\1\1\3\15\1\4\43\15",
            "\1\17",
            "\1\21\5\uffff\12\21\3\uffff\1\20\1\uffff\1\21\1\uffff\72\21",
            "\1\22\3\uffff\1\24\12\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "\1\30",
            "\1\32",
            "",
            "\1\15\3\uffff\1\35\1\uffff\12\14\5\uffff\1\15\1\uffff\72\15",
            "",
            "",
            "\1\36\7\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "\1\45",
            "\1\15\5\uffff\12\15\5\uffff\1\15\1\uffff\72\15",
            "",
            "\1\47",
            "",
            "\1\50",
            "",
            "\1\51",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | VARIABLE | PLUGIN | INTEGER | REAL | STRING | WS );";
        }
    }
 

}