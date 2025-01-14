package lesson20250114;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

public class StreamParallelComputations {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            long start = System.currentTimeMillis();
            long sum = LongStream.range(0, 1_000_000_000).sum();
            long end = System.currentTimeMillis();
            System.out.println(sum);
            System.out.println("Time spent, sequentially: " + (end - start));

            start = System.currentTimeMillis();
            sum = LongStream.range(0, 1_000_000_000).parallel().sum();
            end = System.currentTimeMillis();
            System.out.println(sum);
            System.out.println("Time spent, parallel: " + (end - start));
        }


        LongStream.range(0, 100).parallel().peek(i -> System.out.println(Thread.currentThread().getName())).sum();

        List<Integer> integers = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        integers.stream().parallel().sequential().parallel().sequential().parallel();
        integers.parallelStream(); // uneffective for LinkedList
        
        // effective for arrays, ArrayList, HashMap, HashSet
    }

}
