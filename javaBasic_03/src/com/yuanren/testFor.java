package com.yuanren;

import java.util.Scanner;

public class testFor {
    public static void main(String[] args){
        /**
         * 手动输入两个数number1,number2求这两个数中的所有偶数，求偶属的个数
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int number1=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int number2=scanner.nextInt();
        int max=number1;
        if(max<number2){
            max=number2;
        }
        int min=number2;
        if(min>number1){
            min=number1;
        }
        int count=0;
        for(int i=min;min<=max;min++){
            if(min%2==0){
                System.out.println("偶数是："+min);
                count++;
            }
        }
        System.out.println("有"+count+"个偶数。");


        /**
         * 手动输入两个数number1,number2求这两个数中的所有奇数和
         */
        System.out.println("请输入第一个数：");
        int number3=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int number4=scanner.nextInt();
        max=number3;
        if(max<number4){
            max=number4;
        }
        min=number4;
        if(min>number3){
            min=number3;
        }
        int sum=0;
        for(int i=min;min<=max;min++){
            if(min%2==1){
                System.out.println("奇数是："+min);
                sum+=min;
            }
        }
        System.out.println(number3+"和"+number4+"之间的奇数和为"+sum);

        /**
         * 手动输入三个数，求这三个数中的最大值
         */
        System.out.println("请输入第一个数：");
        number1=scanner.nextInt();
        System.out.println("请输入第二个数：");
        number2=scanner.nextInt();
        System.out.println("请输入第三个数：");
        number3=scanner.nextInt();
        max=number1;
        if(max<number2){
            max=number2;
        }
        if(max<number3){
            max=number3;
        }
        System.out.println("三个数中的最大值为"+max);
        /**
         * 手动输入0~9之间的数，求出现的偶数的次数，如果输入的数小于0或者是大于9，程序结束
         */
        int cout=0;
        while(true){
            System.out.println("请输入一个0~9的数字");
            number1=scanner.nextInt();
           if(number1>=0&&number1<=9) {
               if (number1 % 2 == 0) {
                   cout++;
               }
               System.out.println("偶数出现了" + cout + "次。");
           }else {
               System.out.println("您输入的数据过大!");
               break;
           }
        }



    }
}

