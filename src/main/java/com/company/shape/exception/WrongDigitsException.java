package com.company.shape.exception;

public class WrongDigitsException extends Exception{

    public WrongDigitsException() {
    }

    public WrongDigitsException(String message) {
        super(message);
    }

    public WrongDigitsException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDigitsException(Throwable cause) {
        super(cause);
    }
}
