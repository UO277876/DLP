package codegenerator;

import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import semantic.Visitor;

public class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {

    protected CodeGenerator cg; // Como todos heredan de este Visitor, para que usen el mismo cg

    public AbstractCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    // ------------------ PROGRAM ---------------------
    @Override
    public TR visit(Program p, TP params) {
        throw new IllegalStateException("Undefined template \"Program\" for the code function " +
                this.getClass().getName());
    }

    // ------------------ DEFINITIONS ---------------------
    @Override
    public TR visit(VarDefinition vd, TP params) {
        throw new IllegalStateException("Undefined template \"VarDefinition\" for the code function " +
            this.getClass().getName());
    }

    @Override
    public TR visit(FuncDefinition fd, TP params) {
        throw new IllegalStateException("Undefined template \"FuncDefinition\" for the code function " +
                this.getClass().getName());
    }

    // ------------------ EXPRESSIONS ---------------------
    @Override
    public TR visit(Assignment a, TP params) {
        throw new IllegalStateException("Undefined template \"Assignment\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Conditional c, TP params) {
        throw new IllegalStateException("Undefined template \"Conditional\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Input in, TP params) {
        throw new IllegalStateException("Undefined template \"Input\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Print pr, TP params) {
        throw new IllegalStateException("Undefined template \"Print\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Return rt, TP params) {
        throw new IllegalStateException("Undefined template \"Return\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(While wh, TP params) {
        throw new IllegalStateException("Undefined template \"While\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Arithmetic a, TP params) {
        throw new IllegalStateException("Undefined template \"Arithmetic\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(ArrayAccess ac, TP params) {
        throw new IllegalStateException("Undefined template \"ArrayAccess\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Cast c, TP params) {
        throw new IllegalStateException("Undefined template \"Cast\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(CharLiteral cl, TP params) {
        throw new IllegalStateException("Undefined template \"CharLiteral\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Comparator c, TP params) {
        throw new IllegalStateException("Undefined template \"Comparator\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(FunctionInvocation fi, TP params) {
        throw new IllegalStateException("Undefined template \"FunctionInvocation\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(IntLiteral il, TP params) {
        throw new IllegalStateException("Undefined template \"IntLiteral\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Logical l, TP params) {
        throw new IllegalStateException("Undefined template \"Logical\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(RealLiteral rl, TP params) {
        throw new IllegalStateException("Undefined template \"RealLiteral\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(StructAccess sa, TP params) {
        throw new IllegalStateException("Undefined template \"StructAccess\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(UnaryMinus um, TP params) {
        throw new IllegalStateException("Undefined template \"UnaryMinus\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(UnaryNot un, TP params) {
        throw new IllegalStateException("Undefined template \"UnaryNot\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(Variable v, TP params) {
        throw new IllegalStateException("Undefined template \"Variable\" for the code function " +
                this.getClass().getName());
    }

    // ------------------ TYPES ---------------------
    @Override
    public TR visit(ArrayType at, TP params) {
        throw new IllegalStateException("Undefined template \"ArrayType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(CharType ct, TP params) {
        throw new IllegalStateException("Undefined template \"CharType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(DoubleType dt, TP params) {
        throw new IllegalStateException("Undefined template \"DoubleType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(ErrorType e, TP params) {
        throw new IllegalStateException("Undefined template \"ErrorType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(FunctionType ft, TP params) {
        throw new IllegalStateException("Undefined template \"FunctionType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(IntType it, TP params) {
        throw new IllegalStateException("Undefined template \"IntType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(RecordField rf, TP params) {
        throw new IllegalStateException("Undefined template \"RecordField\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(RecordType rt, TP params) {
        throw new IllegalStateException("Undefined template \"RecordType\" for the code function " +
                this.getClass().getName());
    }

    @Override
    public TR visit(VoidType vt, TP params) {
        throw new IllegalStateException("Undefined template \"VoidType\" for the code function " +
                this.getClass().getName());
    }
}
