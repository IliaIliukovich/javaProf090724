package lesson20241114;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Task {

    public static void main(String[] args) {
        // Написать метод, который на вход принимает два массива одинакового размера типа Integer и функцию.
        // Метод возвращает массив, в котором хранятся результаты попарных вычислений согласно переданной функции.
            Integer[] data1 = {1, 2, 3, 4, 5};
            Integer[] data2 = {2, 2, 2, 2, 2};

            Integer[] result = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 * int2));
            // {2, 4, 6, 8, 10}
            System.out.println(Arrays.toString(result));

            result = applyFunctionToArray(data1, data2, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer + integer2;
                }
            });
            // {3, 4, 5, 6, 7}
            System.out.println(Arrays.toString(result));

    }

    public static Integer[] applyFunctionToArray(Integer[] data1, Integer[] data2, BinaryOperator<Integer> operator) {
        Integer[] result = new Integer[data1.length];
        for (int i = 0; i < data1.length; i++) {
            result[i] = operator.apply(data1[i], data2[i]);
        }
        return result;
    }


}
