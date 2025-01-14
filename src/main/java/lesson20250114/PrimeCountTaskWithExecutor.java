package lesson20250114;

import java.util.List;
import java.util.concurrent.*;

public class PrimeCountTaskWithExecutor {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = computeParallel();
        long end = System.currentTimeMillis();
        System.out.println("Total numbers of prime: " + count);
        System.out.println("Time elapsed, parallel:" + (end - start));
    }

    private static int computeParallel() {
        CallableTask callableTask1 = new CallableTask(2, 300_000);
        CallableTask callableTask2 = new CallableTask(300_000, 470_000);
        CallableTask callableTask3 = new CallableTask(470_000, 600_000);

        int result;
        try (ExecutorService executor = Executors.newCachedThreadPool()) {
            try {
                List<Future<Integer>> futures = executor.invokeAll(List.of(callableTask1, callableTask2, callableTask3));
                result = futures.stream().mapToInt(f -> {
                    try {
                        return f.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }).sum();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }


    private static class CallableTask implements Callable<Integer> {

        int minNumber;
        int maxNumber;

        public CallableTask(int minNumber, int maxNumber) {
            this.minNumber = minNumber;
            this.maxNumber = maxNumber;
        }

        @Override
        public Integer call() {
            int count = 0;
            for (int i = minNumber; i < maxNumber; i++) {
                boolean isPrime = true;

                for (int j=2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    count++;
            }
            return count;
        }
    }

}
