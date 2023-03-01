grammar Pmm;	

@header{
import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
}

program returns [Program ast]:
            (varDefinition | func_definition)+ EOF; /* Una o mas definiciones */

expression returns [Expression ast]:
            INT_CONSTANT {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text),
                $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1 ); }
            | REAL_CONSTANT {$ast = new RealLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text),
                $REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1 ); }
            | CHAR_CONSTANT {$ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text),
                $CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1); }
            | ID { $ast = new Variable($ID.text, $ID.getLine(), $ID.getCharPositionInLine()+1 ); }
            | ID '(' (expression(',' expression)*)?')' /* print f(i, (double)i); */
            | '(' expression ')' /*{$ast = $expression.ast;} */
            | expression '[' expression ']'
            | expression '.' ID /* Acceso a campo */
            | '(' type ')' expression /* CAST */
            | '-' expression /* Unario */ {$ast = new UnaryMinus($expression.ast,$expression.ast.getLine(), $expression.ast.getColumn());}
            | '!' expression
            | left=expression OP=('*'|'/'|'%') right=expression {$ast = new Arithmetic($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
            | left=expression OP=('+'|'-') right=expression {$ast = new Arithmetic($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
            | left=expression OP=('>'|'>='|'<'|'<='|'!='|'==') right=expression{$ast = new Comparator($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
            | left=expression OP=('&&'|'||') right=expression /* And y or */
                 {$ast = new Logical($OP.text, $right.ast, $left.ast,
                    $left.ast.getLine(), $left.ast.getColumn());}
            ;
type: 'int'
       |'double'
       |'char'
       |'[' INT_CONSTANT ']' type /* Seminario 2 */
       |'struct' '{' (varDefinition)+ '}' ;

varDefinition: ID(',' ID)* ':' type ';';
               /* ID ':' type ';' | ID ',' varDefinition; */

func_definition: 'def' ID '(' parameters? ')' ':' type?
                    '{' varDefinition* statement* '}';

parameters: ID ':' type (',' ID ':' type)*;
            /* ID ':' type | ID ':' type ',' parameters */

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
   procedimiento_op: procedimiento | landa ?? */

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




