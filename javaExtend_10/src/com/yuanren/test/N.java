package com.yuanren.test;

public class N extends M{
    public N(int j) {
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}
class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
        System.out.println(n.i);
    }
}