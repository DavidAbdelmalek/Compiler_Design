grammar task_2_1;
IMMEDIATE : [0-9]+
          | [01]+'b';
REG: 'AX'
    | 'BX'
    | 'CX'
    | 'DX';

COMMAND: 'AAA'
        |'ADD'
        |'INC';

MEMORY : '['REG']';

NEWLINE : [\r\n]+ -> skip;

COMMA: ','+  -> skip;

SPACE : ' '+  -> skip;

expr    : COMMAND SPACE REG COMMA SPACE MEMORY
        | COMMAND SPACE MEMORY COMMA SPACE REG
        | COMMAND SPACE REG COMMA SPACE REG
        | COMMAND SPACE MEMORY COMMA SPACE IMMEDIATE
        | COMMAND SPACE REG COMMA SPACE IMMEDIATE
        | COMMAND ;
start : (expr)* ;
