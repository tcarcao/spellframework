// $ANTLR 3.5.2 sell/input/Matrix.g 2014-09-14 00:48:00

  package sell;
  import java.util.TreeMap;
  import sell.input.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MatrixParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "NL", "NUMBER", "Space", 
		"','", "'0'", "'1'", "'='", "'>'", "'['", "']'", "'_'", "'cpu'", "'disk'", 
		"'e'", "'fans'", "'graphic'", "'n'", "'ram'", "'t'", "'|'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MatrixParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MatrixParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MatrixParser.tokenNames; }
	@Override public String getGrammarFileName() { return "sell/input/Matrix.g"; }



	// $ANTLR start "parse"
	// sell/input/Matrix.g:10:1: parse returns [ DataRetrieved matrix ] : ( line )+ EOF ;
	public final DataRetrieved parse() throws RecognitionException {
		DataRetrieved matrix = null;


		DataLineRetrieved line1 =null;

		 matrix = new DataRetrieved(); 
		try {
			// sell/input/Matrix.g:12:2: ( ( line )+ EOF )
			// sell/input/Matrix.g:12:4: ( line )+ EOF
			{
			// sell/input/Matrix.g:12:4: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 9 && LA1_0 <= 10)||LA1_0==13||(LA1_0 >= 15 && LA1_0 <= 23)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// sell/input/Matrix.g:12:5: line
					{
					pushFollow(FOLLOW_line_in_parse37);
					line1=line();
					state._fsp--;

					 matrix.addVector(line1); 
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_parse44); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return matrix;
	}
	// $ANTLR end "parse"



	// $ANTLR start "line"
	// sell/input/Matrix.g:15:1: line returns [ DataLineRetrieved vector ] : (c1= component )+ ( '>' c2= component )? ( '|' c3= component )? ( NL | EOF ) ;
	public final DataLineRetrieved line() throws RecognitionException {
		DataLineRetrieved vector = null;


		ComponentSample c1 =null;
		ComponentSample c2 =null;
		ComponentSample c3 =null;

		 vector = new DataLineRetrieved(); 
		try {
			// sell/input/Matrix.g:17:2: ( (c1= component )+ ( '>' c2= component )? ( '|' c3= component )? ( NL | EOF ) )
			// sell/input/Matrix.g:17:4: (c1= component )+ ( '>' c2= component )? ( '|' c3= component )? ( NL | EOF )
			{
			// sell/input/Matrix.g:17:4: (c1= component )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 9 && LA2_0 <= 10)||LA2_0==13||(LA2_0 >= 15 && LA2_0 <= 23)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// sell/input/Matrix.g:17:5: c1= component
					{
					pushFollow(FOLLOW_component_in_line68);
					c1=component();
					state._fsp--;

					 vector.addComponent(c1); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// sell/input/Matrix.g:17:64: ( '>' c2= component )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==12) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// sell/input/Matrix.g:17:65: '>' c2= component
					{
					match(input,12,FOLLOW_12_in_line76); 
					pushFollow(FOLLOW_component_in_line82);
					c2=component();
					state._fsp--;

					 vector.addTotal(c2); 
					}
					break;

			}

			// sell/input/Matrix.g:17:124: ( '|' c3= component )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==24) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// sell/input/Matrix.g:17:125: '|' c3= component
					{
					match(input,24,FOLLOW_24_in_line90); 
					pushFollow(FOLLOW_component_in_line96);
					c3=component();
					state._fsp--;

					 vector.addError(c3); 
					}
					break;

			}

			if ( input.LA(1)==EOF||input.LA(1)==NL ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vector;
	}
	// $ANTLR end "line"



	// $ANTLR start "component"
	// sell/input/Matrix.g:20:1: component returns [ ComponentSample component ] : ( param | '[' params ']' | '_' | '0' | '1' );
	public final ComponentSample component() throws RecognitionException {
		ComponentSample component = null;


		ComponentParameters params2 =null;

		try {
			// sell/input/Matrix.g:21:2: ( param | '[' params ']' | '_' | '0' | '1' )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
				{
				alt5=1;
				}
				break;
			case 13:
				{
				alt5=2;
				}
				break;
			case 15:
				{
				alt5=3;
				}
				break;
			case 9:
				{
				alt5=4;
				}
				break;
			case 10:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// sell/input/Matrix.g:21:4: param
					{
					pushFollow(FOLLOW_param_in_component124);
					param();
					state._fsp--;

					}
					break;
				case 2 :
					// sell/input/Matrix.g:22:4: '[' params ']'
					{
					match(input,13,FOLLOW_13_in_component129); 
					pushFollow(FOLLOW_params_in_component131);
					params2=params();
					state._fsp--;

					match(input,14,FOLLOW_14_in_component133); 
					 component = new ComponentSample(params2); 
					}
					break;
				case 3 :
					// sell/input/Matrix.g:23:4: '_'
					{
					match(input,15,FOLLOW_15_in_component140); 
					 component = new ComponentSample(false); 
					}
					break;
				case 4 :
					// sell/input/Matrix.g:24:4: '0'
					{
					match(input,9,FOLLOW_9_in_component147); 
					 component = new ComponentSample(false); 
					}
					break;
				case 5 :
					// sell/input/Matrix.g:25:4: '1'
					{
					match(input,10,FOLLOW_10_in_component154); 
					 component = new ComponentSample(true); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return component;
	}
	// $ANTLR end "component"



	// $ANTLR start "params"
	// sell/input/Matrix.g:28:1: params returns [ ComponentParameters parameters ] : p1= param ( ',' p2= param )* ;
	public final ComponentParameters params() throws RecognitionException {
		ComponentParameters parameters = null;


		ParserRuleReturnScope p1 =null;
		ParserRuleReturnScope p2 =null;

		 parameters = new ComponentParameters(); 
		try {
			// sell/input/Matrix.g:30:2: (p1= param ( ',' p2= param )* )
			// sell/input/Matrix.g:30:4: p1= param ( ',' p2= param )*
			{
			pushFollow(FOLLOW_param_in_params179);
			p1=param();
			state._fsp--;

			 parameters.put((p1!=null?((MatrixParser.param_return)p1).key:null), (p1!=null?((MatrixParser.param_return)p1).value:null)); 
			// sell/input/Matrix.g:30:56: ( ',' p2= param )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==8) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// sell/input/Matrix.g:30:58: ',' p2= param
					{
					match(input,8,FOLLOW_8_in_params185); 
					pushFollow(FOLLOW_param_in_params191);
					p2=param();
					state._fsp--;

					 parameters.put((p2!=null?((MatrixParser.param_return)p2).key:null), (p2!=null?((MatrixParser.param_return)p2).value:null)); 
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return parameters;
	}
	// $ANTLR end "params"


	public static class param_return extends ParserRuleReturnScope {
		public String key;
		public String value;
	};


	// $ANTLR start "param"
	// sell/input/Matrix.g:33:1: param returns [ String key, String value ] : ( 'n' '=' NUMBER | 't' '=' NUMBER | 'e' '=' NUMBER | 'cpu' '=' NUMBER | 'ram' '=' NUMBER | 'disk' '=' NUMBER | 'fans' '=' NUMBER | 'graphic' '=' NUMBER );
	public final MatrixParser.param_return param() throws RecognitionException {
		MatrixParser.param_return retval = new MatrixParser.param_return();
		retval.start = input.LT(1);

		Token NUMBER3=null;
		Token NUMBER4=null;
		Token NUMBER5=null;
		Token NUMBER6=null;
		Token NUMBER7=null;
		Token NUMBER8=null;
		Token NUMBER9=null;
		Token NUMBER10=null;

		try {
			// sell/input/Matrix.g:34:2: ( 'n' '=' NUMBER | 't' '=' NUMBER | 'e' '=' NUMBER | 'cpu' '=' NUMBER | 'ram' '=' NUMBER | 'disk' '=' NUMBER | 'fans' '=' NUMBER | 'graphic' '=' NUMBER )
			int alt7=8;
			switch ( input.LA(1) ) {
			case 21:
				{
				alt7=1;
				}
				break;
			case 23:
				{
				alt7=2;
				}
				break;
			case 18:
				{
				alt7=3;
				}
				break;
			case 16:
				{
				alt7=4;
				}
				break;
			case 22:
				{
				alt7=5;
				}
				break;
			case 17:
				{
				alt7=6;
				}
				break;
			case 19:
				{
				alt7=7;
				}
				break;
			case 20:
				{
				alt7=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// sell/input/Matrix.g:34:4: 'n' '=' NUMBER
					{
					match(input,21,FOLLOW_21_in_param212); 
					match(input,11,FOLLOW_11_in_param214); 
					NUMBER3=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param216); 
					 retval.key = "n"; retval.value = (NUMBER3!=null?NUMBER3.getText():null); 
					}
					break;
				case 2 :
					// sell/input/Matrix.g:35:4: 't' '=' NUMBER
					{
					match(input,23,FOLLOW_23_in_param223); 
					match(input,11,FOLLOW_11_in_param225); 
					NUMBER4=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param227); 
					 retval.key = "t"; retval.value = (NUMBER4!=null?NUMBER4.getText():null); 
					}
					break;
				case 3 :
					// sell/input/Matrix.g:36:4: 'e' '=' NUMBER
					{
					match(input,18,FOLLOW_18_in_param234); 
					match(input,11,FOLLOW_11_in_param236); 
					NUMBER5=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param238); 
					 retval.key = "e"; retval.value = (NUMBER5!=null?NUMBER5.getText():null); 
					}
					break;
				case 4 :
					// sell/input/Matrix.g:37:4: 'cpu' '=' NUMBER
					{
					match(input,16,FOLLOW_16_in_param245); 
					match(input,11,FOLLOW_11_in_param247); 
					NUMBER6=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param249); 
					 retval.key = "cpu"; retval.value = (NUMBER6!=null?NUMBER6.getText():null); 
					}
					break;
				case 5 :
					// sell/input/Matrix.g:38:4: 'ram' '=' NUMBER
					{
					match(input,22,FOLLOW_22_in_param256); 
					match(input,11,FOLLOW_11_in_param258); 
					NUMBER7=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param260); 
					 retval.key = "ram"; retval.value = (NUMBER7!=null?NUMBER7.getText():null); 
					}
					break;
				case 6 :
					// sell/input/Matrix.g:39:4: 'disk' '=' NUMBER
					{
					match(input,17,FOLLOW_17_in_param267); 
					match(input,11,FOLLOW_11_in_param269); 
					NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param271); 
					 retval.key = "disk"; retval.value = (NUMBER8!=null?NUMBER8.getText():null); 
					}
					break;
				case 7 :
					// sell/input/Matrix.g:40:4: 'fans' '=' NUMBER
					{
					match(input,19,FOLLOW_19_in_param278); 
					match(input,11,FOLLOW_11_in_param280); 
					NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param282); 
					 retval.key = "fans"; retval.value = (NUMBER9!=null?NUMBER9.getText():null); 
					}
					break;
				case 8 :
					// sell/input/Matrix.g:41:4: 'graphic' '=' NUMBER
					{
					match(input,20,FOLLOW_20_in_param289); 
					match(input,11,FOLLOW_11_in_param291); 
					NUMBER10=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param293); 
					 retval.key = "graphic"; retval.value = (NUMBER10!=null?NUMBER10.getText():null); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"

	// Delegated rules



	public static final BitSet FOLLOW_line_in_parse37 = new BitSet(new long[]{0x0000000000FFA600L});
	public static final BitSet FOLLOW_EOF_in_parse44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_component_in_line68 = new BitSet(new long[]{0x0000000001FFB620L});
	public static final BitSet FOLLOW_12_in_line76 = new BitSet(new long[]{0x0000000000FFA600L});
	public static final BitSet FOLLOW_component_in_line82 = new BitSet(new long[]{0x0000000001000020L});
	public static final BitSet FOLLOW_24_in_line90 = new BitSet(new long[]{0x0000000000FFA600L});
	public static final BitSet FOLLOW_component_in_line96 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_set_in_line103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_component124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_component129 = new BitSet(new long[]{0x0000000000FF0000L});
	public static final BitSet FOLLOW_params_in_component131 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_component133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_component140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_component147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_component154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params179 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_params185 = new BitSet(new long[]{0x0000000000FF0000L});
	public static final BitSet FOLLOW_param_in_params191 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_21_in_param212 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param214 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_param223 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param225 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_param234 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param236 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_param245 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param247 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_param256 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param258 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_param267 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param269 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_param278 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param280 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_param289 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_param291 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NUMBER_in_param293 = new BitSet(new long[]{0x0000000000000002L});
}
