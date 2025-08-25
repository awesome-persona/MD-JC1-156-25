package lesson17;

import lesson06.Point;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    @FunctionalInterface
    interface Operation {
        int todo(int a, int b);
//        void good();
    }

    @FunctionalInterface
    interface PointCreator {
        Point todo(int a, int b);
    }

    static class SomeOperation implements Operation {

        int cout = 0;
        @Override
        public int todo(int a, int b) {
            return a + b;
        }

        public int sum(int a, int b) {
            return a + b + cout++;
        }

        public int multiply(int a, int b) {
            return a * b + cout++;
        }

        public int max(int a, int b) {
            return Math.max(a, b) + cout++;
        }
    }

    public static void main(String[] args) {
        SomeOperation someOperation1 = new SomeOperation();
        SomeOperation someOperation2 = new SomeOperation();

        Operation operation1 = new Operation() {
            @Override
            public int todo(int a, int b) {
                return Integer.sum(a, b);
            }
        };

        Operation operation2 = (x, y) -> {
            System.out.println(x + " " + y);
            return x + y;
        };

        Operation absSumOperation = (x, y) -> Math.abs(x) + Math.abs(y);

        Operation operation3 = (x, y) -> x + y;

        Operation operation4 = Integer::sum;
        Operation operation5 = Integer::max;
        Operation operation6 = Integer::min;



        Operation divideOperation = (x, y) -> x / y;

        Operation divideOperation2 = (x, y) -> {
            if (y == 0) {
                return x;
            } else {
                return x / y;
            }
        };


        int todo = divideOperation.todo(4, 1);
        System.out.println(todo);

        Operation op1 = someOperation1::sum;
        Operation op2 = someOperation2::sum;


        System.out.println(op1.todo(5,5));

        PointCreator pointCreator1 = new PointCreator() {
            @Override
            public Point todo(int a, int b) {
                return new Point(a, b);
            }
        };

        PointCreator pointCreator2 = (a, b) -> {
            return new Point(a, b);
        };

        PointCreator pointCreator3 = (a, b) -> new Point(a, b);

        PointCreator pointCreator4 = Point::new;

        Function<String, Integer> function = str -> str.trim().length();

        Function<String, String> function2 = str -> str.trim();
        UnaryOperator<String> op = str -> str.trim();
        Function<String, String> opOp = op;
        Consumer<String> s = str -> System.out.println(str);
        Consumer<String> s1 = System.out::println;
        Supplier<Integer> supplier = () -> new Random().nextInt(100);
        Predicate<Integer> isOdd = num ->  num % 2 == 0;

        BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length() + str2.length();
        BiFunction<String, String, String> biFunction2 = String::concat;
        BinaryOperator<String> binaryOperator = String::concat;





        System.out.println("count: " + function.apply("hello world"));

    }
}
