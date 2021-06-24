package com.yuanren.homework;

public enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
    void getMonthRange(Season season){
        switch (season){
            case SPRING:
                System.out.println("春天代表的月份为3~5");
                break;
            case SUMMER:
                System.out.println("夏天代表的月份为：6~8");
                break;
            case AUTUMN:
                System.out.println("秋天代表的月份为：9~11");
                break;
            case WINTER:
                System.out.println("冬天代表的月份为：12~2");
                break;
            default:
                System.out.println("不是季节，重新输入。。。");
                break;
        }
    }
}
