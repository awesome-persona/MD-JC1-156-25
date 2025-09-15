package lesson23;

import javax.swing.text.DateFormatter;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static java.time.temporal.ChronoField.DAY_OF_YEAR;
import static java.time.temporal.ChronoUnit.YEARS;

public class Main2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalTime now1 = LocalTime.now();
        LocalDate now2 = LocalDate.now();

        LocalDateTime localDateTime1 = LocalDateTime.of(2025, Month.APRIL, 22, 19, 0, 0, 0);


        List<?> ss = List.of("ss", "sad");


        @SuppressWarnings("unchecked")
        List<String> ss1 = (List<String>) ss;

        int size = ss1.size();

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        Instant instant1 = new Date().toInstant();
        Instant instant2 = Calendar.getInstance().toInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneOffset.systemDefault());

        Instant instant = now.toInstant(ZoneOffset.UTC);


        Month month = now.getMonth();
        LocalDateTime plus1 = now.plus(-5, ChronoUnit.HOURS);
        now.minusHours(5);
        boolean after = now.isAfter(localDateTime);
        now.isEqual(localDateTime);
        LocalDateTime with = now.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.MONDAY));
        System.out.println(with);
        LocalDateTime with1 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDateTime plus = now.with(DAY_OF_YEAR, 1).plus(1, YEARS);

        boolean leapYear = LocalDate.now().isLeapYear();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy hh:mm:ss");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        TemporalAccessor parse = dateTimeFormatter.parse(format);
        System.out.println(parse);

        Duration duration = Duration.ofSeconds(100000);
        Period period = Period.ofDays(5655);
        System.out.println(duration);
        System.out.println(period);

        List.of("mysql", "mariadb", "postgresql");
    }
}
