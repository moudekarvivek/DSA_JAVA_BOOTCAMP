package Binary_Search;

public class FirstAndLastPosition {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target){
        int ans[] = {-1,-1};
        //check for First Occurance if target is first
        int ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            int ans[1] = search(nums,target,false);
        }
        return ans;
    }
    // this function just returns the index value of target
    int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            //find the middle element
            //int mid = (start+end) / 2; // might be possible that (start + end) exceeds the limits of integer
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                // Potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans; // In case My Answer did'nt found we will give refer from line No.8
    }
}
