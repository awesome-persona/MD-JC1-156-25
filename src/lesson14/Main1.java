package lesson14;

import java.util.Random;

public class Main1 {

    public static void main(String[] args) {
        int n = 10;
        int result =  0;

        try {
            for (int i = 0; i < n; i++) {
                result += new Random().nextInt(10);

                int divider = new Random().nextInt(10);
                if (divider > 0) {
                    result /= divider;
                } else {
                    System.out.println("aтата");
                    RuntimeException runtimeException = new RuntimeException("не повезло");
                    throw runtimeException;
                }
                System.out.println("intermediate result:" + result);
            }
        } catch (NullPointerException e) {
            System.out.println("ошибка");
            result = -1;
            return;
        } catch (RuntimeException e) {
            System.out.println("ошибка");
            result = -1;
            return;
        } catch (Exception e) {
            System.out.println("ошибка");
            result = -1;
            return;
        } finally {
            System.out.println("finally: " + result);
        }
        System.out.println(result);
    }
}
