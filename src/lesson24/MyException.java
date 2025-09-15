package lesson24;

import java.time.DayOfWeek;

@MyAnnotation(value = "test", text = "dd", count = 1, dayOfWeek = DayOfWeek.FRIDAY)
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
