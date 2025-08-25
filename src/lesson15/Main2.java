package lesson15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String userDir = (String) properties.get("user.dir");
        String msg = "Hello students. asdasdasda111222";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src/data.txt");        //
                                                                                  // Elena
            String s = "/Users/anarut/projects/it-academy/javaWork/src/.data.txt"; // 2 Alex Andrey
            String wins = "D:Users/anarut/projects/it-academy/javaWork/src/.data.txt";
            // 1  относительный путь
            // 2  полный (absolute path)

            fos.write(msg.getBytes());
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (FileOutputStream os = new FileOutputStream("src/data.txt");) {
            os.write(msg.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }



        try (FileInputStream fis = new FileInputStream("src/data.txt");) {
            while (fis.available() > 0) {
                int read = fis.read(); // 100
                System.out.print((char) read);
            }
//            byte[] bytes = fis.readAllBytes();
//            String s = new String(bytes);
//            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
