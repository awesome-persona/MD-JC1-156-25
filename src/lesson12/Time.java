package lesson12;

import java.util.Objects;

public class Time implements Comparable<Time> {

    private Integer hours;
    private Integer minutes;

    public Time() {
        this(0,0);
    }

    public Time(Integer hours, Integer minutes) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Time{" + hours + ":" + minutes + '}';
    }

    @Override
    public int compareTo(Time t) {
        // 1 0 -1
        int result = Integer.compare(this.getHours(), t.getHours());
        return result == 0 ? Integer.compare(this.getMinutes(), t.getMinutes()) : result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Time time = (Time) o;
        return Objects.equals(hours, time.hours)
                && Objects.equals(minutes, time.minutes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(hours);
        result = 31 * result + Objects.hashCode(minutes);
        return result;
    }
}
