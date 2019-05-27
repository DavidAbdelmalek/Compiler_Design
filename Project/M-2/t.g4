
grammar milestone_2;

tokens { INDENT, DEDENT }

@lexer::members {
@property
def tokens(self):
    try:
        return self._tokens
    except AttributeError:
        self._tokens = []
        return self._tokens
@property
def indents(self):
    try:
        return self._indents
    except AttributeError:
        self._indents = []
        return self._indents
@property
def opened(self):
    try:
        return self._opened
    except AttributeError:
        self._opened = 0
        return self._opened
@opened.setter
def opened(self, value):
    self._opened = value
@property
def lastToken(self):
    try:
        return self._lastToken
    except AttributeError:
        self._lastToken = None
        return self._lastToken
@lastToken.setter
def lastToken(self, value):
    self._lastToken = value
def reset(self):
    super().reset()
    self.tokens = []
    self.indents = []
    self.opened = 0
    self.lastToken = None
def emitToken(self, t):
    super().emitToken(t)
    self.tokens.append(t)
def nextToken(self):
    if self._input.LA(1) == Token.EOF and self.indents:
        for i in range(len(self.tokens)-1,-1,-1):
            if self.tokens[i].type == Token.EOF:
                self.tokens.pop(i)
        self.emitToken(self.commonToken(LanguageParser.NEWLINE, '\n'))
        while self.indents:
            self.emitToken(self.createDedent())
            self.indents.pop()
        self.emitToken(self.commonToken(LanguageParser.EOF, "<EOF>"))
    next = super().nextToken()
    if next.channel == Token.DEFAULT_CHANNEL:
        self.lastToken = next
    return next if not self.tokens else self.tokens.pop(0)
def createDedent(self):
    dedent = self.commonToken(LanguageParser.DEDENT, "")
    dedent.line = self.lastToken.line
    return dedent
def commonToken(self, type, text, indent=0):
    stop = self.getCharIndex()-1-indent
    start = (stop - len(text) + 1) if text else stop
    return CommonToken(self._tokenFactorySourcePair, type, super().DEFAULT_TOKEN_CHANNEL, start, stop)
@staticmethod
def getIndentationCount(spaces):
    count = 0
    for ch in spaces:
        if ch == '\t':
            count += 8 - (count % 8)
        else:
            count += 1
    return count
def atStartOfInput(self):
    return Lexer.column.fget(self) == 0 and Lexer.line.fget(self) == 1
}

/*
 * parser rules
 */

start : (
module
)*;


module : stmt * (';' | INDENT{=});
comma : ',' COMMENT?;
semicolon : ';' COMMENT?;
colon : ':' COMMENT?;
colcom : ':' COMMENT?;
operator :  OP0 | OP1 | OP2 | OP3 | OP4 | OP5 | OP6 | OP7 | OP8 | OP9
         | 'or' | 'xor' | 'and'
         | 'is' | 'isnot' | 'in' | 'notin' | 'of'
         | 'div' | 'mod' | 'shl' | 'shr' | 'not' | 'static' | '..';
prefixOperator : operator;
optInd : COMMENT? INDENT?;
optPar : (INDENT{>} | INDENT{=})?;

simpleExpr : arrowExpr (OP0 optInd arrowExpr)* pragma?;
arrowExpr : assignExpr (OP1 optInd assignExpr)*;
assignExpr : orExpr (OP2 optInd orExpr)*;
orExpr : andExpr (OP3 optInd andExpr)*;
andExpr : cmpExpr (OP4 optInd cmpExpr)*;
cmpExpr : sliceExpr (OP5 optInd sliceExpr)*;
sliceExpr : ampExpr (OP6 optInd ampExpr)*;
ampExpr : plusExpr (OP7 optInd plusExpr)*;
plusExpr : mulExpr (OP8 optInd mulExpr)*;
mulExpr : dollarExpr (OP9 optInd dollarExpr)*;
dollarExpr : primary (OP10 optInd primary)*;
literal : INT_LIT | INT8_LIT | INT16_LIT | INT32_LIT | INT64_LIT
          | UINT_LIT | UINT8_LIT | UINT16_LIT | UINT32_LIT | UINT64_LIT
          | FLOAT_LIT | FLOAT32_LIT | FLOAT64_LIT
          | STR_LIT | RSTR_LIT | TRIPLESTR_LIT
          | CHAR_LIT
          | NIL;
///symbol : '`' (KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`'
 ///      | IDENT | KEYW;
