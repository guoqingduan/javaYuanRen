package com.yuanren.homework;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
      /*  3.对指定的数组里面的数据做添加，删除操作 提供以下方法
//在做此练习时，要考虑数组的的长度是否足够新添加的数据存放*/
    String[] str={"海参","海神","海深","还深","变身","编审"};
    str=add(str,"变深",1);
    System.out.println(Arrays.toString(str));
    str=delete(str,2);
    System.out.println(Arrays.toString(str));
    }
    /**
     arr 目标数组
     number 要添加的数据
     index  指定的位置
     */
    public  static  String [] add(String [] arr,String number,int index){
        if(arr==null||number==null){
            return null;
        }
        if(index<=0||index>arr.length){
            return null;
        }

        String[] newArr=new String[arr.length+1];
        for (int i = 0; i < arr.length; i++) {

            newArr[i]=arr[i];
        }
        for (int j = newArr.length-1; j >=index ; j--) {
            newArr[j]=newArr[j-1];
        }
        newArr[index-1]=number;
        return newArr;
    }

    /**
     arr 目标数组
     number 要删除的数据的下标
     */

    public static  String [] delete(String [] arr,int number){
        if(arr==null){
            return null;
        }
        if(number<=0||number>arr.length){
            return null;
        }
        String[] newArr=new String[arr.length-1];
        for (int j = number-1; j <arr.length-1 ; j++) {
            arr[j]=arr[j+1];
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;

    }




}
