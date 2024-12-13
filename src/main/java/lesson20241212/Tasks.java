package lesson20241212;

import java.util.*;
import java.util.stream.IntStream;

public class Tasks {
       // O(n * m) loop or stream

    public static int[] findCommonElements(int[] a, int[] b) { // O(n + m)
        if (a == null || b == null) return new int[0];
        Set<Integer> setA = new HashSet<>(Arrays.stream(a).boxed().toList()); // O(n)
        List<Integer> result = new ArrayList<>();
        for (int element : b) { // O(m)
            if (setA.contains(element)) { // O(1)
                result.add(element);
            }
        }
        return result.stream().mapToInt(i -> i).toArray(); // O(min(n,m))
    }

    public static int[] findUniqueElements(int[] array) { // O(n)
        return IntStream.of(array).distinct().toArray();
    }


}
