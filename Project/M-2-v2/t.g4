grammar milestone_2;

start : (
stmt

)+;
comments: COMMENT | MULTILINE_DOC|MULTILINE ;
comma : ',' comments?;
semicolon : ';' comments?;
colcom : ':' comments?;

///Define operators.
one_operator: NOT;
two_operator: EQUALS_OPERATOR|'<='|'>=' | GREATER_THAN | LESS_THAN|ADD_OPERATOR;
assign_operator: ADD_OPERATOR|EQUALS_OPERATOR;
opearnds: operand (assign_operator|two_operator) operand;
operand: (IDENTIFIER|number|STR_LIT|call_func);

and_op : 'add' '(' IDENTIFIER ')';
operator_action: and_op;

///VARIABLE
number : (
    FLOAT_LIT|INT_LIT|DIGIT|INT8_LIT|INT16_LIT|INT32_LIT|INT64_LIT|
    UINT_LIT|
    UINT8_LIT|
    UINT16_LIT|
    UINT32_LIT|
    UINT64_LIT|
    FLOAT32_LIT|
    FLOAT64_LIT);

var_type : 'int'|'string' | 'bool';
compx_op : operand operator (operand|compx_op);
num_list: ((number|STR_LIT) COMMA?)+;
arrayStmt:'array'? OPEN_BRACK (num_list|(number ('..'number )?COMMA var_type ))  CLOSE_BRACK;
assign_var_value : IDENTIFIER EQUALIZE (compx_op|number|STR_LIT|IDENTIFIER|boolStmt|arrayStmt) ;
var_ident: (IDENTIFIER (comma)?)+colcom var_type ;

section_variable:( 
                  (INDENT? IDENTIFIER colcom IDENTIFIER)+
                | (INDENT? comments? var_ident )+
                | (INDENT? assign_var_value semicolon?)+ 
                ) semicolon?;
assertStmt: 'assert' number EQUALS_OPERATOR number;
                
///operands
compare_two_operands: (number|STR_LIT|IDENTIFIER|opearnds) two_operator(number|STR_LIT|IDENTIFIER|opearnds);
assign_one_opearnd: one_operator (number|STR_LIT|IDENTIFIER);

///Statement helper
method: DOT IDENTIFIER;
call_func: IDENTIFIER OPEN_PAREN (number|IDENTIFIER)? CLOSE_PAREN;
condition: ((number|CHAR_LIT_LETTER|IDENTIFIER)(method)? ('..'two_operator?) 
           (IDENTIFIER|number|CHAR_LIT_LETTER)(method)? colcom)
           | AT arrayStmt colcom
           | 'items' OPEN_PAREN IDENTIFIER CLOSE_PAREN colcom;
action_for: IDENTIFIER DOT operator_action;
action: INDENT? ( echoStmt
                | action_for
                | vars_types? section_variable
                | blockStmts
                | returnStmt
                | call_func
                | (BREAK IDENTIFIER?));

///BodyStatement
returnStmt:(INDENT)? RETURN boolStmt;
ofStmt: (INDENT)? (OF STR_LIT(COMMA STR_LIT)* colcom action);
comparStmt: (procHelperStmt|IDENTIFIER |assign_one_opearnd|compare_two_operands) colcom;
comparStmt_proc: (procHelperStmt|IDENTIFIER |assign_one_opearnd|compare_two_operands);
elifStmt: (INDENT)? ELIF comparStmt;
elseStmt:(INDENT)?  ELSE colcom;
procHelperStmt : (IDENTIFIER|blockStmt) '(' (var_ident|STR_LIT) ')' ;

///STATEMENTSSS
blockStmts: ifStmt|forStmt|whileStmt|whenStmt|procStmt|caseStmt|blockStmt;
caseStmt: (INDENT)? CASE IDENTIFIER ofStmt+ elseStmt action;
boolStmt : 'true' | 'false'| 'yes'| 'no';
ifStmt: (INDENT)? ((IF comparStmt ifStmt)
        | (IF comparStmt  action (( (elifStmt|elseStmt) action)+)?));
forStmt: (INDENT)?FOR (IDENTIFIER COMMA?)+ IN condition action;
whileStmt:(INDENT)? WHILE (comparStmt|boolStmt colcom) action+ ;
whenStmt:(INDENT)? WHEN comparStmt action ( (elifStmt|elseStmt) action)+;
procStmt:(INDENT)? PROC comparStmt_proc (colcom (var_type|procStmt))? EQUALIZE action+;
blockStmt: (INDENT)? BLOCK IDENTIFIER colcom action+;


///Simple Stmts.
string_type: CHAR_LIT|CHAR_LIT_LETTER |STR_LIT| RSTR_LIT|TRIPLESTR_LIT;
string : ( ( IDENTIFIER COMMA?)+)? ( string_type) ( (COMMA IDENTIFIER?)+)? ;
echoStmt: 'echo' '('? (string+|('$')?IDENTIFIER) ')'?;

importStmt: IMPORT (IDENTIFIER COMMA?)+;


vars_types : (CONST  | VARIABLE | LET | TYPE);

complexOrSimpleStmt :ifStmt 
                    | (vars_types)? section_variable
                    | caseStmt
                    | forStmt
                    | whileStmt
                    | whenStmt
                    | procStmt
                    | blockStmt;


simpleStmt: (echoStmt|assertStmt|importStmt|call_func);
stmt: (complexOrSimpleStmt|simpleStmt)+INDENT*;









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
EQUALS_OPERATOR: '==';
EQUALIZE: '=';
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



INDENT: {self.column ==0}('    ')+;


COMMENT : '#'+ ~('\r' | '\n')*->skip ;
MULTILINE: '#[' (MULTILINE | . | [\n])*? ']#' -> skip;
MULTILINE_DOC: '##[' (MULTILINE|MULTILINE_DOC | . | [\n])*? ']##' -> skip;



STR_LIT : '"'(.| ALL_ESCAPES |'\\p')*? '"';




TRIPLESTR_LIT :'"""'(.|[\n])*?'"""';

RSTR_LIT: 'r' '"'(.)*?'"';



CHAR_LIT_LETTER : '\''(LETTER)+'\'';
CHAR_LIT : '\'' (.| ALL_ESCAPES |'\\p')*? '\'';


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


ALL_LETTER : [a-zA-Z]+;
LETTER  : [a-zA-Z\u0080-\u017E] ->skip;


ALL_ESCAPES : '\\r'| '\\c'  | '\\n' |
'\\l' | '\\f'| '\\t' | '\\v' | '\\\\' | '"' | '\''|
'\\a'| '\\b'| '\\e'|DIGIT+|
'\\xHEXDIGITHEXDIGIT';



SPACE : [ \r\n\t] -> skip;
