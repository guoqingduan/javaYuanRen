package com.homwork;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        /*
          打印九九乘法表
         */
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
        /*
          打印出以下图案
         */
        //4行   4列
        //定义循环的总次数
        int count=0;
        for (int i=0;i<4;i++){//4hang
            for (int j=0;j<=i;j++){//
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        /*
          猿人教育有3个java班级，每个java班级有4个人，
          最近进行了一次测试，求每个班级的平均分，并输出平均分最高的分数
         */

        Scanner scanner=new Scanner(System.in);
        int fenShu;
        int sum=0;
        double avg1=0;
        double avg2=0;
        double avg3=0;
        for (int i=1;i<=3;i++){//3个班级
            for (int j=1;j<=4;j++){
                System.out.println("请输入第"+i+"个班级第"+j+"个同学的分数：");
                fenShu=scanner.nextInt();
                sum += fenShu;
            }
            if(i==1){
                avg1=sum/4.0;
                System.out.println("第"+i+"个班级的平均分："+avg1);
            }
            if(i==2){
                avg2=sum/4.0;
                System.out.println("第"+i+"个班级的平均分："+avg2);
            }
            if(i==3){
                avg3=sum/4.0;
                System.out.println("第"+i+"个班级的平均分："+avg3);
            }
            sum=0;
        }
        double max=avg1;
        if(max<avg2){
            max=avg2;
        }
        if(max<avg3){
            max=avg3;
        }
        System.out.println("平均分最高的分数为："+max);
    }
}
