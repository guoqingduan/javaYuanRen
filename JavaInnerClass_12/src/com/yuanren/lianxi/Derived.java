package com.yuanren.lianxi;

public class Derived{
    abstract class B
    {
        abstract void method();
    }

    {
        new B() {
            @Override
            void method(){
                System.out.println("BBB");
            }
        }.method();
    }
}