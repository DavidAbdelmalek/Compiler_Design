grammar milestone_1;

start : (

AND|VARIABLE|ADDR|AS|ASM|BIND|BLOCK|BREAK|CASE|CAST|
CONCEPT|CONST|CONTINUE|CONVERTER|DEFER|DISCARD|DISTINCT|
DIV|DO|ELIF|ELSE|END|ENUM|EXCEPT|EXPORT|FINALLY|FOR|FROM|
FUNC|IF|IMPORT|IN|INCLUDE|INTERFACE|IS|ISNOT|ITERATOR|
LET|MACRO|METHOD|MIXIN|MOD|NIL|NOT|NOTIN|OBJECT|OF|OR|
OUT|PROC|PTR|RAISE|REF|RETURN|SHL|SHR|STATIC|TEMPLATE|
TRY|TUPLE|TYPE|USING|WHEN|WHILE|XOR|YIELD|IDENTIFIER|
LETTER|DIGIT|INT8_LIT|INT16_LIT|INT32_LIT|INT64_LIT|
UINT_LIT|UINT8_LIT|UINT16_LIT|UINT32_LIT|UINT64_LIT|
FLOAT32_LIT|FLOAT32_SUFFIX|FLOAT64_LIT|FLOAT64_SUFFIX|
FLOAT_LIT|EXP|INT_LIT|HEX_LIT|DEC_LIT|OCT_LIT|BIN_LIT|
HEXDIGIT|OCTDIGIT|BINDIGIT|EQUALS_OPERATOR|ADD_OPERATOR|
MUL_OPERATOR|MINUS_OPERATOR|DIV_OPERATOR|
BITWISE_NOT_OPERATOR|AND_OPERATOR|OR_OPERATOR|
LESS_THAN|GREATER_THAN|AT|MODULUS|NOT_OPERATOR|
XOR_OPERATOR|DOT|COLON|OPEN_PAREN|CLOSE_PAREN|
OPEN_BRACE|CLOSE_BRACE|OPEN_BRACK|CLOSE_BRACK|COMMA|
SEMI_COLON|STR_LIT|CHAR_LIT|
TRIPLESTR_LIT|RSTR_LIT|GENERALIZED_STR_LIT|
GENERALIZED_TRIPLESTR_LIT|COMMENT|MULTILINE|INDENT


)*;


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



INDENT: {self.column ==0}('    ')+;


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



SPACE : [ \r\n\t] -> skip;
