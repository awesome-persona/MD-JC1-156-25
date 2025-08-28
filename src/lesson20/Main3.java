package lesson20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main3 {

    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.printf("%s --- started  --- time: %s \n", Thread.currentThread(), System.currentTimeMillis() / 1000);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%s --- finished --- time: %s \n", Thread.currentThread(), System.currentTimeMillis() / 1000);
        };



        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 5; i++) {
//                executorService.execute(r);
            }
        }

        try (ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            for (int i = 0; i < 15; i++) {
//                executorService.execute(r);
            }
        }


        try (ExecutorService executorService =
                     new ThreadPoolExecutor(2, 4, 100L, TimeUnit.SECONDS,
                             new LinkedBlockingQueue<Runnable>())) {
            for (int i = 0; i < 15; i++) {
//                executorService.execute(r);
            }
        }


        try(ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);) {
            for (int i = 0; i < 15; i++) {
//                scheduledExecutorService.schedule(r, 5, TimeUnit.SECONDS);
            }
        }

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//        scheduledExecutorService.scheduleAtFixedRate(r, 5, 2, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(r, 1, 3, TimeUnit.SECONDS);

//        ExecutorService executorService2 = Executors.newCachedThreadPool();



    }
}
