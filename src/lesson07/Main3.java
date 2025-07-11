package lesson07;

public class Main3 {

    public static void main(String[] args) {
        String s = "fgshjk7"; // 0  1  2  3  4  5  6
        char first = s.charAt(0);
        System.out.println(first);
        if (s.length() % 2 != 0) {
            int middleIndex = s.length() / 2;
            char middle = s.charAt(middleIndex);
            System.out.println(middle);
        }
        char last = s.charAt(s.length() - 1);
        System.out.println(last);

    }
}
