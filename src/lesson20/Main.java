package lesson20;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {


    private static class Counter {
        private int count = 0;

        public Counter() {
        }

        public synchronized void inc() {
            count = count + 1;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        int n = 10;

        Runnable r = () -> {
            for (int i = 0; i < n; i++) {
                Math.random();
                Math.random();
                Math.random();
                synchronized (counter) {
                    counter.inc();
                    //pause
                    String format = String.format("%25s --- count %d\n", Thread.currentThread(), counter.getCount());
                    //pause
                    System.out.print(format);
                }
                Math.random();
                Math.random();
                Math.random();
                synchronized (counter) {
                    counter.inc();
                    //pause
                    String format = String.format("%25s --- count %d\n", Thread.currentThread(), counter.getCount());
                    //pause
                    System.out.print(format);
                }
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(r).start();
        }


        AtomicInteger atomicInteger = new AtomicInteger();

        int i = atomicInteger.get();
    }
}
