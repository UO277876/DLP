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
        a.getLeft().accept(this, params);
        a.getRight().accept(this,params);
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
        <load>
     **/
    @Override
    public Void visit(ArrayAccess ac, Void params) {
        ac.accept(av,params);
        cg.load(ac.getType());
        return null;
    }

    /**
     value[[Cast: expression1 -> type expression2]]()=
        value[[expression2]]()

     **/
    @Override
    public Void visit(Cast c, Void params) {
        // El convertidor de cast se hace en el codeGenerator
        c.getExpression().accept(this.av, params);
        cg.cast(c);
        return null;
    }

    /**
     value[[CharLiteral: expression -> CHAR]]()=
        <pushb> CHAR
     **/
    @Override
    public Void visit(CharLiteral cl, Void params) {
        cg.pushc(cl.getValue()); // El suffix esta en el método push
        return null;
    }

    /**
     value[[Comparator: expression -> expression2 ('>'|'>='|'<'|'<='|'!='|'==') expression3]]()=
         value[[expression2]]
         value[expression3]]
             switch(operator):
             case '>':
                <gt> expression1.type.suffix
             case '>=':
                <ge> expression1.type.suffix
             case '<':
                <lt> expression1.type.suffix
             case '<=':
                <le> expression1.type.suffix
             case '!=':
                <ne> expression1.type.suffix
            case '==':
                <eq> expression1.type.suffix
     **/
    @Override
    public Void visit(Comparator a, Void params) {
        a.getLeft().accept(this, params);
        a.getRight().accept(this,params);
        Type type =  a.getLeft().getType();

        switch (a.getOperator()){
            case ">":
                cg.gt(type);
                break;
            case ">=":
                cg.ge(type);
                break;
            case "<":
                cg.lt(type);
                break;
            case "<=":
                cg.le(type);
                break;
            case "!=":
                cg.ne(type);
                break;
            case "==":
                cg.eq(type);
                break;
        }

        return null;
    }

    /**
     value[[FunctionInvocation: expression1 -> expression2 expression3*]]()=

     **/
    @Override
    public Void visit(FunctionInvocation fi, Void params) {
        return null;
    }

    /**
     value[[IntLiteral: expression -> INT_LITERAL]]()=
        <pushi> INT_LITERAL
     **/
    @Override
    public Void visit(IntLiteral il, Void params) {
        cg.pushi(il.getValue()); // El suffix esta en el método push
        return null;
    }

    /**
     value[[Logical: expression -> expression2 ('&&'|'||') expression3]]()=
         value[[expression2]]
         value[expression3]]
         switch(operator):
            case '&&':
                <and> expression1.type.suffix
            case '||':
                <or> expression1.type.suffix
     **/
    @Override
    public Void visit(Logical l, Void params) {
        l.getLeft().accept(this, params);
        l.getRight().accept(this,params);
        Type type =  l.getLeft().getType();

        switch (l.getOperator()){
            case "&&":
                cg.and(); // No le hace falta suffix
                break;
            case "||":
                cg.or();
                break;
        }

        return null;
    }

    /**
     value[[RealLiteral: expression -> REAL]]()=
         <pushf> REAL
     **/
    @Override
    public Void visit(RealLiteral rl, Void params) {
        cg.pushf(rl.getValue());
        return null;
    }

    /**
     value[[StructAccess: expression1 -> ID expression2]]()=
        address[[expression1]]
        <load> expression1.type.suffix
     **/
    @Override
    public Void visit(StructAccess sa, Void params) {
        sa.accept(av,params);
        cg.load(sa.getType());
        return null;
    }

    /**
     value[[UnaryMinus: expression1 -> expression2]]()=
        value[[expression2]]
        <pushi> -1
        <mul> expression2.type.suffix
     **/
    @Override
    public Void visit(UnaryMinus um, Void params) {
        // Para hacer el UnaryMinus se mete en la pila un -1 y luego se multiplica el valor de expression2
        // por -1
        um.getExpression().accept(this,params);
        cg.pushi(-1);
        cg.mul(um.getExpression().getType());
        return null;
    }

    /**
     value[[UnaryNot: expression1 -> expression2]]()=
         value[[expression2]]
         <not> expression1.type.suffix
     **/
    @Override
    public Void visit(UnaryNot un, Void params) {
        un.getExpression().accept(this,params);
        cg.not();
        return null;
    }

    /**
     value[[Variable: expression -> ID]]()=
        address[[expression]]()
        <load> expression.type.suffix()
     **/
    @Override
    public Void visit(Variable v, Void params) {
        v.accept(av,params);
        cg.load(v.getType());
        return null;
    }

}

