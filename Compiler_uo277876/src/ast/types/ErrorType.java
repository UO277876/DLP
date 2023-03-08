package ast.types;

import errorhandler.ErrorHandler;

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

}
