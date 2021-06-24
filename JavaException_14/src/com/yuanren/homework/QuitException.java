package com.yuanren.homework;

public class QuitException extends CalculatorException{
    public QuitException() {
        super();
    }

    public QuitException(String message) {
        super(message);
    }
}
