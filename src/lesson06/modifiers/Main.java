package lesson06.modifiers;

public class Main {

    public       static int a = 1;
    protected    static int b = 2;
                 static int c = 3; // package private
    private      static int d = 4;
    public       static int e;
    public final static int f = 5;

    int m = 15;
    int abvg = 1234;
    static int n = 16;

//    '0101001010110010101010101010101' ->  4 bytes

    public static void main(String[] args) {
        int a2 = 55;
        System.out.println(a2);

        System.out.println(e);
        e = 66;
        System.out.println(e);

        int a1 = a;
        int b1 = b;
        int c1 = c;
        int d1 = d;

        a = 6;
        d = 6;
//        f = 6;
        Main main1 = new Main();
        Main main2 = new Main();
        Main main3 = new Main();
        System.out.println();
        System.out.println(main1.m);
        System.out.println(main2.m);
        System.out.println(main3.m);
        System.out.println(main1.n);
        System.out.println(main2.n);
        System.out.println(main3.n);
        System.out.println(Main.n);

        main1.m = 23;
        main1.n = 24;

        System.out.println();
        System.out.println(main1.m);
        System.out.println(main2.m);
        System.out.println(main3.m);
        System.out.println(main1.n);
        System.out.println(main2.n);
        System.out.println(main3.n);

        main2.m = 33;
        main2.n = 34;
//        main2.abvg = 33;


        System.out.println();
        System.out.println(main1.m);
        System.out.println(main2.m);
        System.out.println(main3.m);
        System.out.println(main1.n);
        System.out.println(main2.n);
        System.out.println(main3.n);


        System.out.println();
        System.out.println(n);

        Main main4 = new Main();
        int abvg1 = main4.abvg;
    }

}
