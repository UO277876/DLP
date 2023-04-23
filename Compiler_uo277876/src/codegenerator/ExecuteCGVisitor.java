package codegenerator;

import ast.Definition;
import ast.Program;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Arithmetic;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {

    private AddressCGVisitor av;
    private ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg); // Para tener un CodeGenerator común a los 3 visitors se le deja al Abstract
        this.vv = new ValueCGVisitor(cg);
        this.av = new AddressCGVisitor(cg);
    }

    /**
        execute[[Program:program -> definitions*]]()=
            for(Definition d: definitons*)
                if (def is VarDefinition)
                    Execute[[def]]()
            <call main>
            <halt>
            for(Definition d: definitons*)
                if (def is FuncDefinition)
                    Execute[[def]]()
     **/
    @Override
    public Void visit(Program p, Void params) {
        for (Definition def : p.getDefinitions()) {
            if (def instanceof VarDefinition)
            {
                def.accept(this, params);
            }
        }
        cg.mainCall();
        cg.halt();
        for (Definition def : p.getDefinitions()) {
            if (def instanceof FuncDefinition){
                def.accept(this, params);
            }
        }
        return null;
    }

    // ------------------ DEFINITIONS -------------------

    /**
    execute[[FuncDefinition: definition1 -> type ID definition2* statement*]]()=
        {ID}<:>
        < ' * Parameters>
        for(Definition d: definiton2*)
            if (def is VarDefinition)
                Execute[[def]]()
        < ' * Local Variables>
     **/
    @Override
    public Void visit(FuncDefinition fd, Void params) {

        return null;
    }

    /**
         execute[[VarDefinition: definition -> ID type]]()=
            < ' * > ID name <(offset > definition.offset <)>
     **/
    @Override
    public Void visit(VarDefinition vd, Void params) {
        cg.comment(vd.getName() + " " + vd.getType()
                + " (offset " + vd.getOffset() + ")");
        return null;
    }

    // ------------------ STATEMENTS -------------------


}
