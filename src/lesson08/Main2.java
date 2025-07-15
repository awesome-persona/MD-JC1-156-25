package lesson08;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main2 {

    public static void main(String[] args) {
        int a = 5;
        Integer b = null;

        // age   0?  null?


        int i1 = Integer.parseInt("123123");
        Integer i = Integer.valueOf("123123");
        String s = String.valueOf(i);
//        doSmth(a + b);
       doSmth(b);

        BigInteger zero = BigInteger.ZERO;

        BigInteger bigInteger = new BigInteger("124563412312451345342624567457458767978967809860670");
        BigInteger bigInteger2 = new BigInteger("123412312451345342624567457458767978967809860670");
        BigInteger add = bigInteger.add(new BigInteger("44"));
        BigInteger multiply = bigInteger.multiply(new BigInteger("44"));
        BigInteger divide = bigInteger.divide(new BigInteger("44"));
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(bigInteger);
        System.out.println(bigInteger2);
        System.out.println(subtract);


        BigDecimal bigDecimal = new BigDecimal("2312312312.12312312");
        System.out.println(bigDecimal);

        System.out.println(bigInteger.longValue());

        BigInteger bigInteger1 = BigInteger.valueOf(21312312312L);
    }


    public static void doSmth(Integer x) {
        System.out.println(x);
    }

}
