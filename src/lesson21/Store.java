package lesson21;

import java.util.concurrent.atomic.AtomicInteger;

public class Store {

    public static final int DEFAULT_LIMIT = 6;

    private int limit = DEFAULT_LIMIT;

    public Store(int limit) {
        this.limit = limit;
    }

    public Store() {
    }

    private final AtomicInteger counter = new AtomicInteger(0);

    public synchronized void add() {
        while (!(counter.get() < limit)) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.printf("Added 1 item. %d items left in store.\n", counter.get());
        counter.incrementAndGet();
        notifyAll();
    }

    public synchronized void remove() {
        while (!(counter.get() > 0)) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

        System.out.printf("Sold 1 item. %d items left in store.\n", counter.get());
        counter.decrementAndGet();
        notifyAll();
    }

}
