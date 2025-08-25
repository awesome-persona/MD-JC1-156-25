package lesson16;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main3 {

    public static void main(String[] args) {
        try (var fos = new FileInputStream("contactsList.data");
             var bos = new BufferedInputStream(fos);
             var oos = new ObjectInputStream(bos)
        ){
            while (true) {
                Object o = oos.readObject();
                System.out.println(o);
            }
        } catch (EOFException e) {
            // OK
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
