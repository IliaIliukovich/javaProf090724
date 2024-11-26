package lesson20241126;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SumElements {

    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 0; i < 10_000; i++) {
            sum += 0.1;
        }
        System.out.println(sum);
        System.out.println(sum == 1000);

        double sumByStream = IntStream.range(0, 10_000).mapToDouble(i -> 0.1).sum();
        System.out.println(sumByStream);

        System.out.println(IntStream.rangeClosed(1, 10000)
                .asDoubleStream()
                .reduce(0.0, (r, i) -> r + 0.1));

    }



}
