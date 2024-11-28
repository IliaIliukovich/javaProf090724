package lesson20241128;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PithagorianTriples {

    public static void main(String[] args) {
        // С помощью IntStream и метода flatmap() получить все тройки пифагоровых чисел менее 1000.
        // (Пифагорова тройка - упорядоченный набор из трёх натуральных чисел (a, b, c),
        // удовлетворяющих уравнению a^2 + b^2 = c^2. Например, [3, 4, 5], [6, 8, 10]).

        // a, b, c  1-1000 O(n^3)
        // a, b  ----> c = sqrt(a^2 + b^2) O(n^2)
        List<int[]> ints = IntStream.rangeClosed(1, 1000).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 1000).boxed().filter(b -> {
                            double c = Math.sqrt(a * a + b * b);
                            return c % 1 == 0 && c < 1000;
                        })
                        .map(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)}))
                .toList();

        ints.forEach(e -> System.out.println(Arrays.toString(e)));

    }



}
