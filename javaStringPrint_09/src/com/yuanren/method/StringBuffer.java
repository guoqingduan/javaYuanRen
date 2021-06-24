package com.yuanren.method;

import java.util.Arrays;

public class StringBuffer {
    private char[] ch;


    public StringBuffer(){
        ch=new char[0];
    }

    /**
     *扩容
     */
    private void dilatation(){
        char[] newChar=new char[ch.length+1];
        for (int i = 0; i < ch.length; i++) {
            newChar[i]=ch[i];
        }
        ch=newChar;
    }

    /**
     接收字符串
     */
    void append(String str){
        for (int i = 0; i < str.length(); i++) {
            dilatation();
            ch[ch.length-1]=str.charAt(i);
        }
    }
    /**
     接收字符
     */
    void append(char str){
        dilatation();
        ch[ch.length-1]=str;
    }
    /**
     将之前接收到的字符拼接到一起返回
     */
    public String toString() {
        return new String(ch);
    }
    /**
     清除之前的而输入内容
     */
    public void clear(){
        this.ch=new char[0];
    }
    /**
     将之前的输入内容反转
     */
    public String reverse(){
        for (int i = 0; i < ch.length/2; i++) {
            char temp=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=temp;
        }
        return toString();
    }
    /**
     将指定位置的字符串反转
     from 从0起始
     to 不包含在内
     即[from,to)
     例如 abcdefg => reverse(1,3) => acbdefg
     */
    public String reverse(int from, int to){
        for (int i = 0; i < (to-1)/2; i++) {
            char temp=ch[i+from];
            ch[i+from]=ch[to-1-i];
            ch[to-1-i]=temp;
        }
        return toString();
    }
}
class Main{
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("张麻子");
        stringBuffer.append('男');
        stringBuffer.append("陆家嘴打地铺");
        stringBuffer.append("月薪1W元");
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse(2,6));
        stringBuffer.clear();
        stringBuffer.append("张麻子");
        stringBuffer.append('男');
        stringBuffer.append("陆家嘴打地铺");
        stringBuffer.append("月薪1W元");
        System.out.println(stringBuffer.toString());

    }
}