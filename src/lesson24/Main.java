package lesson24;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.time.DayOfWeek;

@MyAnnotation(value = "test val", text = "test text")
public class Main {

    @MyAnnotation("some value")
    public static void main(String[] args) throws Exception {
        Class<Main> mainClass = Main.class;
        Annotation[] annotations = mainClass.getAnnotations();
        for(Annotation annotation : annotations) {
            System.out.println(annotation.getClass().getName());
        }

        MyAnnotation my = mainClass.getAnnotation(MyAnnotation.class);
        int count = my.count();
        DayOfWeek dayOfWeek = my.dayOfWeek();
        String text = my.text();
        String value = my.value();

        System.out.println(my);

        Method main = mainClass.getMethod("main", String[].class);
        MyAnnotation myy2 = main.getAnnotation(MyAnnotation.class);
        System.out.println(myy2);

        Connection connection;

    }
}
