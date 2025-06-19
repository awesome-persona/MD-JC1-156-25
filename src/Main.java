public class Main {

    public static void main(String[] args) {
        int season = 2004_2005;
        System.out.println(season);
        int season1 = 20_042_005;
        System.out.println(season1);

        long bigNumber = 1_234_567_890_123L;
        System.out.println(bigNumber);

        float f = 1;
        double d = 1.f;


        System.out.println("-----------------------------------");
        long l1 = 10000;
        int int1 = (int) l1;
        short s1 = (short) int1;

        System.out.println(s1); // 10000  //     0000 0000 0000 0000 0010 0111 0001 0000
        System.out.println(Integer.toBinaryString(s1));
        byte b = (byte) l1;
        System.out.println(b); // 16 100 127                                   0001 0000
        System.out.println(Integer.toBinaryString(b));

        char ja = 'a';
        char ja1 = 12213;

        // FFFF  16 ^ 4  (2^4)^4 = 2^16 ->  (2 * 2 * 2 * 2) * (2 * 2 * 2 * 2) * (2 * 2 * 2 * 2) * (2 * 2 * 2 * 2) = 2 ^ 16

        // 1 2 3 4 5 6 7 8 9 A B C D E F

        char u1 = '\u0001';
        /*
        asas
        asdsa
        d
        asd
        as
        das
        d
        */
        char u2 = 'T';   // asdjakhjsfgafhgashdgsahjd

        System.out.println("-------------------------------------");
        int num = 10;
        System.out.println(num++); // 11    10
//        System.out.println(num); // 11    10
//        num = num + 1;


        System.out.println(num++); // 12    11
        System.out.println(num--); // 11    12
        System.out.println(--num); // 10    10
        System.out.println(++num); // 11    11
//        num = num + 1;
//        System.out.println(num); // 11    10


        int c = 24;

        System.out.println(c / 7); //  3     3.428
        System.out.println(c % 7); //  3     24 - 7 * 3 (21)= 3
        int y= 11;
        int x = 5;

        int i = x & y;
        x = 10;
        x += 4;
        x = x + 4;
        x *=6;
        x = x * 6;


        // 0000 0000 0000 0000 0000 0000 0011 1100

        //a    = 0011 1100
        //b    = 0000 1101

        // a&b =  0000 1100
        // a|b =  0011 1101
        // a^b =  0011 0001
        //  ~a =  .... 1111 1100 0011

        //       0000 0000 0000 0000 0000 0000 0011 1100  / 60
        // a<<5= 000 0000 0000 0000 00000 0111 1000 0000             31 << 3 ?  248    31 << 1 ? 62
        // a>>4= 0000 0000 0000 0000 0000 0000 0000 0011 / 3
        //       1111 1000 0000 0000 0000 0000 0000 0011

        //a>>>4= 0000 0000 0000 0000 0000 0000 0000 0011 / 3
        //       0000 1000 0000 0000 0000 0000 0000 0011


        int min = -2147483648;
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Integer.toBinaryString(min >> 2));
        System.out.println(Integer.toBinaryString(min >> 4));
        System.out.println(Integer.toBinaryString(min >>> 2));
        System.out.println(Integer.toBinaryString(min >>> 4));

        System.out.println(Integer.toBinaryString(-2147483648 + 256));

        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-1 - 256));


        int v = ((33 & 55) | 66) ^ 35;


    }
}
