package lesson20241017.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTask {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Дан список из числовых данных. С помощью итератора:
        // - Напечатать только четные числа из списка.

        // - Удалить из списка все числа, заканчивающиеся на 0.
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer % 10 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        // - Составить список квадратов чисел.


    }



}
