package lesson21;

public class Producer implements Runnable {

    private static final int DEFAULT_NUMBER_OF_ITERATIONS = 10;

    private final Store store;
    private final int n;

    public Producer(Store store, int n) {
        this.store = store;
        this.n = n;
    }

    public Producer(Store store) {
        this.store = store;
        this.n = DEFAULT_NUMBER_OF_ITERATIONS;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            store.add();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
    }
}
