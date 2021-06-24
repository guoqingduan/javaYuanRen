package com.yuanren.lianxi;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        AbstractionRealize abstractionRealize = new AbstractionRealize();
        abstractionRealize.add("卢瑟");
        abstractionRealize.add("卢瑟3");
        abstractionRealize.add("卢瑟4");
        abstractionRealize.add("卢瑟2");
        abstractionRealize.add("卢瑟1");
        Object set = abstractionRealize.set(2, "张三");
        Object get = abstractionRealize.get(2);
        Object remove = abstractionRealize.remove(2);
        boolean remov = abstractionRealize.remove("卢瑟");
        int size = abstractionRealize.size();
        abstractionRealize.clear();
        boolean empty = abstractionRealize.isEmpty();
        System.out.println(set+"--------"+get+"--------"+remove+"--------"+remov+"--------"+size+"--------"+
                empty+"-------"+abstractionRealize);
    }
}
