package lesson13;

import lesson12.Time;

import java.util.Comparator;

public class TimeComparator implements Comparator<Time> {

    @Override
    public int compare(Time t1, Time t2) {
        int val1 = Math.abs(t1.getHours()) + Math.abs(t1.getMinutes());
        int val2 = Math.abs(t2.getHours()) + Math.abs(t2.getMinutes());
        int result = Integer.compare(val2, val1);
        return result == 0 ? Integer.compare(t2.getHours(), t1.getHours()) : result;

        // 11+22  22+11 -> 0
    }
}
