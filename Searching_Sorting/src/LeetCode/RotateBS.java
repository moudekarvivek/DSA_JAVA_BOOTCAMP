package LeetCode;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RotateBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        //if you did not find the pivot that means, the array is not rotated yet
        if(pivot == -1){
            //just do normal binary search
            return binarysearch(nums, target,0, nums.length - 1);
        }
        //if pivot is found, you have found 2 asc sorting arrays
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarysearch(nums, target,0,pivot - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
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
    //This will not work in duplicated Values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //4 Cases Over here
            //so,Our 1st Case was if the mid > mid + 1 then the pivot element is mid only
            //what in case if the mid element is last element of the array then it will give array index out of bond error as mid+1 pointing to nothing Further
            //so for that mid should be less than end
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
