package lesson15.exception;

public class MyException extends Exception {

    private int errorCode;

    public MyException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
