package lesson19;

public class ThreadMain {

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("overridden method run");
        }
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("overridden method run");
        }
    }

    public static void main(String[] args) {

        Runnable r = () -> {
            System.out.println("interrupted: " + Thread.currentThread().isInterrupted());
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {

            }
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("end");
                return;
            }
            System.out.println("Hello world 2 - " + Thread.currentThread());
            System.out.println("My name: " + Thread.currentThread());
        };




        Thread thread = Thread.currentThread();
        System.out.println(thread.toString());
        System.out.println();

//        new MyThread().start();

        for (int i = 0; i < 5; i++) {
            Thread newThread = new Thread(r);
//            newThread.setDaemon(true);
            try {
                newThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            newThread.setPriority(10);
            newThread.setName(newThread.getName() + " it-academy");
            newThread.start();
            newThread.interrupt();
//            newThread.run();
//            newThread.start();
        }

        System.out.println("Hello world");
    }
}
