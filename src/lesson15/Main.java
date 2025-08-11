package lesson15;

import lesson15.exception.WebPart;

public class Main {

    public static void main(String[] args) {
        WebPart webPart = new WebPart();
        String jacob = webPart.getResult("Jacob");

        System.out.println(jacob);
    }
}
