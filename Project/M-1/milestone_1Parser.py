# Generated from milestone_1.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0083")
        buf.write("\13\4\2\t\2\3\2\7\2\6\n\2\f\2\16\2\t\13\2\3\2\2\2\3\2")
        buf.write("\2\3\5\2\3_awy\u0081\2\n\2\7\3\2\2\2\4\6\t\2\2\2\5\4\3")
        buf.write("\2\2\2\6\t\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2\2")
        buf.write("\t\7\3\2\2\2\3\7")
        return buf.getvalue()


class milestone_1Parser ( Parser ):

    grammarFileName = "milestone_1.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'addr'", "'var'", "'and'", "'as'", "'asm'", 
                     "'bind'", "'block'", "'break'", "'case'", "'cast'", 
                     "'concept'", "'const'", "'continue'", "'converter'", 
                     "'macro'", "'method'", "'mixin'", "'mod'", "'nil'", 
                     "'not'", "'notin'", "'object'", "'of'", "'or'", "'out'", 
                     "'proc'", "'ptr'", "'raise'", "'ref'", "'return'", 
                     "'shl'", "'shr'", "'static'", "'template'", "'try'", 
                     "'tuple'", "'type'", "'using'", "'when'", "'while'", 
                     "'xor'", "'yield'", "'defer'", "'discard'", "'distinct'", 
                     "'div'", "'do'", "'elif'", "'else'", "'end'", "'enum'", 
                     "'except'", "'export'", "'finally'", "'for'", "'from'", 
                     "'func'", "'if'", "'import'", "'in'", "'include'", 
                     "'interface'", "'is'", "'isnot'", "'iterator'", "'let'", 
                     "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
                     "'&'", "'|'", "'~'", "'@'", "'%'", "'!'", "'^'", "'.'", 
                     "':'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", 
                     "';'" ]

    symbolicNames = [ "<INVALID>", "ADDR", "VARIABLE", "AND", "AS", "ASM", 
                      "BIND", "BLOCK", "BREAK", "CASE", "CAST", "CONCEPT", 
                      "CONST", "CONTINUE", "CONVERTER", "MACRO", "METHOD", 
                      "MIXIN", "MOD", "NIL", "NOT", "NOTIN", "OBJECT", "OF", 
                      "OR", "OUT", "PROC", "PTR", "RAISE", "REF", "RETURN", 
                      "SHL", "SHR", "STATIC", "TEMPLATE", "TRY", "TUPLE", 
                      "TYPE", "USING", "WHEN", "WHILE", "XOR", "YIELD", 
                      "DEFER", "DISCARD", "DISTINCT", "DIV", "DO", "ELIF", 
                      "ELSE", "END", "ENUM", "EXCEPT", "EXPORT", "FINALLY", 
                      "FOR", "FROM", "FUNC", "IF", "IMPORT", "IN", "INCLUDE", 
                      "INTERFACE", "IS", "ISNOT", "ITERATOR", "LET", "EQUALS_OPERATOR", 
                      "ADD_OPERATOR", "MINUS_OPERATOR", "MUL_OPERATOR", 
                      "DIV_OPERATOR", "LESS_THAN", "GREATER_THAN", "AND_OPERATOR", 
                      "OR_OPERATOR", "BITWISE_NOT_OPERATOR", "AT", "MODULUS", 
                      "NOT_OPERATOR", "XOR_OPERATOR", "DOT", "COLON", "OPEN_BRACE", 
                      "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", 
                      "CLOSE_BRACK", "COMMA", "SEMI_COLON", "INDENT", "COMMENT", 
                      "MULTILINE", "MULTILINE_DOC", "STR_LIT", "TRIPLESTR_LIT", 
                      "RSTR_LIT", "CHAR_LIT", "GENERALIZED_STR_LIT", "GENERALIZED_TRIPLESTR_LIT", 
                      "IDENTIFIER", "FLOAT_LIT", "DIGIT", "INT_LIT", "INT8_LIT", 
                      "INT16_LIT", "INT32_LIT", "INT64_LIT", "UINT_LIT", 
                      "UINT8_LIT", "UINT16_LIT", "UINT32_LIT", "UINT64_LIT", 
                      "HEX_LIT", "DEC_LIT", "OCT_LIT", "BIN_LIT", "HEX", 
                      "HEXDIGIT", "OCTDIGIT", "BINDIGIT", "EXP", "FLOAT32_SUFFIX", 
                      "FLOAT32_LIT", "FLOAT64_SUFFIX", "FLOAT64_LIT", "LETTER", 
                      "ALL_ESCAPES", "SPACE" ]

    RULE_start = 0

    ruleNames =  [ "start" ]

    EOF = Token.EOF
    ADDR=1
    VARIABLE=2
    AND=3
    AS=4
    ASM=5
    BIND=6
    BLOCK=7
    BREAK=8
    CASE=9
    CAST=10
    CONCEPT=11
    CONST=12
    CONTINUE=13
    CONVERTER=14
    MACRO=15
    METHOD=16
    MIXIN=17
    MOD=18
    NIL=19
    NOT=20
    NOTIN=21
    OBJECT=22
    OF=23
    OR=24
    OUT=25
    PROC=26
    PTR=27
    RAISE=28
    REF=29
    RETURN=30
    SHL=31
    SHR=32
    STATIC=33
    TEMPLATE=34
    TRY=35
    TUPLE=36
    TYPE=37
    USING=38
    WHEN=39
    WHILE=40
    XOR=41
    YIELD=42
    DEFER=43
    DISCARD=44
    DISTINCT=45
    DIV=46
    DO=47
    ELIF=48
    ELSE=49
    END=50
    ENUM=51
    EXCEPT=52
    EXPORT=53
    FINALLY=54
    FOR=55
    FROM=56
    FUNC=57
    IF=58
    IMPORT=59
    IN=60
    INCLUDE=61
    INTERFACE=62
    IS=63
    ISNOT=64
    ITERATOR=65
    LET=66
    EQUALS_OPERATOR=67
    ADD_OPERATOR=68
    MINUS_OPERATOR=69
    MUL_OPERATOR=70
    DIV_OPERATOR=71
    LESS_THAN=72
    GREATER_THAN=73
    AND_OPERATOR=74
    OR_OPERATOR=75
    BITWISE_NOT_OPERATOR=76
    AT=77
    MODULUS=78
    NOT_OPERATOR=79
    XOR_OPERATOR=80
    DOT=81
    COLON=82
    OPEN_BRACE=83
    CLOSE_BRACE=84
    OPEN_PAREN=85
    CLOSE_PAREN=86
    OPEN_BRACK=87
    CLOSE_BRACK=88
    COMMA=89
    SEMI_COLON=90
    INDENT=91
    COMMENT=92
    MULTILINE=93
    MULTILINE_DOC=94
    STR_LIT=95
    TRIPLESTR_LIT=96
    RSTR_LIT=97
    CHAR_LIT=98
    GENERALIZED_STR_LIT=99
    GENERALIZED_TRIPLESTR_LIT=100
    IDENTIFIER=101
    FLOAT_LIT=102
    DIGIT=103
    INT_LIT=104
    INT8_LIT=105
    INT16_LIT=106
    INT32_LIT=107
    INT64_LIT=108
    UINT_LIT=109
    UINT8_LIT=110
    UINT16_LIT=111
    UINT32_LIT=112
    UINT64_LIT=113
    HEX_LIT=114
    DEC_LIT=115
    OCT_LIT=116
    BIN_LIT=117
    HEX=118
    HEXDIGIT=119
    OCTDIGIT=120
    BINDIGIT=121
    EXP=122
    FLOAT32_SUFFIX=123
    FLOAT32_LIT=124
    FLOAT64_SUFFIX=125
    FLOAT64_LIT=126
    LETTER=127
    ALL_ESCAPES=128
    SPACE=129

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AND(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.AND)
            else:
                return self.getToken(milestone_1Parser.AND, i)

        def VARIABLE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.VARIABLE)
            else:
                return self.getToken(milestone_1Parser.VARIABLE, i)

        def ADDR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ADDR)
            else:
                return self.getToken(milestone_1Parser.ADDR, i)

        def AS(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.AS)
            else:
                return self.getToken(milestone_1Parser.AS, i)

        def ASM(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ASM)
            else:
                return self.getToken(milestone_1Parser.ASM, i)

        def BIND(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BIND)
            else:
                return self.getToken(milestone_1Parser.BIND, i)

        def BLOCK(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BLOCK)
            else:
                return self.getToken(milestone_1Parser.BLOCK, i)

        def BREAK(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BREAK)
            else:
                return self.getToken(milestone_1Parser.BREAK, i)

        def CASE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CASE)
            else:
                return self.getToken(milestone_1Parser.CASE, i)

        def CAST(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CAST)
            else:
                return self.getToken(milestone_1Parser.CAST, i)

        def CONCEPT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CONCEPT)
            else:
                return self.getToken(milestone_1Parser.CONCEPT, i)

        def CONST(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CONST)
            else:
                return self.getToken(milestone_1Parser.CONST, i)

        def CONTINUE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CONTINUE)
            else:
                return self.getToken(milestone_1Parser.CONTINUE, i)

        def CONVERTER(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CONVERTER)
            else:
                return self.getToken(milestone_1Parser.CONVERTER, i)

        def DEFER(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DEFER)
            else:
                return self.getToken(milestone_1Parser.DEFER, i)

        def DISCARD(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DISCARD)
            else:
                return self.getToken(milestone_1Parser.DISCARD, i)

        def DISTINCT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DISTINCT)
            else:
                return self.getToken(milestone_1Parser.DISTINCT, i)

        def DIV(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DIV)
            else:
                return self.getToken(milestone_1Parser.DIV, i)

        def DO(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DO)
            else:
                return self.getToken(milestone_1Parser.DO, i)

        def ELIF(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ELIF)
            else:
                return self.getToken(milestone_1Parser.ELIF, i)

        def ELSE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ELSE)
            else:
                return self.getToken(milestone_1Parser.ELSE, i)

        def END(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.END)
            else:
                return self.getToken(milestone_1Parser.END, i)

        def ENUM(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ENUM)
            else:
                return self.getToken(milestone_1Parser.ENUM, i)

        def EXCEPT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.EXCEPT)
            else:
                return self.getToken(milestone_1Parser.EXCEPT, i)

        def EXPORT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.EXPORT)
            else:
                return self.getToken(milestone_1Parser.EXPORT, i)

        def FINALLY(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FINALLY)
            else:
                return self.getToken(milestone_1Parser.FINALLY, i)

        def FOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FOR)
            else:
                return self.getToken(milestone_1Parser.FOR, i)

        def FROM(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FROM)
            else:
                return self.getToken(milestone_1Parser.FROM, i)

        def FUNC(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FUNC)
            else:
                return self.getToken(milestone_1Parser.FUNC, i)

        def IF(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.IF)
            else:
                return self.getToken(milestone_1Parser.IF, i)

        def IMPORT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.IMPORT)
            else:
                return self.getToken(milestone_1Parser.IMPORT, i)

        def IN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.IN)
            else:
                return self.getToken(milestone_1Parser.IN, i)

        def INCLUDE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INCLUDE)
            else:
                return self.getToken(milestone_1Parser.INCLUDE, i)

        def INTERFACE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INTERFACE)
            else:
                return self.getToken(milestone_1Parser.INTERFACE, i)

        def IS(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.IS)
            else:
                return self.getToken(milestone_1Parser.IS, i)

        def ISNOT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ISNOT)
            else:
                return self.getToken(milestone_1Parser.ISNOT, i)

        def ITERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ITERATOR)
            else:
                return self.getToken(milestone_1Parser.ITERATOR, i)

        def LET(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.LET)
            else:
                return self.getToken(milestone_1Parser.LET, i)

        def MACRO(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MACRO)
            else:
                return self.getToken(milestone_1Parser.MACRO, i)

        def METHOD(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.METHOD)
            else:
                return self.getToken(milestone_1Parser.METHOD, i)

        def MIXIN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MIXIN)
            else:
                return self.getToken(milestone_1Parser.MIXIN, i)

        def MOD(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MOD)
            else:
                return self.getToken(milestone_1Parser.MOD, i)

        def NIL(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.NIL)
            else:
                return self.getToken(milestone_1Parser.NIL, i)

        def NOT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.NOT)
            else:
                return self.getToken(milestone_1Parser.NOT, i)

        def NOTIN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.NOTIN)
            else:
                return self.getToken(milestone_1Parser.NOTIN, i)

        def OBJECT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OBJECT)
            else:
                return self.getToken(milestone_1Parser.OBJECT, i)

        def OF(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OF)
            else:
                return self.getToken(milestone_1Parser.OF, i)

        def OR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OR)
            else:
                return self.getToken(milestone_1Parser.OR, i)

        def OUT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OUT)
            else:
                return self.getToken(milestone_1Parser.OUT, i)

        def PROC(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.PROC)
            else:
                return self.getToken(milestone_1Parser.PROC, i)

        def PTR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.PTR)
            else:
                return self.getToken(milestone_1Parser.PTR, i)

        def RAISE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.RAISE)
            else:
                return self.getToken(milestone_1Parser.RAISE, i)

        def REF(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.REF)
            else:
                return self.getToken(milestone_1Parser.REF, i)

        def RETURN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.RETURN)
            else:
                return self.getToken(milestone_1Parser.RETURN, i)

        def SHL(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.SHL)
            else:
                return self.getToken(milestone_1Parser.SHL, i)

        def SHR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.SHR)
            else:
                return self.getToken(milestone_1Parser.SHR, i)

        def STATIC(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.STATIC)
            else:
                return self.getToken(milestone_1Parser.STATIC, i)

        def TEMPLATE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.TEMPLATE)
            else:
                return self.getToken(milestone_1Parser.TEMPLATE, i)

        def TRY(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.TRY)
            else:
                return self.getToken(milestone_1Parser.TRY, i)

        def TUPLE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.TUPLE)
            else:
                return self.getToken(milestone_1Parser.TUPLE, i)

        def TYPE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.TYPE)
            else:
                return self.getToken(milestone_1Parser.TYPE, i)

        def USING(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.USING)
            else:
                return self.getToken(milestone_1Parser.USING, i)

        def WHEN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.WHEN)
            else:
                return self.getToken(milestone_1Parser.WHEN, i)

        def WHILE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.WHILE)
            else:
                return self.getToken(milestone_1Parser.WHILE, i)

        def XOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.XOR)
            else:
                return self.getToken(milestone_1Parser.XOR, i)

        def YIELD(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.YIELD)
            else:
                return self.getToken(milestone_1Parser.YIELD, i)

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.IDENTIFIER)
            else:
                return self.getToken(milestone_1Parser.IDENTIFIER, i)

        def LETTER(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.LETTER)
            else:
                return self.getToken(milestone_1Parser.LETTER, i)

        def DIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DIGIT)
            else:
                return self.getToken(milestone_1Parser.DIGIT, i)

        def INT8_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INT8_LIT)
            else:
                return self.getToken(milestone_1Parser.INT8_LIT, i)

        def INT16_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INT16_LIT)
            else:
                return self.getToken(milestone_1Parser.INT16_LIT, i)

        def INT32_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INT32_LIT)
            else:
                return self.getToken(milestone_1Parser.INT32_LIT, i)

        def INT64_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INT64_LIT)
            else:
                return self.getToken(milestone_1Parser.INT64_LIT, i)

        def UINT_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.UINT_LIT)
            else:
                return self.getToken(milestone_1Parser.UINT_LIT, i)

        def UINT8_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.UINT8_LIT)
            else:
                return self.getToken(milestone_1Parser.UINT8_LIT, i)

        def UINT16_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.UINT16_LIT)
            else:
                return self.getToken(milestone_1Parser.UINT16_LIT, i)

        def UINT32_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.UINT32_LIT)
            else:
                return self.getToken(milestone_1Parser.UINT32_LIT, i)

        def UINT64_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.UINT64_LIT)
            else:
                return self.getToken(milestone_1Parser.UINT64_LIT, i)

        def FLOAT32_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FLOAT32_LIT)
            else:
                return self.getToken(milestone_1Parser.FLOAT32_LIT, i)

        def FLOAT32_SUFFIX(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FLOAT32_SUFFIX)
            else:
                return self.getToken(milestone_1Parser.FLOAT32_SUFFIX, i)

        def FLOAT64_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FLOAT64_LIT)
            else:
                return self.getToken(milestone_1Parser.FLOAT64_LIT, i)

        def FLOAT64_SUFFIX(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FLOAT64_SUFFIX)
            else:
                return self.getToken(milestone_1Parser.FLOAT64_SUFFIX, i)

        def FLOAT_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.FLOAT_LIT)
            else:
                return self.getToken(milestone_1Parser.FLOAT_LIT, i)

        def EXP(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.EXP)
            else:
                return self.getToken(milestone_1Parser.EXP, i)

        def INT_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INT_LIT)
            else:
                return self.getToken(milestone_1Parser.INT_LIT, i)

        def HEX_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.HEX_LIT)
            else:
                return self.getToken(milestone_1Parser.HEX_LIT, i)

        def DEC_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DEC_LIT)
            else:
                return self.getToken(milestone_1Parser.DEC_LIT, i)

        def OCT_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OCT_LIT)
            else:
                return self.getToken(milestone_1Parser.OCT_LIT, i)

        def BIN_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BIN_LIT)
            else:
                return self.getToken(milestone_1Parser.BIN_LIT, i)

        def HEXDIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.HEXDIGIT)
            else:
                return self.getToken(milestone_1Parser.HEXDIGIT, i)

        def OCTDIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OCTDIGIT)
            else:
                return self.getToken(milestone_1Parser.OCTDIGIT, i)

        def BINDIGIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BINDIGIT)
            else:
                return self.getToken(milestone_1Parser.BINDIGIT, i)

        def EQUALS_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.EQUALS_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.EQUALS_OPERATOR, i)

        def ADD_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.ADD_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.ADD_OPERATOR, i)

        def MUL_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MUL_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.MUL_OPERATOR, i)

        def MINUS_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MINUS_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.MINUS_OPERATOR, i)

        def DIV_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DIV_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.DIV_OPERATOR, i)

        def BITWISE_NOT_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.BITWISE_NOT_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.BITWISE_NOT_OPERATOR, i)

        def AND_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.AND_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.AND_OPERATOR, i)

        def OR_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OR_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.OR_OPERATOR, i)

        def LESS_THAN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.LESS_THAN)
            else:
                return self.getToken(milestone_1Parser.LESS_THAN, i)

        def GREATER_THAN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.GREATER_THAN)
            else:
                return self.getToken(milestone_1Parser.GREATER_THAN, i)

        def AT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.AT)
            else:
                return self.getToken(milestone_1Parser.AT, i)

        def MODULUS(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MODULUS)
            else:
                return self.getToken(milestone_1Parser.MODULUS, i)

        def NOT_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.NOT_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.NOT_OPERATOR, i)

        def XOR_OPERATOR(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.XOR_OPERATOR)
            else:
                return self.getToken(milestone_1Parser.XOR_OPERATOR, i)

        def DOT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.DOT)
            else:
                return self.getToken(milestone_1Parser.DOT, i)

        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.COLON)
            else:
                return self.getToken(milestone_1Parser.COLON, i)

        def OPEN_PAREN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OPEN_PAREN)
            else:
                return self.getToken(milestone_1Parser.OPEN_PAREN, i)

        def CLOSE_PAREN(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CLOSE_PAREN)
            else:
                return self.getToken(milestone_1Parser.CLOSE_PAREN, i)

        def OPEN_BRACE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OPEN_BRACE)
            else:
                return self.getToken(milestone_1Parser.OPEN_BRACE, i)

        def CLOSE_BRACE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CLOSE_BRACE)
            else:
                return self.getToken(milestone_1Parser.CLOSE_BRACE, i)

        def OPEN_BRACK(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.OPEN_BRACK)
            else:
                return self.getToken(milestone_1Parser.OPEN_BRACK, i)

        def CLOSE_BRACK(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CLOSE_BRACK)
            else:
                return self.getToken(milestone_1Parser.CLOSE_BRACK, i)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.COMMA)
            else:
                return self.getToken(milestone_1Parser.COMMA, i)

        def SEMI_COLON(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.SEMI_COLON)
            else:
                return self.getToken(milestone_1Parser.SEMI_COLON, i)

        def STR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.STR_LIT)
            else:
                return self.getToken(milestone_1Parser.STR_LIT, i)

        def CHAR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.CHAR_LIT)
            else:
                return self.getToken(milestone_1Parser.CHAR_LIT, i)

        def TRIPLESTR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.TRIPLESTR_LIT)
            else:
                return self.getToken(milestone_1Parser.TRIPLESTR_LIT, i)

        def RSTR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.RSTR_LIT)
            else:
                return self.getToken(milestone_1Parser.RSTR_LIT, i)

        def GENERALIZED_STR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.GENERALIZED_STR_LIT)
            else:
                return self.getToken(milestone_1Parser.GENERALIZED_STR_LIT, i)

        def GENERALIZED_TRIPLESTR_LIT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.GENERALIZED_TRIPLESTR_LIT)
            else:
                return self.getToken(milestone_1Parser.GENERALIZED_TRIPLESTR_LIT, i)

        def COMMENT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.COMMENT)
            else:
                return self.getToken(milestone_1Parser.COMMENT, i)

        def MULTILINE(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.MULTILINE)
            else:
                return self.getToken(milestone_1Parser.MULTILINE, i)

        def INDENT(self, i:int=None):
            if i is None:
                return self.getTokens(milestone_1Parser.INDENT)
            else:
                return self.getToken(milestone_1Parser.INDENT, i)

        def getRuleIndex(self):
            return milestone_1Parser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = milestone_1Parser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 5
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << milestone_1Parser.ADDR) | (1 << milestone_1Parser.VARIABLE) | (1 << milestone_1Parser.AND) | (1 << milestone_1Parser.AS) | (1 << milestone_1Parser.ASM) | (1 << milestone_1Parser.BIND) | (1 << milestone_1Parser.BLOCK) | (1 << milestone_1Parser.BREAK) | (1 << milestone_1Parser.CASE) | (1 << milestone_1Parser.CAST) | (1 << milestone_1Parser.CONCEPT) | (1 << milestone_1Parser.CONST) | (1 << milestone_1Parser.CONTINUE) | (1 << milestone_1Parser.CONVERTER) | (1 << milestone_1Parser.MACRO) | (1 << milestone_1Parser.METHOD) | (1 << milestone_1Parser.MIXIN) | (1 << milestone_1Parser.MOD) | (1 << milestone_1Parser.NIL) | (1 << milestone_1Parser.NOT) | (1 << milestone_1Parser.NOTIN) | (1 << milestone_1Parser.OBJECT) | (1 << milestone_1Parser.OF) | (1 << milestone_1Parser.OR) | (1 << milestone_1Parser.OUT) | (1 << milestone_1Parser.PROC) | (1 << milestone_1Parser.PTR) | (1 << milestone_1Parser.RAISE) | (1 << milestone_1Parser.REF) | (1 << milestone_1Parser.RETURN) | (1 << milestone_1Parser.SHL) | (1 << milestone_1Parser.SHR) | (1 << milestone_1Parser.STATIC) | (1 << milestone_1Parser.TEMPLATE) | (1 << milestone_1Parser.TRY) | (1 << milestone_1Parser.TUPLE) | (1 << milestone_1Parser.TYPE) | (1 << milestone_1Parser.USING) | (1 << milestone_1Parser.WHEN) | (1 << milestone_1Parser.WHILE) | (1 << milestone_1Parser.XOR) | (1 << milestone_1Parser.YIELD) | (1 << milestone_1Parser.DEFER) | (1 << milestone_1Parser.DISCARD) | (1 << milestone_1Parser.DISTINCT) | (1 << milestone_1Parser.DIV) | (1 << milestone_1Parser.DO) | (1 << milestone_1Parser.ELIF) | (1 << milestone_1Parser.ELSE) | (1 << milestone_1Parser.END) | (1 << milestone_1Parser.ENUM) | (1 << milestone_1Parser.EXCEPT) | (1 << milestone_1Parser.EXPORT) | (1 << milestone_1Parser.FINALLY) | (1 << milestone_1Parser.FOR) | (1 << milestone_1Parser.FROM) | (1 << milestone_1Parser.FUNC) | (1 << milestone_1Parser.IF) | (1 << milestone_1Parser.IMPORT) | (1 << milestone_1Parser.IN) | (1 << milestone_1Parser.INCLUDE) | (1 << milestone_1Parser.INTERFACE) | (1 << milestone_1Parser.IS))) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & ((1 << (milestone_1Parser.ISNOT - 64)) | (1 << (milestone_1Parser.ITERATOR - 64)) | (1 << (milestone_1Parser.LET - 64)) | (1 << (milestone_1Parser.EQUALS_OPERATOR - 64)) | (1 << (milestone_1Parser.ADD_OPERATOR - 64)) | (1 << (milestone_1Parser.MINUS_OPERATOR - 64)) | (1 << (milestone_1Parser.MUL_OPERATOR - 64)) | (1 << (milestone_1Parser.DIV_OPERATOR - 64)) | (1 << (milestone_1Parser.LESS_THAN - 64)) | (1 << (milestone_1Parser.GREATER_THAN - 64)) | (1 << (milestone_1Parser.AND_OPERATOR - 64)) | (1 << (milestone_1Parser.OR_OPERATOR - 64)) | (1 << (milestone_1Parser.BITWISE_NOT_OPERATOR - 64)) | (1 << (milestone_1Parser.AT - 64)) | (1 << (milestone_1Parser.MODULUS - 64)) | (1 << (milestone_1Parser.NOT_OPERATOR - 64)) | (1 << (milestone_1Parser.XOR_OPERATOR - 64)) | (1 << (milestone_1Parser.DOT - 64)) | (1 << (milestone_1Parser.COLON - 64)) | (1 << (milestone_1Parser.OPEN_BRACE - 64)) | (1 << (milestone_1Parser.CLOSE_BRACE - 64)) | (1 << (milestone_1Parser.OPEN_PAREN - 64)) | (1 << (milestone_1Parser.CLOSE_PAREN - 64)) | (1 << (milestone_1Parser.OPEN_BRACK - 64)) | (1 << (milestone_1Parser.CLOSE_BRACK - 64)) | (1 << (milestone_1Parser.COMMA - 64)) | (1 << (milestone_1Parser.SEMI_COLON - 64)) | (1 << (milestone_1Parser.INDENT - 64)) | (1 << (milestone_1Parser.COMMENT - 64)) | (1 << (milestone_1Parser.MULTILINE - 64)) | (1 << (milestone_1Parser.STR_LIT - 64)) | (1 << (milestone_1Parser.TRIPLESTR_LIT - 64)) | (1 << (milestone_1Parser.RSTR_LIT - 64)) | (1 << (milestone_1Parser.CHAR_LIT - 64)) | (1 << (milestone_1Parser.GENERALIZED_STR_LIT - 64)) | (1 << (milestone_1Parser.GENERALIZED_TRIPLESTR_LIT - 64)) | (1 << (milestone_1Parser.IDENTIFIER - 64)) | (1 << (milestone_1Parser.FLOAT_LIT - 64)) | (1 << (milestone_1Parser.DIGIT - 64)) | (1 << (milestone_1Parser.INT_LIT - 64)) | (1 << (milestone_1Parser.INT8_LIT - 64)) | (1 << (milestone_1Parser.INT16_LIT - 64)) | (1 << (milestone_1Parser.INT32_LIT - 64)) | (1 << (milestone_1Parser.INT64_LIT - 64)) | (1 << (milestone_1Parser.UINT_LIT - 64)) | (1 << (milestone_1Parser.UINT8_LIT - 64)) | (1 << (milestone_1Parser.UINT16_LIT - 64)) | (1 << (milestone_1Parser.UINT32_LIT - 64)) | (1 << (milestone_1Parser.UINT64_LIT - 64)) | (1 << (milestone_1Parser.HEX_LIT - 64)) | (1 << (milestone_1Parser.DEC_LIT - 64)) | (1 << (milestone_1Parser.OCT_LIT - 64)) | (1 << (milestone_1Parser.BIN_LIT - 64)) | (1 << (milestone_1Parser.HEXDIGIT - 64)) | (1 << (milestone_1Parser.OCTDIGIT - 64)) | (1 << (milestone_1Parser.BINDIGIT - 64)) | (1 << (milestone_1Parser.EXP - 64)) | (1 << (milestone_1Parser.FLOAT32_SUFFIX - 64)) | (1 << (milestone_1Parser.FLOAT32_LIT - 64)) | (1 << (milestone_1Parser.FLOAT64_SUFFIX - 64)) | (1 << (milestone_1Parser.FLOAT64_LIT - 64)) | (1 << (milestone_1Parser.LETTER - 64)))) != 0):
                self.state = 2
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << milestone_1Parser.ADDR) | (1 << milestone_1Parser.VARIABLE) | (1 << milestone_1Parser.AND) | (1 << milestone_1Parser.AS) | (1 << milestone_1Parser.ASM) | (1 << milestone_1Parser.BIND) | (1 << milestone_1Parser.BLOCK) | (1 << milestone_1Parser.BREAK) | (1 << milestone_1Parser.CASE) | (1 << milestone_1Parser.CAST) | (1 << milestone_1Parser.CONCEPT) | (1 << milestone_1Parser.CONST) | (1 << milestone_1Parser.CONTINUE) | (1 << milestone_1Parser.CONVERTER) | (1 << milestone_1Parser.MACRO) | (1 << milestone_1Parser.METHOD) | (1 << milestone_1Parser.MIXIN) | (1 << milestone_1Parser.MOD) | (1 << milestone_1Parser.NIL) | (1 << milestone_1Parser.NOT) | (1 << milestone_1Parser.NOTIN) | (1 << milestone_1Parser.OBJECT) | (1 << milestone_1Parser.OF) | (1 << milestone_1Parser.OR) | (1 << milestone_1Parser.OUT) | (1 << milestone_1Parser.PROC) | (1 << milestone_1Parser.PTR) | (1 << milestone_1Parser.RAISE) | (1 << milestone_1Parser.REF) | (1 << milestone_1Parser.RETURN) | (1 << milestone_1Parser.SHL) | (1 << milestone_1Parser.SHR) | (1 << milestone_1Parser.STATIC) | (1 << milestone_1Parser.TEMPLATE) | (1 << milestone_1Parser.TRY) | (1 << milestone_1Parser.TUPLE) | (1 << milestone_1Parser.TYPE) | (1 << milestone_1Parser.USING) | (1 << milestone_1Parser.WHEN) | (1 << milestone_1Parser.WHILE) | (1 << milestone_1Parser.XOR) | (1 << milestone_1Parser.YIELD) | (1 << milestone_1Parser.DEFER) | (1 << milestone_1Parser.DISCARD) | (1 << milestone_1Parser.DISTINCT) | (1 << milestone_1Parser.DIV) | (1 << milestone_1Parser.DO) | (1 << milestone_1Parser.ELIF) | (1 << milestone_1Parser.ELSE) | (1 << milestone_1Parser.END) | (1 << milestone_1Parser.ENUM) | (1 << milestone_1Parser.EXCEPT) | (1 << milestone_1Parser.EXPORT) | (1 << milestone_1Parser.FINALLY) | (1 << milestone_1Parser.FOR) | (1 << milestone_1Parser.FROM) | (1 << milestone_1Parser.FUNC) | (1 << milestone_1Parser.IF) | (1 << milestone_1Parser.IMPORT) | (1 << milestone_1Parser.IN) | (1 << milestone_1Parser.INCLUDE) | (1 << milestone_1Parser.INTERFACE) | (1 << milestone_1Parser.IS))) != 0) or ((((_la - 64)) & ~0x3f) == 0 and ((1 << (_la - 64)) & ((1 << (milestone_1Parser.ISNOT - 64)) | (1 << (milestone_1Parser.ITERATOR - 64)) | (1 << (milestone_1Parser.LET - 64)) | (1 << (milestone_1Parser.EQUALS_OPERATOR - 64)) | (1 << (milestone_1Parser.ADD_OPERATOR - 64)) | (1 << (milestone_1Parser.MINUS_OPERATOR - 64)) | (1 << (milestone_1Parser.MUL_OPERATOR - 64)) | (1 << (milestone_1Parser.DIV_OPERATOR - 64)) | (1 << (milestone_1Parser.LESS_THAN - 64)) | (1 << (milestone_1Parser.GREATER_THAN - 64)) | (1 << (milestone_1Parser.AND_OPERATOR - 64)) | (1 << (milestone_1Parser.OR_OPERATOR - 64)) | (1 << (milestone_1Parser.BITWISE_NOT_OPERATOR - 64)) | (1 << (milestone_1Parser.AT - 64)) | (1 << (milestone_1Parser.MODULUS - 64)) | (1 << (milestone_1Parser.NOT_OPERATOR - 64)) | (1 << (milestone_1Parser.XOR_OPERATOR - 64)) | (1 << (milestone_1Parser.DOT - 64)) | (1 << (milestone_1Parser.COLON - 64)) | (1 << (milestone_1Parser.OPEN_BRACE - 64)) | (1 << (milestone_1Parser.CLOSE_BRACE - 64)) | (1 << (milestone_1Parser.OPEN_PAREN - 64)) | (1 << (milestone_1Parser.CLOSE_PAREN - 64)) | (1 << (milestone_1Parser.OPEN_BRACK - 64)) | (1 << (milestone_1Parser.CLOSE_BRACK - 64)) | (1 << (milestone_1Parser.COMMA - 64)) | (1 << (milestone_1Parser.SEMI_COLON - 64)) | (1 << (milestone_1Parser.INDENT - 64)) | (1 << (milestone_1Parser.COMMENT - 64)) | (1 << (milestone_1Parser.MULTILINE - 64)) | (1 << (milestone_1Parser.STR_LIT - 64)) | (1 << (milestone_1Parser.TRIPLESTR_LIT - 64)) | (1 << (milestone_1Parser.RSTR_LIT - 64)) | (1 << (milestone_1Parser.CHAR_LIT - 64)) | (1 << (milestone_1Parser.GENERALIZED_STR_LIT - 64)) | (1 << (milestone_1Parser.GENERALIZED_TRIPLESTR_LIT - 64)) | (1 << (milestone_1Parser.IDENTIFIER - 64)) | (1 << (milestone_1Parser.FLOAT_LIT - 64)) | (1 << (milestone_1Parser.DIGIT - 64)) | (1 << (milestone_1Parser.INT_LIT - 64)) | (1 << (milestone_1Parser.INT8_LIT - 64)) | (1 << (milestone_1Parser.INT16_LIT - 64)) | (1 << (milestone_1Parser.INT32_LIT - 64)) | (1 << (milestone_1Parser.INT64_LIT - 64)) | (1 << (milestone_1Parser.UINT_LIT - 64)) | (1 << (milestone_1Parser.UINT8_LIT - 64)) | (1 << (milestone_1Parser.UINT16_LIT - 64)) | (1 << (milestone_1Parser.UINT32_LIT - 64)) | (1 << (milestone_1Parser.UINT64_LIT - 64)) | (1 << (milestone_1Parser.HEX_LIT - 64)) | (1 << (milestone_1Parser.DEC_LIT - 64)) | (1 << (milestone_1Parser.OCT_LIT - 64)) | (1 << (milestone_1Parser.BIN_LIT - 64)) | (1 << (milestone_1Parser.HEXDIGIT - 64)) | (1 << (milestone_1Parser.OCTDIGIT - 64)) | (1 << (milestone_1Parser.BINDIGIT - 64)) | (1 << (milestone_1Parser.EXP - 64)) | (1 << (milestone_1Parser.FLOAT32_SUFFIX - 64)) | (1 << (milestone_1Parser.FLOAT32_LIT - 64)) | (1 << (milestone_1Parser.FLOAT64_SUFFIX - 64)) | (1 << (milestone_1Parser.FLOAT64_LIT - 64)) | (1 << (milestone_1Parser.LETTER - 64)))) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 7
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





