package com.yuanren.method;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        //生成一个四位不重复的数字
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int i1 = random.nextInt(10);
        int i2=0;
        int i3=0;
        int i4=0;
        String str="";
        while (true){
            i2 = random.nextInt(10);
            if(i2!=i1){
                break;
            }
        }
        while (true){
            i3 = random.nextInt(10);
            if(i3!=i1&&i3!=i2){
                break;
            }
        }
        while (true){
            i4 = random.nextInt(10);
            if(i4!=i1&&i4!=i2&&i4!=i3){
                break;
            }
        }
        str+=i1+""+i2+""+i3+""+i4;
        System.out.println(str);
        while(true){
            //输入四位数
            System.out.println("请输入4个数字：");
            int num=sc.nextInt();
            if(num>=1000&&num<=9999){//判断是否是四位数
                //转换成string
                String str1=String.valueOf(num);
                if(!str1.equals(str)){
                //获取每一位上的数字跟随机数比较。
                int count=0;//几个数字对
                    int count2=0;//位置
                for (int i = 0; i < str1.length(); i++) {

                    for (int j = 0; j < str.length(); j++) {
                        if (str1.charAt(i) == str.charAt(j)) {
                            count++;
                            if(i==j){
                                count2++;
                            }
                        }
                    }
                }
                    System.out.println("包含了"+count+"个正确的数字");
                    System.out.println(count2+"个数字的位置正确");
                }else {
                    System.out.println("回答正确");
                    break;
                }
            }else {
                System.out.println("输入的数据有误！");
            }
        }
    }
}
