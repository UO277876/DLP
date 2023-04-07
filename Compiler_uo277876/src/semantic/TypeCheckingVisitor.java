package semantic;

import ast.Expression;
import ast.definitions.FuncDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.CharType;
import ast.types.DoubleType;
import ast.types.ErrorType;
import ast.types.IntType;

public class TypeCheckingVisitor<TP,TR> extends AbstractVisitor<TP,TR> {

    // ------------------ EXPRESSIONS ---------------------
    @Override
    public TR visit(Arithmetic a, TP params) {
        super.visit(a,params);
        a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(),a));
        a.setLValue(false);
        return null;
    }

    @Override
    public TR visit(ArrayAccess ac, TP params) {
        super.visit(ac,params);
        ac.setType(ac.getExpression1().getType().squareBrackets(ac.getExpression2().getType(),ac));
        ac.setLValue(true);
        return null;
    }

    @Override
    public TR visit(Cast c, TP params) {
        super.visit(c,params);
        c.setType(c.getType().canBeCastTo(c.getExpression().getType(),c));
        c.setLValue(false);
        return null;
    }

    @Override
    public TR visit(CharLiteral cl, TP params) {
        super.visit(cl,params);
        cl.setType(new CharType());
        cl.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Comparator c, TP params) {
        super.visit(c,params);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(),c));
        c.setLValue(false);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation fi, TP params) {
        super.visit(fi,params);
        fi.setType(fi.getFunction().getType().parenthesis(fi.getParameters(),fi));
        fi.setLValue(false);
        return null;
    }

    @Override
    public TR visit(IntLiteral il, TP params) {
        super.visit(il,params);
        il.setType(new IntType());
        il.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Logical l, TP params) {
        super.visit(l,params);
        l.setType(l.getLeft().getType().logic(l.getRight().getType(),l));
        l.setLValue(false);
        return null;
    }

    @Override
    public TR visit(RealLiteral rl, TP params) {
        super.visit(rl,params);
        rl.setType(new DoubleType());
        rl.setLValue(false);
        return null;
    }

    @Override
    public TR visit(StructAccess sa, TP params) {
        super.visit(sa,params);
        sa.setType(sa.getExpression().getType().dot(sa.getName(),sa));
        sa.setLValue(true);
        return null;
    }

    @Override
    public TR visit(UnaryMinus um, TP params) {
        super.visit(um,params);
        um.setType(um.getExpression().getType().arithmeticUnary(um));
        um.setLValue(false);
        return null;
    }

    @Override
    public TR visit(UnaryNot un, TP params) {
        super.visit(un,params);
        un.setType(un.getExpression().getType().logic(un));
        un.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Variable v, TP params) {
        super.visit(v,params);
        v.setType(v.getDefinition().getType());
        v.setLValue(true);
        return null;
    }

    // ------------------ STATEMENTS ---------------------
    @Override
    public TR visit(Assignment a, TP params) {
        super.visit(a,params);
        a.getLeft().setType(a.getLeft().getType().mustBePromoteTo(a.getRight().getType(),a));
        if(!a.getLeft().getLValue()){
            new ErrorType("Cannot assign to the left anything that is not a variable or lValue",
                    a.getLine(), a.getColumn());
        }
        return null;
    }

    @Override
    public TR visit(Conditional c, TP param) {
        super.visit(c, param);
        if(!c.getCondition().getType().isLogical()) {
            new ErrorType("There isn't a logical type", c.getCondition().getLine(), c.getCondition().getColumn());
        }
        return null;
    }

    @Override
    public TR visit(Input in, TP params) {
        // No se hace el super porque para evaluar se tiene que recorrer el árbol
        boolean valid = true;
        for (Expression e : in.getExpressions()) {
            e.accept(this, params);
            if (!e.getLValue())
                valid = false;
        }
        if (!valid)
            new ErrorType("Variables not found", in.getLine(), in.getColumn());

        // Falta el asignar type
        return null;
    }

    @Override
    public TR visit(Print p, TP params) {
        boolean valid = true;
        for (Expression e : p.getExpressions()) {
            e.accept(this, params);
            if (!e.getLValue())
                valid = false;
        }
        if (!valid)
            new ErrorType("Variables not found", p.getLine(), p.getColumn());

        // Falta el asignar type
        return null;
    }

    @Override
    public TR visit(Return r, TP param) {
        super.visit(r, param);
        // Falta el asignar type
        return null;
    }

    public TR visit(While w, TP param) {
        super.visit(w, param);
        if(!w.getCondition().getType().isLogical()) {
            new ErrorType("There isn't a logical type", w.getCondition().getLine(), w.getCondition().getColumn());
        }
        return null;
    }

    // ------------------ DEFINITIONS ---------------------
    public TR visit(FuncDefinition fd, TP param) {
        super.visit(fd, param);
        // Falta el asignar type
        return null;
    }
}
