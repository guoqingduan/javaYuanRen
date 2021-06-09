package com.yuanren;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws Exception{
        /*
         *输入一个正整数，将该数的各位左右反转输出，即输入123，输出321。（使用while循环实现）
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int sum=scanner.nextInt();
        //tailSwap(sum);
        tailSwap2(sum);
        /*现对一个八位数进行加密，每个位上加5得到的和对10进行取余操作，得到的余数进行收尾交换，求最终得到的数据
        如：12345678   87654321  此例子只是作为余数之间的收尾交换演示   String 拼接*/
        System.out.println("输入一个八位数：");
        sum=scanner.nextInt();
        //tailSwap1(sum);
        tailSwap3(sum);
    }
    public static void tailSwap(int number){
        int sum1=number;
        int count=0;
        while(number!=0){
            number=number/10;
            count++;
        }
        System.out.println("是"+count+"位数。");
        String num="";
        int weiShu=0;
        int cheng=1;
        for(int i=0;i<count;i++){
            if (i==0){
                weiShu=sum1%10;
            }else{
                for (int j=1;j<=i;j++){
                    cheng = cheng*10;
                }
                weiShu=sum1/cheng%10;
                cheng=1;
            }
            num=num+weiShu;
        }
        System.out.println(num);
    }

    public static void tailSwap1(int number){
        if(number>=10000000&&number<=99999999){
            String num1="";
            int weiShu1=0;
            int cheng1=1;
            for(int i=0;i<8;i++){
                if (i==0){
                    weiShu1=(number%10+5)%10;
                }else{
                    for (int j=1;j<=i;j++){
                        cheng1 = cheng1*10;
                    }
                    weiShu1=(number/cheng1%10+5)%10;
                    cheng1=1;
                }
                num1=num1+weiShu1;
            }
            System.out.println(num1);
        }else {
            System.out.println("请输入八位数！");
        }
    }

    public static void tailSwap2(int number1)  {
        int i;
        String num1 = "";
        if (number1 <= 0) {
            System.out.println("请输入正数！");
        } else if (number1 < 10) {
            System.out.println("结果： " + number1);
        } else {
            while (number1 > 0) {
                i = number1 % 10;
                number1 = number1 / 10;
                num1 = num1 + i;
            }
            System.out.println("结果： " + num1);
        }
    }
        public static void tailSwap3(int number1) {
            int i;
            String num1 = "";
            if(number1<10000000&&number1>99999999){
                System.out.println("请输入八位数！");
            } else {
                while (number1 > 0) {
                    i = (number1 % 10+5)%10;
                    number1 = number1 / 10;
                    num1 = num1 + i;
                }
                System.out.println("结果： " + num1);
            }
        }

}
