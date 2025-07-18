package lesson09;

public class Point {

    private int someAwesomeIntNumber;
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


//    //read
//    public int x() {
//        return x;
//    }
//
//    //update
//    public void x(int newX) {
//        if (newX >= 0) {
//            x = newX;
//        }
//    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

//    public void setY(int y) {
//        if (y >= 0) {
//            this.y = y;
//        }
//    }

    public int getZ() {
        return z;
    }

//    public void setZ(int z) {
//        if (z >= 0) {
//            this.z = z;
//        }
//    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
