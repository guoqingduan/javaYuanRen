package com.exam.core;

import java.util.Date;

public class TotalPoints {
    private String TPId;//考试成绩的次数id
    private Integer score;  //考试结束之后才有的分数
    private Date date;   //考试时间 是不是考试结束之后才有的

    public TotalPoints(Integer score, Date date) {
        this.score = score;
        this.date = date;
    }

    public TotalPoints() {
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void setTPId(String TPId) {
        this.TPId = TPId;
    }

    public String getTPId() {
        return TPId;
    }

    @Override
    public String toString() {
        return "TotalPoints{" +
                "TPId='" + TPId + '\'' +
                ", score=" + score +
                ", date=" + date +
                '}';
    }
}
