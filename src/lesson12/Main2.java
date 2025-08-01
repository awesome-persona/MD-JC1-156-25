package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Time> times = new ArrayList<>();
//        List<Time> times = new LinkedList<>();
        times.add(new Time(19,0));
        times.add(new Time(22,0));
        times.add(new Time(18,30));
        times.add(1, new Time(9,0));
        times.add(3, new Time(8,45));
        for (Time time : times) {
            System.out.println(time);
        }
        Time time = times.get(2);
        System.out.println();
//        System.out.println(times);

    }
}
