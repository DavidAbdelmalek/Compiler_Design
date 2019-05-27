// Generated from milestone_1.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class milestone_1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADDR=1, VARIABLE=2, AND=3, AS=4, ASM=5, BIND=6, BLOCK=7, BREAK=8, CASE=9, 
		CAST=10, CONCEPT=11, CONST=12, CONTINUE=13, CONVERTER=14, MACRO=15, METHOD=16, 
		MIXIN=17, MOD=18, NIL=19, NOT=20, NOTIN=21, OBJECT=22, OF=23, OR=24, OUT=25, 
		PROC=26, PTR=27, RAISE=28, REF=29, RETURN=30, SHL=31, SHR=32, STATIC=33, 
		TEMPLATE=34, TRY=35, TUPLE=36, TYPE=37, USING=38, WHEN=39, WHILE=40, XOR=41, 
		YIELD=42, DEFER=43, DISCARD=44, DISTINCT=45, DIV=46, DO=47, ELIF=48, ELSE=49, 
		END=50, ENUM=51, EXCEPT=52, EXPORT=53, FINALLY=54, FOR=55, FROM=56, FUNC=57, 
		IF=58, IMPORT=59, IN=60, INCLUDE=61, INTERFACE=62, IS=63, ISNOT=64, ITERATOR=65, 
		LET=66, EQUALS_OPERATOR=67, ADD_OPERATOR=68, MINUS_OPERATOR=69, MUL_OPERATOR=70, 
		DIV_OPERATOR=71, LESS_THAN=72, GREATER_THAN=73, AND_OPERATOR=74, OR_OPERATOR=75, 
		BITWISE_NOT_OPERATOR=76, AT=77, MODULUS=78, NOT_OPERATOR=79, XOR_OPERATOR=80, 
		DOT=81, COLON=82, OPEN_BRACE=83, CLOSE_BRACE=84, OPEN_PAREN=85, CLOSE_PAREN=86, 
		OPEN_BRACK=87, CLOSE_BRACK=88, COMMA=89, SEMI_COLON=90, INDENT=91, COMMENT=92, 
		MULTILINE=93, MULTILINE_DOC=94, STR_LIT=95, TRIPLESTR_LIT=96, RSTR_LIT=97, 
		CHAR_LIT=98, GENERALIZED_STR_LIT=99, GENERALIZED_TRIPLESTR_LIT=100, IDENTIFIER=101, 
		FLOAT_LIT=102, DIGIT=103, INT_LIT=104, INT8_LIT=105, INT16_LIT=106, INT32_LIT=107, 
		INT64_LIT=108, UINT_LIT=109, UINT8_LIT=110, UINT16_LIT=111, UINT32_LIT=112, 
		UINT64_LIT=113, HEX_LIT=114, DEC_LIT=115, OCT_LIT=116, BIN_LIT=117, HEX=118, 
		HEXDIGIT=119, OCTDIGIT=120, BINDIGIT=121, EXP=122, FLOAT32_SUFFIX=123, 
		FLOAT32_LIT=124, FLOAT64_SUFFIX=125, FLOAT64_LIT=126, LETTER=127, ALL_ESCAPES=128, 
		SPACE=129;
	public static final int
		RULE_start = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
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
			null, "ADDR", "VARIABLE", "AND", "AS", "ASM", "BIND", "BLOCK", "BREAK", 
			"CASE", "CAST", "CONCEPT", "CONST", "CONTINUE", "CONVERTER", "MACRO", 
			"METHOD", "MIXIN", "MOD", "NIL", "NOT", "NOTIN", "OBJECT", "OF", "OR", 
			"OUT", "PROC", "PTR", "RAISE", "REF", "RETURN", "SHL", "SHR", "STATIC", 
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
	public String getGrammarFileName() { return "milestone_1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public milestone_1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TerminalNode> AND() { return getTokens(milestone_1Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(milestone_1Parser.AND, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(milestone_1Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(milestone_1Parser.VARIABLE, i);
		}
		public List<TerminalNode> ADDR() { return getTokens(milestone_1Parser.ADDR); }
		public TerminalNode ADDR(int i) {
			return getToken(milestone_1Parser.ADDR, i);
		}
		public List<TerminalNode> AS() { return getTokens(milestone_1Parser.AS); }
		public TerminalNode AS(int i) {
			return getToken(milestone_1Parser.AS, i);
		}
		public List<TerminalNode> ASM() { return getTokens(milestone_1Parser.ASM); }
		public TerminalNode ASM(int i) {
			return getToken(milestone_1Parser.ASM, i);
		}
		public List<TerminalNode> BIND() { return getTokens(milestone_1Parser.BIND); }
		public TerminalNode BIND(int i) {
			return getToken(milestone_1Parser.BIND, i);
		}
		public List<TerminalNode> BLOCK() { return getTokens(milestone_1Parser.BLOCK); }
		public TerminalNode BLOCK(int i) {
			return getToken(milestone_1Parser.BLOCK, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(milestone_1Parser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(milestone_1Parser.BREAK, i);
		}
		public List<TerminalNode> CASE() { return getTokens(milestone_1Parser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(milestone_1Parser.CASE, i);
		}
		public List<TerminalNode> CAST() { return getTokens(milestone_1Parser.CAST); }
		public TerminalNode CAST(int i) {
			return getToken(milestone_1Parser.CAST, i);
		}
		public List<TerminalNode> CONCEPT() { return getTokens(milestone_1Parser.CONCEPT); }
		public TerminalNode CONCEPT(int i) {
			return getToken(milestone_1Parser.CONCEPT, i);
		}
		public List<TerminalNode> CONST() { return getTokens(milestone_1Parser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(milestone_1Parser.CONST, i);
		}
		public List<TerminalNode> CONTINUE() { return getTokens(milestone_1Parser.CONTINUE); }
		public TerminalNode CONTINUE(int i) {
			return getToken(milestone_1Parser.CONTINUE, i);
		}
		public List<TerminalNode> CONVERTER() { return getTokens(milestone_1Parser.CONVERTER); }
		public TerminalNode CONVERTER(int i) {
			return getToken(milestone_1Parser.CONVERTER, i);
		}
		public List<TerminalNode> DEFER() { return getTokens(milestone_1Parser.DEFER); }
		public TerminalNode DEFER(int i) {
			return getToken(milestone_1Parser.DEFER, i);
		}
		public List<TerminalNode> DISCARD() { return getTokens(milestone_1Parser.DISCARD); }
		public TerminalNode DISCARD(int i) {
			return getToken(milestone_1Parser.DISCARD, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(milestone_1Parser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(milestone_1Parser.DISTINCT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(milestone_1Parser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(milestone_1Parser.DIV, i);
		}
		public List<TerminalNode> DO() { return getTokens(milestone_1Parser.DO); }
		public TerminalNode DO(int i) {
			return getToken(milestone_1Parser.DO, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(milestone_1Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(milestone_1Parser.ELIF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(milestone_1Parser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(milestone_1Parser.ELSE, i);
		}
		public List<TerminalNode> END() { return getTokens(milestone_1Parser.END); }
		public TerminalNode END(int i) {
			return getToken(milestone_1Parser.END, i);
		}
		public List<TerminalNode> ENUM() { return getTokens(milestone_1Parser.ENUM); }
		public TerminalNode ENUM(int i) {
			return getToken(milestone_1Parser.ENUM, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(milestone_1Parser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(milestone_1Parser.EXCEPT, i);
		}
		public List<TerminalNode> EXPORT() { return getTokens(milestone_1Parser.EXPORT); }
		public TerminalNode EXPORT(int i) {
			return getToken(milestone_1Parser.EXPORT, i);
		}
		public List<TerminalNode> FINALLY() { return getTokens(milestone_1Parser.FINALLY); }
		public TerminalNode FINALLY(int i) {
			return getToken(milestone_1Parser.FINALLY, i);
		}
		public List<TerminalNode> FOR() { return getTokens(milestone_1Parser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(milestone_1Parser.FOR, i);
		}
		public List<TerminalNode> FROM() { return getTokens(milestone_1Parser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(milestone_1Parser.FROM, i);
		}
		public List<TerminalNode> FUNC() { return getTokens(milestone_1Parser.FUNC); }
		public TerminalNode FUNC(int i) {
			return getToken(milestone_1Parser.FUNC, i);
		}
		public List<TerminalNode> IF() { return getTokens(milestone_1Parser.IF); }
		public TerminalNode IF(int i) {
			return getToken(milestone_1Parser.IF, i);
		}
		public List<TerminalNode> IMPORT() { return getTokens(milestone_1Parser.IMPORT); }
		public TerminalNode IMPORT(int i) {
			return getToken(milestone_1Parser.IMPORT, i);
		}
		public List<TerminalNode> IN() { return getTokens(milestone_1Parser.IN); }
		public TerminalNode IN(int i) {
			return getToken(milestone_1Parser.IN, i);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(milestone_1Parser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(milestone_1Parser.INCLUDE, i);
		}
		public List<TerminalNode> INTERFACE() { return getTokens(milestone_1Parser.INTERFACE); }
		public TerminalNode INTERFACE(int i) {
			return getToken(milestone_1Parser.INTERFACE, i);
		}
		public List<TerminalNode> IS() { return getTokens(milestone_1Parser.IS); }
		public TerminalNode IS(int i) {
			return getToken(milestone_1Parser.IS, i);
		}
		public List<TerminalNode> ISNOT() { return getTokens(milestone_1Parser.ISNOT); }
		public TerminalNode ISNOT(int i) {
			return getToken(milestone_1Parser.ISNOT, i);
		}
		public List<TerminalNode> ITERATOR() { return getTokens(milestone_1Parser.ITERATOR); }
		public TerminalNode ITERATOR(int i) {
			return getToken(milestone_1Parser.ITERATOR, i);
		}
		public List<TerminalNode> LET() { return getTokens(milestone_1Parser.LET); }
		public TerminalNode LET(int i) {
			return getToken(milestone_1Parser.LET, i);
		}
		public List<TerminalNode> MACRO() { return getTokens(milestone_1Parser.MACRO); }
		public TerminalNode MACRO(int i) {
			return getToken(milestone_1Parser.MACRO, i);
		}
		public List<TerminalNode> METHOD() { return getTokens(milestone_1Parser.METHOD); }
		public TerminalNode METHOD(int i) {
			return getToken(milestone_1Parser.METHOD, i);
		}
		public List<TerminalNode> MIXIN() { return getTokens(milestone_1Parser.MIXIN); }
		public TerminalNode MIXIN(int i) {
			return getToken(milestone_1Parser.MIXIN, i);
		}
		public List<TerminalNode> MOD() { return getTokens(milestone_1Parser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(milestone_1Parser.MOD, i);
		}
		public List<TerminalNode> NIL() { return getTokens(milestone_1Parser.NIL); }
		public TerminalNode NIL(int i) {
			return getToken(milestone_1Parser.NIL, i);
		}
		public List<TerminalNode> NOT() { return getTokens(milestone_1Parser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(milestone_1Parser.NOT, i);
		}
		public List<TerminalNode> NOTIN() { return getTokens(milestone_1Parser.NOTIN); }
		public TerminalNode NOTIN(int i) {
			return getToken(milestone_1Parser.NOTIN, i);
		}
		public List<TerminalNode> OBJECT() { return getTokens(milestone_1Parser.OBJECT); }
		public TerminalNode OBJECT(int i) {
			return getToken(milestone_1Parser.OBJECT, i);
		}
		public List<TerminalNode> OF() { return getTokens(milestone_1Parser.OF); }
		public TerminalNode OF(int i) {
			return getToken(milestone_1Parser.OF, i);
		}
		public List<TerminalNode> OR() { return getTokens(milestone_1Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(milestone_1Parser.OR, i);
		}
		public List<TerminalNode> OUT() { return getTokens(milestone_1Parser.OUT); }
		public TerminalNode OUT(int i) {
			return getToken(milestone_1Parser.OUT, i);
		}
		public List<TerminalNode> PROC() { return getTokens(milestone_1Parser.PROC); }
		public TerminalNode PROC(int i) {
			return getToken(milestone_1Parser.PROC, i);
		}
		public List<TerminalNode> PTR() { return getTokens(milestone_1Parser.PTR); }
		public TerminalNode PTR(int i) {
			return getToken(milestone_1Parser.PTR, i);
		}
		public List<TerminalNode> RAISE() { return getTokens(milestone_1Parser.RAISE); }
		public TerminalNode RAISE(int i) {
			return getToken(milestone_1Parser.RAISE, i);
		}
		public List<TerminalNode> REF() { return getTokens(milestone_1Parser.REF); }
		public TerminalNode REF(int i) {
			return getToken(milestone_1Parser.REF, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(milestone_1Parser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(milestone_1Parser.RETURN, i);
		}
		public List<TerminalNode> SHL() { return getTokens(milestone_1Parser.SHL); }
		public TerminalNode SHL(int i) {
			return getToken(milestone_1Parser.SHL, i);
		}
		public List<TerminalNode> SHR() { return getTokens(milestone_1Parser.SHR); }
		public TerminalNode SHR(int i) {
			return getToken(milestone_1Parser.SHR, i);
		}
		public List<TerminalNode> STATIC() { return getTokens(milestone_1Parser.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(milestone_1Parser.STATIC, i);
		}
		public List<TerminalNode> TEMPLATE() { return getTokens(milestone_1Parser.TEMPLATE); }
		public TerminalNode TEMPLATE(int i) {
			return getToken(milestone_1Parser.TEMPLATE, i);
		}
		public List<TerminalNode> TRY() { return getTokens(milestone_1Parser.TRY); }
		public TerminalNode TRY(int i) {
			return getToken(milestone_1Parser.TRY, i);
		}
		public List<TerminalNode> TUPLE() { return getTokens(milestone_1Parser.TUPLE); }
		public TerminalNode TUPLE(int i) {
			return getToken(milestone_1Parser.TUPLE, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(milestone_1Parser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(milestone_1Parser.TYPE, i);
		}
		public List<TerminalNode> USING() { return getTokens(milestone_1Parser.USING); }
		public TerminalNode USING(int i) {
			return getToken(milestone_1Parser.USING, i);
		}
		public List<TerminalNode> WHEN() { return getTokens(milestone_1Parser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(milestone_1Parser.WHEN, i);
		}
		public List<TerminalNode> WHILE() { return getTokens(milestone_1Parser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(milestone_1Parser.WHILE, i);
		}
		public List<TerminalNode> XOR() { return getTokens(milestone_1Parser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(milestone_1Parser.XOR, i);
		}
		public List<TerminalNode> YIELD() { return getTokens(milestone_1Parser.YIELD); }
		public TerminalNode YIELD(int i) {
			return getToken(milestone_1Parser.YIELD, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(milestone_1Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(milestone_1Parser.IDENTIFIER, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(milestone_1Parser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(milestone_1Parser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(milestone_1Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(milestone_1Parser.DIGIT, i);
		}
		public List<TerminalNode> INT8_LIT() { return getTokens(milestone_1Parser.INT8_LIT); }
		public TerminalNode INT8_LIT(int i) {
			return getToken(milestone_1Parser.INT8_LIT, i);
		}
		public List<TerminalNode> INT16_LIT() { return getTokens(milestone_1Parser.INT16_LIT); }
		public TerminalNode INT16_LIT(int i) {
			return getToken(milestone_1Parser.INT16_LIT, i);
		}
		public List<TerminalNode> INT32_LIT() { return getTokens(milestone_1Parser.INT32_LIT); }
		public TerminalNode INT32_LIT(int i) {
			return getToken(milestone_1Parser.INT32_LIT, i);
		}
		public List<TerminalNode> INT64_LIT() { return getTokens(milestone_1Parser.INT64_LIT); }
		public TerminalNode INT64_LIT(int i) {
			return getToken(milestone_1Parser.INT64_LIT, i);
		}
		public List<TerminalNode> UINT_LIT() { return getTokens(milestone_1Parser.UINT_LIT); }
		public TerminalNode UINT_LIT(int i) {
			return getToken(milestone_1Parser.UINT_LIT, i);
		}
		public List<TerminalNode> UINT8_LIT() { return getTokens(milestone_1Parser.UINT8_LIT); }
		public TerminalNode UINT8_LIT(int i) {
			return getToken(milestone_1Parser.UINT8_LIT, i);
		}
		public List<TerminalNode> UINT16_LIT() { return getTokens(milestone_1Parser.UINT16_LIT); }
		public TerminalNode UINT16_LIT(int i) {
			return getToken(milestone_1Parser.UINT16_LIT, i);
		}
		public List<TerminalNode> UINT32_LIT() { return getTokens(milestone_1Parser.UINT32_LIT); }
		public TerminalNode UINT32_LIT(int i) {
			return getToken(milestone_1Parser.UINT32_LIT, i);
		}
		public List<TerminalNode> UINT64_LIT() { return getTokens(milestone_1Parser.UINT64_LIT); }
		public TerminalNode UINT64_LIT(int i) {
			return getToken(milestone_1Parser.UINT64_LIT, i);
		}
		public List<TerminalNode> FLOAT32_LIT() { return getTokens(milestone_1Parser.FLOAT32_LIT); }
		public TerminalNode FLOAT32_LIT(int i) {
			return getToken(milestone_1Parser.FLOAT32_LIT, i);
		}
		public List<TerminalNode> FLOAT32_SUFFIX() { return getTokens(milestone_1Parser.FLOAT32_SUFFIX); }
		public TerminalNode FLOAT32_SUFFIX(int i) {
			return getToken(milestone_1Parser.FLOAT32_SUFFIX, i);
		}
		public List<TerminalNode> FLOAT64_LIT() { return getTokens(milestone_1Parser.FLOAT64_LIT); }
		public TerminalNode FLOAT64_LIT(int i) {
			return getToken(milestone_1Parser.FLOAT64_LIT, i);
		}
		public List<TerminalNode> FLOAT64_SUFFIX() { return getTokens(milestone_1Parser.FLOAT64_SUFFIX); }
		public TerminalNode FLOAT64_SUFFIX(int i) {
			return getToken(milestone_1Parser.FLOAT64_SUFFIX, i);
		}
		public List<TerminalNode> FLOAT_LIT() { return getTokens(milestone_1Parser.FLOAT_LIT); }
		public TerminalNode FLOAT_LIT(int i) {
			return getToken(milestone_1Parser.FLOAT_LIT, i);
		}
		public List<TerminalNode> EXP() { return getTokens(milestone_1Parser.EXP); }
		public TerminalNode EXP(int i) {
			return getToken(milestone_1Parser.EXP, i);
		}
		public List<TerminalNode> INT_LIT() { return getTokens(milestone_1Parser.INT_LIT); }
		public TerminalNode INT_LIT(int i) {
			return getToken(milestone_1Parser.INT_LIT, i);
		}
		public List<TerminalNode> HEX_LIT() { return getTokens(milestone_1Parser.HEX_LIT); }
		public TerminalNode HEX_LIT(int i) {
			return getToken(milestone_1Parser.HEX_LIT, i);
		}
		public List<TerminalNode> DEC_LIT() { return getTokens(milestone_1Parser.DEC_LIT); }
		public TerminalNode DEC_LIT(int i) {
			return getToken(milestone_1Parser.DEC_LIT, i);
		}
		public List<TerminalNode> OCT_LIT() { return getTokens(milestone_1Parser.OCT_LIT); }
		public TerminalNode OCT_LIT(int i) {
			return getToken(milestone_1Parser.OCT_LIT, i);
		}
		public List<TerminalNode> BIN_LIT() { return getTokens(milestone_1Parser.BIN_LIT); }
		public TerminalNode BIN_LIT(int i) {
			return getToken(milestone_1Parser.BIN_LIT, i);
		}
		public List<TerminalNode> HEXDIGIT() { return getTokens(milestone_1Parser.HEXDIGIT); }
		public TerminalNode HEXDIGIT(int i) {
			return getToken(milestone_1Parser.HEXDIGIT, i);
		}
		public List<TerminalNode> OCTDIGIT() { return getTokens(milestone_1Parser.OCTDIGIT); }
		public TerminalNode OCTDIGIT(int i) {
			return getToken(milestone_1Parser.OCTDIGIT, i);
		}
		public List<TerminalNode> BINDIGIT() { return getTokens(milestone_1Parser.BINDIGIT); }
		public TerminalNode BINDIGIT(int i) {
			return getToken(milestone_1Parser.BINDIGIT, i);
		}
		public List<TerminalNode> EQUALS_OPERATOR() { return getTokens(milestone_1Parser.EQUALS_OPERATOR); }
		public TerminalNode EQUALS_OPERATOR(int i) {
			return getToken(milestone_1Parser.EQUALS_OPERATOR, i);
		}
		public List<TerminalNode> ADD_OPERATOR() { return getTokens(milestone_1Parser.ADD_OPERATOR); }
		public TerminalNode ADD_OPERATOR(int i) {
			return getToken(milestone_1Parser.ADD_OPERATOR, i);
		}
		public List<TerminalNode> MUL_OPERATOR() { return getTokens(milestone_1Parser.MUL_OPERATOR); }
		public TerminalNode MUL_OPERATOR(int i) {
			return getToken(milestone_1Parser.MUL_OPERATOR, i);
		}
		public List<TerminalNode> MINUS_OPERATOR() { return getTokens(milestone_1Parser.MINUS_OPERATOR); }
		public TerminalNode MINUS_OPERATOR(int i) {
			return getToken(milestone_1Parser.MINUS_OPERATOR, i);
		}
		public List<TerminalNode> DIV_OPERATOR() { return getTokens(milestone_1Parser.DIV_OPERATOR); }
		public TerminalNode DIV_OPERATOR(int i) {
			return getToken(milestone_1Parser.DIV_OPERATOR, i);
		}
		public List<TerminalNode> BITWISE_NOT_OPERATOR() { return getTokens(milestone_1Parser.BITWISE_NOT_OPERATOR); }
		public TerminalNode BITWISE_NOT_OPERATOR(int i) {
			return getToken(milestone_1Parser.BITWISE_NOT_OPERATOR, i);
		}
		public List<TerminalNode> AND_OPERATOR() { return getTokens(milestone_1Parser.AND_OPERATOR); }
		public TerminalNode AND_OPERATOR(int i) {
			return getToken(milestone_1Parser.AND_OPERATOR, i);
		}
		public List<TerminalNode> OR_OPERATOR() { return getTokens(milestone_1Parser.OR_OPERATOR); }
		public TerminalNode OR_OPERATOR(int i) {
			return getToken(milestone_1Parser.OR_OPERATOR, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(milestone_1Parser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(milestone_1Parser.LESS_THAN, i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(milestone_1Parser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(milestone_1Parser.GREATER_THAN, i);
		}
		public List<TerminalNode> AT() { return getTokens(milestone_1Parser.AT); }
		public TerminalNode AT(int i) {
			return getToken(milestone_1Parser.AT, i);
		}
		public List<TerminalNode> MODULUS() { return getTokens(milestone_1Parser.MODULUS); }
		public TerminalNode MODULUS(int i) {
			return getToken(milestone_1Parser.MODULUS, i);
		}
		public List<TerminalNode> NOT_OPERATOR() { return getTokens(milestone_1Parser.NOT_OPERATOR); }
		public TerminalNode NOT_OPERATOR(int i) {
			return getToken(milestone_1Parser.NOT_OPERATOR, i);
		}
		public List<TerminalNode> XOR_OPERATOR() { return getTokens(milestone_1Parser.XOR_OPERATOR); }
		public TerminalNode XOR_OPERATOR(int i) {
			return getToken(milestone_1Parser.XOR_OPERATOR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(milestone_1Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(milestone_1Parser.DOT, i);
		}
		public List<TerminalNode> COLON() { return getTokens(milestone_1Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(milestone_1Parser.COLON, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(milestone_1Parser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(milestone_1Parser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(milestone_1Parser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(milestone_1Parser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> OPEN_BRACE() { return getTokens(milestone_1Parser.OPEN_BRACE); }
		public TerminalNode OPEN_BRACE(int i) {
			return getToken(milestone_1Parser.OPEN_BRACE, i);
		}
		public List<TerminalNode> CLOSE_BRACE() { return getTokens(milestone_1Parser.CLOSE_BRACE); }
		public TerminalNode CLOSE_BRACE(int i) {
			return getToken(milestone_1Parser.CLOSE_BRACE, i);
		}
		public List<TerminalNode> OPEN_BRACK() { return getTokens(milestone_1Parser.OPEN_BRACK); }
		public TerminalNode OPEN_BRACK(int i) {
			return getToken(milestone_1Parser.OPEN_BRACK, i);
		}
		public List<TerminalNode> CLOSE_BRACK() { return getTokens(milestone_1Parser.CLOSE_BRACK); }
		public TerminalNode CLOSE_BRACK(int i) {
			return getToken(milestone_1Parser.CLOSE_BRACK, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(milestone_1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(milestone_1Parser.COMMA, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(milestone_1Parser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(milestone_1Parser.SEMI_COLON, i);
		}
		public List<TerminalNode> STR_LIT() { return getTokens(milestone_1Parser.STR_LIT); }
		public TerminalNode STR_LIT(int i) {
			return getToken(milestone_1Parser.STR_LIT, i);
		}
		public List<TerminalNode> CHAR_LIT() { return getTokens(milestone_1Parser.CHAR_LIT); }
		public TerminalNode CHAR_LIT(int i) {
			return getToken(milestone_1Parser.CHAR_LIT, i);
		}
		public List<TerminalNode> TRIPLESTR_LIT() { return getTokens(milestone_1Parser.TRIPLESTR_LIT); }
		public TerminalNode TRIPLESTR_LIT(int i) {
			return getToken(milestone_1Parser.TRIPLESTR_LIT, i);
		}
		public List<TerminalNode> RSTR_LIT() { return getTokens(milestone_1Parser.RSTR_LIT); }
		public TerminalNode RSTR_LIT(int i) {
			return getToken(milestone_1Parser.RSTR_LIT, i);
		}
		public List<TerminalNode> GENERALIZED_STR_LIT() { return getTokens(milestone_1Parser.GENERALIZED_STR_LIT); }
		public TerminalNode GENERALIZED_STR_LIT(int i) {
			return getToken(milestone_1Parser.GENERALIZED_STR_LIT, i);
		}
		public List<TerminalNode> GENERALIZED_TRIPLESTR_LIT() { return getTokens(milestone_1Parser.GENERALIZED_TRIPLESTR_LIT); }
		public TerminalNode GENERALIZED_TRIPLESTR_LIT(int i) {
			return getToken(milestone_1Parser.GENERALIZED_TRIPLESTR_LIT, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(milestone_1Parser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(milestone_1Parser.COMMENT, i);
		}
		public List<TerminalNode> MULTILINE() { return getTokens(milestone_1Parser.MULTILINE); }
		public TerminalNode MULTILINE(int i) {
			return getToken(milestone_1Parser.MULTILINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(milestone_1Parser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(milestone_1Parser.INDENT, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_1Listener ) ((milestone_1Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof milestone_1Listener ) ((milestone_1Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDR) | (1L << VARIABLE) | (1L << AND) | (1L << AS) | (1L << ASM) | (1L << BIND) | (1L << BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CAST) | (1L << CONCEPT) | (1L << CONST) | (1L << CONTINUE) | (1L << CONVERTER) | (1L << MACRO) | (1L << METHOD) | (1L << MIXIN) | (1L << MOD) | (1L << NIL) | (1L << NOT) | (1L << NOTIN) | (1L << OBJECT) | (1L << OF) | (1L << OR) | (1L << OUT) | (1L << PROC) | (1L << PTR) | (1L << RAISE) | (1L << REF) | (1L << RETURN) | (1L << SHL) | (1L << SHR) | (1L << STATIC) | (1L << TEMPLATE) | (1L << TRY) | (1L << TUPLE) | (1L << TYPE) | (1L << USING) | (1L << WHEN) | (1L << WHILE) | (1L << XOR) | (1L << YIELD) | (1L << DEFER) | (1L << DISCARD) | (1L << DISTINCT) | (1L << DIV) | (1L << DO) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENUM) | (1L << EXCEPT) | (1L << EXPORT) | (1L << FINALLY) | (1L << FOR) | (1L << FROM) | (1L << FUNC) | (1L << IF) | (1L << IMPORT) | (1L << IN) | (1L << INCLUDE) | (1L << INTERFACE) | (1L << IS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ISNOT - 64)) | (1L << (ITERATOR - 64)) | (1L << (LET - 64)) | (1L << (EQUALS_OPERATOR - 64)) | (1L << (ADD_OPERATOR - 64)) | (1L << (MINUS_OPERATOR - 64)) | (1L << (MUL_OPERATOR - 64)) | (1L << (DIV_OPERATOR - 64)) | (1L << (LESS_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (AND_OPERATOR - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (BITWISE_NOT_OPERATOR - 64)) | (1L << (AT - 64)) | (1L << (MODULUS - 64)) | (1L << (NOT_OPERATOR - 64)) | (1L << (XOR_OPERATOR - 64)) | (1L << (DOT - 64)) | (1L << (COLON - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (CLOSE_BRACE - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (CLOSE_PAREN - 64)) | (1L << (OPEN_BRACK - 64)) | (1L << (CLOSE_BRACK - 64)) | (1L << (COMMA - 64)) | (1L << (SEMI_COLON - 64)) | (1L << (INDENT - 64)) | (1L << (COMMENT - 64)) | (1L << (MULTILINE - 64)) | (1L << (STR_LIT - 64)) | (1L << (TRIPLESTR_LIT - 64)) | (1L << (RSTR_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (GENERALIZED_STR_LIT - 64)) | (1L << (GENERALIZED_TRIPLESTR_LIT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (DIGIT - 64)) | (1L << (INT_LIT - 64)) | (1L << (INT8_LIT - 64)) | (1L << (INT16_LIT - 64)) | (1L << (INT32_LIT - 64)) | (1L << (INT64_LIT - 64)) | (1L << (UINT_LIT - 64)) | (1L << (UINT8_LIT - 64)) | (1L << (UINT16_LIT - 64)) | (1L << (UINT32_LIT - 64)) | (1L << (UINT64_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (DEC_LIT - 64)) | (1L << (OCT_LIT - 64)) | (1L << (BIN_LIT - 64)) | (1L << (HEXDIGIT - 64)) | (1L << (OCTDIGIT - 64)) | (1L << (BINDIGIT - 64)) | (1L << (EXP - 64)) | (1L << (FLOAT32_SUFFIX - 64)) | (1L << (FLOAT32_LIT - 64)) | (1L << (FLOAT64_SUFFIX - 64)) | (1L << (FLOAT64_LIT - 64)) | (1L << (LETTER - 64)))) != 0)) {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDR) | (1L << VARIABLE) | (1L << AND) | (1L << AS) | (1L << ASM) | (1L << BIND) | (1L << BLOCK) | (1L << BREAK) | (1L << CASE) | (1L << CAST) | (1L << CONCEPT) | (1L << CONST) | (1L << CONTINUE) | (1L << CONVERTER) | (1L << MACRO) | (1L << METHOD) | (1L << MIXIN) | (1L << MOD) | (1L << NIL) | (1L << NOT) | (1L << NOTIN) | (1L << OBJECT) | (1L << OF) | (1L << OR) | (1L << OUT) | (1L << PROC) | (1L << PTR) | (1L << RAISE) | (1L << REF) | (1L << RETURN) | (1L << SHL) | (1L << SHR) | (1L << STATIC) | (1L << TEMPLATE) | (1L << TRY) | (1L << TUPLE) | (1L << TYPE) | (1L << USING) | (1L << WHEN) | (1L << WHILE) | (1L << XOR) | (1L << YIELD) | (1L << DEFER) | (1L << DISCARD) | (1L << DISTINCT) | (1L << DIV) | (1L << DO) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENUM) | (1L << EXCEPT) | (1L << EXPORT) | (1L << FINALLY) | (1L << FOR) | (1L << FROM) | (1L << FUNC) | (1L << IF) | (1L << IMPORT) | (1L << IN) | (1L << INCLUDE) | (1L << INTERFACE) | (1L << IS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ISNOT - 64)) | (1L << (ITERATOR - 64)) | (1L << (LET - 64)) | (1L << (EQUALS_OPERATOR - 64)) | (1L << (ADD_OPERATOR - 64)) | (1L << (MINUS_OPERATOR - 64)) | (1L << (MUL_OPERATOR - 64)) | (1L << (DIV_OPERATOR - 64)) | (1L << (LESS_THAN - 64)) | (1L << (GREATER_THAN - 64)) | (1L << (AND_OPERATOR - 64)) | (1L << (OR_OPERATOR - 64)) | (1L << (BITWISE_NOT_OPERATOR - 64)) | (1L << (AT - 64)) | (1L << (MODULUS - 64)) | (1L << (NOT_OPERATOR - 64)) | (1L << (XOR_OPERATOR - 64)) | (1L << (DOT - 64)) | (1L << (COLON - 64)) | (1L << (OPEN_BRACE - 64)) | (1L << (CLOSE_BRACE - 64)) | (1L << (OPEN_PAREN - 64)) | (1L << (CLOSE_PAREN - 64)) | (1L << (OPEN_BRACK - 64)) | (1L << (CLOSE_BRACK - 64)) | (1L << (COMMA - 64)) | (1L << (SEMI_COLON - 64)) | (1L << (INDENT - 64)) | (1L << (COMMENT - 64)) | (1L << (MULTILINE - 64)) | (1L << (STR_LIT - 64)) | (1L << (TRIPLESTR_LIT - 64)) | (1L << (RSTR_LIT - 64)) | (1L << (CHAR_LIT - 64)) | (1L << (GENERALIZED_STR_LIT - 64)) | (1L << (GENERALIZED_TRIPLESTR_LIT - 64)) | (1L << (IDENTIFIER - 64)) | (1L << (FLOAT_LIT - 64)) | (1L << (DIGIT - 64)) | (1L << (INT_LIT - 64)) | (1L << (INT8_LIT - 64)) | (1L << (INT16_LIT - 64)) | (1L << (INT32_LIT - 64)) | (1L << (INT64_LIT - 64)) | (1L << (UINT_LIT - 64)) | (1L << (UINT8_LIT - 64)) | (1L << (UINT16_LIT - 64)) | (1L << (UINT32_LIT - 64)) | (1L << (UINT64_LIT - 64)) | (1L << (HEX_LIT - 64)) | (1L << (DEC_LIT - 64)) | (1L << (OCT_LIT - 64)) | (1L << (BIN_LIT - 64)) | (1L << (HEXDIGIT - 64)) | (1L << (OCTDIGIT - 64)) | (1L << (BINDIGIT - 64)) | (1L << (EXP - 64)) | (1L << (FLOAT32_SUFFIX - 64)) | (1L << (FLOAT32_LIT - 64)) | (1L << (FLOAT64_SUFFIX - 64)) | (1L << (FLOAT64_LIT - 64)) | (1L << (LETTER - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(7);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083\13\4\2\t\2"+
		"\3\2\7\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2\2\3\5\2\3_awy\u0081\2\n\2\7"+
		"\3\2\2\2\4\6\t\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b"+
		"\3\3\2\2\2\t\7\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}