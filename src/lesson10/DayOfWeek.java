package lesson10;

public enum DayOfWeek {
    MONDAY("Mon"),
    TUESDAY("Tue"),
    WEDNESDAY("Wed"),
    THURSDAY("Thu") {
        @Override
        public int getWorkingHours() {
            return 6;
        }
    },
    FRIDAY("Fri", false),
    SATURDAY("Sat", false),
    SUNDAY("Sun", false);

    private final String shortName;
    private final boolean isWorkingDay;

    DayOfWeek(String shortName) {
        this(shortName, true);
    }

    DayOfWeek(String shortName, boolean isWorkingDay) {
        this.shortName = shortName;
        this.isWorkingDay = isWorkingDay;
    }

    public int getWorkingHours() {
        if (isWorkingDay()) {
            return 8;
        } else {
            return 0;
        }
    }

    public String getShortName() {
        return shortName;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }



    public static void main(String[] args) {
        DayOfWeek someDay = DayOfWeek.MONDAY;
        System.out.println(someDay.name());
        System.out.println(someDay.ordinal());
        System.out.println(someDay.toString());
        DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        DayOfWeek[] values = DayOfWeek.values();
        System.out.println(values[3]);

        switch (someDay) {
            case MONDAY:
                break;
            case TUESDAY:
                break;
            case WEDNESDAY:
                break;
            case THURSDAY:
                break;
            case FRIDAY:
                break;
            case SATURDAY:
                break;
            case SUNDAY:

        }

        int workingHours = DayOfWeek.MONDAY.getWorkingHours();
        int workingHours1 = DayOfWeek.FRIDAY.getWorkingHours();
        System.out.println(workingHours);
        System.out.println(workingHours1);
    }
}
