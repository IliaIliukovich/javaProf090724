package summary20241122;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        // Дан список кошек
        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 6, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        Cat cat6 = new Cat("Vasya", 5, "black", false);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6);

        //1. Получить Map<String, Boolean> имя / информация, голодна ли кошка
//        Map<String, Boolean> hungryCatsByName = catList.stream()
//                .collect(Collectors.toMap(Cat::getName, Cat::isHungry));
//        System.out.println(hungryCatsByName);
        Map<String, Boolean> hungryCatsByName = catList.stream()
                .collect(Collectors.toMap(Cat::getName, Cat::isHungry, (isHungry1, isHungry2) -> isHungry1 || isHungry2));
        System.out.println(hungryCatsByName);

        //2. Получить Map<String, Long> цвет / количество кошек данного цвета
        Map<String, Integer> catsByColours = catList.stream().collect(Collectors.toMap(Cat::getColour, cat -> 1, Integer::sum));
        System.out.println(catsByColours);
        Map<String, Long> catsByColours2 = catList.stream().collect(Collectors.groupingBy(Cat::getColour, Collectors.counting()));
        System.out.println(catsByColours2);

        //3. Получить Map<String, Long> цвет / средний возраст кошек данного цвета
        Map<String, Double> catsByColours3 = catList.stream().collect(Collectors.groupingBy(Cat::getColour, Collectors.averagingDouble(Cat::getAge)));
        System.out.println(catsByColours3);

        //4. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
        Map<String, List<String>> catsByColours4 = catList.stream()
                .collect(Collectors.groupingBy(Cat::getColour, Collectors.mapping(Cat::getName, Collectors.toList())));
        System.out.println(catsByColours4);

        //5. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста
        Map<Integer, Integer> catsByAge = catList.stream()
                .collect(Collectors.groupingBy(Cat::getAge, Collectors.mapping(Cat::isHungry, Collectors.summingInt(value -> value ? 1 : 0))));
        System.out.println(catsByAge);
    }

    static class Cat {
        private String name;
        private int age;
        private String colour;
        private boolean isHungry;

        public Cat(String name, int age, String colour, boolean isHungry) {
            this.name = name;
            this.age = age;
            this.colour = colour;
            this.isHungry = isHungry;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getColour() {
            return colour;
        }

        public boolean isHungry() {
            return isHungry;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", colour='" + colour + '\'' +
                    ", isHungry=" + isHungry +
                    '}';
        }
    }




}
