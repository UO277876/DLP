package semantic;

import ast.Expression;
import ast.expressions.*;
import ast.statements.*;
import ast.types.ErrorType;

public class TypeCheckingVisitor<TP,TR> extends AbstractVisitor<TP,TR> {

    // ------------------ EXPRESSIONS ---------------------
    @Override
    public TR visit(Arithmetic a, TP params) {
        super.visit(a,params);
        a.setLValue(false);
        return null;
    }

    @Override
    public TR visit(ArrayAccess ac, TP params) {
        super.visit(ac,params);
        ac.setLValue(true);
        return null;
    }

    @Override
    public TR visit(Cast c, TP params) {
        super.visit(c,params);
        c.setLValue(false);
        return null;
    }

    @Override
    public TR visit(CharLiteral cl, TP params) {
        super.visit(cl,params);
        cl.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Comparator c, TP params) {
        super.visit(c,params);
        c.setLValue(false);
        return null;
    }

    @Override
    public TR visit(FunctionInvocation fi, TP params) {
        super.visit(fi,params);
        fi.setLValue(false);
        return null;
    }

    @Override
    public TR visit(IntLiteral il, TP params) {
        super.visit(il,params);
        il.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Logical l, TP params) {
        super.visit(l,params);
        l.setLValue(false);
        return null;
    }

    @Override
    public TR visit(RealLiteral rl, TP params) {
        super.visit(rl,params);
        rl.setLValue(false);
        return null;
    }

    @Override
    public TR visit(StructAccess sa, TP params) {
        super.visit(sa,params);
        sa.setLValue(true);
        return null;
    }

    @Override
    public TR visit(UnaryMinus um, TP params) {
        super.visit(um,params);
        um.setLValue(false);
        return null;
    }

    @Override
    public TR visit(UnaryNot un, TP params) {
        super.visit(un,params);
        un.setLValue(false);
        return null;
    }

    @Override
    public TR visit(Variable v, TP params) {
        super.visit(v,params);
        v.setLValue(true);
        return null;
    }

    // ------------------ STATEMENTS ---------------------
    @Override
    public TR visit(Assignment a, TP params) {
        super.visit(a,params);
        if(!a.getLeft().getLValue()){
            new ErrorType("Cannot assign to the left anything that is not a variable or lValue",
                    a.getLine(), a.getColumn());
        }
        return null;
    }

    @Override
    public TR visit(Input in, TP params) {
        boolean valid = true;
        for (Expression e : in.getExpressions()) {
            e.accept(this, params);
            if (!e.getLValue())
                valid = false;
        }
        if (!valid)
            new ErrorType("Variables not found", in.getLine(), in.getColumn());
        return null;
    }
}
