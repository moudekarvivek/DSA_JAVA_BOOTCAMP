package com.vivek;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();// Here we are calling the function
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is:"+sum);
    }
    /*
        return_type name(){
        //body
        return statement;
        }
     */
}
