package lesson20241121;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 1, 6, 8, 10, 11, 21, 17);


        List<Integer> list = integers.stream().toList(); // unmodifiable
        list = integers.stream().collect(Collectors.toList()); // unknown
        list= integers.stream().collect(Collectors.toCollection(ArrayList::new)); // ArrayList
        list= integers.stream().collect(Collectors.toCollection(LinkedList::new)); // LinkedList
        Set<Integer> set = integers.stream().collect(Collectors.toSet());// unknown Set
        set = integers.stream().collect(Collectors.toCollection(HashSet::new));// HashSet

        Optional<Integer> optional = integers.stream().filter(integer -> integer % 9 == 0).findFirst();
        System.out.println(optional.orElse(-1));

        System.out.println(integers.stream().findAny().orElse(-1));

        long count = integers.stream().count();
        System.out.println(count);

        System.out.println(integers.stream().anyMatch(integer -> integer % 7 == 0));
        System.out.println(integers.stream().allMatch(integer -> integer % 7 == 0));

        System.out.println(integers.stream().min(Integer::compareTo).get());
        System.out.println(integers.stream().max(Integer::compareTo).get());

        Integer[] array = integers.stream().filter(integer -> integer % 2 == 0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

        System.out.println(integers.stream().reduce(0, (accumulator, data) -> accumulator + data)); // sum
        System.out.println(integers.stream().reduce((accumulator, data) -> accumulator + data).get()); // sum
        System.out.println(integers.stream().reduce((accumulator, data) -> accumulator + data * data).get()); // sum square

        System.out.println(integers.stream().reduce(0, (accumulator, data) -> accumulator + 1)); // count
        System.out.println(integers.stream().reduce((accumulator, data) -> Math.min(accumulator, data)).get()); // min

        List<String> strings = List.of("One", "Two", "Three", "Four", "Five");
        System.out.println(strings.stream().reduce("base", (s, s2) -> s + "|" + s2));
        System.out.println(strings.stream().reduce((s, s2) -> s + "|" + s2).get());

    }



}
