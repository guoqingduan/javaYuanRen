package com.yuanren.homework;

public class Test1 {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("汤姆");
        cat.setSex('男');
        cat.setAge(15);
        Cat cat2=new Cat();
        cat2.setName("布鲁斯");
        cat2.setSex('男');
        cat2.setAge(18);
        System.out.println(cat.toString());
        System.out.println(cat2.toString());
    }
}
