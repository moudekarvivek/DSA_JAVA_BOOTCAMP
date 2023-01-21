package vivek;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey User Please Enter Temprature in celcius:");
        float tempc = input.nextFloat();

        float tempf = (tempc * 9/5) + 32 ;
        System.out.println(tempf);
    }
}
