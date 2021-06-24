package com.yuanren.core;

public class TestMain {
    public static void main(String[] args) {
        Person person=new Son1();
        person.sports("蔡徐坤","唱跳");
        Util.getStr(person,"卢小鱼","唱跳");
        person=new Son2();
        person.sports("蔡徐坤","Rap");
        Util.getStr(person,"卢小鱼","Rap");
        person=new Son3();
        person.sports("蔡徐坤","篮球");
        Util.getStr(person,"卢小鱼","篮球");


    }
}
