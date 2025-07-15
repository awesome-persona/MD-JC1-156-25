package lesson08;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int n = 1;

        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + i;
        }
//        System.out.println(result);
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + " millis");



        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i);
        }
//        System.out.println(stringBuilder.toString());
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " millis");


        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(i);
        }
//        System.out.println(stringBuffer.toString());
        finish = System.currentTimeMillis();
        System.out.println(finish - start + " millis");

        StringBuilder builder = new StringBuilder("abrakadabra")
                .append("hello")
                .append("goodbye")
                .insert(5, "java")
                .reverse()
                .append("hello");

        System.out.println(builder);


        StringBuilder insert = new StringBuilder("HelloWorld").insert(5, "Java");
        System.out.println(insert);

        String str = "HelloWorld";
        String substring = str.substring(5, 7);
        System.out.println(substring);


        Pattern compile = Pattern.compile("\\w.++");
    }
}
