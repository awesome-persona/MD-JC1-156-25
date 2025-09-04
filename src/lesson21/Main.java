package lesson21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String fileName = "somefile.txt";

        Callable<String> callable = () -> {
            try (FileReader fileReader = new FileReader(fileName);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)){
                Thread.sleep(18000);
                String fullText = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
                return fullText;
            } catch (Exception e) {
                System.out.println("Something went wrong " + e.getLocalizedMessage());
                return "";
            }
        };

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Future<String> future = executorService.submit(callable);
            System.out.println("Hello Student");

            Thread.sleep(5000);

            if (future.isDone()) {
                String result = future.get();
                System.out.println(result.substring(0, 10));
            } else {
                System.out.println("wait another 1 sec");
                Thread.sleep(5000);

                try {
                    String s = future.get(5, TimeUnit.SECONDS);
                    System.out.println(s.substring(0, 10));
                } catch (TimeoutException e) {
                    System.out.println("can't wait so long");
                    future.cancel(false);
                }
            }

        } catch (Exception e) {
            System.out.println("Something went wrong " + e.getLocalizedMessage());
        }

        System.out.println("end");
    }
}