symbol :  '`' (KEYW|IDENT|literal|(operator|'('|')'|'['|']'|'{'|'}'|'=')+)+ '`'
          | IDENT | KEYW;
exprColonEqExpr : expr (':'|'=' expr)?;
exprList : (expr)+ comma;
exprColonEqExprList : exprColonEqExpr (comma exprColonEqExpr)* (comma)?;
dotExpr : expr '.' optInd (symbol | '[:' exprList ']');
explicitGenericInstantiation : '[:' exprList ']' ( '(' exprColonEqExpr ')' )?;
qualifiedIdent : symbol ('.' optInd symbol)?;
setOrTableConstr : '{' ((exprColonEqExpr comma)* | ':' ) '}';
castExpr : 'cast' '[' optInd typeDesc optPar ']' '(' optInd expr optPar ')';
parKeyw : 'discard' | 'include' | 'if' | 'while' | 'case' | 'try'
        | 'finally' | 'except' | 'for' | 'block' | 'const' | 'let'
        | 'when' | 'var' | 'mixin';
par : '(' optInd
          ( '&' parKeyw complexOrSimpleStmt+ ';'
          | ';' complexOrSimpleStmt+ ';'
          | pragmaStmt
          | simpleExpr ( ('=' expr (';' complexOrSimpleStmt+ ';' )? )
                       | (':' expr (',' exprColonEqExpr+ ',' )? ) ) )
          optPar ')';

generalizedLit : GENERALIZED_STR_LIT | GENERALIZED_TRIPLESTR_LIT;
identOrLiteral : generalizedLit | symbol | literal
               | par | arrayConstr | setOrTableConstr
               | castExpr;
tupleConstr : '(' optInd (exprColonEqExpr comma?)* optPar ')';
arrayConstr : '[' optInd (exprColonEqExpr comma?)* optPar ']';
primarySuffix : '(' (exprColonEqExpr comma?)* ')' doBlock?
      | doBlock
      | '.' optInd symbol generalizedLit?
      ///| '[' optInd indexExprList optPar ']'
      ///| '{' optInd indexExprList optPar '}'
      | '&' ( '`'|IDENT|literal|'cast'|'addr'|'type') expr;

///NOT SURE ABOUT IT.!!!!!!////
condExpr : expr colcom expr optInd
        ('elif' expr colcom expr optInd)*
         'else' colcom expr;
ifExpr : 'if' condExpr;
whenExpr : 'when' condExpr;
pragma : '{.' optInd (exprColonEqExpr comma?)* optPar ('.}' | '}');
identVis : symbol opr?;
identVisDot : symbol '.' optInd symbol opr?;
identWithPragma : identVis pragma?;
identWithPragmaDot : identVisDot pragma?;
declColonEquals : identWithPragma (comma identWithPragma)* comma?
                  (':' optInd typeDesc)? ('=' optInd expr)?;
identColonEquals : IDENT (comma IDENT)* comma?
     (':' optInd typeDesc)? ('=' optInd expr)?;
inlTupleDecl : 'tuple'
    '[' optInd  (identColonEquals (comma|semicolon)?)*  optPar ']';
extTupleDecl : 'tuple'
    COMMENT? (INDENT{>} identColonEquals (INDENT{=} identColonEquals)*)?;
tupleClass : 'tuple';
paramList : '(' declColonEquals* (comma|semicolon) ')';
paramListArrow : paramList? ('->' optInd typeDesc)?;
paramListColon : paramList? (':' optInd typeDesc)?;
doBlock : 'do' paramListArrow pragmaStmt? colcom stmt;
procExpr : 'proc' paramListColon pragmaStmt? ('=' COMMENT? stmt)?;
distinct : 'distinct' optInd typeDesc;
forStmt : 'for' (identWithPragma+ comma) 'in' expr colcom stmt;
forExpr : forStmt;
expr : (blockExpr
      | ifExpr
      | whenExpr
      ///| caseExpr
      |'case'
      | forExpr
      | tryExpr)
      | simpleExpr;
typeKeyw : 'var' | 'out' | 'ref' | 'ptr' | 'shared' | 'tuple'
         | 'proc' | 'iterator' | 'distinct' | 'object' | 'enum';
///primary : typeKeyw typeDescK
///        |  prefixOperator* identOrLiteral primarySuffix*
///        | 'bind' primary;
primary : ///typeKeyw typeDescK
          prefixOperator* identOrLiteral primarySuffix*
        | 'bind' primary;
