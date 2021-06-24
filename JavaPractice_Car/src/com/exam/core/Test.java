package com.exam.core;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args)  {
        System.out.println("欢迎进入xxx考试系统");
        Scanner  scanner=new Scanner(System.in);
        while(true){
            try {
                System.out.println("请选择功能:\n 1.请选择登录的身份: \n 2.退出");
                String numberStr = scanner.next();
                int number = Integer.parseInt(numberStr);
                switch (number) {
                    case 1:
                        while (number!=3) {
                            System.out.println(" 1.老师\n 2.学生\n 3.退出（返回上一层）");
                            numberStr = scanner.next();
                            number = Integer.parseInt(numberStr);
                            switch (number) {
                                case 1:
                                    //teacher
                                    Util.showAll_teacher();
                                    break;
                                case 2:
                                    //student
                                    Util.showAll_student();
                                    break;
                                case 3:
                                    //返回上一层
                                    break;
                                default:
                                    System.out.println("请按提示输入，重新输入。");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("退出成功！");
                        System.exit(0);
                    default:
                        System.out.println("请按提示输入，重新输入。");
                }
            }catch (NumberFormatException e){
                    System.out.println("类型不匹配，请重新输入:");
            }
        }
    }

}

