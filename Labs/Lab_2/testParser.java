// Generated from test.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMMEDIATE=1, REG=2, COMMAND=3, MEMORY=4, NEWLINE=5, COMMA=6, SPACE=7;
	public static final int
		RULE_expr = 0, RULE_start = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMMEDIATE", "REG", "COMMAND", "MEMORY", "NEWLINE", "COMMA", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public testParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode COMMAND() { return getToken(testParser.COMMAND, 0); }
		public List<TerminalNode> SPACE() { return getTokens(testParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(testParser.SPACE, i);
		}
		public List<TerminalNode> REG() { return getTokens(testParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(testParser.REG, i);
		}
		public TerminalNode COMMA() { return getToken(testParser.COMMA, 0); }
		public TerminalNode MEMORY() { return getToken(testParser.MEMORY, 0); }
		public TerminalNode IMMEDIATE() { return getToken(testParser.IMMEDIATE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4);
				match(COMMAND);
				setState(5);
				match(SPACE);
				setState(6);
				match(REG);
				setState(7);
				match(COMMA);
				setState(8);
				match(SPACE);
				setState(9);
				match(MEMORY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(COMMAND);
				setState(11);
				match(SPACE);
				setState(12);
				match(MEMORY);
				setState(13);
				match(COMMA);
				setState(14);
				match(SPACE);
				setState(15);
				match(REG);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(COMMAND);
				setState(17);
				match(SPACE);
				setState(18);
				match(REG);
				setState(19);
				match(COMMA);
				setState(20);
				match(SPACE);
				setState(21);
				match(REG);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(COMMAND);
				setState(23);
				match(SPACE);
				setState(24);
				match(MEMORY);
				setState(25);
				match(COMMA);
				setState(26);
				match(SPACE);
				setState(27);
				match(IMMEDIATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(COMMAND);
				setState(29);
				match(SPACE);
				setState(30);
				match(REG);
				setState(31);
				match(COMMA);
				setState(32);
				match(SPACE);
				setState(33);
				match(IMMEDIATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				match(COMMAND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof testListener ) ((testListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAND) {
				{
				{
				setState(37);
				expr();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t.\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n\2\3\3"+
		"\7\3)\n\3\f\3\16\3,\13\3\3\3\2\2\4\2\4\2\2\2\61\2%\3\2\2\2\4*\3\2\2\2"+
		"\6\7\7\5\2\2\7\b\7\t\2\2\b\t\7\4\2\2\t\n\7\b\2\2\n\13\7\t\2\2\13&\7\6"+
		"\2\2\f\r\7\5\2\2\r\16\7\t\2\2\16\17\7\6\2\2\17\20\7\b\2\2\20\21\7\t\2"+
		"\2\21&\7\4\2\2\22\23\7\5\2\2\23\24\7\t\2\2\24\25\7\4\2\2\25\26\7\b\2\2"+
		"\26\27\7\t\2\2\27&\7\4\2\2\30\31\7\5\2\2\31\32\7\t\2\2\32\33\7\6\2\2\33"+
		"\34\7\b\2\2\34\35\7\t\2\2\35&\7\3\2\2\36\37\7\5\2\2\37 \7\t\2\2 !\7\4"+
		"\2\2!\"\7\b\2\2\"#\7\t\2\2#&\7\3\2\2$&\7\5\2\2%\6\3\2\2\2%\f\3\2\2\2%"+
		"\22\3\2\2\2%\30\3\2\2\2%\36\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\')\5\2\2\2(\'"+
		"\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,*\3\2\2\2\4%*";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}