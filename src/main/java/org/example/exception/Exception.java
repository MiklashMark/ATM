package org.example.exception;

public class Exception extends java.lang.Exception {

    private String message;
    private int errorCode;
    public Exception(String message) {
        super(message);
    }

    public Exception(String message, int errorCode) {
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