typeDesc : simpleExpr;
typeDefAux : simpleExpr
           | 'concept' typeClass;
postExprBlocks : ':' stmt? ( INDENT{=} doBlock
                           | INDENT{=} 'of' exprList ':' stmt
                           | INDENT{=} 'elif' expr ':' stmt
                           | INDENT{=} 'except' exprList ':' stmt
                           | INDENT{=} 'else' ':' stmt )*;
exprStmt : simpleExpr
         (( '=' optInd expr colonBody? )
         | ( expr+ comma
             doBlock
         ///     | macroColon
           ))?;
importStmt : 'import' optInd expr
              ((comma expr)*
              | 'except' optInd (expr+ comma));
includeStmt : 'include' optInd expr+ comma;
fromStmt : 'from' LETTER 'import' optInd expr (comma expr)*;
///fromStmt : 'from' moduleName 'import' optInd expr (comma expr)*;

returnStmt : 'return' optInd expr?;
raiseStmt : 'raise' optInd expr?;
yieldStmt : 'yield' optInd expr?;
discardStmt : 'discard' optInd expr?;
breakStmt : 'break' optInd expr?;
continueStmt : 'break' optInd expr?;
condStmt : expr colcom stmt COMMENT?
           (INDENT{=} 'elif' expr colcom stmt)*
           (INDENT{=} 'else' colcom stmt)?;
ifStmt : 'if' condStmt;
whenStmt : 'when' condStmt;
whileStmt : 'while' expr colcom stmt;
ofBranch : 'of' exprList colcom stmt;
ofBranches : ofBranch (INDENT{=} ofBranch)*
                      (INDENT{=} 'elif' expr colcom stmt)*
                      (INDENT{=} 'else' colcom stmt)?;
caseStmt : 'case' expr ':'? COMMENT?
            (INDENT{>} ofBranches DEDENT
            | INDENT{=} ofBranches);
tryStmt : 'try' colcom stmt '&'(INDENT{=}? 'except'|'finally')
           (INDENT{=}? 'except' exprList colcom stmt)*
           (INDENT{=}? 'finally' colcom stmt)?;
tryExpr : 'try' colcom stmt '&' (optInd 'except'|'finally')
           (optInd 'except' exprList colcom stmt)*
           (optInd 'finally' colcom stmt)?;
exceptBlock : 'except' colcom stmt;
blockStmt : 'block' symbol? colcom stmt;
blockExpr : 'block' symbol? colcom stmt;
staticStmt : 'static' colcom stmt;
deferStmt : 'defer' colcom stmt;
asmStmt : 'asm' pragma? (STR_LIT | RSTR_LIT | TRIPLESTR_LIT);
genericParam : symbol (comma symbol)* (colon expr)? ('=' optInd expr)?;
genericParamList : '[' optInd
  genericParam* (comma|semicolon) optPar ']';
pattern : '{' stmt '}';
indAndComment : (INDENT{>} COMMENT)? | COMMENT?;
routine : optInd identVis pattern? genericParamList?
  paramListColon pragma? ('=' COMMENT? stmt)? indAndComment;
commentStmt : COMMENT;
///NOT SURE
///section(p) : COMMENT? p | 
///          (INDENT{>} (p | COMMENT)+ INDENT{=} DEDENT);

section_typeDef: COMMENT? typeDef |
                (INDENT{>} (typeDef | COMMENT)+ INDENT{=} DEDENT);
    
section_constant: COMMENT? constant |
                (INDENT{>} (constant | COMMENT)+ INDENT{=} DEDENT);
section_variable: COMMENT? variable |
                (INDENT{>} (variable | COMMENT)+ INDENT{=} DEDENT);

constant : identWithPragma (colon typeDesc)? '=' optInd expr indAndComment;
///CHANGED
enum_grammer : ENUM optInd (symbol optInd ('=' optInd expr COMMENT?)? comma?)+;
objectWhen : 'when' expr colcom objectPart COMMENT?
            ('elif' expr colcom objectPart COMMENT?)*
            ('else' colcom objectPart COMMENT?)?;
objectBranch : 'of' exprList colcom objectPart;
objectBranches : objectBranch (INDENT{=} objectBranch)*
                      (INDENT{=} 'elif' expr colcom objectPart)*
                      (INDENT{=} 'else' colcom objectPart)?;
objectCase : 'case' identWithPragma ':' typeDesc ':'? COMMENT?
            (INDENT{>} objectBranches DEDENT
            | INDENT{=} objectBranches);
