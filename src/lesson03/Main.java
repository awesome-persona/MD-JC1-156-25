package lesson03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = -34235;

        // -3 -> пт


        int y = n > 0 ? n % 7 : n % 7 + 7;
        int x = (n % 7 + 7) % 7; // [-6;6] -> 13; [1;13] -> 13;  [0;6] -> 7;

        switch (x) {
            case 1, -6:
                System.out.println("вт");
                break;
            case 2:
//            case -5:
                System.out.println("ср");
                break;
            case 3:
//            case -4:
                System.out.println("чт");
                break;
            case 4:
//            case -3:
                System.out.println("пт");
                break;
            case 5:
//            case -2:
                System.out.println("сб");
                break;
            case 6:
//            case -1:
                System.out.println("вск");
                break;
            default:
                System.out.println("пн");
        }
    }
}
