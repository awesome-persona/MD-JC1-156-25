package lesson21;

import java.util.concurrent.Semaphore;

public class Main3 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(100, true);

        Runnable r = () -> {
            try {
                System.out.printf("%s ---> started\n", Thread.currentThread().getName());
                semaphore.acquire(50);
                System.out.printf("%s ---> 50 permits acquired\n", Thread.currentThread().getName());
                Thread.sleep(5000);
                semaphore.release(30);
                System.out.printf("%s ---> 30 permits released\n", Thread.currentThread().getName());
                Thread.sleep(10000);
                semaphore.release(10);
                System.out.printf("%s ---> 10 permits released\n", Thread.currentThread().getName());
                Thread.sleep(10000);
                semaphore.release(10);
                System.out.printf("%s ---> ended\n", Thread.currentThread().getName());
            } catch (Exception e) {

            }
        };

        for (int i = 0; i < 10; i++) {
//            new Thread(r).start();
        }


        Semaphore semaphore1 = new Semaphore(1, false);

        Runnable r2 = () -> {
            try {
                System.out.printf("%s ---> started\n", Thread.currentThread().getName());
//                synchronized (semaphore1) {
                    semaphore1.acquire();
                    System.out.printf("%s ---> permit acquired\n", Thread.currentThread().getName());
                    Thread.sleep(5000);
                    semaphore1.release();
//                }
                System.out.printf("%s ---> ended\n", Thread.currentThread().getName());
            } catch (Exception e) {

            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(r2).start();
        }
    }
}
