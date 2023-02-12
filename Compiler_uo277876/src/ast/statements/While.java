package ast.statements;

import ast.Expression;
import ast.Statement;

import javax.swing.plaf.nimbus.State;
import java.util.List;

public class While extends AbstractStatement {

    private Expression condition;
    private List<Statement> statements;

    public While(Expression condition, List<Statement> statements, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.statements = statements;
    }

    public Expression getCondition(){
        return condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
