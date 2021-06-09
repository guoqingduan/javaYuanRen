package com.yuanren.sort;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        /*
        *去除数组中的重复值，并且对之后的数组进行排序
        */
        int[] arr={10,1,61,89,36,35,55,61,35,88,89};
        for (int i = arr.length-1; i >0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]) {
                    arr[i]++;
                }
                int temp=arr[i];
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        printArray(arr);
        printArray(tailSwap(arr));
        String[] strArray=new String[10];
        strArray[0]="张三";
        strArray[2]="李四";
        strArray[4]="王五";
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入要添加的数据: ");
        String num=scanner.next();
        System.out.println("输入要添加的位置: ");
        int index=scanner.nextInt();
        add(strArray,num,index);
        System.out.println(Arrays.toString(strArray));
        System.out.println("输入要删除的位置: ");
        index=scanner.nextInt();
        delete(strArray,index);
        System.out.println(Arrays.toString(strArray));
        System.out.println("输入乘法的第一位数: ");
        int n1=scanner.nextInt();
        System.out.println("输入乘法的第二位数: ");
        int n2=scanner.nextInt();
        System.out.println(multiply(n1,n2));


    }

    /*将数组中的数据进行首尾交换*/
    public static int[] tailSwap(int[] array){
        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        return array;
    }
   /*输出数组*/
    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.print(array[i]+"]");
            }else {
                System.out.print(array[i]+",");
            }
        }
        System.out.println("");
    }
    /*### 3.对指定的数组里面的数据做添加，删除操作 提供以下方法
```java
//在做此练习时，要考虑数组的的长度是否足够新添加的数据存放*/

    /**
     arr 目标数组
     number 要添加的数据
     index  指定的位置
     */
    public  static  String [] add(String [] arr,String number,int index){

        arr[index-1]=number;
        return arr;
    }

    /**
     arr 目标数组
     number 要删除的数据的下标
     */

    public static  String [] delete(String [] arr,int number){
        arr[number-1]=null;
        return arr;
    }

    /*4. 编写一个方法不使用 * 完成两个数相乘*/
    public static int multiply(int n1, int n2) {
        int sumber=0;
        for (int i = 0; i < n2; i++) {
            sumber+=n1;
        }
        return sumber;
    }





}
