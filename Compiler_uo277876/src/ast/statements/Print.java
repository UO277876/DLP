package ast.statements;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class Print extends AbstractStatement {

    private List<Expression> expressions;

    public Print(List<Expression> expressions, int line, int column) {
        super(line, column);
        this.expressions = expressions;
    }

    public List<Expression> getExpressions(){
        return expressions;
    }
}
