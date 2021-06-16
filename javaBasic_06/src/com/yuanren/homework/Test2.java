package com.yuanren.homework;

public class Test2 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setModel("马自达");
        car.setBrand("h1");
        car.setLength(2.4);
        car.setHeight(1.6);
        car.setColor("白色");
        Car car2=new Car();
        car2.setModel("奔驰");
        car2.setBrand("h4");
        car2.setLength(2.9);
        car2.setHeight(1.5);
        car2.setColor("黑色");
        System.out.println(car.toString()+"\t"+car2.toString());

    }
}
