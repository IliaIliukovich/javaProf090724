package summary20241129.generics;

import java.util.List;

public class SteamExamples {

    public static void main(String[] args) {
        List.of(1, 2, 3).stream()
                .parallel()
                .sorted()
                .sequential()
                .sorted()
                .filter(e -> true)
                .map(integer -> integer)
                .forEach(System.out::println);
    }



}
