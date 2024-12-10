package lesson20241121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>());
        listOfLists.add(new ArrayList<>());
        listOfLists.get(0).add("A");
        listOfLists.get(0).add("B");
        listOfLists.get(0).add("C");
        listOfLists.get(1).add("D");
        listOfLists.get(1).add("E");
        listOfLists.get(1).add("F");
        listOfLists.get(2).add("G");
        listOfLists.get(2).add("H");

        Stream<List<String>> stream = listOfLists.stream();
        Stream<String> stringStream = listOfLists.stream().flatMap(list -> list.stream());
        stringStream.forEach(System.out::println);

        System.out.println("Get unique set of letters:");
        List<String> strings = List.of("One", "Two", "apple", "orange", "chocolate");
        strings.stream()
                .flatMap(string -> string.chars().boxed())
                .peek(System.out::println)
                .map(c -> Character.toString(c).toLowerCase())
                .distinct()
                .forEach(System.out::println);

    }


}
