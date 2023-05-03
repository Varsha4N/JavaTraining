package com.targetindia.exceptions;

public class NullNameException extends Exception{

    public NullNameException() {
        super("Name was NULL");
    }

    public NullNameException(String message) {
        super(message);
    }

    public NullNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullNameException(Throwable cause) {
        super(cause);
    }

    public NullNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
