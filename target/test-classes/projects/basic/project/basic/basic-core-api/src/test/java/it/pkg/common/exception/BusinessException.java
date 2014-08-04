package it.pkg.common.exception;

/**
 * Created by IntelliJ IDEA.
 * User: rdobrzynski
 * Date: 30.07.14
 * Time: 09:53
 */
public class BusinessException extends Exception {

    private Object[] args;

    public BusinessException(String message, Object... args) {
        super(message);
        this.args = args;
    }

     public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
