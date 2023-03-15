package semantic;

import ast.Program;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public interface Visitor<TP,TR> {

    // ------------------ PROGRAM ---------------------
    TR visit(Program p, TP params);

    // ------------------ DEFINITIONS ---------------------
    TR visit(VarDefinition vd, TP params);
    TR visit(FuncDefinition fd, TP params);

    // ------------------ STATEMENTS ---------------------
    TR visit(Assignment a, TP params);
    TR visit(Conditional c, TP params);
    TR visit(Input in, TP params);
    TR visit(Print pr, TP params);
    TR visit(Return rt, TP params);
    TR visit(While wh, TP params);

    // ------------------ EXPRESSIONS ---------------------
    TR visit(Arithmetic a, TP params);
    TR visit(ArrayAccess ac, TP params);
    TR visit(Cast c, TP params);
    TR visit(CharLiteral cl, TP params);
    TR visit(Comparator c, TP params);
    TR visit(FunctionInvocation fi, TP params);
    TR visit(IntLiteral il, TP params);
    TR visit(Logical l, TP params);

    TR visit(RealLiteral rl, TP params);
    TR visit(StructAccess sa, TP params);
    TR visit(UnaryMinus um, TP params);
    TR visit(UnaryNot un, TP params);
    TR visit(Variable v, TP params);

    // ------------------ TYPES ---------------------
    TR visit(ArrayType at, TP params);
    TR visit(CharType ct, TP params);
    TR visit(DoubleType dt, TP params);
    TR visit(ErrorType e, TP params);
    TR visit(FunctionType ft, TP params);
    TR visit(IntType it, TP params);
    TR visit(RecordField rf, TP params);
    TR visit(RecordType rt, TP params);
    TR visit(VoidType vt, TP params);

}
