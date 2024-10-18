package summary20241018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hometasks {

    public static void main(String[] args) {
        // 2. Написать метод generateMatrix(), который будет создавать матрицу размера m на n,
        //у которой на побочной диагонали будут единицы, остальные значения 0.
        //Input: n = 4, m = 3
        //Output:
        //	0 0 0
        //	0 0 1
        //	0 1 0
        //	1 0 0

        int[][] matrix = generateMatrix(4, 1);
        print2DArray(matrix);

//        3. Написать метод, который проверяет, является ли массив отсортированным
        System.out.println(isSorted(new int[] {1, 1, -2, 3}));

//        4. Написать метод, который выдает из исходного двумерного массива массив максимумов столбцов.
        int[][] array = {{100, 20, 3},
                        {3, 2, 8},
                        {1, 3, 11}};
        int[] maxArray = getMaxArray(array);
        System.out.println(Arrays.toString(maxArray));

    // Напишите метод для объединения двух списков в один общий ArrayList
        List<String> list1 = List.of("A", "B", "C");
        List<String> list2 = List.of("D", "E", "F");
        List<String> result = uniteLists(list1, list2);
        System.out.println(result);

    // У вас есть список значений String, вы должны вернуть одну строку, которая представляет собой конкатенацию всех значений.
        List<String> data = List.of("Hello", "World", "!!!");
        String resultString = concatList(data);
        System.out.println(resultString);

        String string = String.join(" ", data);
        System.out.println(string);
    }

    public static String concatList(List<String> data) {
        StringBuilder result = new StringBuilder();
        for (String element : data) {
            result.append(element).append(" ");
        }
        return result.toString();
    }

    public static List<String> uniteLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static int[] getMaxArray(int[][] array) {
        int[] maxArray = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            int max = array[0][j];
            for (int i = 1; i < array.length; i++) {
                max = Math.max(max, array[i][j]);
            }
            maxArray[j] = max;
        }
        return maxArray;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // n - 1 check alg <---> n * log n sort alg
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }

    public static int[][] generateMatrix(int n, int m) {
        int min = Math.min(n, m);
        int j = 0;
        int[][] matrix = new int[n][m];
        for (int i = n - 1; i >= n - min; i--) {
            matrix[i][j++] = 1;
        }
        return matrix;
    }

    public static void print2DArray(int[][] arayOfArray) {
        for (int i = 0; i < arayOfArray.length; i++) {
            for (int j = 0; j < arayOfArray[i].length; j++) {
                System.out.print(arayOfArray[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }


}
