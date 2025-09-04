package lesson22.singleton;

import lesson09.Point;

public class Singleton { // cursor

    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) { //<----- проверка доступа (для обхода synchronized)
            synchronized (Singleton.class) {
                if (instance == null) { //<----- проверка для single экземпляра
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private int x;
    private int y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Point p) {
        x = p.getX();
        y = p.getY();
    }


}
