package Binary_Search;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestNumber {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};// It should be sorted array because biinary search works on BS
        char target = 'c';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            //find the middle element
            //int mid = (start+end) / 2; // might be possible that (start + end) exceeds the limits of integer
            int mid = start + (end - start) / 2;

                if(target < letters[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            return letters[start  % letters.length];
    }
}

