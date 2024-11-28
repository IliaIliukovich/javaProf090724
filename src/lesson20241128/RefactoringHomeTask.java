package lesson20241128;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RefactoringHomeTask {

    public static void main(String[] args) {

        // a)
        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> doubles = doubleList.stream().filter(d -> d % 2 == 1).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(doubles);

        // b)
        List<String> list = List.of("One", "Two", "Three", "Four", "Five");
        String word = list.stream().filter(s -> s.length() == 3).findFirst().orElse(null);
        System.out.println(word);

        // g)
        Set<String> names = Set.of("Ivan", "Peter", "William", "Mary");
        Set<Integer> integerSet = names.stream().map(String::length).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(integerSet);

        // h)
        Map<Boolean, List<Integer>> map = getMap();
        System.out.println(map);
    }


    // c)
    public static int getSum(List<Integer> integers) {
        return integers.stream().filter(i -> i % 2 != 0).mapToInt(v -> v).sum();
    }

    // d)
    public static int linearSearch(String[] data, String element) {
        return IntStream.range(0, data.length)
                .filter(i -> data[i].equals(element))
                .findFirst()
                .orElse(-1);
    }

    // f)
    public static void fill(List<Integer> list, int capacity) {
        IntStream.range(0, capacity).forEach(i -> list.add(i));
    }

    // h)
    public static Map<Boolean, List<Integer>> getMap() {
//        return IntStream.range(0, 100).boxed()
//                .collect(Collectors.partitioningBy(i -> (i % 3 == 0), Collectors.toCollection(ArrayList::new)));
        return IntStream.range(0, 100).boxed().collect(Collectors.partitioningBy(i -> (i % 3 == 0)));
    }


}
