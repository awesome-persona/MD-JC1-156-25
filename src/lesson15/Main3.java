package lesson15;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws Exception {
        String fileName = "somefile.txt";


        try (FileWriter writer = new FileWriter(fileName, true)){
            writer.write("Hello");
            writer.write(" Students");
            writer.write("\n");
            writer.write("lesson 15\n");
            writer.flush();
            writer.write("------\n");
        }

        try (FileReader reader = new FileReader(fileName)){
            int read = reader.read();
            while (read > 0) {
                System.out.print((char) read);
                read = reader.read();
            }
        }
    }
}
