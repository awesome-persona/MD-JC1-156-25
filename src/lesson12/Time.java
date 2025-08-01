package lesson12;

public class Time {

    private int minutes;
    private int hours;

    public Time() {
        this(0,0);
    }

    public Time(int hours, int minutes) {
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
