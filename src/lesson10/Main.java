package lesson10;

import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        List<Object> objects = List.of();

        Stream<Object> stream = objects.stream();
        Stream<Object> stream1 = StreamSupport.stream(Spliterators.spliterator(objects, 0), false);


        Classes classes = new Classes();
//        Classes.InnerClass innerClass = classes.new InnerClass();



    }
}
