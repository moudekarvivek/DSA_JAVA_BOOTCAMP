import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr ={5, 4, 3, 2, 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped; // this bool value taken to check the array is already sorted or not if it is sorted then it will not allow loop to execute further and break out
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step,max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
                
            }
            //if you did'nt swap for particular value of i, it means array is sorted hence stop the program
            if(!swapped)
            break;
        }
    }
}