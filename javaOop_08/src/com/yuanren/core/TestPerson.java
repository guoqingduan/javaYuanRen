package com.yuanren.core;

public class TestPerson {
    public static void main(String[] args) {

        int num = Integer.parseInt("ABCDEF", 16);
        System.out.printf("%15d",num);
        System.out.println();
        System.out.println(0xABCDEF);
        Person person=new Person("张三丰",21);
        Person person1=new Person();
        person1.setAge(21);
        person1.setName("法外狂徒");
        System.out.println(person.toString());
        System.out.println(person1.toString());

    }



}
