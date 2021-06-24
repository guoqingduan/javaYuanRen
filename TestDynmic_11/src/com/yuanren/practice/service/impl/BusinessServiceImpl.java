package com.yuanren.practice.service.impl;

import com.yuanren.practice.pojo.Business;
import com.yuanren.practice.service.BusinessService;
import com.yuanren.practice.util.DataUtil;

import java.util.Scanner;

public class BusinessServiceImpl   extends BusinessService {
    Business[] businesses = DataUtil.businesses;

    //商户登录
    @Override
    public boolean login(String name, String password) {

        for (int i = 0; i < businesses.length; i++) {
            if(name.equals(businesses[i].getName()) && password.equals(businesses[i].getPassword())){
                return true;
            }
        }
        return false;
    }



    //商户注册
    @Override
    public void register(Business business) {
        DataUtil.changeBusinessesArrayLength();
        Business[] businesses = DataUtil.businesses;
        businesses[businesses.length-1]=business;

    }


    //商户删除
    @Override
    public void deleteBusiness(String IDCard) {

        for (int i = 0; i < businesses.length; i++) {
            if(IDCard.equals(businesses[i].getIDCard())){
                businesses[i]=null;
                for (int j = i; j < businesses.length-1; j++) {
                        Business temp=businesses[j];
                        businesses[j]=businesses[j+1];
                        businesses[j+1]=temp;
                }
                break;
            }
        }
        DataUtil.del(businesses);
    }


    //更新商户
    @Override
    public void updateBusiness(String IDCard) {
        int index = DataUtil.intIDCard(IDCard);
        Scanner scanner=new Scanner(System.in);
        String name ="";
        boolean isname=false;
        while(true) {
            System.out.println("请输入用户名：");
            name = scanner.next();
            for (int i = 0; i < businesses.length; i++) {
                if(name.equals(businesses[i].getName())){
                  if (i!=index){
                      isname=true;
                      System.out.println("您输入的用户已重复 请重新输入....");
                  }
                }
            }
            if (isname==false){
                break;
            }
        }
        System.out.println("请输入昵称:");
        String nick = scanner.next();

        System.out.println("请输入phone:");
        String phone = scanner.next();

        System.out.println("请输入password:");
        String password = scanner.next();

        businesses[index].setName(name);
        businesses[index].setNick(nick);
        businesses[index].setPhone(phone);
        businesses[index].setPassword(password);
        businesses[index].setIDCard(IDCard);
        DataUtil.print();
    }




}
