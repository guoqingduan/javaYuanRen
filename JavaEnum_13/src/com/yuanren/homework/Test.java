package com.yuanren.homework;

public class Test {
    public static void main(String[] args) {
        Weekday sat = Weekday.SATURDAY;
        //该方法返回枚举中值的数组
        Weekday[] values = Weekday.values();
        //for增强
        for (Weekday day : values) {
            int i = day.compareTo(sat);
            if(i<0){
                System.out.println(i+",它小于sat。");
            }else if(i>0){
                System.out.println(i+",它大于sat。");
            }else {
                System.out.println(i+",它等于sat。");
            }
        }
        Season season = Season.SPRING;
        season.getMonthRange(season);


    }

}
