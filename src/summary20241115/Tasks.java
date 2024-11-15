package summary20241115;

import java.util.List;
import java.util.function.BiFunction;

public class Tasks {

    public static void main(String[] args) {
        // 1. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
        System.out.println((int) Math.pow(2, 3));
        BiFunction<Integer, Integer, Integer> powerFunction = (a, b) -> (int) Math.pow(a, b);
        System.out.println(powerFunction.apply(2, 10));


        //2. Создать три функции:
        //- обрезает входную строку до 11 символов,
        //- добавляет текст "Info: " перед
        //- делает основной текст upper case
        //Составить композитную функцию так, чтобы:
        //Input:
        //"Some random data"
        //Output:
        //"Info: SOME RANDOM"

        // 3. Написать метод, который на вход принимает список String и производит фильтрацию данных согласно реализации
        //интерфейса Filter (например, через лямбда-выражение)
        //Интерфейс Filter имеет метод apply (String data), с помощью которого можно будет указывать способ фильтрации.
        //interface Filter {
        //   boolean apply(String data);
        //}
        //Отфильтрованные данные возвращаются в новом списке.

        List<String> list = List.of("One", "Two", "Three", "Four", "Five");
        List<String> result = applyFilterToList(list, element -> element.length() == 3);
        System.out.println(result); // One Two

        result = applyFilterToList(list, element -> element.startsWith("T"));
        System.out.println(result); // Two Three

    }

    public static List<String> applyFilterToList(List<String> list, Filter filter) {
        return null; // TODO
    }


}
