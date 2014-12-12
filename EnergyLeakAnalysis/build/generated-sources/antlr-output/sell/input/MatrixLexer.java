// $ANTLR 3.5.2 sell/input/Matrix.g 2014-09-14 00:48:00
 package sell; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MatrixLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__8=8;
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
	public static final int T__24=24;
	public static final int DIGIT=4;
	public static final int NL=5;
	public static final int NUMBER=6;
	public static final int Space=7;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MatrixLexer() {} 
	public MatrixLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MatrixLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "sell/input/Matrix.g"; }

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:4:6: ( ',' )
			// sell/input/Matrix.g:4:8: ','
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:5:6: ( '0' )
			// sell/input/Matrix.g:5:8: '0'
			{
			match('0'); 
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
			// sell/input/Matrix.g:6:7: ( '1' )
			// sell/input/Matrix.g:6:9: '1'
			{
			match('1'); 
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
			// sell/input/Matrix.g:7:7: ( '=' )
			// sell/input/Matrix.g:7:9: '='
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:8:7: ( '>' )
			// sell/input/Matrix.g:8:9: '>'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:9:7: ( '[' )
			// sell/input/Matrix.g:9:9: '['
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:10:7: ( ']' )
			// sell/input/Matrix.g:10:9: ']'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:11:7: ( '_' )
			// sell/input/Matrix.g:11:9: '_'
			{
			match('_'); 
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
			// sell/input/Matrix.g:12:7: ( 'cpu' )
			// sell/input/Matrix.g:12:9: 'cpu'
			{
			match("cpu"); 

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
			// sell/input/Matrix.g:13:7: ( 'disk' )
			// sell/input/Matrix.g:13:9: 'disk'
			{
			match("disk"); 

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
			// sell/input/Matrix.g:14:7: ( 'e' )
			// sell/input/Matrix.g:14:9: 'e'
			{
			match('e'); 
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
			// sell/input/Matrix.g:15:7: ( 'fans' )
			// sell/input/Matrix.g:15:9: 'fans'
			{
			match("fans"); 

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
			// sell/input/Matrix.g:16:7: ( 'graphic' )
			// sell/input/Matrix.g:16:9: 'graphic'
			{
			match("graphic"); 

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
			// sell/input/Matrix.g:17:7: ( 'n' )
			// sell/input/Matrix.g:17:9: 'n'
			{
			match('n'); 
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
			// sell/input/Matrix.g:18:7: ( 'ram' )
			// sell/input/Matrix.g:18:9: 'ram'
			{
			match("ram"); 

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
			// sell/input/Matrix.g:19:7: ( 't' )
			// sell/input/Matrix.g:19:9: 't'
			{
			match('t'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:20:7: ( '|' )
			// sell/input/Matrix.g:20:9: '|'
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
	// $ANTLR end "T__24"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:46:2: ( ( DIGIT )+ ( '.' ( DIGIT )+ )? | '.' ( DIGIT )+ )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			else if ( (LA5_0=='.') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// sell/input/Matrix.g:46:4: ( DIGIT )+ ( '.' ( DIGIT )+ )?
					{
					// sell/input/Matrix.g:46:4: ( DIGIT )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// sell/input/Matrix.g:46:4: DIGIT
							{
							mDIGIT(); 

							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					// sell/input/Matrix.g:46:11: ( '.' ( DIGIT )+ )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0=='.') ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// sell/input/Matrix.g:46:12: '.' ( DIGIT )+
							{
							match('.'); 
							// sell/input/Matrix.g:46:16: ( DIGIT )+
							int cnt2=0;
							loop2:
							while (true) {
								int alt2=2;
								int LA2_0 = input.LA(1);
								if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
									alt2=1;
								}

								switch (alt2) {
								case 1 :
									// sell/input/Matrix.g:46:16: DIGIT
									{
									mDIGIT(); 

									}
									break;

								default :
									if ( cnt2 >= 1 ) break loop2;
									EarlyExitException eee = new EarlyExitException(2, input);
									throw eee;
								}
								cnt2++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// sell/input/Matrix.g:47:4: '.' ( DIGIT )+
					{
					match('.'); 
					// sell/input/Matrix.g:47:8: ( DIGIT )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// sell/input/Matrix.g:47:8: DIGIT
							{
							mDIGIT(); 

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

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
	// $ANTLR end "NUMBER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// sell/input/Matrix.g:51:18: ( ( '0' .. '9' )+ )
			// sell/input/Matrix.g:51:20: ( '0' .. '9' )+
			{
			// sell/input/Matrix.g:51:20: ( '0' .. '9' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// sell/input/Matrix.g:
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
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "NL"
	public final void mNL() throws RecognitionException {
		try {
			int _type = NL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:52:7: ( ( '\\r' )? '\\n' | '\\r' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='\n') ) {
					alt8=1;
				}

				else {
					alt8=2;
				}

			}
			else if ( (LA8_0=='\n') ) {
				alt8=1;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// sell/input/Matrix.g:52:9: ( '\\r' )? '\\n'
					{
					// sell/input/Matrix.g:52:9: ( '\\r' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\r') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// sell/input/Matrix.g:52:9: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;
				case 2 :
					// sell/input/Matrix.g:52:22: '\\r'
					{
					match('\r'); 
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
	// $ANTLR end "NL"

	// $ANTLR start "Space"
	public final void mSpace() throws RecognitionException {
		try {
			int _type = Space;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// sell/input/Matrix.g:53:7: ( ( ' ' | '\\t' )+ )
			// sell/input/Matrix.g:53:9: ( ' ' | '\\t' )+
			{
			// sell/input/Matrix.g:53:9: ( ' ' | '\\t' )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\t'||LA9_0==' ') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// sell/input/Matrix.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Space"

	@Override
	public void mTokens() throws RecognitionException {
		// sell/input/Matrix.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | NUMBER | NL | Space )
		int alt10=20;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt10=1;
			}
			break;
		case '0':
			{
			int LA10_2 = input.LA(2);
			if ( (LA10_2=='.'||(LA10_2 >= '0' && LA10_2 <= '9')) ) {
				alt10=18;
			}

			else {
				alt10=2;
			}

			}
			break;
		case '1':
			{
			int LA10_3 = input.LA(2);
			if ( (LA10_3=='.'||(LA10_3 >= '0' && LA10_3 <= '9')) ) {
				alt10=18;
			}

			else {
				alt10=3;
			}

			}
			break;
		case '=':
			{
			alt10=4;
			}
			break;
		case '>':
			{
			alt10=5;
			}
			break;
		case '[':
			{
			alt10=6;
			}
			break;
		case ']':
			{
			alt10=7;
			}
			break;
		case '_':
			{
			alt10=8;
			}
			break;
		case 'c':
			{
			alt10=9;
			}
			break;
		case 'd':
			{
			alt10=10;
			}
			break;
		case 'e':
			{
			alt10=11;
			}
			break;
		case 'f':
			{
			alt10=12;
			}
			break;
		case 'g':
			{
			alt10=13;
			}
			break;
		case 'n':
			{
			alt10=14;
			}
			break;
		case 'r':
			{
			alt10=15;
			}
			break;
		case 't':
			{
			alt10=16;
			}
			break;
		case '|':
			{
			alt10=17;
			}
			break;
		case '.':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt10=18;
			}
			break;
		case '\n':
		case '\r':
			{
			alt10=19;
			}
			break;
		case '\t':
		case ' ':
			{
			alt10=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 10, 0, input);
			throw nvae;
		}
		switch (alt10) {
			case 1 :
				// sell/input/Matrix.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// sell/input/Matrix.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// sell/input/Matrix.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// sell/input/Matrix.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// sell/input/Matrix.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// sell/input/Matrix.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// sell/input/Matrix.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// sell/input/Matrix.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// sell/input/Matrix.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// sell/input/Matrix.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// sell/input/Matrix.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// sell/input/Matrix.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// sell/input/Matrix.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// sell/input/Matrix.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// sell/input/Matrix.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// sell/input/Matrix.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// sell/input/Matrix.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// sell/input/Matrix.g:1:110: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 19 :
				// sell/input/Matrix.g:1:117: NL
				{
				mNL(); 

				}
				break;
			case 20 :
				// sell/input/Matrix.g:1:120: Space
				{
				mSpace(); 

				}
				break;

		}
	}



}
