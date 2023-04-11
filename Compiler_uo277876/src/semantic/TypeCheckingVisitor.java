package semantic;

import ast.Expression;
import ast.Type;
import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.ErrorType;
import ast.types.IntType;

public class TypeCheckingVisitor<Type,Void> extends AbstractVisitor<Type,Void> {

    // ------------------ EXPRESSIONS ---------------------
    @Override
    public Void visit(Arithmetic a, Type params) {
        super.visit(a,params);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(),a));
        a.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess ac, Type params) {
        super.visit(ac,params);
        ac.setType(ac.getExpression1().getType().squareBrackets(ac.getExpression2().getType(),ac));
        ac.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast c, Type params) {
        super.visit(c,params);
        c.setType(c.getType().canBeCastTo(c.getExpression().getType(),c));
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(CharLiteral cl, Type params) {
        super.visit(cl,params);
        cl.setType(new CharType());
        cl.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparator c, Type params) {
        super.visit(c,params);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(),c));
        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation fi, Type params) {
        super.visit(fi,params);
        fi.setType(fi.getFunction().getType().parenthesis(fi.getParameters(),fi));
        fi.setLValue(false);
        return null;
    }

    @Override
    public Void visit(IntLiteral il, Type params) {
        super.visit(il,params);
        il.setType(new IntType());
        il.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logical l, Type params) {
        super.visit(l,params);
        l.setType(l.getLeft().getType().logic(l.getRight().getType(),l));
        l.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RealLiteral rl, Type params) {
        super.visit(rl,params);
        rl.setType(new DoubleType());
        rl.setLValue(false);
        return null;
    }

    @Override
    public Void visit(StructAccess sa, Type params) {
        super.visit(sa,params);
        sa.setType(sa.getExpression().getType().dot(sa.getName(),sa));
        sa.setLValue(true);
        return null;
    }

    @Override
    public Void visit(UnaryMinus um, Type params) {
        super.visit(um,params);
        um.setType(um.getExpression().getType().arithmeticUnary(um));
        um.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot un, Type params) {
        super.visit(un,params);
        un.setType(un.getExpression().getType().logic(un));
        un.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Variable v, Type params) {
        super.visit(v,params);
        v.setType(v.getDefinition().getType());
        v.setLValue(true);
        return null;
    }

    // ------------------ STATEMENTS ---------------------
    @Override
    public Void visit(Assignment a, Type params) {
        super.visit(a,params);
        a.getLeft().setType(a.getLeft().getType().mustBePromoteTo(a.getRight().getType(),a));
        if(!a.getLeft().getLValue()){
            new ErrorType("Cannot assign to the left anything that is not a variable or lValue",
                    a.getLine(), a.getColumn());
        }
        return null;
    }

    @Override
    public Void visit(Conditional c, Type param) {
        super.visit(c, param);
        if(!c.getCondition().getType().isLogical()) {
            new ErrorType("There isn't a logical type", c.getCondition().getLine(), c.getCondition().getColumn());
        }
        return null;
    }

    @Override
    public Void visit(Input in, Type params) {
        // No se hace el super porque para asignar el lvalue se tiene que recorrer el árbol
        for (Expression e : in.getExpressions()) {
            e.accept(this, params);
            if (!e.getLValue())
                new ErrorType("Variables not found", in.getLine(), in.getColumn());
        }

        // Falta el asignar type
        return null;
    }

    @Override
    public Void visit(Print p, Type params) {
        for (Expression e : p.getExpressions()) {
            e.accept(this, params);
            if (!e.getLValue())
                new ErrorType("Variables not found", p.getLine(), p.getColumn());
        }

        // Falta el asignar type
        return null;
    }

    @Override
    public Void visit(Return r, Type param) {
        super.visit(r, param);
        if(!r.getExpression().getType().equals(param)){
            new ErrorType("Type of return wrong", r.getLine(),r.getColumn());
        }

        return null;
    }

    public Void visit(While w, Type param) {
        super.visit(w, param);
        if(!w.getCondition().getType().isLogical()) {
            new ErrorType("There isn't a logical type", w.getCondition().getLine(), w.getCondition().getColumn());
        }
        return null;
    }

    // ------------------ DEFINITIONS ---------------------
    public Void visit(FuncDefinition fd, Type param) {
        super.visit(fd, param);
        // Falta el asignar type
        return null;
    }
}
