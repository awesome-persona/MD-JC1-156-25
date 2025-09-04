package lesson21;

import lesson09.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.stream.Stream;

public class Main4 {

    private static class Result {
        private final String stringValue;
        private final Integer intValue;
        private Double dValue;
        private Point point;
        private Map<String, Integer> map = new HashMap<>();

        public Result(String stringValue, Integer intValue) {
            this.stringValue = stringValue;
            this.intValue = intValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public Integer getIntValue() {
            return intValue;
        }
    }

    public static void main(String[] args) {
        Exchanger<Result> exchanger = new Exchanger<>();
        Runnable r1  = () -> {
            try {
                System.out.printf("%s ---> started\n", Thread.currentThread().getName());
                String text = "some text from r1";
                System.out.printf("%s ---> before exchange %s\n", Thread.currentThread().getName(), text);
                Result result = exchanger.exchange(new Result(text, null));
                System.out.printf("%s ---> after exchange %s %s\n", Thread.currentThread().getName(), result.getIntValue(), result.getStringValue());
                System.out.printf("%s ---> ended\n", Thread.currentThread().getName());
            } catch (Exception e) {

            }
        };

        Runnable r2  = () -> {
            try {
                System.out.printf("%s ---> started\n", Thread.currentThread().getName());
                String text = "some text from r2";
                Integer someNumber = 123123;
                System.out.printf("%s ---> before exchange %s\n", Thread.currentThread().getName(), text);
                Result result = exchanger.exchange(new Result(text, someNumber));
                System.out.printf("%s ---> after exchange %s\n", Thread.currentThread().getName(), result.getStringValue());
                System.out.printf("%s ---> ended\n", Thread.currentThread().getName());
            } catch (Exception e) {

            }
        };

//        List.of(r1, r2).forEach(r  -> new Thread(r).start());

        Stream.of(r1, r2).map(Thread::new).forEach(Thread::start);

    }
}
