package codegenerator;

import ast.*;
import ast.definitions.*;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition,Void> {

    private AddressCGVisitor av;
    private ValueCGVisitor vv;

    public ExecuteCGVisitor(CodeGenerator cg) {
        super(cg); // Para tener un CodeGenerator común a los 3 visitors se le deja al Abstract
        this.vv = new ValueCGVisitor(cg);
        this.av = new AddressCGVisitor(cg);

        vv.setValueCGVisitor(av);
        av.setAddressCGVisitor(vv);
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
    public Void visit(Program p, FuncDefinition params) {
        cg.comment("Global variables:");
        for (Definition def : p.getDefinitions()) {
            if (def instanceof VarDefinition)
            {
                def.accept(this, params);
            }
        }
        cg.comment_specific("Invocation main function");
        cg.mainCall();
        cg.halt();
        for (Definition def : p.getDefinitions()) {
            if (def instanceof FuncDefinition){
                def.accept(this, params);
            }
        }
        return null;
    }

    // ------------------ DEFINITIONS Y FUNCTION (en general) -------------------

    /**
     execute[[FuncDefinition: definition1 -> type ID definition2* statement*]]()=
        execute[[type]]()
        localVariables = 0;
        fd.localVariablesBytes = -definition2*.get(definition2*.size - 1).offset

        for(Statement st : statement*){
            execute[[st]]()
        }
     **/
    @Override
    public Void visit(FuncDefinition fd, FuncDefinition params) {
        cg.comment("Parameters:");
        fd.getType().accept(this,params);

        cg.comment("Local variables:");
        int localVariables = 0;
        localVariables = -fd.getVarDefinitions().get(fd.getVarDefinitions().size() - 1).getOffset();
        cg.enter(localVariables);

        for(Statement st : fd.getStatements()){
            st.accept(this,params);
        }


        return null;
    }

    /**
     execute[[FuncInvocation: expression1 -> expression2 expression3*]]()=
        value[[(Expression) FuncInvocation]]()
        if(!(FuncInvocation.type instanceof VoidType)){
            <pop> FuncInvocation.type.suffix
        }
     **/
    @Override
    public Void visit(FunctionInvocation fi, FuncDefinition params) {
        fi.accept(vv,null);
        if(!(fi.getType() instanceof VoidType)){
            cg.pop(fi.getType());
        }
        return null;
    }

    /**
         execute[[VarDefinition: definition -> ID type]]()=
            < ' * > ID name <(offset > definition.offset <)>
     **/
    @Override
    public Void visit(VarDefinition vd, FuncDefinition params) {
        cg.comment(vd.getType().toString() + " " + vd.getName()
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
    public Void visit(Print p, FuncDefinition params) {
        cg.comment("Write");
        for(Expression expr : p.getExpressions()){
            expr.accept(vv,null);
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
    public Void visit(Input i, FuncDefinition params) {
        cg.comment("Read");
        for(Expression expr : i.getExpressions()){
            expr.accept(av,null);
            cg.in(expr.getType());
            cg.store(expr.getType());
        }
        return null;
    }

    /**
     execute[[Return: statement -> expression]](funcDefinition)=
        value[[expression]]()
        <ret> funcDefinition.type.returnType.numberOfBytes <,>
              funcDefinition.bytesLocalsSum <,>
              funcDefinition.type.bytesParamsSum <,>
     **/
    @Override
    public Void visit(Return r, FuncDefinition params) {
        r.getExpression().accept(vv,null);
        FunctionType funcType = ((FunctionType) params.getType());

        cg.ret(funcType.getReturnType().numberOfBytes(),
                params.getBytesLocalsSum(),
                funcType.getBytesParamsSum()
        );

        return null;
    }

    /**
    execute[[Assignment: statement -> expression1 expression2]]() =
        address[[expression1]]()
        value[[expression2]]()
        <store> expression1.type.suffix
     */
    public Void visit(Assignment a, FuncDefinition params) {
        a.getLeft().accept(this.av, null);
        a.getRight().accept(this.vv, null);
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
    public Void visit(While w, FuncDefinition params) {
        int condition = cg.getLabels();
        int end = cg.getLabels();
        cg.label("label" + condition);
        cg.comment_specific("condition");
        w.getCondition().accept(vv,null);
        cg.jz("label" + end);
        cg.comment_specific("while body");
        for(Statement st : w.getStatements()){
            st.accept(this,params);
        }
        cg.jmp("label" + condition);
        cg.label("label" + end );
        return null;
    }

    /**
     execute[[Conditional: statement1 -> expression statement2* statement3*]]() =
         int else_invocation = cg.getLabels();
         int end = cg.getLabels();
         <label> condition <:>
         value[[expression]]()
         <jz label> else
         for(Statement st : statement2*){
            execute[[statement]]()
         }
         <jmp label> end
         <label> else_invocation <:>
         for(Statement st : statement3*){
            execute[[statement]]()
         }
         <label> end <:>
     */
    public Void visit(Conditional c, FuncDefinition params) {
        int else_invocation = cg.getLabels();
        int end = cg.getLabels();
        //cg.label("condition" + );
        cg.comment_specific("condition");
        c.getCondition().accept(vv,null);
        cg.jz("label" + else_invocation);
        cg.comment_specific("if body");
        for(Statement st : c.getIfStatements()){
            st.accept(this,params);
        }
        cg.jmp("label" + end);
        cg.label("label" + else_invocation);
        cg.comment_specific("else body");
        for(Statement st : c.getElseStatements()){
            st.accept(this,params);
        }
        cg.label("end" + end);
        return null;
    }

    /**
     execute[[FunctionType: type1 -> type2 definitions*]]() =
         for(VarDefinition def : definitions*){
            execute[[def]]();
        }
     */
    public Void visit(FunctionType ft, FuncDefinition params) {
        for(VarDefinition varDef : ft.getParameters()){
            varDef.accept(this,params);
        }
        return null;
    }
}
