package lesson20241010.arrays;

import java.util.Arrays;

public class Tasks {


    public static void main(String[] args) {
        String[] data = {"One", "Two", "Three", "Four", "Five"};
        changePlace(data);
        System.out.println(Arrays.toString(data));
    }

    // 1. Напишите метод, который меняет местами элементы одномерного массива из String в обратном порядке.
    //Не используйте дополнительный массив для хранения результатов.
    //Input:
    //	data = {"One", "Two", "Three"}
    //Result:
    //	data = {"Three", "Two", "One"}
    public static void changePlace(String[] data) {
        for (int i = 0; i < data.length / 2; i++) { // цикл идет до середины массива
            // Находим индекс элемента для замены
            int j = data.length - 1 - i;
            // Меняем местами элементы
            String tmp = data[i];
            data[i] = data[j];
            data[j] = tmp;
        }
    }

    // 2. Создать метод transpose(), который будет транспонировать матрицу (заменять строки на столбцы).
    //Input:
    //	1 2 3 4
    //	5 6 7 8
    //	9 0 0 0
    //Output:
    //	1 5 9
    //	2 6 0
    //	3 7 0
    //	4 8 0
    //


}
