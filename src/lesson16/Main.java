package lesson16;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {
        try (var fos = new FileOutputStream("bufferedFile.txt");
             var bos = new BufferedOutputStream(fos, 50)) {
            for (int i = 0; i < 100; i++) {
                bos.write("some text\n".getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
