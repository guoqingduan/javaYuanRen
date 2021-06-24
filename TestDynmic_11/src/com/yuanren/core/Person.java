package com.yuanren.core;

public class Person {
    public String name;
    public String adress;

    public void sports(String name,String play){
        System.out.println(name+"喜欢运动:"+play);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
