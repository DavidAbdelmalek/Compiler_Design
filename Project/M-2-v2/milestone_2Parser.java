// Generated from milestone_2.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class milestone_2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OP10=2, OP9=3, OP8=4, OP7=5, OP6=6, OP5=7, OP4=8, OP3=9, OP2=10, 
		OP1=11, OP0=12, ADDR=13, VARIABLE=14, AND=15, AS=16, ASM=17, BIND=18, 
		BLOCK=19, BREAK=20, CASE=21, CAST=22, CONCEPT=23, CONST=24, CONTINUE=25, 
		CONVERTER=26, MACRO=27, METHOD=28, MIXIN=29, MOD=30, NIL=31, NOT=32, NOTIN=33, 
		OBJECT=34, OF=35, OR=36, OUT=37, PROC=38, PTR=39, RAISE=40, REF=41, RETURN=42, 
		SHL=43, SHR=44, STATIC=45, TEMPLATE=46, TRY=47, TUPLE=48, TYPE=49, USING=50, 
		WHEN=51, WHILE=52, XOR=53, YIELD=54, DEFER=55, DISCARD=56, DISTINCT=57, 
		DIV=58, DO=59, ELIF=60, ELSE=61, END=62, ENUM=63, EXCEPT=64, EXPORT=65, 
		FINALLY=66, FOR=67, FROM=68, FUNC=69, IF=70, IMPORT=71, IN=72, INCLUDE=73, 
		INTERFACE=74, IS=75, ISNOT=76, ITERATOR=77, LET=78, EQUALS_OPERATOR=79, 
		ADD_OPERATOR=80, MINUS_OPERATOR=81, MUL_OPERATOR=82, DIV_OPERATOR=83, 
		LESS_THAN=84, GREATER_THAN=85, AND_OPERATOR=86, OR_OPERATOR=87, BITWISE_NOT_OPERATOR=88, 
		AT=89, MODULUS=90, NOT_OPERATOR=91, XOR_OPERATOR=92, DOT=93, COLON=94, 
		OPEN_BRACE=95, CLOSE_BRACE=96, OPEN_PAREN=97, CLOSE_PAREN=98, OPEN_BRACK=99, 
		CLOSE_BRACK=100, COMMA=101, SEMI_COLON=102, INDENT=103, COMMENT=104, MULTILINE=105, 
		MULTILINE_DOC=106, STR_LIT=107, TRIPLESTR_LIT=108, RSTR_LIT=109, CHAR_LIT=110, 
		GENERALIZED_STR_LIT=111, GENERALIZED_TRIPLESTR_LIT=112, IDENTIFIER=113, 
		FLOAT_LIT=114, DIGIT=115, INT_LIT=116, INT8_LIT=117, INT16_LIT=118, INT32_LIT=119, 
		INT64_LIT=120, UINT_LIT=121, UINT8_LIT=122, UINT16_LIT=123, UINT32_LIT=124, 
		UINT64_LIT=125, HEX_LIT=126, DEC_LIT=127, OCT_LIT=128, BIN_LIT=129, HEX=130, 
		HEXDIGIT=131, OCTDIGIT=132, BINDIGIT=133, EXP=134, FLOAT32_SUFFIX=135, 
		FLOAT32_LIT=136, FLOAT64_SUFFIX=137, FLOAT64_LIT=138, LETTER=139, ALL_ESCAPES=140, 
		SPACE=141;
	public static final int
		RULE_start = 0, RULE_comma = 1, RULE_semicolon = 2, RULE_colon = 3, RULE_colcom = 4, 
		RULE_operator = 5, RULE_var_value = 6, RULE_section_variable = 7, RULE_complexOrSimpleStmt = 8, 
		RULE_stmt = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "comma", "semicolon", "colon", "colcom", "operator", "var_value", 
			"section_variable", "complexOrSimpleStmt", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'..'", null, null, null, null, null, null, null, null, null, null, 
			null, "'addr'", "'var'", "'and'", "'as'", "'asm'", "'bind'", "'block'", 
			"'break'", "'case'", "'cast'", "'concept'", "'const'", "'continue'", 
			"'converter'", "'macro'", "'method'", "'mixin'", "'mod'", "'nil'", "'not'", 
			"'notin'", "'object'", "'of'", "'or'", "'out'", "'proc'", "'ptr'", "'raise'", 
			"'ref'", "'return'", "'shl'", "'shr'", "'static'", "'template'", "'try'", 
			"'tuple'", "'type'", "'using'", "'when'", "'while'", "'xor'", "'yield'", 
			"'defer'", "'discard'", "'distinct'", "'div'", "'do'", "'elif'", "'else'", 
			"'end'", "'enum'", "'except'", "'export'", "'finally'", "'for'", "'from'", 
			"'func'", "'if'", "'import'", "'in'", "'include'", "'interface'", "'is'", 
			"'isnot'", "'iterator'", "'let'", null, "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", "'&'", "'|'", "'~'", "'@'", "'%'", "'!'", "'^'", "'.'", "':'", 
			"'{'", "'}'", "'('", "')'", "'['", "']'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OP10", "OP9", "OP8", "OP7", "OP6", "OP5", "OP4", "OP3", 
			"OP2", "OP1", "OP0", "ADDR", "VARIABLE", "AND", "AS", "ASM", "BIND", 
			"BLOCK", "BREAK", "CASE", "CAST", "CONCEPT", "CONST", "CONTINUE", "CONVERTER", 
			"MACRO", "METHOD", "MIXIN", "MOD", "NIL", "NOT", "NOTIN", "OBJECT", "OF", 
			"OR", "OUT", "PROC", "PTR", "RAISE", "REF", "RETURN", "SHL", "SHR", "STATIC", 
			"TEMPLATE", "TRY", "TUPLE", "TYPE", "USING", "WHEN", "WHILE", "XOR", 
			"YIELD", "DEFER", "DISCARD", "DISTINCT", "DIV", "DO", "ELIF", "ELSE", 
			"END", "ENUM", "EXCEPT", "EXPORT", "FINALLY", "FOR", "FROM", "FUNC", 
			"IF", "IMPORT", "IN", "INCLUDE", "INTERFACE", "IS", "ISNOT", "ITERATOR", 
			"LET", "EQUALS_OPERATOR", "ADD_OPERATOR", "MINUS_OPERATOR", "MUL_OPERATOR", 
			"DIV_OPERATOR", "LESS_THAN", "GREATER_THAN", "AND_OPERATOR", "OR_OPERATOR", 
			"BITWISE_NOT_OPERATOR", "AT", "MODULUS", "NOT_OPERATOR", "XOR_OPERATOR", 
			"DOT", "COLON", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "COMMA", "SEMI_COLON", "INDENT", "COMMENT", 
			"MULTILINE", "MULTILINE_DOC", "STR_LIT", "TRIPLESTR_LIT", "RSTR_LIT", 
			"CHAR_LIT", "GENERALIZED_STR_LIT", "GENERALIZED_TRIPLESTR_LIT", "IDENTIFIER", 
			"FLOAT_LIT", "DIGIT", "INT_LIT", "INT8_LIT", "INT16_LIT", "INT32_LIT", 
			"INT64_LIT", "UINT_LIT", "UINT8_LIT", "UINT16_LIT", "UINT32_LIT", "UINT64_LIT", 
			"HEX_LIT", "DEC_LIT", "OCT_LIT", "BIN_LIT", "HEX", "HEXDIGIT", "OCTDIGIT", 
			"BINDIGIT", "EXP", "FLOAT32_SUFFIX", "FLOAT32_LIT", "FLOAT64_SUFFIX", 
			"FLOAT64_LIT", "LETTER", "ALL_ESCAPES", "SPACE"
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
	public String getGrammarFileName() { return "milestone_2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public milestone_2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				stmt();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VARIABLE || _la==USING || _la==LET );
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

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(milestone_2Parser.COMMA, 0); }
		public TerminalNode COMMENT() { return getToken(milestone_2Parser.COMMENT, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(COMMA);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(26);
				match(COMMENT);
				}
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

	public static class SemicolonContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(milestone_2Parser.SEMI_COLON, 0); }
		public TerminalNode COMMENT() { return getToken(milestone_2Parser.COMMENT, 0); }
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitSemicolon(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_semicolon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(SEMI_COLON);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(30);
				match(COMMENT);
				}
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

	public static class ColonContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(milestone_2Parser.COLON, 0); }
		public TerminalNode COMMENT() { return getToken(milestone_2Parser.COMMENT, 0); }
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitColon(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_colon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(COLON);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(34);
				match(COMMENT);
				}
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

	public static class ColcomContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(milestone_2Parser.SEMI_COLON, 0); }
		public TerminalNode COMMENT() { return getToken(milestone_2Parser.COMMENT, 0); }
		public ColcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterColcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitColcom(this);
		}
	}

	public final ColcomContext colcom() throws RecognitionException {
		ColcomContext _localctx = new ColcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_colcom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(SEMI_COLON);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(38);
				match(COMMENT);
				}
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode OP0() { return getToken(milestone_2Parser.OP0, 0); }
		public TerminalNode OP1() { return getToken(milestone_2Parser.OP1, 0); }
		public TerminalNode OP2() { return getToken(milestone_2Parser.OP2, 0); }
		public TerminalNode OP3() { return getToken(milestone_2Parser.OP3, 0); }
		public TerminalNode OP4() { return getToken(milestone_2Parser.OP4, 0); }
		public TerminalNode OP5() { return getToken(milestone_2Parser.OP5, 0); }
		public TerminalNode OP6() { return getToken(milestone_2Parser.OP6, 0); }
		public TerminalNode OP7() { return getToken(milestone_2Parser.OP7, 0); }
		public TerminalNode OP8() { return getToken(milestone_2Parser.OP8, 0); }
		public TerminalNode OP9() { return getToken(milestone_2Parser.OP9, 0); }
		public TerminalNode OR() { return getToken(milestone_2Parser.OR, 0); }
		public TerminalNode XOR() { return getToken(milestone_2Parser.XOR, 0); }
		public TerminalNode AND() { return getToken(milestone_2Parser.AND, 0); }
		public TerminalNode IS() { return getToken(milestone_2Parser.IS, 0); }
		public TerminalNode ISNOT() { return getToken(milestone_2Parser.ISNOT, 0); }
		public TerminalNode IN() { return getToken(milestone_2Parser.IN, 0); }
		public TerminalNode NOTIN() { return getToken(milestone_2Parser.NOTIN, 0); }
		public TerminalNode OF() { return getToken(milestone_2Parser.OF, 0); }
		public TerminalNode DIV() { return getToken(milestone_2Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(milestone_2Parser.MOD, 0); }
		public TerminalNode SHL() { return getToken(milestone_2Parser.SHL, 0); }
		public TerminalNode SHR() { return getToken(milestone_2Parser.SHR, 0); }
		public TerminalNode NOT() { return getToken(milestone_2Parser.NOT, 0); }
		public TerminalNode STATIC() { return getToken(milestone_2Parser.STATIC, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << OP9) | (1L << OP8) | (1L << OP7) | (1L << OP6) | (1L << OP5) | (1L << OP4) | (1L << OP3) | (1L << OP2) | (1L << OP1) | (1L << OP0) | (1L << AND) | (1L << MOD) | (1L << NOT) | (1L << NOTIN) | (1L << OF) | (1L << OR) | (1L << SHL) | (1L << SHR) | (1L << STATIC) | (1L << XOR) | (1L << DIV))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (IN - 72)) | (1L << (IS - 72)) | (1L << (ISNOT - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Var_valueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(milestone_2Parser.IDENTIFIER, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode INT_LIT() { return getToken(milestone_2Parser.INT_LIT, 0); }
		public Var_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterVar_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitVar_value(this);
		}
	}

	public final Var_valueContext var_value() throws RecognitionException {
		Var_valueContext _localctx = new Var_valueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IDENTIFIER);
			setState(44);
			operator();
			setState(45);
			match(INT_LIT);
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

	public static class Section_variableContext extends ParserRuleContext {
		public ColcomContext colcom() {
			return getRuleContext(ColcomContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(milestone_2Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(milestone_2Parser.INDENT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(milestone_2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(milestone_2Parser.IDENTIFIER, i);
		}
		public List<Var_valueContext> var_value() {
			return getRuleContexts(Var_valueContext.class);
		}
		public Var_valueContext var_value(int i) {
			return getRuleContext(Var_valueContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public Section_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterSection_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitSection_variable(this);
		}
	}

	public final Section_variableContext section_variable() throws RecognitionException {
		Section_variableContext _localctx = new Section_variableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INDENT) {
				{
				{
				setState(47);
				match(INDENT);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				match(IDENTIFIER);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(54);
					comma();
					}
				}

				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(61);
				colcom();
				}
				break;
			case 2:
				{
				setState(62);
				semicolon();
				}
				break;
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				var_value();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class ComplexOrSimpleStmtContext extends ParserRuleContext {
		public Section_variableContext section_variable() {
			return getRuleContext(Section_variableContext.class,0);
		}
		public TerminalNode LET() { return getToken(milestone_2Parser.LET, 0); }
		public TerminalNode VARIABLE() { return getToken(milestone_2Parser.VARIABLE, 0); }
		public TerminalNode USING() { return getToken(milestone_2Parser.USING, 0); }
		public ComplexOrSimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexOrSimpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterComplexOrSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitComplexOrSimpleStmt(this);
		}
	}

	public final ComplexOrSimpleStmtContext complexOrSimpleStmt() throws RecognitionException {
		ComplexOrSimpleStmtContext _localctx = new ComplexOrSimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_complexOrSimpleStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==USING || _la==LET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			section_variable();
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

	public static class StmtContext extends ParserRuleContext {
		public List<ComplexOrSimpleStmtContext> complexOrSimpleStmt() {
			return getRuleContexts(ComplexOrSimpleStmtContext.class);
		}
		public ComplexOrSimpleStmtContext complexOrSimpleStmt(int i) {
			return getRuleContext(ComplexOrSimpleStmtContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_2Listener ) ((milestone_2Listener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(73);
					complexOrSimpleStmt();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008fQ\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\5\3\36\n\3\3\4\3\4\5\4\"\n\4\3"+
		"\5\3\5\5\5&\n\5\3\6\3\6\5\6*\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\t\63\n"+
		"\t\f\t\16\t\66\13\t\3\t\3\t\5\t:\n\t\6\t<\n\t\r\t\16\t=\3\t\3\t\5\tB\n"+
		"\t\3\t\6\tE\n\t\r\t\16\tF\3\n\3\n\3\n\3\13\6\13M\n\13\r\13\16\13N\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\r\2\3\3\5\16\21\21  \"#%&-/\67\67<"+
		"<JJMN\5\2\20\20\64\64PP\2Q\2\27\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b#\3"+
		"\2\2\2\n\'\3\2\2\2\f+\3\2\2\2\16-\3\2\2\2\20\64\3\2\2\2\22H\3\2\2\2\24"+
		"L\3\2\2\2\26\30\5\24\13\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31"+
		"\32\3\2\2\2\32\3\3\2\2\2\33\35\7g\2\2\34\36\7j\2\2\35\34\3\2\2\2\35\36"+
		"\3\2\2\2\36\5\3\2\2\2\37!\7h\2\2 \"\7j\2\2! \3\2\2\2!\"\3\2\2\2\"\7\3"+
		"\2\2\2#%\7`\2\2$&\7j\2\2%$\3\2\2\2%&\3\2\2\2&\t\3\2\2\2\')\7h\2\2(*\7"+
		"j\2\2)(\3\2\2\2)*\3\2\2\2*\13\3\2\2\2+,\t\2\2\2,\r\3\2\2\2-.\7s\2\2./"+
		"\5\f\7\2/\60\7v\2\2\60\17\3\2\2\2\61\63\7i\2\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65;\3\2\2\2\66\64\3\2\2\2\679\7s\2\2"+
		"8:\5\4\3\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;\67\3\2\2\2<=\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>A\3\2\2\2?B\5\n\6\2@B\5\6\4\2A?\3\2\2\2A@\3\2\2\2BD\3\2\2"+
		"\2CE\5\16\b\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\21\3\2\2\2HI\t"+
		"\3\2\2IJ\5\20\t\2J\23\3\2\2\2KM\5\22\n\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2O\25\3\2\2\2\r\31\35!%)\649=AFN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}