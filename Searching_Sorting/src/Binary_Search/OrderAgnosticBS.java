package Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {-2, 0, 2, 4, 8, 10, 12, 15, 20};// It should be sorted array because biinary search works on BS
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
       int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) { // This condition is same for both ascending and descending order so take that common here
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }

            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
