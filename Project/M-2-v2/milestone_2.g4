grammar milestone_2;

start: ( stmt)+;
comments: COMMENT | MULTILINE_DOC | MULTILINE;
comma: ',' comments?;
semicolon: ';' comments?;
colcom: ':' comments?;

///Define operators.
post_operators: SWAP;
two_operator:
	EQUALS_OPERATOR
	| '<='
	| '>='
	| GREATER_THAN
	| LESS_THAN
	| ADD_OPERATOR
	| AND_OPERATOR;
cond_operator: AND | OR;
assign_operator:
	MINUS_OPERATOR
	| ADD_OPERATOR
	| EQUALS_OPERATOR
	| MOD
	| MUL_OPERATOR
	| DIV
	| DIV_OPERATOR;
operands:
	operand (
		(assign_operator | two_operator) (operand | operands)
	)?;
priotize_operand:
	OPEN_PAREN (priotize_operand | operands) CLOSE_PAREN;

///Removed call_fun from operand
operand: (
		array_index
		| number
		| call_func
		| STR_LIT
		| boolStmt
		| priotize_operand
		| pointer_assign
		| IDENTIFIER
		| string_type
		
	);

predifined_method: IDENTIFIER (predifined_method | operands);

///VARIABLE
number: (MINUS_OPERATOR)? (
		FLOAT_LIT
		| INT_LIT
		| DIGIT
		| INT8_LIT
		| INT16_LIT
		| INT32_LIT
		| INT64_LIT
		| UINT_LIT
		| UINT8_LIT
		| UINT16_LIT
		| UINT32_LIT
		| UINT64_LIT
		| FLOAT32_LIT
		| FLOAT64_LIT
	);

var_type: 'int' | 'string' | 'bool' | 'untyped' | boolStmt;
///compx_op : operand (assign_operator (operand|compx_op))?;

arr_item: ((number | STR_LIT) COMMA?)+;
arrayStmt:
	(
		'array'? OPEN_BRACK (
			arr_item
			| (number ('..' number)? COMMA var_type)
		) CLOSE_BRACK
	)
	| (AT OPEN_BRACK CLOSE_BRACK);
pointer_assign: '$' (operands | IDENTIFIER method | operand);

///change here 
	///add + and method
assign_var_value: (INDENT | COMMA)? (
		(array_index | IDENTIFIER) (EQUALIZE | colcom)
	) (
		ifStmt
		| section_variable
		| call_func
		| pointer_assign
		| arrayStmt
		| operands
		| number
		| STR_LIT
		| boolStmt
		| objectStmt
	) (method|DOT call_func)?;

	

var_ident: (INDENT | COMMA | SEMI_COLON)? (IDENTIFIER (COMMA)?)+ colcom (
		procStmt
		| (vars_types)? array_index
		| vars_types section_variable
		| var_type
	);

section_variable:
	INDENT? (
		( assign_var_value semicolon?)+
		| ( comments? var_ident)+
	) semicolon?;
assertStmt: 'assert' number EQUALS_OPERATOR number;

///operands
compare_two_operands: (
		(number | STR_LIT | IDENTIFIER | operands | call_func) two_operator (
			call_func
			| number
			| STR_LIT
			| IDENTIFIER
			| operands
		) cond_operator?
	)+;
post_operand_func:
	post_operators (number | array_index) COMMA (
		number
		| array_index
	);
method:
	DOT IDENTIFIER (
		(OPEN_PAREN prac_body+ CLOSE_PAREN)
		| prac_body+
	)?;
///Statement helper

prac_body:
	operand
	| assign_var_value
	| call_func
	| predifined_method;
call_func:
	(
		('yes' | IDENTIFIER) OPEN_PAREN (
			(IDENTIFIER method)
			| (prac_body COMMA?)
		)* CLOSE_PAREN
	)
	| (array_index OPEN_PAREN prac_body* CLOSE_PAREN)
	| (IDENTIFIER method);

