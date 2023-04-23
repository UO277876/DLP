package codegenerator;

import ast.Type;
import ast.expressions.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void> {

    private AddressCGVisitor av;

    public ValueCGVisitor(CodeGenerator cg) {
        super(cg);
        this.av = new AddressCGVisitor(cg, this);
    }

    // ------------------ EXPRESSIONS -------------------
    /**
     value[[Arithmetic: expression1 -> expression2 operator=(+|-|*|/|%) expression3]]()=
        value[[expression2]]
        value[expression3]]
        switch(operator):
            case '+':
                <add> expression1.type.suffix
            case '-':
                <sub> expression1.type.suffix
            case '*':
                <mul> expression1.type.suffix
            case '/':
                <div> expression1.type.suffix
            case '/':
                <mod> expression1.type.suffix
     **/
    @Override
    public Void visit(Arithmetic a, Void params) {
        a.getLeft().accept(this, null);
        a.getRight().accept(this,null);
        Type type =  a.getLeft().getType();

        switch (a.getOperator()){
            case "*":
                cg.mul(type);
                break;
            case "/":
                cg.div(type);
                break;
            case "+":
                cg.add(type);
                break;
            case "-":
                cg.sub(type);
                break;
            case "%":
                cg.mod(type);
                break;
        }

        return null;
    }

    /**
     value[[ArrayAccess: expression1 -> expression2 expression3]]()=
        address[[expression1]]
        <load>expression.type.suffix
     **/
    @Override
    public Void visit(ArrayAccess ac, Void params) {
        ac.accept(this.av, null);
        cg.load(ac.getType());
        return null;
    }

    /**
     value[[Cast: expression1 -> type expression2]]()=
        value[[expression2]]
        expression2.type.canBeCast(type)
     **/
    @Override
    public Void visit(Cast c, Void params) {
        c.getExpression().accept(this.av, null);
        
    }

}
