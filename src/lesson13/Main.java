package lesson13;

import lesson12.Time;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
//        Set<Time> times = new TreeSet<>(new TimeComparator());
        Set<Time> times = new TreeSet<>(new HourComparator().thenComparing(new MinuteComparator().reversed()).reversed());
        times.add(new Time(3,3));
        times.add(new Time(20,13));
        times.add(new Time(7,32));
        times.add(new Time(11,33));
        times.add(new Time(22,45));
        times.add(new Time(1,53));
        times.add(new Time(9,23));
        times.add(new Time(12,11));
        times.add(new Time(11,13));
        times.add(new Time(11,55));
        times.add(new Time(11,33));

        Time time = new Time(5,5);
        Time time1 = new Time(5, 5);

        System.out.println(times);

        time.equals("sdjhfgdj");


    }
}
