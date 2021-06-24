package com.yuanren.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(true){
            String BOP="";
            int result=0;
            try{
            System.out.println("输入算法。");
            BOP = scanner.next();
            checkStr(BOP);//判断是否时quit
                checkIllegalInput(BOP);
            String c = BOP.substring(0,1);
            String c1=  BOP.substring(1,2);
            String c2 = BOP.substring(2,3);
            int n1 = Integer.parseInt(c);
            int n2=Integer.parseInt(c2);
            checkDenominator(n2);//判断分母是否为零
                if(c1.equals("+")){
                    result=n1+n2;
                }else if(c1.equals("-")){
                    result=n1-n2;
                }else if(c1.equals("*")){
                    result=n1*n2;
                }else if(c1.equals("/")){
                    result=n1/n2;
                }
                System.out.println("The result is : "+result);
        }catch (QuitException e){
            System.out.println("Quitting");
            System.out.println("Thanks!");
            System.exit(0);
        }catch (DivideByZeroException e){
            System.out.println("Tried to divide by zero");
        }catch (IllegalInputException e){
                System.out.println("Illegal input :"+ e.getExceptionType());
            }finally {
            System.out.println("Input was: "+BOP);
        }
        }

    }

    private static void checkIllegalInput(String length)throws IllegalInputException {
        if(length.length()<1||length.length()>3){
            new IllegalInputException().setExceptionType("Illegal Token Length");
            throw new IllegalInputException();
        }
        if(Character.isDigit(length.charAt(0))==false||Character.isDigit(length.charAt(2))==false){
            new IllegalInputException().setExceptionType("Illegal Argument");
            throw new IllegalInputException();
        }
        String c1=  length.substring(1,2);
        if(!(c1.equals("+")||c1.equals("-")||c1.equals("*")||c1.equals("/"))){
            new IllegalInputException().setExceptionType("Illegal Operator");
            throw new IllegalInputException();
        }

    }

    private static void checkStr(String str) throws  QuitException {
    if(str.equalsIgnoreCase("QUIT")){
            throw new QuitException();
    }
}
    private static void checkDenominator(int denominator) throws  DivideByZeroException {
        if(denominator==0){
            throw new DivideByZeroException();
        }
    }






}


