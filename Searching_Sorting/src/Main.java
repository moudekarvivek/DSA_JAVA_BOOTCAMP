public class Main {
    public static void main(String[] args) {
    //Search in the Array:return the index if item found
        //Otherwise if Item not found return -1
        int[] nums = {12, 14, 13, 18, 20, 50}; //take any number of values here
        int target = 18; //now we have given the target here
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        //we were putting some checks here like
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //This line will execute if none of the return statements above have executed
        //hence target not found
        return -1;
    }
}