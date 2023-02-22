grammar Pmm;	

program: expression EOF;
expression: INT_CONSTANT
            | CHAR_CONSTANT
            | expression ('*'|'/'|'%') expression
            | expression ('+'|'-') expression
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




