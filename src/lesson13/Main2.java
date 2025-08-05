package lesson13;

import lesson12.Time;

public class Main2 {

    public static void main(String[] args)   {
        Time time = new Time(5, 5);
        Class<? extends Time> aClass = time.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getCanonicalName());
        System.out.println(aClass.getSimpleName());
    }
}