objectPart : INDENT{>} objectPart+INDENT{=} DEDENT
           | objectWhen | objectCase | 'nil' | 'discard' | declColonEquals;
object_g : 'object' pragma? ('of' typeDesc)? COMMENT? objectPart;
typeClassParam : ('var' | 'out')? symbol;
typeClass : typeClassParam* ',' (pragma)? ('of' typeDesc* ',')? (INDENT{>} stmt);
typeDef : identWithPragmaDot genericParamList? '=' optInd typeDefAux
            indAndComment?;
varTuple : '(' optInd identWithPragma+ comma optPar ')' '=' optInd expr;
colonBody : colcom stmt doBlock?;
variable : (varTuple | identColonEquals) colonBody? indAndComment;
bindStmt : 'bind' optInd qualifiedIdent+ comma;
mixinStmt : 'mixin' optInd qualifiedIdent+ comma;
pragmaStmt : pragma (':' COMMENT? stmt)?;
simpleStmt : ((returnStmt | raiseStmt | yieldStmt | discardStmt | breakStmt
           | continueStmt | pragmaStmt | importStmt  | fromStmt
           | includeStmt | commentStmt) | exprStmt) COMMENT?
         ///  | exportStmt
           ;
complexOrSimpleStmt : (ifStmt | whenStmt | whileStmt
                    | tryStmt | forStmt
                    | blockStmt | staticStmt | deferStmt | asmStmt
                    | 'proc' routine
                    | 'method' routine
                    | 'iterator' routine
                    | 'macro' routine
                    | 'template' routine
                    | 'converter' routine
                    | 'type' section_typeDef
                    | 'const' section_constant
                    | ('let' | 'var' | 'using') section_variable
                    | bindStmt | mixinStmt)
                    | simpleStmt;
stmt : (INDENT{>} complexOrSimpleStmt+(INDENT{=} | ';') DEDENT)
     | simpleStmt+ ';';



ADDR: 'addr'; 
VARIABLE : 'var';
AND : 'and'; 
AS :'as'; 
ASM : 'asm';
BIND:'bind'; 
BLOCK :'block'; 
BREAK :'break';
CASE:'case'; 
CAST:'cast'; 
CONCEPT:'concept';
CONST:'const';
CONTINUE:'continue'; 
CONVERTER:'converter';
MACRO:'macro'; 
METHOD:'method';
MIXIN:'mixin';
MOD:'mod';
NIL:'nil';
NOT:'not'; 
NOTIN:'notin';
OBJECT:'object';
OF:'of'; 
OR:'or';
OUT:'out';
PROC:'proc';
PTR:'ptr';
RAISE:'raise';
REF:'ref';
RETURN:'return';
SHL:'shl';
SHR:'shr';
STATIC:'static';
TEMPLATE:'template';
TRY:'try';
TUPLE:'tuple';
TYPE:'type';
USING:'using';
WHEN:'when';
WHILE:'while';
XOR:'xor';
YIELD:'yield';
DEFER:'defer';
DISCARD:'discard';
DISTINCT:'distinct';
DIV:'div';
DO:'do';
ELIF:'elif';
ELSE:'else';
END:'end';
ENUM:'enum';
EXCEPT:'except';
EXPORT:'export';
FINALLY:'finally';
FOR:'for';
FROM:'from';
FUNC:'func';
IF:'if';
IMPORT:'import';
IN:'in';
INCLUDE:'include';
INTERFACE:'interface';
IS:'is';
ISNOT:'isnot';
ITERATOR:'iterator';
LET:'let';
EQUALS_OPERATOR:'=' | '==';
ADD_OPERATOR: '+';
MINUS_OPERATOR:'-';
MUL_OPERATOR:'*';
DIV_OPERATOR:'/';
LESS_THAN:'<';
GREATER_THAN:'>';
AND_OPERATOR:'&';
OR_OPERATOR:'|';
BITWISE_NOT_OPERATOR:'~';
AT:'@';
MODULUS:'%';
NOT_OPERATOR:'!';
XOR_OPERATOR:'^';
DOT: '.' ;
COLON : ':';
OPEN_BRACE:'{';
CLOSE_BRACE:'}';
OPEN_PAREN: '(' ;
CLOSE_PAREN:')';
OPEN_BRACK: '[' ;
CLOSE_BRACK:']';
COMMA: ',';
SEMI_COLON:';';



///INDENT: {self.column ==0}('    ')+;


