package lesson06;

public class Point { //extends Object {   by default

    private int x;
    private int y;

    // DRY principle - don't repeat yourself

    public Point() {
//        super();  by default
    }

    public Point(int x) {
        this(x, 0);
    }

//    public Point(int x1, int y1) {
//        x = x1;
//        y = y1;
//    }

    public Point(int x, int y) {
//        super();  by default
        this.x = x;
        this.y = y;
        System.out.println("point initialized");
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", x, y);
//        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        point1.x = 4;
        point1.y = 5;
        System.out.println(point1);

        Point point2 = new Point(1,3);
        System.out.println(point2.x);
        System.out.println(point2.y);
        System.out.println(point2);
        point2.x = -3;
        point2.y = 7;
        System.out.println(point2);

        Point point3 = new Point(-7, 11);
        System.out.println(point3);


        System.out.println(point1);
    }
}
