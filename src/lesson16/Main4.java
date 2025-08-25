package lesson16;

import java.io.Console;
import java.io.File;

public class Main4 {

    public static void main(String[] args) throws Exception{
        File file = new File(".");
//        File file = new File("../javaWork/.data.txt");
        System.out.println(file);
        boolean b = file.canExecute();
        boolean b1 = file.canRead();
        boolean b2 = file.canWrite();
        String absoluteFile = file.getAbsolutePath();
        String canonicalPath = file.getCanonicalPath();
        File parentFile = file.getParentFile();
        long l = file.lastModified();
        boolean file1 = file.isFile();
        boolean directory = file.isDirectory();
        long usableSpace = file.getUsableSpace();
        long freeSpace = file.getFreeSpace();
        long totalSpace = file.getTotalSpace();
        boolean hidden = file.isHidden();
        long length = file.length();
        boolean exists = file.exists();

//        file.delete()
//        file.deleteOnExit();
//        file.createNewFile()
//        boolean mkdir = file.mkdir();
//        boolean mkdirs = file.mkdirs();
        System.out.println();

        File parentFile1 = file.getParentFile();
        String[] list = file.list();
        File[] files = file.listFiles();

        System.out.println();

        Console console = System.console();
        System.out.println("log:");
        String s = console.readLine();
        System.out.println("pass:");
        char[] chars = console.readPassword();
        System.out.println("your log: " + s + " pass: " + new String(chars));
    }


}
