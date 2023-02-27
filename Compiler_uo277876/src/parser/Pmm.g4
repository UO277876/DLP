grammar Pmm;	

program: (varDefinition | func_definition)+ EOF; /* Una o mas definiciones */

expression: INT_CONSTANT
            | REAL_CONSTANT
            | CHAR_CONSTANT
            | ID
            | ID '(' (expression(',' expression)*)?')' /* print f(i, (double)i); */
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

type: 'int'
       |'double'
       |'char'
       |'[' INT_CONSTANT ']' type /* Seminario 2 */
       |'struct' '{' (varDefinition)+ '}' ;

varDefinition: ID(',' ID)* ':' type ';';
               /* ID ':' type ';' | ID ',' varDefinition;  ?? */


func_definition: 'def' ID '(' parameters? ')' ':' type?
                    '{' varDefinition* statement* '}';

parameters: ID ':' type (',' ID ':' type)*;
            /* ID ':' type | ID ':' type ',' parameters ?? */

statement: 'print' expression (',' expression)* ';'
            /*'print' expression ';' | 'print' expression ',' statement ';' */
            | 'input' expression (',' expression)* ';'
            /* 'input' expression ';' | 'input' expression ',' statement ';' */
            | expression '=' expression ';'
            | 'if' expression ':' block ('else' ':' block)?
            | 'while' expression ':' block
            | 'return' expression ';'
            | ID '(' (expression(',' expression)*)?')' ';' /* p() */
            ;
/* procedimiento: ID expression | ID expression ',' procedimiento);
   procedimiento_op: procedimiento | landa ??
*/

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




