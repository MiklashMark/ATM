package org.example.exceptiom;

public class ATMException extends Exception {

    private String message;
    private int errorCode;
    public ATMException(String message) {
        super(message);
    }

    public ATMException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
