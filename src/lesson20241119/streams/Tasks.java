package lesson20241119.streams;

import java.util.Comparator;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        // 1. Отсортировать с помощью стримов список из строк
        //- по алфавиту
        //- в обратном порядке
        List<String> stringList = List.of("cat", "dog", "apple", "pizza");
        System.out.println(stringList.stream().sorted().toList());
        stringList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //2. Из списка чисел типа Integer с помощью стримов создать список их строковых представлений
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        List<String> strings = integerList.stream().map(String::valueOf).toList();
        System.out.println(strings);


        //3. Создать список из экземпляров класса Employee.
        List<Employee> employees = List.of(new Employee("Tom", "Smiths", 23, 40),
                new Employee("Tom", "Smiths", 23, 40),
                new Employee("Nike", "Smiths", 23, 26),
                new Employee("Mary", "Smiths", 23, 40),
                new Employee("Tom", "Smiths", 23, 20),
                new Employee("Jane", "Smiths", 32, 15),
                new Employee("John", "Smiths", 19, 40));

        //С помощью стримов:
        //- вывести список активных сотрудников старше 20 лет
        //- вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
        //- вывести список фамилий сотрудников с именем John
        //- вывести список всех уникальных имен сотрудников
    }




}
