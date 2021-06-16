package com.yuanren.homework;

public class Cat {
   /*编写一个Cat类,属性有 姓名 性别 年龄 行为有:抓老鼠;创建两个不同的对象,对对象进行赋值，然后调用输出信息的方法*/
    private String name;
    private char sex;
    private int age;

    public void catchMouse(){
        System.out.println("正在抓老鼠。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}
