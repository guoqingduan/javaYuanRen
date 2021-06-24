package com.yuanren.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

    public static void check(int   score) throws MyException {  //可以传递1个以上的字符串

        if (score<0) {
            throw new MyException("分数不合法");
        }
    }

    public static void main(String[] args) throws MyException {

        int   a=12;
        try {
            check(-5);
            a=123;
        } catch (MyException e) {
            throw new MyException();
        }finally {
            a=1237889;
        }
        System.out.println("哈哈啥"+a);



    }
}
