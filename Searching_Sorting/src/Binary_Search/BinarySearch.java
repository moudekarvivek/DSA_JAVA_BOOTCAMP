package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 2, 4, 8, 10, 12, 15, 20};// It should be sorted array because biinary search works on BS
        int target = 10;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    static int binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //find the middle element
            //int mid = (start+end) / 2; // might be possible that (start + end) exceeds the limits of integer
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                // ans found
                return mid;
            }
        }
        return -1; //we return this because the above any condition didnt get true so it will get out of the loop and will return
        //If above statement return nothing then this will get execute i.e- return -1
    }
}
