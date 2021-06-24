package com.yuanren.method;

import java.util.Random;
import java.util.Scanner;

public class DrawLots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        while(true){
            int i = random.nextInt(100)+1;
            System.out.println("摇晃竹筒，心诚则灵！");
            int i1 = scanner.nextInt();
            if(i1==0){
                System.out.println("抽签结束！");
                break;
            }else {
                if(i<=5){
                    System.out.println("大吉大利！");
                }else if(i>5&&i<=15){
                    System.out.println("中吉！");
                }else if(i>15&&i<=30){
                    System.out.println("小吉！");
                }else if(i>30&&i<=60){
                    System.out.println("吉！");
                }else if(i>60&&i<=80){
                    System.out.println("末吉！");
                }else if(i>80&&i<=95){
                    System.out.println("凶！");
                }else{
                    System.out.println("大凶之兆！");
                }
            }
        }
    }
}
