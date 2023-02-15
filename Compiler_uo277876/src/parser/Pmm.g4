grammar Pmm;	

program: 
       ;
TRASH: [\n\r\t ]+ -> skip;
COMMENT: '#' .*? '\n';
COMMENT_LINE: '"""' .*? '""""';
INT_CONSTANT: [1-9][0-9]+  | '0'
            ;
