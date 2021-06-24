package com.yuanren.method;

import java.util.Random;

public class RandomDemo {
    int getRandom(int begin,int end){
        Random random=new Random();
        int ran=0;
        if(begin>0){
            int i = random.nextInt(end-begin+1);
            ran=i+begin;
            return ran;
        }else if(begin==0){
            end=end+1;
            ran=random.nextInt(end);
            return ran;
        }else {
            int i = random.nextInt(2);
            if (i == 0) {
                ran = random.nextInt(end + 1);
                return ran;
            } else {
                ran = 0 - random.nextInt(Math.abs(begin + 1));
                return ran;
            }
        }
    }

}
class Main2{
    public static void main(String[] args) {
        RandomDemo randomDemo=new RandomDemo();
        Random random=new Random();
        int i = random.nextInt(12 + 1);
        int rand = randomDemo.getRandom(-10, 12);
        System.out.println(rand);


    }
}