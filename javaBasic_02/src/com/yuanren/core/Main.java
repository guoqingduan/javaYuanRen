package com.yuanren.core;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        *1.判断输入的月份是哪一个季节
        */
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份：");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("在春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("在夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("在秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("在冬季");
                break;
            default:
                System.out.println("出现了其他情况");
                break;
        }


        /*
        *2.请输入任意月份，任意天数，判断是这一年过去了第几天
        */
        System.out.println("请输入月份：");
        int month1=scanner.nextInt();
        int number=0;
        int day;
        switch (month1){
            case 1:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number+=day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 2:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=28){
                    number=31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 3:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 4:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=30){
                    number=31+28+31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 5:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+31+30+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 6:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=30){
                    number=31+28+31+30+31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 7:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+31+30+31+30+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 8:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+31+30+31+30+31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 9:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=30){
                    number=31+28+31+30+31+30+31+31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 10:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+31+30+31+30+31+31+30+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 11:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=30){
                    number=31+28+31+30+31+30+31+31+30+31+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            case 12:
                System.out.println("请输入天数：");
                day=scanner.nextInt();
                if(day>=1&&day<=31){
                    number=31+28+31+30+31+30+31+31+30+31+30+day;
                }else{
                    System.out.println("出现了其他情况");
                }
                break;
            default:
                System.out.println("出现了其他情况");
                break;
        }
        System.out.println("这一年过去了"+number+"天。");

    }
}
