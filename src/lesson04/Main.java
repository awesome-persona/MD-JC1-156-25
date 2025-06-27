package lesson04;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[8];
        {
            int a0 = a[0];
            int a1 = a[1];
            int a2 = a[2];
            int a7 = a[7];
        }

        a[0] = 5;
        a[1] = 2;
        a[2] = 5;
        a[3] = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(a.length);
        System.out.println(arr.length);
        int[] f = {1};
        System.out.println(f.length);
        f = new int[]{1,2,3};
        System.out.println(f.length);
    //        int a8 = a[8];


//        System.out.println(a0);
        int i = arr[5];
        System.out.println();

        for (int j = 0; j < arr.length; j++) {
            arr[j] = new Random().nextInt(100);
//            System.out.print(arr[j] + " ");
        }

        /*
        * code
        */
        System.out.println();
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
        Arrays.fill(arr, 2, 5, 666);
        for (int k : arr) {  // int[]
            System.out.print(k + " ");
        }

        int i1 = a[-1];






    }
}
