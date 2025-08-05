package lesson13;

import lesson12.Time;

import java.util.Comparator;

public class HourComparator  implements Comparator<Time> {
    @Override
    public int compare(Time o1, Time o2) {
        return Integer.compare(o1.getHours(), o2.getHours());
    }
}
