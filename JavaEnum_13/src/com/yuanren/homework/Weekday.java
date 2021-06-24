package com.yuanren.homework;

public enum Weekday {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;
    Weekday(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekDay(Weekday value){
        if(value.equals(MONDAY)||value.equals(TUESDAY)||value.equals(WEDNESDAY)||value.equals(THURSDAY)||value.equals(FRIDAY)){
            return true;
        }
        return false;
    }
    public boolean isHoliday(Weekday value){
        boolean weekDay = isWeekDay(value);
        if(weekDay==true){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weekday{" +
                "name='" + name + '\'' +
                '}';
    }
}
