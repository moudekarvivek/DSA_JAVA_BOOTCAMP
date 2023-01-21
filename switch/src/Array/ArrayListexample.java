package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(28);
//        list.add(284);
//        list.add(283);
//        list.add(285);
//        list.add(22);
//        System.out.println(list.contains(123456));
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        //get Item at any index
        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
        }
    }
}
