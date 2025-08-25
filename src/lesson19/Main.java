package lesson19;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Optional<String> min = Stream.of("aasd", "dsada", "asdasd")
                .min((a,b) -> a.compareTo(b));

        Optional<String> min2 = Stream.of("aasd", "dsada", "asdasd")
                .min(String::compareTo);

        OptionalInt min1 = IntStream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123).min();
        OptionalDouble avg = IntStream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123).average();


        Optional<Integer> reduce = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .filter(n -> n < 10)
                .reduce((a, b) -> a + b);


        Integer reduce1 = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .reduce(0, (a, b) -> a + b);


        Integer reduce2 = Stream.of("aasd", "dsada", "asdasd", "qweqwe")
                .reduce(0, (count, str) -> count + str.length(), Integer::sum);

        System.out.println(reduce.orElse(-1));
        System.out.println(reduce1);
        System.out.println(reduce2);


        List<Integer> collect = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .filter(n -> n < 10)
                .map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<Integer> list = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .filter(n -> n < 10)
                .map(n -> n * 3)
                .toList();

        Set<Integer> collect1 = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .filter(n -> n < 10)
                .map(n -> n * 3)
                .collect(Collectors.toSet());
        System.out.println(collect1);

        Map<Integer, Integer> collect2 = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
                .filter(n -> n < 10)
                .map(n -> n * 3)
                .distinct()
                .collect(Collectors.toMap(n -> n, n -> n));
        System.out.println(collect2);


        Map<String, Integer> collect3 = Stream.of("aasd", "dsada", "asdasd", "qweqwe")
                .collect(Collectors.toMap(Function.identity(), str -> str.hashCode()));
        System.out.println(collect3);


        Map<Integer, List<String>> collect4 = Stream.of("dog", "cat", "bat", "rat", "door", "bell", "winter", "summer", "mouse", "tiger", "bear")
                .collect(Collectors.groupingBy(str -> str.length()));

        System.out.println(collect4);

        Map<Integer, Long> collect5 = Stream.of("dog", "cat", "bat", "rat", "door", "bell", "winter", "summer", "mouse", "tiger", "bear")
                .collect(Collectors.groupingBy(str -> str.length(), Collectors.counting()));

        System.out.println(collect5);

        int size = collect4.get(4).size();
        Long l = collect5.get(4);


        long count = Stream.of(1, 2,
                        12, 3,
                        124, 21,
                        2, 4132,
                        234, 1234,
                        123)
                .parallel()
                .filter(n -> n < 10)
                .map(n -> n * 3)
                .distinct()
                .count();


//        a + b  = b + a;
//        a - b  != b - a;
//        a / b  = b / a;

        System.out.println();
        Integer reduce3 = Stream.of(1, 2, 12, 3, 124, 21, 2, 4132, 234, 1234, 123)
//                .parallel()
//                .filter(n -> n < 10)
                .reduce(0, (a, b) -> {
                    int result = a - b;

                    System.out.printf("a= %5s b= %5s result: %5s    %s\n", a, b, result, Thread.currentThread().getName());
                    return result;
                });

        System.out.println(reduce3);
    }
}
