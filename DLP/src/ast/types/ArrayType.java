package ast.types;

import ast.Type;

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

}
