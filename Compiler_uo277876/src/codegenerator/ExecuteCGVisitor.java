package codegenerator;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definitions.*;
import ast.statements.*;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void,Void> {

    private AddressCGVisitor av;
    private ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg); // Para tener un CodeGenerator común a los 3 visitors se le deja al Abstract
        this.vv = new ValueCGVisitor(cg);
        this.av = new AddressCGVisitor(cg, vv);
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
    /**
     execute[[Print: statement -> expressions*]]()=
         for(Expresion expr : expressions*){
            value[[expr]]
            <out> expr.type.suffix
         }
     **/
    @Override
    public Void visit(Print p, Void params) {
        for(Expression expr : p.getExpressions()){
            expr.accept(vv,params);
            cg.out(expr.getType());
        }
        return null;
    }

    /**
     execute[[Input: statement -> expressions*]]()=
         for(Expresion expr : expressions*){
             address[[expr]]
             <in> expr.type.suffix
             <store> expr.type.suffix
        }
     **/
    @Override
    public Void visit(Input i, Void params) {
        for(Expression expr : i.getExpressions()){
            expr.accept(av,params);
            cg.in(expr.getType());
            cg.store(expr.getType());
        }
        return null;
    }

    /**
     execute[[Return: statement -> expression]]()=
     **/
    @Override
    public Void visit(Return r, Void params) {
        return null;
    }

    /**
    execute[[Assignment: statement -> expression1 expression2]]() =
        address[[expression1]]()
        value[[expression2]]()
        <store>expression1.type.suffix
     */
    public Void visit(Assignment a, Void params) {
        a.getLeft().accept(this.av, params);
        a.getRight().accept(this.vv, params);
        cg.store(a.getLeft().getType());
        return null;
    }

    /**
     execute[[While: statement1 -> expression statement2*]]() =
        int condition = cg.getLabels();
        int end = cg.getLabels();
        <label> condition <:>
        value[[expression]]()
        <jz label> end
        for(Statement st : statement2*){
            execute[[statement]]()
        }
        <jmp label> condition
        <label> end <:>
     */
    public Void visit(While w, Void params) {
        int condition = cg.getLabels();
        int end = cg.getLabels();

        w.getCondition().accept(vv,params);

        for(Statement st : w.getStatements()){
            st.accept(this,params);
        }


        return null;
    }

    /**
     execute[[Conditional: statement1 -> expression statement2* statement3*]]() =
         int else = cg.getLabels();
         int end = cg.getLabels();
         <label> condition <:>
         value[[expression]]()
         <jz label> else
         for(Statement st : statement2*){
            execute[[statement]]()
         }
         <jmp label> end
         <label> else <:>
         for(Statement st : statement3*){
            execute[[statement]]()
         }
         <label> end <:>
     */
    public Void visit(Conditional c, Void params) {

        return null;
    }

}
