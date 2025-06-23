package lesson03;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
//        int result = (int) Math.random();  // [0.0; 1.0) -> [1;100]
//        int result = (int) Math.random() + 1;  // [1.0; 2.0) -> [1;100]
        int result = (int) (Math.random() * 100 + 1);  // [1; 101) -> [1; 100] -> [1;100]

        //
        guess(result);
    }

    public static void guess(int result) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (result == x) {
            System.out.println("угадал");
        } else {
            System.out.println(result > x ? "больше" : "меньше");
//            if (result > x) {
//                System.out.println("больше");
////                guess(result);
//            } else {
//                System.out.println("меньше");
////                guess(result);
//            }
            guess(result);
        }
    }
}
