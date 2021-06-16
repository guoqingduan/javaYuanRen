package com.yuanren.core;

public class Elephant {
//封装:将相同类型的模板进行提取到一个类中，私有化属性公有化方法

    private double height = 3.5;
    private double weight = 2000;
    private String name = "小三";
    private char sex = '雄';
    private int age = 5;  //全局变量

    public void setHeight(double newHeight){
        if(newHeight>0&&newHeight<=4){
            height=newHeight;
        }else {
            System.out.println("体重有误。。。");
        }
    }

    public void setWeight(double newWeight){
        if(newWeight>0&&newWeight<=8000){
            weight=newWeight;
        }else {
            System.out.println("身高有误。。。");
        }
    }

    public void setName(String newName){
        name=newName;
    }

    

    public void setSex(char newSex){
        if(newSex=='雄'&&newSex=='母'){
            sex=newSex;
        }else {
            System.out.println("性别有误。。。");
        }
    }

    public  double getHeight(){
        return height;
    }
    public  double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public char getSex(){
        return sex;
    }


    //提供一个共有的方法  对其进行赋值
    public  void   setAge(int newAge){
        if(newAge >0 && newAge<= 15){
            age=newAge;
        }else{
            System.out.println("年龄有误...");
        }
    }
    //提供一个公有化的访问方法
    public   int  getAge(){
        return age;
    }

    /**
     * 体重  身高  姓名   年龄    性别
     * <p>
     * 表演   进食    繁衍行为  睡觉  ....
     */

    public void show() {
        System.out.println("大象在表演穿针引线");
    }

    public void eat() {
        System.out.println("大象在进食...");
    }

    public void Fy() {
        System.out.println("大象在繁衍...");
    }

}


class Person {

    /**
     * 属性  (定义的一些变量)
     * 行为（功能  方法  函数）
     */

    //car   颜色      车长度    车子马力  出厂日期   材质   品牌

    //车子的功能    driver     调节温度   玻璃清洁   播放音频  ....

    // 身高    体重   性别   年龄  血型   肤色   身份证(姓名  身份号   民族  出生年月  户口所在地 国籍  身份证颁发所属机关 头像  有效期)
    //属性：普通攻击    防御   移速   血量  姓名   身高    体重   性别   年龄   jax

    //功能  打架    逃跑   插眼    买装备   ....


}
