package com.vivek;

public class Overloading {
    public static void main(String[] args) {
        fun(68); //suppose i say call this function fun with number it will call the fun() function with argument as num
        fun("Vivek Ashok Moudekar");
    }
    static void fun(int num){
        System.out.println(num);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
