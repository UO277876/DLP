package errorhandler;

import ast.types.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler errorHandler = new ErrorHandler();
    private List<ErrorType> errors;

    public ErrorHandler(){
        this.errors = new ArrayList<ErrorType>();
    }

    public boolean anyError(){
        if(errors.size() != 0){
            return true;
        } else {
            return false;
        }
    }

    public static ErrorHandler getInstance(){
        if (errorHandler == null){
            errorHandler = new ErrorHandler();
        }
        return errorHandler;
    }

    public void showErrors(PrintStream ps){
        for(ErrorType error : errors){
            ps.println(error);
        }
    }

    public void addError(ErrorType et){
        errors.add(et);
    }
}
