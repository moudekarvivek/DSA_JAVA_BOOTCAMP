package Binary_Search;
//Q. Find the position of an element in a sorted array of infinite numbers
public class InfiniteArray {
    public static void main(String[] args) {
        //We will start with the box size 2 as we don't know the size of the array so will make array multiple of 2
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find the range
        //first start with the box of size 2
        int start = 0;
        int end = 1;
        //Condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1; //newStart
             //Double the box value *2
            //new end = previous end + sizeofbox * 2;
            end =  end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr, target, start,end);
    }
    static int binarysearch(int[] arr , int target, int start, int end){
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

