package ast.statements;

import ast.Expression;

import java.util.List;

public class Input extends AbstractStatement{

    private List<Expression> expressions;

    public Input(List<Expression> expressions, int line, int column) {
        super(line, column);
        this.expressions = expressions;
    }

    public List<Expression> getExpression(){
        return expressions;
    }
}
