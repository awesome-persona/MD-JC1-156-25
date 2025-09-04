package lesson21;

import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Store store = new Store(6);
        Producer producer1 = new Producer(store, 8);
        Producer producer2 = new Producer(store, 10);
        Producer producer3 = new Producer(store, 14);

        Consumer consumer1 = new Consumer(store, 7);
        Consumer consumer2 = new Consumer(store, 4);
        Consumer consumer3 = new Consumer(store, 9);
        Consumer consumer4 = new Consumer(store, 6);
        Consumer consumer5 = new Consumer(store, 6);

        List<Runnable> runnables = List.of(producer1, producer2, producer3, consumer1, consumer2, consumer3, consumer4, consumer5);
        runnables.forEach(r -> new Thread(r).start());

    }
}
