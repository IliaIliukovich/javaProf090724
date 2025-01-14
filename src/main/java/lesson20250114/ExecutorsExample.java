package lesson20250114;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1_000);

        Executor customSingleThreadExecutor = task -> {
            Thread thread = new Thread(task);
            thread.start();
        };

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " going task");
        };

        Callable<String> callableTask = () -> {
            System.out.println(Thread.currentThread().getName() + " going callable task");
            return "data from callable processed by " + Thread.currentThread().getName();
        };


        customSingleThreadExecutor.execute(task);
        customSingleThreadExecutor.execute(task);
        customSingleThreadExecutor.execute(task);

        try (ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor()) {
            singleThreadExecutor.execute(task);
            singleThreadExecutor.execute(task);
            singleThreadExecutor.execute(task);
//        executorService.shutdown();
            Future<String> future = singleThreadExecutor.submit(callableTask);

            Thread.sleep(5_000); // main thread doing some other tasks

            try {
                String result = future.get(); // main thread waiting for the result from threadpool
                System.out.println(result);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }

        Callable<String> callableTask2 = () -> {
            System.out.println(Thread.currentThread().getName() + " going callable task");
            Thread.sleep(5_000);
            return "data from callable processed by " + Thread.currentThread().getName();
        };

        int maxThreads = Runtime.getRuntime().availableProcessors();
//        ExecutorService manyThreadsExecutor = Executors.newFixedThreadPool(3);
        ExecutorService manyThreadsExecutor = Executors.newCachedThreadPool();
        List<Future<String>> futures = manyThreadsExecutor.invokeAll(List.of(callableTask2, callableTask2, callableTask2, callableTask2, callableTask2));

        futures.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });

        Thread.sleep(20_000);
        manyThreadsExecutor.submit(callableTask2);
        manyThreadsExecutor.submit(callableTask2);
        manyThreadsExecutor.submit(callableTask2);

        manyThreadsExecutor.shutdown();
    }

}
