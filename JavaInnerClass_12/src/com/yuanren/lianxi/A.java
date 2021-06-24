package com.yuanren.lianxi;

public interface A {
     void sada();
    }
abstract class A1 {
    abstract void myMethod(Number N);
}

interface B {
    abstract void myMethod(Object O);
}

class C extends A1 implements B {
    public void myMethod(Number N) {
        System.out.println("Number");
    }

    public void myMethod(Object O) {
        System.out.println("Object");
    }
}

class MainClass {
    public static void main(String[] args) {
        A1 a = new C();
        a.myMethod(new Integer(121));
        B b = new C();
        b.myMethod(new Integer(121));
        C c = new C();
        c.myMethod(new Integer(121));
    }
}