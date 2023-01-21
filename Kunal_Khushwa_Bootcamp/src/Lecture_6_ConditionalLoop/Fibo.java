package Lecture_6_ConditionalLoop;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; //THE PREVIOUS INDEX FROM WHERE WE GONNA START
        int b = 1; //THE INITIAL STARTING
        int count = 2; //we already have 2 numbers so the count will start from 2

        while(count <= n)
        {
            int temp = b;
            b = b + a;
            a=temp;
            count++;

        }
        System.out.println(b);

        }
    }

