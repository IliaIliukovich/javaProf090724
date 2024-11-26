package lesson20241126.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        //Написать generic метод makeList(), который преобразует массив в список.

        Integer[] integers = {1 ,2, 3};
        List<Integer> integerList = makeList(integers);
        System.out.println(integerList);
        String[] strings = {"a", "b", "c"};
        List<String> stringList = makeList(strings);
        System.out.println(stringList);

    }

    public static <T> List<T> makeList(T[] t) {
//        List<T> resultList = new ArrayList<>();
//        for (T element : t) {
//            resultList.add(element);
//        }
//        return resultList;
//        return List.of(t);
        return Arrays.asList(t);
    }


}
