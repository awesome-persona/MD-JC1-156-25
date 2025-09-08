package lesson23;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalTime now1 = LocalTime.now();
        LocalDate now2 = LocalDate.now();

        LocalDateTime localDateTime1 = LocalDateTime.of(2025, Month.APRIL, 22, 19, 0, 0, 0);

        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        Instant instant1 = new Date().toInstant();
        Instant instant2 = Calendar.getInstance().toInstant();

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneOffset.systemDefault());

        Instant instant = now.toInstant(ZoneOffset.UTC);
    }
}
