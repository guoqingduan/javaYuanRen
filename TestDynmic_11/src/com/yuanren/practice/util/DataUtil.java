package com.yuanren.practice.util;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.pojo.Product;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;

public class DataUtil {

    private DataUtil(){

    }
    //当成数据库
    public static Business[] businesses = new Business[0];


    /**
     * 扩容的方法
     */
    public  static  void  changeBusinessesArrayLength(){
        businesses=  Arrays.copyOf(businesses,businesses.length+1);
    }



    /**
     * 商家注销
     */

    public  static  void  del(Business[] bus){
        businesses=Arrays.copyOf(bus,bus.length-1);
        print();
    }
    /**
     * 产品注销
     */

    public  static  void  del(Product[] products){
        products=Arrays.copyOf(products,products.length-1);
        printProduct2(products);
    }

    /**
     * 打印数据
     */
    public static  void  print(){
        System.out.println(Arrays.toString(businesses));
    }

    /**
     * 打印产品
     */
    public static  void  printProduct(Business business){
        Product[] products = business.getProducts();
        System.out.println(Arrays.toString(products));
    }
    /**
     * 打印产品
     */
    public static  void  printProduct2(Product[] products){
        System.out.println(Arrays.toString(products));
    }
    /**
     * 判断用户名是否存在
     */
    public static boolean isName(String name) {

        for (int i = 0; i < businesses.length; i++) {
            if(name.equals(businesses[i].getName())){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断身份证卡号是否存在
     */
    public static boolean isIDCard(String IDCard) {

        for (int i = 0; i < businesses.length; i++) {
            if(IDCard.equals(businesses[i].getIDCard())){
                return true;
            }
        }
        return false;
    }

    /**
     * 根据身份证卡号返回下标
     */
    public static int intIDCard(String IDCard) {

        for (int i = 0; i < businesses.length; i++) {
            if(IDCard.equals(businesses[i].getIDCard())){
                return i;
            }
        }
        return -1;
    }
    /**
     * 根据用户名和密码返回下标
     */
    public static int login(String name, String password) {

        for (int i = 0; i < businesses.length; i++) {
            if(name.equals(businesses[i].getName()) && password.equals(businesses[i].getPassword())){
                return i;
            }
        }
        return -1;
    }


    /**
     * 判断PID是否存在
     */
    public static boolean isPID(Business business,String pid) {
        boolean b=false;
        for (int i = 0; i < business.getProducts().length; i++) {
            if(pid.equals(business.getProducts()[i].getPid())){
                b=true;
                return true;
            }
        }
        return b;
    }

    /**
     * 根据PID返回下标
     */
    public static int indexPID(Business business,String pid) {
        int index=-1;
        for (int i = 0; i < business.getProducts().length; i++) {
            if(pid.equals(business.getProducts()[i].getPid())){
                index=i;
                return index;
            }
        }
        return index;
    }

    /**
     * 判断PName是否存在
     */
    public static boolean isPName(Business business,String pName) {

        for (int i = 0; i < business.getProducts().length; i++) {
            if(pName.equals(business.getProducts()[i].getpName())){
                return true;
            }
        }
        return false;
    }

    /**
     * 根据PName返回下标数组
     */
    public static int[] indexPName(Business business,String pName) {
        int[] array=new int[0];
        for (int i = 0; i < business.getProducts().length; i++) {
            if(pName.equals(business.getProducts()[i].getpName())){
                array=changeIntLength(array);
                array[array.length-1]=i;
            }
        }
        return array;
    }

    /**
     * 数组扩容
     */
    public static int[] changeIntLength(int[] array){
        int[] ints = Arrays.copyOf(array, array.length + 1);
        return ints;
    }

    /**
     * 数组扩容
     */
    public static Product[] changeProductsLength(Product[] Products){
        Product[] Productss = Arrays.copyOf(Products, Products.length + 1);
        return Productss;
    }

    /**
     * 判断PDate是否存在
     */
    public static boolean isDate(Business business, Date date) {

        for (int i = 0; i < business.getProducts().length; i++) {
            if(date.equals(business.getProducts()[i].getDate())){
                return true;
            }
        }
        return false;
    }

    /**
     * 根据PDate返回下标数组
     */
    public static int[] indexPDate(Business business,Date date) {
        int[] array=new int[0];
        for (int i = 0; i < business.getProducts().length; i++) {
            if(date.equals(business.getProducts()[i].getDate())){
                array=changeIntLength(array);
                array[array.length-1]=i;
            }
        }
        return array;
    }


}
