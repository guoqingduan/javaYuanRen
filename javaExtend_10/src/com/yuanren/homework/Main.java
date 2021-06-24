package com.yuanren.homework;

public class Main {
    public static void main(String[] args) {
        Primary primary = new Primary("小米");
        Junior junior = new Junior("小明");
        Senior senior = new Senior("小花");
        System.out.println(senior.getName()+junior.getName()+primary.getName());
       //1. 1 2 3
        //2.Class A Constructor  Class B Constructor  Class C Constructor
        //3.编译报错，因为类A中没有无参构造方法，子类构造方法中没有显式调用父类的构造方法
//4.super();和this()在构造函数中只能是第一行
        //5.编译报错，没有可用的默认构造函数
//6.super();和this()在构造函数中只能是第一行
//7.构造函数不继承   27
//8 51 260 520
//9  不能访问私有的
//10. 1111 2220
//11.1
        //12: 1212 1212 1212 ------ 2121 1212
        //13.200
//14.1212  子类和父类有相同变量名称优先使用子类的
//15.报错  final修饰的类不能被重写   private也不能被同类以外的访问
//16.报错   private也不能被同类以外的访问
//17.报错  super.super.没有这种写法
//18.Complex number is (10.0 + 15.0i)
        //19.Class A  Class B  Class C
        //20.THIRD SECOND  FIRST
        //21.Class Y
        //22.ADBCEF
        //23.AAABBB
//24.101010
        //25.1    191918
        //26.0
        //27.0
        //28.31
        //29.Hi....  Hi....
        //30.-114  109

    }
}
