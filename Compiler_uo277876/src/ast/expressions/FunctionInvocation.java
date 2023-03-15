package ast.expressions;

import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.List;

public class FunctionInvocation extends AbstractExpression implements Statement {

    private Variable function;
    private List<Expression> parameters;

    public FunctionInvocation(Variable function, List<Expression> parameters,
                              int line, int column) {
        super(line, column);
        this.function = function;
        this.parameters = parameters;
    }

    public Variable getFunction(){
        return function;
    }

    public List<Expression> getParameters(){
        return parameters;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
