package lesson24;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.DayOfWeek;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
public @interface MyAnnotation {

    String text() default "Greetings";

    int count() default 10;

    DayOfWeek dayOfWeek() default DayOfWeek.FRIDAY;

    String value();

}
