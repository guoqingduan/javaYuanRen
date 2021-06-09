package com.yuanren.core;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("哈哈哈哈");
        int Int = 12;
        int a = 5678;
        int ge = a % 10;
        int shi = (a - ge) / 10 % 10;
        int bai = (a - (shi * 10 + ge)) / 100 % 10;
        int qian = a / 1000;
        int number = ge + shi + bai + qian;
        System.out.println(number);

        //补码    反码   正数  负数   格式化
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个年龄：");
        int age1 = scanner.nextInt();
        if (age1 <= 3 && age1 >= 0) {
            System.out.println("婴幼儿。");
        } else if (age1 <= 12 && age1 >= 3) {
            System.out.println("儿童。");
        } else if (age1 <= 17 && age1 >= 12) {
            System.out.println("青年。");
        } else if (age1 >= 28) {
            System.out.println("老年人。");
        }
        System.out.println("输入第二个年龄：");
        int age2 = scanner.nextInt();
        if (age2 <= 3 && age2 >= 0) {
            System.out.println("婴幼儿。");
        } else if (age2 <= 12 && age2 >= 3) {
            System.out.println("儿童。");
        } else if (age2 <= 17 && age2 >= 12) {
            System.out.println("青年。");
        } else if (age2 >= 28) {
            System.out.println("老年人。");
        }
        System.out.println("输入第三个年龄：");
        int age3 = scanner.nextInt();
        if (age3 <= 3 && age1 >= 0) {
            System.out.println("婴幼儿。");
        } else if (age3 <= 12 && age3 >= 3) {
            System.out.println("儿童。");
        } else if (age3 <= 17 && age3 >= 12) {
            System.out.println("青年。");
        } else if (age3 >= 28) {
            System.out.println("老年人。");
        }
        System.out.println("输入第四个年龄：");
        int age4 = scanner.nextInt();
        if (age4 <= 3 && age1 >= 0) {
            System.out.println("婴幼儿。");
        } else if (age4 <= 12 && age4 >= 3) {
            System.out.println("儿童。");
        } else if (age4 <= 17 && age4 >= 12) {
            System.out.println("青年。");
        } else if (age4 >= 28) {
            System.out.println("老年人。");
        }
        System.out.println("输入第五个年龄：");
        int age5 = scanner.nextInt();
        if (age5 <= 3 && age5 >= 0) {
            System.out.println("婴幼儿。");
        } else if (age5 <= 12 && age5 >= 3) {
            System.out.println("儿童。");
        } else if (age5 <= 17 && age5 >= 12) {
            System.out.println("青年。");
        } else if (age5 >= 28) {
            System.out.println("老年人。");
        }


    }
}
