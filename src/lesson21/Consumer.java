package lesson21;

public class Consumer implements Runnable {

    private static final int DEFAULT_NUMBER_OF_ITERATIONS = 10;

    private final Store store;
    private final int n;

    public Consumer(Store store, int n) {
        this.store = store;
        this.n = n;
    }

    public Consumer(Store store) {
        this.store = store;
        this.n = DEFAULT_NUMBER_OF_ITERATIONS;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            store.remove();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

            }
        }
    }
}
