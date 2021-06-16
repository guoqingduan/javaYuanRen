package com.yuanren.homework;

import java.util.Arrays;

public class DButil {
    private User[] user=new User[5];
    private int index=0;
    public User[] getUser() {
        return user;
    }

    public void setUser(User[] user) {
        this.user = user;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "DButil{" +
                "user=" + Arrays.toString(user) +
                ", index=" + index +
                '}';
    }
}
