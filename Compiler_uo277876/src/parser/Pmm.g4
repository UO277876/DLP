grammar Pmm;	

program: expression EOF;

expression: INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            | '(' expression ')'
            | expression '[' expression ']'
            | expression '.' ID /* Acceso a campo */
            | '(' type ')' expression /* CAST */
            | '-' expression /* Unario */
            | '!' expression
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
            | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
            | expression ('&&'|'||') expression; /* And y or */

type: 'int'|'double'|'char';

array_type: ('[' INT_CONSTANT ']')+ type; /*Puede haber matrices, no solo listas*/

statement: 'print' expression ';' | 'print' expression ',' expression ';'
            /* 'print' expression (',' expression)* ';' */
            | 'input' expression ';' | 'input' expression ',' expression ';'
            /* 'input' expression (',' expression)* ';' */
            | expression '=' expression ';'
            | 'if' expression ':' block ('else' ':' block)?
            | 'while' expression ':' block
            | 'return' expression ';'
            | expression '(' statement ')'
            ;

block: statement
       | '{' statement+ '}'
       ;

variable: expression
          | expression variable
       ;
fragment
NUMBER: [0-9];
fragment
LETTER: [a-zA-Z];
fragment
DECIMAL: INT_CONSTANT* '.' NUMBER+ | INT_CONSTANT+ '.' NUMBER*;
fragment
EXPONENT: [eE][+-]?NUMBER;

TRASH: [ \n\r\t]+ -> skip;
COMMENT_BLOCK: '"''"''"' .*? '"''"''"' -> skip;
COMMENT: '#' .*? '\r'? ('\n' | EOF) -> skip;
INT_CONSTANT: [1-9]NUMBER*  | '0';
REAL_CONSTANT: DECIMAL|(DECIMAL|INT_CONSTANT) EXPONENT;
CHAR_CONSTANT: '\'' . '\'' | '\'' '\\' (INT_CONSTANT | [nrt]) '\'';
ID: (LETTER|'_')|(LETTER|NUMBER|'_')*;




