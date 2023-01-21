package com.vivek;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
    }
    static void random(){
        System.out.println(" ");//this is funtion scope we cant access a here in this random method scope
    }
}
