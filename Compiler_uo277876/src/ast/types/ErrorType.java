package ast.types;

import errorhandler.ErrorHandler;
import semantic.Visitor;

public class ErrorType extends AbstractType{

    private String message;

    public ErrorType(String message, int line, int column){
        super(line,column);
        this.message = message;

        ErrorHandler.getInstance().addError(this);
    }

    public String getMessage() {
        return message;
    }

    public String toString(){
        return "Error: " + message;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
