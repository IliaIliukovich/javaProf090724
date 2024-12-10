package lesson20241107;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchAdaptation {

    // Напишите метод, чтобы получить первое и последнее вхождение элементов в отсортированном списке.

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(List.of(1, 1, 2, 2, 2, 2, 2, 2, 4, 4, 5, 7, 9, 10));
        searchFirstAndLast(data, 2);
    }

    public static void searchFirstAndLast(List<Integer> data, int element) { // log(n)
        int first = searchFirst(data, element); // log(n)
        System.out.println("Index of first occurrence: " + first);
        int last = searchLast(data, element); // log(n)
        System.out.println("Index of last occurrence: " + last);
    }

    private static int searchFirst(List<Integer> list, Integer key) {
        int startIndex = 0;
        int endIndex = list.size() - 1;
        while (startIndex <= endIndex) {
            int middleIndex =startIndex + (endIndex - startIndex) / 2;
            if (key.compareTo(list.get(middleIndex)) > 0){
                startIndex = middleIndex + 1;
            } else if (key.compareTo(list.get(middleIndex)) < 0) {
                endIndex = middleIndex - 1;
            } else {
                if (middleIndex == 0 || key.compareTo(list.get(middleIndex - 1)) > 0) {
                    return middleIndex;
                } else {
                    endIndex = middleIndex - 1;
                }
            }
        }
        return -1;
    }

    private static int searchLast(List<Integer> list, Integer key) {
        int startIndex = 0;
        int endIndex = list.size() - 1;
        while (startIndex <= endIndex) {
            int middleIndex =startIndex + (endIndex - startIndex) / 2;
            if (key.compareTo(list.get(middleIndex)) > 0){
                startIndex = middleIndex + 1;
            } else if (key.compareTo(list.get(middleIndex)) < 0) {
                endIndex = middleIndex - 1;
            } else {
                if (middleIndex == list.size() - 1 || key.compareTo(list.get(middleIndex + 1)) < 0) {
                    return middleIndex;
                } else {
                    startIndex = middleIndex + 1;
                }
            }
        }
        return -1;
    }


}
