package com.yuanren.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int n=2;
        int m=2;
        Student[][] students=new Student[n][m];
        Scanner scanner=new Scanner(System.in);
        //输入获取二维数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Student student = new Student();
                System.out.println("输入第"+(i+1)+"个班级第"+(j+1)+"个学生的id:");
                student.setId(scanner.nextInt());
                System.out.println("输入第"+(i+1)+"个班级第"+(j+1)+"个学生的名字:");
                student.setName(scanner.next());
                System.out.println("输入第"+(i+1)+"个班级第"+(j+1)+"个学生的分数:");
                student.setScore(scanner.nextDouble());
                students[i][j]=student;
            }
        }
        print(students,n,m);
        //获取分数 降序排序
        for (int i = 0; i < n; i++) {
            //交换
            for (int j = 0; j < m-1; j++) {
                double max=students[i][j].getScore();
                Student student=students[i][j];
                for (int k = j+1; k <m; k++) {
                    if(max<students[i][k].getScore()){
                        students[i][j]=students[i][k];
                        students[i][k]=student;
                        student=students[i][j];
                    }
                }
            }
        }
        print(students,n,m);
        //求出平均分，并且对平均分降序排序
        double[] avgs=new double[n];
        double avg=0;
        for (int i = 0; i < n; i++) {
            double sum=0;
            for (int j = 0; j <m; j++) {
               sum+=students[i][j].getScore();
            }
            avg=sum/m;
            avgs[i]=avg;
        }
        //交换
        for (int i = 0; i < n-1; i++) {
            double max=avgs[i];
            Student[] student=students[i];
            for (int j = i+1; j < n; j++) {
                if(max<avgs[j]){
                    avgs[i]=avgs[j];
                    students[i]=students[j];
                    avgs[j]=max;
                    students[j]=student;
                    max=avgs[i];
                    student=students[i];
                }
            }
        }
        print(students,n,m);

    }
    //输出
    public static void print(Student[][] students,int n,int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(students[i][j].toString()+"\t");
            }
            System.out.println();
        }
    }





}
