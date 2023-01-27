package LeetCode;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Mountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //This means You are now at decreasing part of the array
                //This may be the answer but pls look at left of arr[mid]
                // This is why end != mid - 1
                end = mid;
            }else{
                //you are in ascending part of the array
                start = mid + 1;// because we know  that mid + 1 element > mid element
            }
        }
        //In the end, start == end and pointing to the lagest number because of the above 2 checks
        //start and end  are always trying to find max element in the above 2 checks
        //hence,when they are pointing to just one element,that is the maxmium one because that is what is check says
    }
}
