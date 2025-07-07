package lesson05;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // n + (n-1) + (n-2) + (n-3) +  ... + 4 + 3 + 2 + 1 -> (1 + n) * n /2 -->
        // O ((1 + n) * n /2) -> O (n^2)


        int[] a = {6,7,3,2,1,4,9,8,3};
        System.out.println(Arrays.toString(a));


        Arrays.sort(a); // <-----/
        System.out.println(Arrays.toString(a));

        int i = Arrays.binarySearch(a, 0);
        System.out.println(i);

        // log2 16 = x -> 4
        // 2^x = 16 \\  2^4 = 16

        //1 000 000 000

        // log2(1_000_000_000)  -> 30;


    }
}
