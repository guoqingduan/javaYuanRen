package com.yuanren.homework;

public class IllegalInputException extends CalculatorException{
    private static String exceptionType;

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }

    public IllegalInputException() {
        super();
    }

    public IllegalInputException(String message) {
        super(message);
    }
}
