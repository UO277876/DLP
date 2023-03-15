package ast.types;

import ast.Type;
import semantic.Visitor;

public class ArrayType extends AbstractType{

    private int size;
    private Type of;

    public ArrayType(int size, Type of) {
        super(0, 0);
        this.size = size;
        this.of = of;
    }

    public int getSize(){
        return size;
    }
    public Type getType(){
        return of;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
