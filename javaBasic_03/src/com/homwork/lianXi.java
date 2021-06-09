package com.homwork;

public class lianXi {
    public static void main(String[] args) {
        //编写证明||会出现短路而|是不会短路的
        //|| 都为false才为false  只要有true就是true
        int a=1;
        int b=10;
        if (a++<b||a>b++){
            System.out.println(a);
            System.out.println(b);
        }
        if (a++<b|a>b++){
            System.out.println(a);
            System.out.println(b);
        }
        //当float类型变量中保存了超出int所能表示的范围的数字，将这个变量强制转换成int数据类型后，int数据类型变量中
        //保存的值是多少  int 最小值是 -2,147,483,648(-2^31)；  最大值是 2,147,483,647(2^31 - 1)
        float c=2147483650f;
        int d=(int)c;
        System.out.println(d);



    }


}
