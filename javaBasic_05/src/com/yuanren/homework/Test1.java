package com.yuanren.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("输入一个小于8位的整数：");
            int number = sc.nextInt();
            if (number > 0 && number < 100000000) {
                int number2=number;
                int count=0;
                while(number>0){
                    number=number/10;
                    count++;
                }
                int[] array=new int[count];
                int count2=0;
                while(number2>0){
                    array[count2]=(number2%10+5)%10;
                    number2=number2/10;
                    count2++;
                }
                String str="";
                int temp=array[0];
                array[0]=array[array.length-1];
                array[array.length-1]=temp;
                for (int i = 0; i < array.length; i++) {
                    str+=array[i];
                }
                System.out.println(str);
                break;
            } else {
                System.out.println("输入8位数以内的正整数。");
            }
        }

        /* *//* 1.去除上述数组中的重复数据，并且对去除之后的数组进行排序*//*
        int[] array={10,1,61,89,36,35,55,61,35,88,89};
        //首先排序
        sort(array);
        System.out.println(Arrays.toString(array));
        //然后去除重复
        array=deWeight(array);
        System.out.println(Arrays.toString(array));*/

    }



    //扩容操作
    public static int[] dilatation(int[] array){
        int[] newArray=new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i];
        }
        return newArray;
    }

    //去重操作
    public static int[] deWeight(int[] array) {
        //先扩容
        int[] addSizeArray=new int[0];
        if (addSizeArray.length==0){
            addSizeArray=new int[addSizeArray.length+1];
        }else {
            addSizeArray = dilatation(addSizeArray);
        }
        //赋值操作
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]==array[j]){
                    break;
                }else {
                    addSizeArray[addSizeArray.length-1]=array[i];
                    addSizeArray = dilatation(addSizeArray);
                    break;
                }
            }
            if(i== array.length-1){
                addSizeArray[addSizeArray.length-1]=array[i];
            }

        }
        return addSizeArray;
    }

    //从小到大排序
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                int temp=array[j];
                if(array[j]>array[j+1]){
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }


}
