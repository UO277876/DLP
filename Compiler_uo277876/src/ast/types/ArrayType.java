package ast.types;

import ast.ASTNode;
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
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type squareBrackets(Type t, ASTNode node){
        if(t instanceof IntType) {
            return of;
        }

        return super.squareBrackets(t,node);
    }

    @Override
    public int numberOfBytes(){
        return of.numberOfBytes() * size; // Hay que reserva el número de bytes que ocupa su tipo * el tamaño del array
    }

    @Override
    public String toString(){
        return "ArrayType[" +
                "of:" + of +
                ",size:" + size +
                "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
