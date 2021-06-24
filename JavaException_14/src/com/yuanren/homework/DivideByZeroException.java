package com.yuanren.homework;

public class DivideByZeroException extends CalculatorException{
    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
