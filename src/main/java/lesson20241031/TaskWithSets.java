package lesson20241031;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TaskWithSets {

    public static void main(String[] args) {
        // 1. Set<String> names ------> Set<Integer> длины имен
        // 2. Имеется текст "Hello world!!!". Вывести уникальный набор символов

        // 3. Имеется список Integer, отсортировать его через set
        List<Integer> list = new ArrayList<>(List.of(0, 2, 3, -2, 5, 9, 12, 60, -10));
        sortWithSet(list);
        System.out.println(list);
     }

    public static void sortWithSet(List<Integer> list) { // O(n log n)
        Set<Integer> set = new TreeSet<>();
        for (Integer data : list) { // O(n)
            set.add(data); // O(log n)
        }
        int index = 0;
        for (Integer data : set) { // O(n)
            list.set(index++, data);
        }
    }


}
