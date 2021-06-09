package com.yuanren.sort;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort2 {

    public static void main(String[] args) {
         /*编写一个main方法用来测试上述两个方法，定义一个数组，内容 {13,26,-3,4,54,26,37,18,69,-10}，
        编写一个print方法，使用字符串拼接的方式，将数组内容数组输出为如下格式，每5个换行
        [0]=13 [1]=26 [2]=-1 [3]=4 [4]=54
        [5]=26 ....*/
        int[] array={13,26,-3,4,54,26,37,18,69,-10};
        print(array);
       /* 编写一个sortArr方法*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入布尔值：");
        sort(array,scanner.nextBoolean());



    }
    public static void print(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("["+i+"]="+arrays[i]+" ");
            if((i+1)%5==0){
                System.out.println();
            }
        }
    }
    /**
     * 根据传入的参数来将数组升序或降序排列
     *
     * @param isAsc true 升序， false 降序
     * @param arr
     */
    static void sort(int arr[], boolean isAsc) {

        if(isAsc){
            for (int i = arr.length-1; i >0; i--) {
                for (int j = 0; j < i; j++) {
                    int temp=arr[i];
                    if(arr[i]<arr[j]){
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }else{
            for (int i = arr.length-1; i >0; i--) {
                for (int j = 0; j < i; j++) {
                    int temp=arr[i];
                    if(arr[i]>arr[j]){
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }



}
