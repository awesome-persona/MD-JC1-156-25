package lesson06;

import lesson03.Main;

public class Point3D extends Point {

    int z;

    public Point3D(int x, int y, int z) {
//        super(); by default
//        super(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)",getX(), getY(), z);
    }

    static {
//        z = 5; только статика может
    }

    {
        z = 5;
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(5,7,8);
        int x1 = point3D.getX();
        int y1 = point3D.getY();
        int z1 = point3D.z;

        System.out.println(point3D);

        Point3D a = point3D;
        Point b = point3D;
        Object c = point3D;
        Object e = new Main();

        if (c instanceof Point3D) {
            Point3D d = (Point3D) c;
            System.out.println(d);
        }

        if (c instanceof Point3D d) {
            System.out.println(d);
        }

//        Point3D f = (Point3D) e; Нельзя!
    }
}
