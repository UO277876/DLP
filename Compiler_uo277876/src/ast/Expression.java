package ast;

public interface Expression extends ASTNode {
    void setLValue(boolean lvalue);
    boolean getLValue();

}
