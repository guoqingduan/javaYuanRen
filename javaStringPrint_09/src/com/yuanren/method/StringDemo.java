package com.yuanren.method;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String str="To be or not to be";
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        for (int i = 0; i < s.length; i++) {
            String str1="";
            for (int j = s[i].length()-1; j >=0 ; j--) {
                str1+=s[i].charAt(j);
            }
         str=str.replace(s[i],str1);
        }
        System.out.println(str);
    }


}
