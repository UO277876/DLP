package ast.statements;

import ast.Expression;
import semantic.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
