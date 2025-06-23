package lesson03;

public class Main2 {

    public static void main(String[] args) {
        for (int i = 7; i < 200; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i < 10000; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        for (int i = 3, j = 0; j < 15; i *= 3, j++) {
            System.out.print(i + " ");
        }
    }
}