condition: (
		(number | CHAR_LIT_LETTER | IDENTIFIER) (method)? (
			'..' two_operator?
		) (IDENTIFIER | number | CHAR_LIT_LETTER) (method)? colcom
	)
	| IDENTIFIER COLON
	| call_func colcom
	| AT arrayStmt colcom
	| 'items' OPEN_PAREN IDENTIFIER CLOSE_PAREN colcom;
action_for: IDENTIFIER (DOT predifined_method);
action:
	INDENT? (
		echoStmt action*
		| predifined_method action?
		| operands
		| action_for action*
		| blockStmts action*
		| vars_types? section_variable action*
		| string
		| post_operand_func action*
		| returnStmt
		| DISCARD
		| breakStmt
		| CONTINUE
	);

breakStmt: BREAK IDENTIFIER?;

///BodyStatement
return_body: boolStmt | (IDENTIFIER '&' STR_LIT);
returnStmt: (INDENT)? RETURN return_body?;
ofStmt: (INDENT)? OF (
		CHAR_LIT
		| CHAR_LIT_LETTER
		| STR_LIT
		| boolStmt
	) (COMMA STR_LIT)* colcom action;
comparStmt: (NOT)? (
		call_func
		| IDENTIFIER
		| compare_two_operands
	) colcom;
comparStmt_proc: (
		procHelperStmt
		| IDENTIFIER
		| compare_two_operands
	);
elifStmt: (INDENT)? ELIF comparStmt;
elseStmt: (INDENT)? ELSE colcom;
array_index:
	(REF)? (AT | IDENTIFIER)? OPEN_BRACK (
		var_type
		| array_index
		| IDENTIFIER
		| number
		| operands
		| arr_item
	) CLOSE_BRACK;
procHelperStmt: (
		'yes'
		| IDENTIFIER
		| blockStmt
		| ('\'$\'')? array_index
	)? OPEN_PAREN (
		(array_index | var_ident | STR_LIT | assign_var_value) COMMA?
	)+ CLOSE_PAREN;

///STATEMENTSSS
blockStmts:
	ifStmt
	| forStmt
	| whileStmt
	| whenStmt
	| procStmt
	| caseStmt
	| blockStmt
	| macroStmt
	| templateStmt;
caseStmt: (INDENT)? CASE (var_ident | IDENTIFIER) ofStmt+ (
		elseStmt action
	)?;
boolStmt: 'true' | 'false' | 'yes' | 'no';
ifStmt:
	INDENT? (
		(IF comparStmt ifStmt)
		| (
			IF comparStmt action (
				((elifStmt | elseStmt) action)+
			)?
		)
	);
forStmt: (INDENT)? FOR (IDENTIFIER COMMA?)+ IN condition action;
whileStmt: (INDENT)? WHILE (comparStmt | boolStmt colcom) action;
whenStmt: (INDENT)? WHEN comparStmt action (
		(elifStmt | elseStmt) action
	)+;
procStmt:  PROC procHelperStmt (
		colcom (var_type | array_index)
	)? (EQUALIZE action)?;

blockStmt: (INDENT)? BLOCK IDENTIFIER colcom action;

objectStmt: (INDENT)? OBJECT caseStmt;
macroStmt: (INDENT)? MACRO procHelperStmt (
		colcom (var_type | array_index)
	)? (EQUALIZE action)?;
templateStmt: (INDENT)? TEMPLATE call_func (
		OPEN_BRACE method CLOSE_BRACE
	)? (EQUALIZE action);
///template searchLoop (inp, actions) {.dirty} =

///Simple Stmts.
string_type:
	CHAR_LIT
	| CHAR_LIT_LETTER
	| STR_LIT
	| RSTR_LIT
	| TRIPLESTR_LIT;
var_print: IDENTIFIER;
string: (( (var_print | call_func) COMMA?)+)? (string_type) (
		(COMMA (var_print | call_func)?)+
	)?
	| (OPEN_PAREN ifStmt CLOSE_PAREN);
