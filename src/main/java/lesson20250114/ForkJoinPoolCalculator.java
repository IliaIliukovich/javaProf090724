package lesson20250114;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinPoolCalculator extends RecursiveTask<Long> {

    private final long[] numbers;
    private final int threshold;
    private final int start;
    private final int end;

    public ForkJoinPoolCalculator(long[] numbers, int threshold) {
        this(numbers, 0, numbers.length, threshold);
    }

    private ForkJoinPoolCalculator(long[] numbers, int start, int end, int threshold) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= threshold) {
            return computeSequentially();
        }
        ForkJoinPoolCalculator leftTask = new ForkJoinPoolCalculator(numbers, start, start + length/2, threshold);
        leftTask.fork();
        ForkJoinPoolCalculator rightTask = new ForkJoinPoolCalculator(numbers, start + length/2, end, threshold);
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        long[] inputData = LongStream.rangeClosed(1, 100_000_000).toArray();
        int threshold = 10_000;
        ForkJoinTask<Long> task = new ForkJoinPoolCalculator(inputData, threshold);

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long sum = forkJoinPool.invoke(task);
        System.out.println(sum);
    }
}

