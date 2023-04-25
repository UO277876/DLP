package codegenerator;

import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.statements.Print;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void> {

    private ValueCGVisitor vv;

    public AddressCGVisitor(CodeGenerator cg, ValueCGVisitor vv) {
        super(cg);
        this.vv = vv;
    }

    /**
     address[[Variable: expression -> ID]]()=
         address[[expression]]()
         <load> expression.type.suffix()
     **/
    @Override
    public Void visit(Variable v, Void params) {
        if(v.getDefinition().getScope() == 0){ // SI ES UNA VARIABLE GLOBAL
            cg.pusha((VarDefinition) v.getDefinition().);
        } else {
            cg.pushBP();
            cg.pushi();
            cg.add(v.getType());
        }
        return null;
    }


}
