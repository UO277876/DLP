grammar Pmm;	

@header{
import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.*;
}

// /* Sintactico */
// --------------------- Program ---------------------------
program returns [Program ast] locals
                [List<Definition> definitions = new ArrayList<Definition>()]:
            (varDefinition {$definitions.addAll($varDefinition.ast);}
            | funcDefinition {$definitions.add($funcDefinition.ast);}
            )*
            mainDefinition {$definitions.add($mainDefinition.ast);}
            { $ast = new Program($definitions, $definitions.get($definitions.size()-1).getLine(),
                $definitions.get($definitions.size()-1).getColumn());}
            EOF; /* Una o mas definiciones */

// --------------------- Expressions ---------------------------
expression returns [Expression ast]:
        ID '(' funcParameters ')'
             {
                 $ast = new FunctionInvocation(
                    new Variable($ID.text,$ID.getLine(),$ID.getCharPositionInLine()+1),
                    $funcParameters.ast,$ID.getLine(),$ID.getCharPositionInLine()+1);
             }
        | '(' expression ')' {$ast = $expression.ast;}
        | expr1=expression '[' expr2=expression ']' {$ast = new ArrayAccess($expr1.ast,$expr2.ast,
                                                      $expr1.ast.getLine(),$expr1.ast.getColumn());}
        | expr=expression '.' ID /* Acceso a campo */ {$ast = new StructAccess($ID.text, $expr.ast,
                                                        $expr.ast.getLine(), $expr.ast.getColumn());}
        | '(' type ')' expression /* CAST */ {$ast = new Cast($type.ast,$expression.ast,
                                               $expression.ast.getLine(), $expression.ast.getColumn());}
        | '-' expression /* Unario */ {$ast = new UnaryMinus($expression.ast,
                                            $expression.ast.getLine(), $expression.ast.getColumn());}
        | '!' expression {$ast = new UnaryNot($expression.ast,
                               $expression.ast.getLine(),$expression.ast.getColumn());}
        | left=expression OP=('*'|'/'|'%') right=expression {$ast = new Arithmetic($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
        | left=expression OP=('+'|'-') right=expression {$ast = new Arithmetic($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
        | left=expression OP=('>'|'>='|'<'|'<='|'!='|'==') right=expression{$ast = new Comparator($OP.text,
                 $right.ast, $left.ast, $left.ast.getLine(), $left.ast.getColumn());}
        | left=expression OP=('&&'|'||') right=expression /* And y or */
                 {$ast = new Logical($OP.text, $right.ast, $left.ast,
                    $left.ast.getLine(), $left.ast.getColumn());}
        | INT_CONSTANT {$ast = new IntLiteral(LexerHelper.lexemeToInt($INT_CONSTANT.text),
                                    $INT_CONSTANT.getLine(), $INT_CONSTANT.getCharPositionInLine()+1 ); }
        | REAL_CONSTANT {$ast = new RealLiteral(LexerHelper.lexemeToReal($REAL_CONSTANT.text),
                                    $REAL_CONSTANT.getLine(), $REAL_CONSTANT.getCharPositionInLine()+1 ); }
        | CHAR_CONSTANT {$ast = new CharLiteral(LexerHelper.lexemeToChar($CHAR_CONSTANT.text),
                                    $CHAR_CONSTANT.getLine(), $CHAR_CONSTANT.getCharPositionInLine()+1); }
        | ID { $ast = new Variable($ID.text, $ID.getLine(), $ID.getCharPositionInLine()+1 ); }
        ;

// --------------------- Types ---------------------------
type returns [Type ast] locals [List<RecordField> rfs = new ArrayList<RecordField>()]:
       simple_types {$ast = $simple_types.ast;}
       |'[' INT_CONSTANT ']' type /* Seminario 2 */ {$ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text),
                                                        $type.ast);}
       | 'struct' '{' (recordFields{$rfs.addAll($recordFields.ast);})* '}' {$ast = new RecordType($rfs);}
       ;

simple_types returns [Type ast]:
       'int' {$ast = new IntType();}
       |'double' {$ast = new DoubleType();}
       |'char' {$ast = new CharType();}
       ;

recordFields returns [List<RecordField> ast = new ArrayList<>()] locals
                        [List<String> ids = new ArrayList<String>()]:
       ID1=ID {$ids.add($ID1.text);}
       (',' ID2=ID {$ids.add($ID2.text);})*
       ':' type {for(String id: $ids) {
                    $ast.add(
                        new RecordField(id,$type.ast,$ID1.getLine(),$ID1.getCharPositionInLine()+1));
                  }
                }
       ';'
       ;

// --------------------- Definitions ---------------------------
varDefinition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()] locals
                         [List<String> ids = new ArrayList<String>()]:
    /* ID ':' type ';' | ID ',' varDefinition; */
       ID1=ID {$ids.add($ID1.text);}
       (',' ID2=ID { if($ids.contains($ID2.text)){
                        new ErrorType("Variable with name " + $ID2.text + " is already defined.",
                            $ID2.getLine(),$ID2.getCharPositionInLine()+1);
                     } else {
                            $ids.add($ID2.text);}
                     }
       )*
       ':' type
       {
            for(String id: $ids){
                $ast.add(
                   new VarDefinition($type.ast,id,$ID1.getLine(),$ID1.getCharPositionInLine()+1));
            }
       }
       ';'
       ;

funcDefinition returns [Definition ast] locals
            [List<Statement> statements = new ArrayList<Statement>(),
            List<Definition> definitions = new ArrayList<Definition>(),
            List<VarDefinition> varDefinitions= new ArrayList<VarDefinition>()]:
       'def' ID '(' parameters ')' ':' returnType
       '{' (varDefinition {$varDefinitions.addAll($varDefinition.ast);})*
       (statement {$statements.add($statement.ast);})* '}'
       { $ast = new FuncDefinition(
            new FunctionType($returnType.ast, $parameters.ast),
                $ID.text,
                $varDefinitions,
                $statements,
                $ID.getLine(),
                $ID.getCharPositionInLine()+1);
       }
       ;

mainDefinition returns [Definition ast] locals
            [List<Statement> statements = new ArrayList<Statement>(),
            List<Definition> definitions = new ArrayList<Definition>(),
            List<VarDefinition> varDefinitions= new ArrayList<VarDefinition>()]:
       'def' MAIN='main' '(' ')' ':'
       '{' (varDefinition {$varDefinitions.addAll($varDefinition.ast);})*
       (statement {$statements.add($statement.ast);})* '}'
       { $ast = new FuncDefinition(
            new FunctionType(new VoidType(), new ArrayList<VarDefinition>()),
                $MAIN.text,
                $varDefinitions,
                $statements,
                $MAIN.getLine(),
                $MAIN.getCharPositionInLine()+1);
       }
       ;

parameters returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
       (ID1=ID ':' type1=simple_types {$ast.add(new VarDefinition($type1.ast, $ID1.text,
                                $ID1.getLine(),$ID1.getCharPositionInLine()+1));}
       (',' ID2=ID ':' type2=simple_types {$ast.add(new VarDefinition($type2.ast, $ID2.text,
                                                 $ID2.getLine(),$ID2.getCharPositionInLine()+1));}
       )*)?
       /* ID ':' type | ID ':' type ',' parameters */
       ;

returnType returns [Type ast]:
       simple_types { $ast = $simple_types.ast; }
       | {$ast = new VoidType();}
       ;

// --------------------- Statements ---------------------------
statement returns [Statement ast] locals
                    [List<Expression> exprs = new ArrayList<Expression>(),
                    List<Statement> if_statements = new ArrayList<Statement>(),
                    List<Statement> else_statements = new ArrayList<Statement>()]:
       'print' expr1=expression {$exprs.add($expr1.ast);}
       (',' expr2=expression {$exprs.add($expr2.ast);})
       * ';'
       /*'print' expression ';' | 'print' expression ',' statement ';' */
       {
            List<Expression> aux = new ArrayList<Expression>();
            for(Expression expr : $exprs){
                aux.add(expr);
            }
            $ast = new Print(aux,$expr1.ast.getLine(),$expr1.ast.getColumn());
       }
       | 'input' expr1=expression {$exprs.add($expr1.ast);}
         (',' expr2=expression {$exprs.add($expr2.ast);})
         * ';'
         /* 'input' expression ';' | 'input' expression ',' statement ';' */
         {
             List<Expression> aux = new ArrayList<Expression>();
             for(Expression expr : $exprs){
                 aux.add(expr);
             }
             $ast = new Input(aux,$expr1.ast.getLine(),$expr1.ast.getColumn());
         }
       | left=expression '=' right=expression ';' {$ast = new Assignment($right.ast,$left.ast,$left.ast.getLine(),
                                                        $left.ast.getColumn());}
       | 'if' cond=expression ':' bl1=block {$if_statements.addAll($bl1.ast);}
         ('else' ':' bl2=block {$else_statements.addAll($bl2.ast);})?
       { $ast = new Conditional($cond.ast, $if_statements, $else_statements,
            $cond.ast.getLine(), $cond.ast.getColumn());}
       | 'while' cond=expression ':' bl1=block
       { $ast = new While($cond.ast, $bl1.ast, $cond.ast.getLine(), $cond.ast.getColumn());}
       | 'return' expression ';' {$ast = new Return($expression.ast,$expression.ast.getLine(),
                                        $expression.ast.getColumn());}
       | ID '(' funcParameters ')' ';'
                  {
                    $ast = new FunctionInvocation(
                         new Variable($ID.text,$ID.getLine(),$ID.getCharPositionInLine()+1),
                         $funcParameters.ast,$ID.getLine(),$ID.getCharPositionInLine()+1);
                  }
       ;

funcParameters returns [List<Expression> ast = new ArrayList<Expression>()]:
       (
         expr1=expression {$ast.add($expr1.ast);}
         (',' expr2=expression {$ast.add($expr2.ast);})*
       )?
       ;

/* procedimiento: ID expression | ID expression ',' procedimiento);
   procedimiento_op: procedimiento | landa ?? */

block returns [List<Statement> ast = new ArrayList<Statement>()]:
       statement {$ast.add($statement.ast);}
       | '{' (statement{$ast.add($statement.ast);})+ '}'
       ;

// /* Lexico */
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
ID: (LETTER|'_')(LETTER|NUMBER|'_')*;