COMMENT : '#'+ ~('\r' | '\n')* -> skip;
MULTILINE: '#[' (MULTILINE | . | [\n])*? ']#' -> skip;
MULTILINE_DOC: '##[' (MULTILINE|MULTILINE_DOC | . | [\n])*? ']##' -> skip;



STR_LIT : '"'(.| ALL_ESCAPES |'\\p')*? '"';




TRIPLESTR_LIT :'"""'(.|[\n])*?'"""';

RSTR_LIT: 'r' '"'(.)*?'"';




CHAR_LIT : '\'' (.| ALL_ESCAPES )*? '\'';


GENERALIZED_STR_LIT: IDENTIFIER'"'(.)*?'"';
GENERALIZED_TRIPLESTR_LIT:IDENTIFIER'"""'(.)*?'"""';

IDENTIFIER : LETTER+ ( '_'? (LETTER | DIGIT)+ ) | LETTER+;

FLOAT_LIT: DIGIT+ ('_' DIGIT+)* '.' (( DIGIT+ ('_' DIGIT+)* EXP?) |EXP);
DIGIT : [0-9];

INT_LIT : HEX_LIT
        | DEC_LIT
        | OCT_LIT
        | BIN_LIT;

INT8_LIT : INT_LIT '\'' ('i' | 'I') '8';
INT16_LIT : INT_LIT '\'' ('i' | 'I') '16';
INT32_LIT : INT_LIT '\'' ('i' | 'I') '32';
INT64_LIT : INT_LIT '\'' ('i' | 'I') '64';

UINT_LIT : INT_LIT '\'' ('u' | 'U');
UINT8_LIT : INT_LIT '\'' ('u' | 'U') '8';
UINT16_LIT : INT_LIT '\'' ('u' | 'U') '16';
UINT32_LIT : INT_LIT '\'' ('u' | 'U') '32';
UINT64_LIT : INT_LIT '\'' ('u' | 'U') '64';




HEX_LIT : '0' ('x' | 'X' ) HEXDIGIT+ ( '_' HEXDIGIT+ )*;
DEC_LIT : DIGIT+ ( '_' DIGIT+ )*;
OCT_LIT : '0' 'o' OCTDIGIT+ ( '_' OCTDIGIT+ )*;
BIN_LIT : '0' ('b' | 'B' ) BINDIGIT+ ( '_' BINDIGIT+ )*;

HEX :   ('x'|'X') HEXDIGIT+;
HEXDIGIT : DIGIT | 'A'..'F' | 'a'..'f';
OCTDIGIT : '0'..'7';
BINDIGIT : '0'..'1';




EXP : ('e' | 'E' ) ('+' | '-') DIGIT+ ( '_' DIGIT+ )?;


FLOAT32_SUFFIX : ('f' | 'F') '32';
FLOAT32_LIT : HEX_LIT '\'' FLOAT32_SUFFIX
            | (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) '\'' FLOAT32_SUFFIX;
FLOAT64_SUFFIX : ( ('f' | 'F') '64' ) | 'd' | 'D';
FLOAT64_LIT : HEX_LIT '\'' FLOAT64_SUFFIX
            | (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) '\'' FLOAT64_SUFFIX;



LETTER  : [a-zA-Z\u0080-\u017E] ->skip;


ALL_ESCAPES : '\\r'| '\\c'  | '\\n' |
'\\l' | '\\f'| '\\t' | '\\v' | '\\\\' | '"' | '\''|
'\\a'| '\\b'| '\\e'|DIGIT+|
'\\xHEXDIGITHEXDIGIT';



/// NEW 
OP10: XOR_OPERATOR;
OP9 : MUL_OPERATOR | DIV_OPERATOR | MODULUS | SHL | SHR | DIV | MOD;
OP8: ADD_OPERATOR| MINUS_OPERATOR| BITWISE_NOT_OPERATOR |OR_OPERATOR;
OP7: AND_OPERATOR;
OP6: DOT;
OP5: EQUALS_OPERATOR| GREATER_THAN | LESS_THAN | ISNOT | NOT_OPERATOR | NOTIN | IN | IS | NOT | OF;
OP4: AND;
OP3:OR |XOR;
OP2: AT | COLON | '?';
OP1:'+='|'-=';
OP0:'->'|'=>';

///NEED TO CHANGE
opr: MUL_OPERATOR | DIV_OPERATOR |  ADD_OPERATOR| MINUS_OPERATOR | OR_OPERATOR | DIV | MOD | EQUALS_OPERATOR;


SPACE : [ \r\n\t] -> skip;




