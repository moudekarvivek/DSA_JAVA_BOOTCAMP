package Binary_Search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,9,5,14,16,18};// It should be sorted array because biinary search works on BS
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //return the index of greatest Number <= target
    static int floor(int[] arr , int target){
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
        return end; //we return this because the above any condition didnt get true so it will get out of the loop and will return
        //If above statement return nothing then this will get execute i.e- return -1
        //The only change we have done here is we change return value to start
    }
}
