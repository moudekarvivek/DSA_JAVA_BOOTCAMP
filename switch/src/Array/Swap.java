package Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,8,29}; //Swapping of Numbers in a given Array
       // swap(arr,1,3);
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){ // This is Two Pointer Method will work for Even And Odd both number of elements
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
