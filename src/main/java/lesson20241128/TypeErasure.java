package lesson20241128;

import java.util.ArrayList;
import java.util.List;

public class TypeErasure implements Comparable<String> {


    @Override
    public int compareTo(String o) {
        return 0;
    }

    public int compareTo(Integer o) {
        return 0;
    }

//    public int compareTo(Object o) { // impossible because of type erasure
//        return 0;
//    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[4];
        String[] strings = new String[4];

        System.out.println(integers.getClass());
        System.out.println(strings.getClass());
        System.out.println(integers.getClass().equals(strings.getClass()));

        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        System.out.println(integerList.getClass());
        System.out.println(stringList.getClass());
        System.out.println(integerList.getClass().equals(stringList.getClass()));
    }



}
