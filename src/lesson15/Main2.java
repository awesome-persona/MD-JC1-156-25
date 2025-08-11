package lesson15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main2 {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String userDir = (String) properties.get("user.dir");


        String msg = "Hello students. asdasdasda111222";
        try {
            FileOutputStream fos = new FileOutputStream("src/data.txt");        //
                                                                                  // Elena
            String s = "/Users/anarut/projects/it-academy/javaWork/src/data.txt"; // 2 Alex Andrey

            String wins = "D:Users/anarut/projects/it-academy/javaWork/src/data.txt";


            // 1  относительный путь
            // 2  полный (absolute path)
            fos.write(msg.getBytes());
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