print_with_condition:
	INDENT? (COMMA? OPEN_PAREN? ifStmt CLOSE_PAREN?)+;
print_statement: operands | call_func | predifined_method | OPEN_PAREN print_with_condition CLOSE_PAREN;

///changed here

echoStmt:
	'echo' (
		(
			OPEN_PAREN (
				('$')? IDENTIFIER
				| print_with_condition
				| (print_statement COMMA? )+
				| call_func
			) CLOSE_PAREN 
			
		)
		| (
			(
				('$')? IDENTIFIER
				| print_with_condition
				| (COMMA? print_statement)+
				| call_func
			)
		)
	);

importStmt: IMPORT (IDENTIFIER COMMA?)+;
fromStmt: FROM IDENTIFIER+ importStmt;

vars_types: (CONST | VARIABLE | LET | TYPE);

complexOrSimpleStmt: blockStmts;
simpleStmt: (
		echoStmt
		| (vars_types)? section_variable
		| assertStmt
		| importStmt
		| predifined_method
		| call_func
		| fromStmt
	);
stmt: (simpleStmt | complexOrSimpleStmt)+ INDENT* EOF;

SWAP: 'swap';
ADDR: 'addr';
VARIABLE: 'var';
AND: 'and';
AS: 'as';
ASM: 'asm';
BIND: 'bind';
BLOCK: 'block';
BREAK: 'break';
CASE: 'case';
CAST: 'cast';
CONCEPT: 'concept';
CONST: 'const';
CONTINUE: 'continue';
CONVERTER: 'converter';
MACRO: 'macro';
METHOD: 'method';
MIXIN: 'mixin';
MOD: 'mod';
NIL: 'nil';
NOT: 'not';
NOTIN: 'notin';
OBJECT: 'object';
OF: 'of';
OR: 'or';
OUT: 'out';
PROC: 'proc';
PTR: 'ptr';
RAISE: 'raise';
REF: 'ref';
RETURN: 'return';
SHL: 'shl';
SHR: 'shr';
STATIC: 'static';
TEMPLATE: 'template';
TRY: 'try';
TUPLE: 'tuple';
TYPE: 'type';
USING: 'using';
WHEN: 'when';
WHILE: 'while';
XOR: 'xor';
YIELD: 'yield';
DEFER: 'defer';
DISCARD: 'discard';
DISTINCT: 'distinct';
DIV: 'div';
DO: 'do';
ELIF: 'elif';
ELSE: 'else';
END: 'end';
ENUM: 'enum';
EXCEPT: 'except';
EXPORT: 'export';
FINALLY: 'finally';
FOR: 'for';
FROM: 'from';
FUNC: 'func';
IF: 'if';
IMPORT: 'import';
IN: 'in';
INCLUDE: 'include';

INTERFACE: 'interface';
IS: 'is';
ISNOT: 'isnot';
ITERATOR: 'iterator';
LET: 'let';
EQUALS_OPERATOR: '==';
EQUALIZE: '=';
ADD_OPERATOR: '+';
MINUS_OPERATOR: '-';
MUL_OPERATOR: '*';
DIV_OPERATOR: '/';
LESS_THAN: '<';
GREATER_THAN: '>';
AND_OPERATOR: '&';
OR_OPERATOR: '|';
BITWISE_NOT_OPERATOR: '~';
AT: '@';
MODULUS: '%';
NOT_OPERATOR: '!';
XOR_OPERATOR: '^';
DOT: '.';
COLON: ':';
OPEN_BRACE: '{';
CLOSE_BRACE: '}';
OPEN_PAREN: '(';
CLOSE_PAREN: ')';
OPEN_BRACK: '[';
CLOSE_BRACK: ']';
COMMA: ',';
SEMI_COLON: ';';

INDENT: {self.column ==0} ('    ')+ -> skip;

