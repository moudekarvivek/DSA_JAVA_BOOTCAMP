package Lecture_6_ConditionalLoop;

public class CountNums {
    public static void main(String[] args) {
        int n =435842;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 4){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
