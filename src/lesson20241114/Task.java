package lesson20241114;

import java.util.function.BinaryOperator;

public class Task {

    public static void main(String[] args) {
        // Написать метод, который на вход принимает два массива одинакового размера типа Integer и функцию.
        // Метод возвращает массив, в котором хранятся результаты попарных вычислений согласно переданной функции.
            Integer[] data1 = {1, 2, 3, 4, 5};
            Integer[] data2 = {2, 2, 2, 2, 2};

            Integer[] result = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 * int2));
            // {2, 4, 6, 8, 10}

            result = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 + int2));
            // {3, 4, 5, 6, 7}

    }

    public static Integer[] applyFunctionToArray(Integer[] data1, Integer[] data2, BinaryOperator<Integer> operator) {
        return new Integer[0];
    }


}
