grammar Pmm;	

program: 
       ;
fragment
NUMBER: [0-9];
fragment
LETTER: [a-zA-Z];
fragment
DECIMAL: '.' NUMBER*;
fragment
EXPONENT: [eE][+-]?INT_CONSTANT;

TRASH: [ \n\r\t]+ -> skip;
COMMENT_BLOCK: '"''"''"' .*? '"''"''"' -> skip;
COMMENT: '#' .*? '\r'? ('\n' | EOF) -> skip;
INT_CONSTANT: [1-9]NUMBER+  | '0';
REAL_CONSTANT: ;
ID: (LETTER|'_')|(LETTER|NUMBER|'_')*;


