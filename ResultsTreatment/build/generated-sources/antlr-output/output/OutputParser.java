// $ANTLR 3.5.2 output/Output.g 2014-12-04 12:38:18

  package output;
  import genericTree.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class OutputParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "ID", "IdentifierNondigit", 
		"NUMBER", "Nondigit", "WS", "'('", "')'", "','", "'<'", "'='", "'>'", 
		"'e'", "'m'", "'t'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int DIGIT=4;
	public static final int ID=5;
	public static final int IdentifierNondigit=6;
	public static final int NUMBER=7;
	public static final int Nondigit=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public OutputParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public OutputParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return OutputParser.tokenNames; }
	@Override public String getGrammarFileName() { return "output/Output.g"; }



	// $ANTLR start "output"
	// output/Output.g:9:1: output returns [ Tree<ComponentNode> tree ] : l1= line (l2= line )* ;
	public final Tree<ComponentNode> output() throws RecognitionException {
		Tree<ComponentNode> tree = null;


		Node<ComponentNode> l1 =null;
		Node<ComponentNode> l2 =null;

		try {
			// output/Output.g:10:2: (l1= line (l2= line )* )
			// output/Output.g:10:4: l1= line (l2= line )*
			{
			pushFollow(FOLLOW_line_in_output36);
			l1=line();
			state._fsp--;

			// output/Output.g:10:14: (l2= line )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==15) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// output/Output.g:10:15: l2= line
					{
					pushFollow(FOLLOW_line_in_output43);
					l2=line();
					state._fsp--;

					 tree.getRoot().addChild(l2);  
					}
					break;

				default :
					break loop1;
				}
			}

			 tree = new Tree(l1); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tree;
	}
	// $ANTLR end "output"


	protected static class line_scope {
		ArrayList<Node<ComponentNode>> childList;
	}
	protected Stack<line_scope> line_stack = new Stack<line_scope>();


	// $ANTLR start "line"
	// output/Output.g:13:1: line returns [ Node<ComponentNode> node ] : component_begin (l1= line )* component_end ;
	public final Node<ComponentNode> line() throws RecognitionException {
		line_stack.push(new line_scope());
		Node<ComponentNode> node = null;


		Node<ComponentNode> l1 =null;
		OutputNode component_begin1 =null;
		OutputNode component_end2 =null;

		try {
			// output/Output.g:15:2: ( component_begin (l1= line )* component_end )
			// output/Output.g:15:4: component_begin (l1= line )* component_end
			{
			pushFollow(FOLLOW_component_begin_in_line70);
			component_begin1=component_begin();
			state._fsp--;

			// output/Output.g:15:20: (l1= line )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==15) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// output/Output.g:15:21: l1= line
					{
					pushFollow(FOLLOW_line_in_line77);
					l1=line();
					state._fsp--;

					 
														if (line_stack.peek().childList == null)
															line_stack.peek().childList = new ArrayList<Node<ComponentNode>>(); 
															
														line_stack.peek().childList.add(l1); 
													
					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_component_end_in_line84);
			component_end2=component_end();
			state._fsp--;


							if (component_begin1.getId().equals(component_end2.getId())){
								ComponentNode componentNode = new ComponentNode(component_begin1, component_end2);
								node = new Node<ComponentNode>(componentNode);

			                                        if (line_stack.peek().childList != null) {
			                                            for(Node<ComponentNode> child : line_stack.peek().childList) {
			                                                    node.addChild(child);
			                                            }
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
			line_stack.pop();
		}
		return node;
	}
	// $ANTLR end "line"



	// $ANTLR start "component"
	// output/Output.g:35:1: component returns [ OutputNode outputNode ] : ID '(' params ')' ;
	public final OutputNode component() throws RecognitionException {
		OutputNode outputNode = null;


		Token ID3=null;
		OutputNodeParameters params4 =null;

		 outputNode = new OutputNode(); 
		try {
			// output/Output.g:37:2: ( ID '(' params ')' )
			// output/Output.g:37:4: ID '(' params ')'
			{
			ID3=(Token)match(input,ID,FOLLOW_ID_in_component109); 
			match(input,10,FOLLOW_10_in_component111); 
			pushFollow(FOLLOW_params_in_component113);
			params4=params();
			state._fsp--;

			match(input,11,FOLLOW_11_in_component115); 
			 outputNode.setId((ID3!=null?ID3.getText():null)); outputNode.setParameters(params4); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return outputNode;
	}
	// $ANTLR end "component"



	// $ANTLR start "component_begin"
	// output/Output.g:41:1: component_begin returns [ OutputNode nodeBegin ] : '>' component ;
	public final OutputNode component_begin() throws RecognitionException {
		OutputNode nodeBegin = null;


		OutputNode component5 =null;

		try {
			// output/Output.g:42:2: ( '>' component )
			// output/Output.g:42:4: '>' component
			{
			match(input,15,FOLLOW_15_in_component_begin133); 
			pushFollow(FOLLOW_component_in_component_begin135);
			component5=component();
			state._fsp--;

			 nodeBegin = component5; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nodeBegin;
	}
	// $ANTLR end "component_begin"



	// $ANTLR start "component_end"
	// output/Output.g:45:1: component_end returns [ OutputNode nodeEnd ] : '<' component ;
	public final OutputNode component_end() throws RecognitionException {
		OutputNode nodeEnd = null;


		OutputNode component6 =null;

		try {
			// output/Output.g:46:2: ( '<' component )
			// output/Output.g:46:4: '<' component
			{
			match(input,13,FOLLOW_13_in_component_end152); 
			pushFollow(FOLLOW_component_in_component_end154);
			component6=component();
			state._fsp--;

			 nodeEnd = component6; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return nodeEnd;
	}
	// $ANTLR end "component_end"



	// $ANTLR start "params"
	// output/Output.g:49:1: params returns [ OutputNodeParameters parameters ] : p1= param ( ',' p2= param )* ;
	public final OutputNodeParameters params() throws RecognitionException {
		OutputNodeParameters parameters = null;


		ParserRuleReturnScope p1 =null;
		ParserRuleReturnScope p2 =null;

		 parameters = new OutputNodeParameters(); 
		try {
			// output/Output.g:51:3: (p1= param ( ',' p2= param )* )
			// output/Output.g:51:5: p1= param ( ',' p2= param )*
			{
			pushFollow(FOLLOW_param_in_params180);
			p1=param();
			state._fsp--;

			 parameters.put((p1!=null?((OutputParser.param_return)p1).key:null), (p1!=null?((OutputParser.param_return)p1).value:null)); 
			// output/Output.g:51:57: ( ',' p2= param )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==12) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// output/Output.g:51:59: ',' p2= param
					{
					match(input,12,FOLLOW_12_in_params186); 
					pushFollow(FOLLOW_param_in_params192);
					p2=param();
					state._fsp--;

					 parameters.put((p2!=null?((OutputParser.param_return)p2).key:null), (p2!=null?((OutputParser.param_return)p2).value:null)); 
					}
					break;

				default :
					break loop3;
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
	// output/Output.g:54:1: param returns [ String key, String value ] : ( 'm' '=' ID | 't' '=' NUMBER | 'e' '=' NUMBER );
	public final OutputParser.param_return param() throws RecognitionException {
		OutputParser.param_return retval = new OutputParser.param_return();
		retval.start = input.LT(1);

		Token ID7=null;
		Token NUMBER8=null;
		Token NUMBER9=null;

		try {
			// output/Output.g:55:2: ( 'm' '=' ID | 't' '=' NUMBER | 'e' '=' NUMBER )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 17:
				{
				alt4=1;
				}
				break;
			case 18:
				{
				alt4=2;
				}
				break;
			case 16:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// output/Output.g:55:4: 'm' '=' ID
					{
					match(input,17,FOLLOW_17_in_param214); 
					match(input,14,FOLLOW_14_in_param216); 
					ID7=(Token)match(input,ID,FOLLOW_ID_in_param218); 
					 retval.key = "m"; retval.value = (ID7!=null?ID7.getText():null); 
					}
					break;
				case 2 :
					// output/Output.g:56:4: 't' '=' NUMBER
					{
					match(input,18,FOLLOW_18_in_param225); 
					match(input,14,FOLLOW_14_in_param227); 
					NUMBER8=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param229); 
					 retval.key = "t"; retval.value = (NUMBER8!=null?NUMBER8.getText():null); 
					}
					break;
				case 3 :
					// output/Output.g:57:4: 'e' '=' NUMBER
					{
					match(input,16,FOLLOW_16_in_param236); 
					match(input,14,FOLLOW_14_in_param238); 
					NUMBER9=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_param240); 
					 retval.key = "e"; retval.value = (NUMBER9!=null?NUMBER9.getText():null); 
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



	public static final BitSet FOLLOW_line_in_output36 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_line_in_output43 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_component_begin_in_line70 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_line_in_line77 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_component_end_in_line84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_component109 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_component111 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_params_in_component113 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_component115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_component_begin133 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_component_in_component_begin135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_component_end152 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_component_in_component_end154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params180 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_params186 = new BitSet(new long[]{0x0000000000070000L});
	public static final BitSet FOLLOW_param_in_params192 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_17_in_param214 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_param216 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_param218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_param225 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_param227 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUMBER_in_param229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_param236 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_param238 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUMBER_in_param240 = new BitSet(new long[]{0x0000000000000002L});
}
