package lesson18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 12, 3, 6, 7, 2, 11, 3, 7, 13, 4, 2, 5, 9);
        numbers.forEach(n -> System.out.print(n));
        numbers.forEach(System.out::print);

        System.out.println();

        numbers.stream().forEach(n -> System.out.print(n + " "));

        System.out.println();
        numbers.stream()
                .filter(n -> n % 2 != 0) // && n > 5
                .takeWhile(n -> n < 13)
                .filter(n -> n > 5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        numbers.stream()
                .dropWhile(n -> n < 13)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        numbers.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        numbers.stream()
                .skip(5)
                .limit(6)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        int page = 1292;
        int pageSize = 30;

        numbers.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> stream1 = numbers.stream();
        Stream<Integer> stream2 = numbers.stream();
        Stream<Integer> stream3 = numbers.stream();

//        Stream.concat(Stream.concat(stream1, stream2), stream3)
//                .forEach(n -> System.out.print(n + " "));
        System.out.println();


        Stream<Integer> stream12 = Stream.concat(stream1, stream2);
        Stream<Integer> stream123 = Stream.concat(stream12, stream3);
        stream123.forEach(n -> System.out.print(n + " "));
        System.out.println();


        Stream<String> capitals = Stream.of("Moscow", "Minsk", "Kiev", "Warsaw", "Oslo", "Paris", "Madrid");
        IntStream intStream = capitals.mapToInt(s -> s.length());
//        Stream<Integer> lengths = capitals.map(s -> s.length());
        OptionalInt max = intStream.max();
        int asInt = max.getAsInt();
        System.out.println(asInt);

//
        System.out.println();
        ;

        Stream.of("Moscow", "Minsk", "Kiev", "Warsaw", "Oslo", "Paris", "Madrid")
                .map(s -> {
                    //adasdasdasdas
                    return s + " city";
                })
                .forEach(n -> System.out.print(n + " "));

        System.out.println();


        Function<String, Stream<Character>> function = str -> {
            char[] charArray = str.toCharArray();
            List<Character> characterList = new ArrayList<>();
            for (char ch : charArray) {
                characterList.add(ch);
            }
            return characterList.stream();
        };

        Function<char[], Stream<Character>> charsToCharacterStreamFunction = chars -> {
            List<Character> characterList = new ArrayList<>();
            for (char ch : chars) {
                characterList.add(ch);
            }
            return characterList.stream();
        };


        Stream.of("Moscow", "Minsk", "Kiev", "Warsaw", "Oslo", "Paris", "Madrid")
                .map(s -> s.toLowerCase())
                .map(s -> s.toCharArray())
//                .peek(n -> System.out.print(Arrays.toString(n) + " "))
                .flatMap(charsToCharacterStreamFunction)
                .distinct()
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        long count = Stream.of("Moscow", "Minsk", "Kiev", "Warsaw", "Oslo", "Paris", "Madrid")
                .filter(s -> s.length() == 6)
                .count();

        Optional<String> first = Stream.of("Moscow", "Minsk", "Kiev", "Warsaw", "Oslo", "Paris", "Madrid")
                .filter(s -> s.length() == 16)
                .parallel()
                .findFirst();

        System.out.println(first.orElse("No city"));

        System.out.println();

        List<Integer> integers = List.of(1, 2, 3, 6, 7, 2, 8);

        System.out.println("--------- end -----------");
        System.out.println();

        Supplier<Integer> supplier = () -> {
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int n = new Random().nextInt(100);
            System.out.println("hello world " + n);
            return n;
        };

        Integer i1 = integers.stream()
//                .filter(n -> n > 10)
                .findAny()
                .orElse(supplier.get());
        System.out.println(i1);

        Integer i2 = integers.stream()
//                .filter(n -> n > 10)
                .findAny()
                .orElseGet(supplier);

        System.out.println(i2);

        long count2 = integers.size();
        long count1 = integers.stream().filter(val -> val % 2 == 0).count();

        boolean b = integers.stream().allMatch(val -> val % 2 == 0);
        boolean b1 = integers.stream().anyMatch(val -> val % 2 == 0);
        boolean b2 = integers.stream().noneMatch(val -> val % 2 == 0);
        boolean b3 = !b2;
    }
}
