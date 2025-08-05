package lesson13;

import lesson12.Time;

import java.util.Comparator;

public class MinuteComparator implements Comparator<Time> {
    @Override
    public int compare(Time o1, Time o2) {
        return Integer.compare(o1.getMinutes(), o2.getMinutes());
    }
}
