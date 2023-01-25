public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 14, 25, 88, 78, 89};
        int target = 12; // This will give us -1 as output because it is out of range
        System.out.println(linearsearch(arr,target,1,4));

    }
    static int linearsearch(int[] arr,int target,int start,int end){
        //we were putting some checks here like
        if(arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index = start; index <= end; index++) {
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

