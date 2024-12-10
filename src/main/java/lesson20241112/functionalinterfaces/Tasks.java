package lesson20241112.functionalinterfaces;

import java.util.function.Supplier;

public class Tasks {

    public static void main(String[] args) {

    // 1. Создать Supplier generateBot, который выдает пользователю экземпляр класса Bot.
        Supplier<Bot> botGenerator = () -> new Bot();
        Bot bot1 = botGenerator.get();
        Bot bot2 = botGenerator.get();

    // 2. Создать Consumer, который принимает числа и печатает их в формате "---123---".

    // 3. Создать Predicate isAdultEmployee, который проверяет, что возраст Employee больше 18.

    // 4. Создать Function, которая вычисляет сумму чисел от 1 до n включительно.

    }

    static class Bot {

    }

    static class Employee {
        int age;

        public Employee(int age) {
            this.age = age;
        }
    }


}