COMMENT: '#'+ ~('\r' | '\n')* -> skip;
MULTILINE: '#[' (MULTILINE | . | [\n])*? ']#' -> skip;
MULTILINE_DOC:
	'##[' (MULTILINE | MULTILINE_DOC | . | [\n])*? ']##' -> skip;

STR_LIT: '"' (. | ALL_ESCAPES | '\\p')*? '"';

TRIPLESTR_LIT: '"""' (. | [\n])*? '"""';

RSTR_LIT: 'r' '"' (.)*? '"';

CHAR_LIT_LETTER: '\'' (LETTER)+ '\'';
CHAR_LIT: '\'' (. | ALL_ESCAPES | '\\p')*? '\'';

GENERALIZED_STR_LIT: IDENTIFIER '"' (.)*? '"';
GENERALIZED_TRIPLESTR_LIT: IDENTIFIER '"""' (.)*? '"""';

IDENTIFIER: LETTER+ ( '_'? (LETTER | DIGIT)+) | LETTER+;

FLOAT_LIT:
	DIGIT+ ('_' DIGIT+)* '.' (( DIGIT+ ('_' DIGIT+)* EXP?) | EXP);
DIGIT: [0-9];

INT_LIT: HEX_LIT | DEC_LIT | OCT_LIT | BIN_LIT;

INT8_LIT: INT_LIT '\'' ('i' | 'I') '8';
INT16_LIT: INT_LIT '\'' ('i' | 'I') '16';
INT32_LIT: INT_LIT '\'' ('i' | 'I') '32';
INT64_LIT: INT_LIT '\'' ('i' | 'I') '64';

UINT_LIT: INT_LIT '\'' ('u' | 'U');
UINT8_LIT: INT_LIT '\'' ('u' | 'U') '8';
UINT16_LIT: INT_LIT '\'' ('u' | 'U') '16';
UINT32_LIT: INT_LIT '\'' ('u' | 'U') '32';
UINT64_LIT: INT_LIT '\'' ('u' | 'U') '64';

HEX_LIT: '0' ('x' | 'X') HEXDIGIT+ ( '_' HEXDIGIT+)*;
DEC_LIT: DIGIT+ ( '_' DIGIT+)*;
OCT_LIT: '0' 'o' OCTDIGIT+ ( '_' OCTDIGIT+)*;
BIN_LIT: '0' ('b' | 'B') BINDIGIT+ ( '_' BINDIGIT+)*;

HEX: ('x' | 'X') HEXDIGIT+;
HEXDIGIT: DIGIT | 'A' ..'F' | 'a' ..'f';
OCTDIGIT: '0' ..'7';
BINDIGIT: '0' ..'1';

EXP: ('e' | 'E') ('+' | '-') DIGIT+ ( '_' DIGIT+)?;

FLOAT32_SUFFIX: ('f' | 'F') '32';
FLOAT32_LIT:
	HEX_LIT '\'' FLOAT32_SUFFIX
	| (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) '\'' FLOAT32_SUFFIX;
FLOAT64_SUFFIX: ( ('f' | 'F') '64') | 'd' | 'D';
FLOAT64_LIT:
	HEX_LIT '\'' FLOAT64_SUFFIX
	| (FLOAT_LIT | DEC_LIT | OCT_LIT | BIN_LIT) '\'' FLOAT64_SUFFIX;

ALL_LETTER: [a-zA-Z]+;
LETTER: [a-zA-Z\u0080-\u017E] -> skip;

ALL_ESCAPES:
	'\\r'
	| '\\c'
	| '\\n'
	| '\\l'
	| '\\f'
	| '\\t'
	| '\\v'
	| '\\\\'
	| '"'
	| '\''
	| '\\a'
	| '\\b'
	| '\\e'
	| DIGIT+
	| '\\xHEXDIGITHEXDIGIT';

SPACE: [ \r\n\t] -> skip;
