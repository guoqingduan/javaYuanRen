package com.yuanren.homework;

import java.util.Arrays;

public class Student {
    private int id=1;
    private String name="张三";
    private double score=10;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return  id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
