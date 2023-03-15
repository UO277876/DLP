package semantic;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;

public abstract class AbstractVisitor<TP,TR> implements Visitor<TP,TR> {

    // ------------------ PROGRAM ---------------------
    @Override
    public TR visit(Program p, TP params) {
        for(Definition def : p.getDefinitions()){
            def.accept(this,params);
        }

        return null;
    }

    // ------------------ DEFINITIONS ---------------------
    @Override
    public TR visit(VarDefinition vd, TP params) {
        vd.getType().accept(this,params);
        return null;
    }

    @Override
    public TR visit(FuncDefinition fd, TP params) {
        fd.getType().accept(this,params);

        for(VarDefinition def : fd.getVarDefinitions()){
            def.accept(this,params);
        }

        for(Statement st : fd.getStatements()){
            st.accept(this,params);
        }

        return null;
    }

    // ------------------ STATEMENTS ---------------------
    @Override
    public TR visit(Assignment a, TP params) {
        a.getLeft().accept(this,params);
        a.getRight().accept(this,params);
        return null;
    }

    @Override
    public TR visit(Conditional c, TP params) {
        c.getCondition().accept(this,params);

        for(Statement st : c.getIfStatements()){
            st.accept(this,params);
        }

        for(Statement st : c.getElseStatements()){
            st.accept(this,params);
        }

        return null;
    }

    @Override
    public TR visit(Input in, TP params) {
        for(Expression expr : in.getExpressions()){
            expr.accept(this,params);
        }

        return null;
    }

    @Override
    public TR visit(Print pr, TP params) {
        for(Expression expr : pr.getExpressions()){
            expr.accept(this,params);
        }

        return null;
    }

    @Override
    public TR visit(Return rt, TP params) {
        rt.accept(this,params);
        return null;
    }

    @Override
    public TR visit(While wh, TP params) {
        wh.accept(this,params);
        for(Statement st : wh.getStatements()){
            st.accept(this,params);
        }

        return null;
    }

    // ------------------ EXPRESSIONS ---------------------
    @Override
    public TR visit(Arithmetic a, TP params) {
        a.getLeft().accept(this,params);
        a.getRight().accept(this,params);
        return null;
    }

    @Override
    public TR visit(ArrayAccess ac, TP params) {
        ac.getExpression1().accept(this,params);
        ac.getExpression2().accept(this,params);
        return null;
    }

    @Override
    public TR visit(Cast c, TP params) {
        c.getType().accept(this,params);
        c.getExpression().accept(this,params);
        return null;
    }

    @Override
    public TR visit(CharLiteral cl, TP params) {
        return null;
    }

    @Override
    public TR visit(Comparator c, TP params) {
        c.getLeft().accept(this,params);
        c.getRight().accept(this,params);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation fi, TP params) {
        fi.getFunction().accept(this,params);
        for(Expression expr : fi.getParameters()){
            expr.accept(this,params);
        }

        return null;
    }

    @Override
    public TR visit(IntLiteral il, TP params) {
        return null;
    }

    @Override
    public TR visit(Logical l, TP params) {
        l.getLeft().accept(this,params);
        l.getRight().accept(this,params);
        return null;
    }

    @Override
    public TR visit(RealLiteral rl, TP params) {
        return null;
    }

    @Override
    public TR visit(StructAccess sa, TP params) {
        sa.getExpression().accept(this,params);
        return null;
    }

    @Override
    public TR visit(UnaryMinus um, TP params) {
        um.getExpression().accept(this,params);
        return null;
    }

    @Override
    public TR visit(UnaryNot un, TP params) {
        un.getExpression().accept(this,params);
        return null;
    }

    @Override
    public TR visit(Variable v, TP params) {
        return null;
    }

    // ------------------ TYPES ---------------------
    @Override
    public TR visit(ArrayType at, TP params) {
        at.getType().accept(this,params);
        return null;
    }

    @Override
    public TR visit(CharType ct, TP params) {
        return null;
    }

    @Override
    public TR visit(DoubleType dt, TP params) {
        return null;
    }

    @Override
    public TR visit(ErrorType e, TP params) {
        return null;
    }

    @Override
    public TR visit(FunctionType ft, TP params) {
        ft.getReturnType().accept(this,params);
        for(VarDefinition def : ft.getParameters()){
            def.accept(this,params);
        }
        return null;
    }

    @Override
    public TR visit(IntType it, TP params) {
        return null;
    }

    @Override
    public TR visit(RecordField rf, TP params) {
        rf.getType().accept(this,params);
        return null;
    }

    @Override
    public TR visit(RecordType rt, TP params) {
        for(RecordField rf : rt.getFields()){
            rf.accept(this,params);
        }
        return null;
    }

    @Override
    public TR visit(VoidType vt, TP params) {
        return null;
    }
}
