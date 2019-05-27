# Generated from test.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t")
        buf.write("L\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\3\2\6\2\23\n\2\r\2\16\2\24\3\2\6\2\30\n\2\r\2")
        buf.write("\16\2\31\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62")
        buf.write("\n\4\3\5\3\5\3\5\3\5\3\6\6\69\n\6\r\6\16\6:\3\6\3\6\3")
        buf.write("\7\6\7@\n\7\r\7\16\7A\3\7\3\7\3\b\6\bG\n\b\r\b\16\bH\3")
        buf.write("\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\3\2\62")
        buf.write(";\3\2\62\63\4\2\f\f\17\17\2V\2\3\3\2\2\2\2\5\3\2\2\2\2")
        buf.write("\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3")
        buf.write("\2\2\2\3\34\3\2\2\2\5&\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2")
        buf.write("\2\138\3\2\2\2\r?\3\2\2\2\17F\3\2\2\2\21\23\t\2\2\2\22")
        buf.write("\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2")
        buf.write("\25\35\3\2\2\2\26\30\t\3\2\2\27\26\3\2\2\2\30\31\3\2\2")
        buf.write("\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35\7d")
        buf.write("\2\2\34\22\3\2\2\2\34\27\3\2\2\2\35\4\3\2\2\2\36\37\7")
        buf.write("C\2\2\37\'\7Z\2\2 !\7D\2\2!\'\7Z\2\2\"#\7E\2\2#\'\7Z\2")
        buf.write("\2$%\7F\2\2%\'\7Z\2\2&\36\3\2\2\2& \3\2\2\2&\"\3\2\2\2")
        buf.write("&$\3\2\2\2\'\6\3\2\2\2()\7C\2\2)*\7C\2\2*\62\7C\2\2+,")
        buf.write("\7C\2\2,-\7F\2\2-\62\7F\2\2./\7K\2\2/\60\7P\2\2\60\62")
        buf.write("\7E\2\2\61(\3\2\2\2\61+\3\2\2\2\61.\3\2\2\2\62\b\3\2\2")
        buf.write("\2\63\64\7]\2\2\64\65\5\5\3\2\65\66\7_\2\2\66\n\3\2\2")
        buf.write("\2\679\t\4\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2")
        buf.write("\2;<\3\2\2\2<=\b\6\2\2=\f\3\2\2\2>@\7.\2\2?>\3\2\2\2@")
        buf.write("A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\7\2\2D\16")
        buf.write("\3\2\2\2EG\7\"\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2")
        buf.write("\2\2IJ\3\2\2\2JK\b\b\2\2K\20\3\2\2\2\13\2\24\31\34&\61")
        buf.write(":AH\3\b\2\2")
        return buf.getvalue()


class testLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    IMMEDIATE = 1
    REG = 2
    COMMAND = 3
    MEMORY = 4
    NEWLINE = 5
    COMMA = 6
    SPACE = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
 ]

    symbolicNames = [ "<INVALID>",
            "IMMEDIATE", "REG", "COMMAND", "MEMORY", "NEWLINE", "COMMA", 
            "SPACE" ]

    ruleNames = [ "IMMEDIATE", "REG", "COMMAND", "MEMORY", "NEWLINE", "COMMA", 
                  "SPACE" ]

    grammarFileName = "test.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


