package com.vivek;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);//That's the beauty of Variable length Argument we can give as many argument as we can
    }
    static void fun(int ...v){ //This will internally create array of integers[array is collection of integers]
        System.out.println(Arrays.toString(v));
    }
}
