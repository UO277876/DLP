package ast.expressions;

import ast.Expression;

import java.util.List;

public class FunctionInvocation extends AbstractExpression {

    private Variable function;
    private List<Expression> expressions;

    public FunctionInvocation(Variable function, List<Expression> expressions,
                              int line, int column) {
        super(line, column);
        this.function = function;
        this.expressions = expressions;
    }

    public Variable getFunction(){
        return function;
    }

    public List<Expression> getExpressions(){
        return expressions;
    }

}
