package lesson07;

import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
        int n = 7;// args.length > 0 ? Integer.valueOf(args[0]): 7;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(random.nextInt(100) + " ");
            }

            System.out.println();
        }
    }
}
