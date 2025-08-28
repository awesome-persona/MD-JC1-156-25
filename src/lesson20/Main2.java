package lesson20;

import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {

//    private static class Counter {
//        private int count = 0;
//
//        public Counter() {
//        }
//
//        public synchronized void inc() {
//            count = count + 1;
//        }
//
//        public int getCount() {
//            return count;
//        }
//    }

    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();

        int n = 10;

        Runnable r = () -> {
            for (int i = 0; i < n; i++) {

                System.out.printf("%25s --- count %d\n", Thread.currentThread(), counter.incrementAndGet());
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }

    }
}
