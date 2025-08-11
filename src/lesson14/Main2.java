package lesson14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main2 {

    public static void main(String[] args) throws Exception {
        todo();
    }


    public static void todo() throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
        } catch (Exception e) {
            System.out.println("не повезло");
        }

        FileInputStream fileInputStream = new FileInputStream("test.txt");

    }
}
