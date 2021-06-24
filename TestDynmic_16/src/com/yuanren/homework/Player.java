package com.yuanren.homework;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private  boolean flag;//是否是地主
    private List<String> list=new ArrayList<String>();
    public Player() {
        super();
    }
    public Player(String name, boolean flag) {
        this.name = name;
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

/**
        成员不限以上描述，可自行添加
     ```
     分析:三人斗地主，每人17张牌，地主有额外的底牌3张（地主20张）,牌种 4种  ,每一种有17张 ,大小王,一共54张牌

     需求:最终需要在控制台输出三个人的牌
        */

}
