package lesson20241015.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
    // I
    // 1. У вас есть список строковых значений, вы должны вернуть список со всеми этими строковыми значениями в верхнем регистре
//        List<String> stringList = Arrays.asList("Value1", "Value2", "Value3");
        List<String> stringList = new ArrayList<>(List.of("Value1", "Value2", "Value3"));
        List<String> result = new ArrayList<>();
        for (String s : stringList) {
            result.add(s.toUpperCase());
        }
        System.out.println(result);

    // 2. У вас есть список значений Integer, вы должны вернуть список, каждое значение которого умножается на 2
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> result2 = new ArrayList<>();
        for (Integer i : integerList) {
            result2.add(i * 2);
        }
        System.out.println(result2);

    // 3. У вас есть список значений String, вы должны вернуть список количества символов этих String
        List<String> stringList2 = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));
        List<Integer> result3 = new ArrayList<>();
        for (String s : stringList2) {
            result3.add(s.length());
        }
        System.out.println(result3);
    }



}
