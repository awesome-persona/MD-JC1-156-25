package lesson09;

public class Main {

    public static void main(String[] args) {
        // x,y,z > 0
        Point point1 = new Point(4, 6,1);
        Point point2 = new Point(5,9, 3);
        System.out.println(point1);
        System.out.println(point2);

        int x = point1.getX();
        System.out.println(x);
        x= 6;
        System.out.println();
        System.out.println(x);
        System.out.println(point1.getX());
//        point1.setX(9);
        System.out.println(point1);
//        point1.setX(-11);
        System.out.println(point1);


//        point1.x = -3;
//        point1.z = -11;
        System.out.println(point1);

    }
}
