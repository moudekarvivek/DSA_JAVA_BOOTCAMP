package com.vivek;

public class Shadowing {
    static int x = 90;// This will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 40;
        System.out.println(x);//40 because this lowerlevel, is overriding the upperlevel that is on line 4
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
