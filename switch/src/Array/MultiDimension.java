package Array;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
    /*
        1 2 3
        4 5 6
        7 8 9
     */
        Scanner sc = new Scanner(System.in);
        //int[][] arr = new int[3][];//It is not Mandatory to pass the column size we will see it further why this so
//    int[][] = {
//        {1,2,3},//0th Index
//        {4,5},// 1st Index
//        {6,7,8,9}//2nd Index -> arr[2] = {6,7,8,9} and if arr[2][0] = 6
//    };
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // This will give us the number of rows as length
        //Input
        for (int row = 0; row < arr.length; row++) {
            //for each Column in every row because numberofcoloumn varies row to row
            for (int col = 0; col < arr[row].length; col++) {//arr[row] meaning is the length of that specified row
                arr[row][col] = sc.nextInt();
            }
        }
        //Output
        for (int row = 0; row < arr.length; row++) {
            //for each Column in every row because numberofcoloumn varies row to row
            for (int col = 0; col < arr[row].length; col++) {//arr[row] meaning is the length of that specified row
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
