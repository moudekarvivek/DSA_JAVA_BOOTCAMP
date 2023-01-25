public class EvenDigitsLeetcode1 {
   //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] nums = {12, 14, 13, 18, 20, 50};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
        //function to check whether a number contains even digits or not
        static boolean even(int num){
            int numberofdigits = digits(num);
            if(numberofdigits % 2 == 0){
                return true;
            }
            return false;
        }
        //count the number of digits in a number
        static int digits(int num){
            int count = 0;

            while(num > 0){
                count++;
                num /= 10;
            }
            return count;
        }
}
