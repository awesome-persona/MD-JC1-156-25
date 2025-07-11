package lesson07;

public class Main {

    public static void main(String[] args) {
        String hello = "Hello";
        String hello1 = new String("Hello");
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s = new String(chars);
        System.out.println(hello);
        System.out.println(hello1);
        System.out.println(s);

        String s1 = " asjdasjh   ";
        String trim =s1.trim();
        System.out.println(s1);
        System.out.println(trim);

        System.out.println();
        for (String entry : args) {
            System.out.println(entry);
        }
    }
}
