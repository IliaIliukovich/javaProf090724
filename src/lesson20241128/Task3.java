package lesson20241128;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        // Написать generic метод makeArray(), который преобразует список в массив.

        List<Integer> integerList = List.of(1, 2, 3);
        Object[] integers = makeArray(integerList);
        System.out.println(Arrays.toString(integers));

        List<String> stringList = List.of("A", "B", "C");
        Object[] strings = makeArray(stringList);
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.getClass());
        System.out.println(strings[0].getClass());


        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1.0);
    }


    public static <U> Object[] makeArray(List<U> arg) {
////        U[] u = new U[arg.size()]; impossible
        Object[] array = new Object[arg.size()];
        int index = 0;
        for (U u : arg) {
            array[index++] = u;
        }
        return array;
//        U[] u = (U[]) Array.newInstance(arg.get(0).getClass(), arg.size());
//        return arg.toArray();
    }



}
