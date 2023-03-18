package ast;

public interface Expression extends ASTNode {
    public void setLValue(boolean lvalue);
    public boolean getLValue();
}
