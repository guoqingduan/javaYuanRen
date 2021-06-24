package com.yuanren.homework;

public class Student {
   private String name;

    public Student(String name){
        System.out.println("Student类");
    }

   public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }




}
