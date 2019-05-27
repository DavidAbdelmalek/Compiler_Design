# Generated from task_2_1.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write(".\4\2\t\2\4\3\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3")
        buf.write("\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n\2\3\3\7\3)\n")
        buf.write("\3\f\3\16\3,\13\3\3\3\2\2\4\2\4\2\2\2\61\2%\3\2\2\2\4")
        buf.write("*\3\2\2\2\6\7\7\5\2\2\7\b\7\t\2\2\b\t\7\4\2\2\t\n\7\b")
        buf.write("\2\2\n\13\7\t\2\2\13&\7\6\2\2\f\r\7\5\2\2\r\16\7\t\2\2")
        buf.write("\16\17\7\6\2\2\17\20\7\b\2\2\20\21\7\t\2\2\21&\7\4\2\2")
        buf.write("\22\23\7\5\2\2\23\24\7\t\2\2\24\25\7\4\2\2\25\26\7\b\2")
        buf.write("\2\26\27\7\t\2\2\27&\7\4\2\2\30\31\7\5\2\2\31\32\7\t\2")
        buf.write("\2\32\33\7\6\2\2\33\34\7\b\2\2\34\35\7\t\2\2\35&\7\3\2")
        buf.write("\2\36\37\7\5\2\2\37 \7\t\2\2 !\7\4\2\2!\"\7\b\2\2\"#\7")
        buf.write("\t\2\2#&\7\3\2\2$&\7\5\2\2%\6\3\2\2\2%\f\3\2\2\2%\22\3")
        buf.write("\2\2\2%\30\3\2\2\2%\36\3\2\2\2%$\3\2\2\2&\3\3\2\2\2\'")
        buf.write(")\5\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5")
        buf.write("\3\2\2\2,*\3\2\2\2\4%*")
        return buf.getvalue()


class task_2_1Parser ( Parser ):

    grammarFileName = "task_2_1.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [  ]

    symbolicNames = [ "<INVALID>", "IMMEDIATE", "REG", "COMMAND", "MEMORY", 
                      "NEWLINE", "COMMA", "SPACE" ]

    RULE_expr = 0
    RULE_start = 1

    ruleNames =  [ "expr", "start" ]

    EOF = Token.EOF
    IMMEDIATE=1
    REG=2
    COMMAND=3
    MEMORY=4
    NEWLINE=5
    COMMA=6
    SPACE=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COMMAND(self):
            return self.getToken(task_2_1Parser.COMMAND, 0)

        def SPACE(self, i:int=None):
            if i is None:
                return self.getTokens(task_2_1Parser.SPACE)
            else:
                return self.getToken(task_2_1Parser.SPACE, i)

        def REG(self, i:int=None):
            if i is None:
                return self.getTokens(task_2_1Parser.REG)
            else:
                return self.getToken(task_2_1Parser.REG, i)

        def COMMA(self):
            return self.getToken(task_2_1Parser.COMMA, 0)

        def MEMORY(self):
            return self.getToken(task_2_1Parser.MEMORY, 0)

        def IMMEDIATE(self):
            return self.getToken(task_2_1Parser.IMMEDIATE, 0)

        def getRuleIndex(self):
            return task_2_1Parser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = task_2_1Parser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_expr)
        try:
            self.state = 35
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 4
                self.match(task_2_1Parser.COMMAND)
                self.state = 5
                self.match(task_2_1Parser.SPACE)
                self.state = 6
                self.match(task_2_1Parser.REG)
                self.state = 7
                self.match(task_2_1Parser.COMMA)
                self.state = 8
                self.match(task_2_1Parser.SPACE)
                self.state = 9
                self.match(task_2_1Parser.MEMORY)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 10
                self.match(task_2_1Parser.COMMAND)
                self.state = 11
                self.match(task_2_1Parser.SPACE)
                self.state = 12
                self.match(task_2_1Parser.MEMORY)
                self.state = 13
                self.match(task_2_1Parser.COMMA)
                self.state = 14
                self.match(task_2_1Parser.SPACE)
                self.state = 15
                self.match(task_2_1Parser.REG)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 16
                self.match(task_2_1Parser.COMMAND)
                self.state = 17
                self.match(task_2_1Parser.SPACE)
                self.state = 18
                self.match(task_2_1Parser.REG)
                self.state = 19
                self.match(task_2_1Parser.COMMA)
                self.state = 20
                self.match(task_2_1Parser.SPACE)
                self.state = 21
                self.match(task_2_1Parser.REG)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 22
                self.match(task_2_1Parser.COMMAND)
                self.state = 23
                self.match(task_2_1Parser.SPACE)
                self.state = 24
                self.match(task_2_1Parser.MEMORY)
                self.state = 25
                self.match(task_2_1Parser.COMMA)
                self.state = 26
                self.match(task_2_1Parser.SPACE)
                self.state = 27
                self.match(task_2_1Parser.IMMEDIATE)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 28
                self.match(task_2_1Parser.COMMAND)
                self.state = 29
                self.match(task_2_1Parser.SPACE)
                self.state = 30
                self.match(task_2_1Parser.REG)
                self.state = 31
                self.match(task_2_1Parser.COMMA)
                self.state = 32
                self.match(task_2_1Parser.SPACE)
                self.state = 33
                self.match(task_2_1Parser.IMMEDIATE)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 34
                self.match(task_2_1Parser.COMMAND)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StartContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(task_2_1Parser.ExprContext)
            else:
                return self.getTypedRuleContext(task_2_1Parser.ExprContext,i)


        def getRuleIndex(self):
            return task_2_1Parser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = task_2_1Parser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==task_2_1Parser.COMMAND:
                self.state = 37
                self.expr()
                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





