package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // This is Array of Primitives
        int[] arr = new int[5];
            arr[0] = 23;    // This Assignment can't be done where there are large number of elements
            arr[1] = 45;
            arr[2] = 89;
            arr[3] = 245;
            arr[4] = 435;
        System.out.println(arr[3]);
        //So will Take input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        /* System.out.println(Arrays.toString(arr));
        //the toString() Method of Arrays class is also used to print the same
        if we give input as 1 2 3 4 5 then it will print like this :
        [1,2,3,4,5] */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

        }
        //for(int num : arr){ //for every element in array print the element
        //System.out.println(num  + " ");//here num represents element of the array
        // }
        //System.out.println(arr[5]); // This will give us Index Out of Bond Error

        //Array of Objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
