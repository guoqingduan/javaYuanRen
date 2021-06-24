package com.exam.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private String sId;
    private String  stuName;
    private String password;
    private Gender gender;
    private String phone;
    private List<TotalPoints> totalPointsList=new ArrayList<TotalPoints>();
    private static int  stuNumber=0;

    public Student() {
        this.sId = ++stuNumber+"";
    }

    public Student(String stuName, String password, Gender gender, String phone) {
        this.sId = ++stuNumber+"";
        this.stuName = stuName;
        this.password = password;
        this.gender = gender;
        this.phone = phone;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<TotalPoints> getTotalPointsList() {
        return totalPointsList;
    }

    public void setTotalPointsList(List<TotalPoints> totalPointsList) {
        this.totalPointsList = totalPointsList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", totalPointsList=" + totalPointsList +
                '}';
    }
}
