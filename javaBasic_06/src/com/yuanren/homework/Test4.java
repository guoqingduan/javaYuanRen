package com.yuanren.homework;

import java.util.Arrays;

public class Test4 {
    //有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
    public static void main(String[] args) {
        int[] randoms=new int[30];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i]=(int)(Math.random()*10);
        }
        int[] newArray=getCountArray(randoms);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(i+"出现的次数是："+newArray[i]);
        }

    }
    public static int[] getCountArray(int[] arr){
        int[] newArr=new int[10];
        for (int i = 0; i <newArr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    newArr[i]++;
                }
            }
        }
        return newArr;
    }


}
