package com.yuanren.array;

public class ArrayTest {
    public static void main(String[] args) {
        //使用循环的方式给字符串数组赋值
        String[] str=new String[5];
        for (int i = 0; i <5 ; i++) {
            str[i]="你好！";
            System.out.print(str[i]+"\t");
        }
        System.out.println();
        int a=2;
        int b=3;
        int[] array=arrays(a,b);
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static int[] arrays(int x,int y){
        int[] array=new int[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

}
