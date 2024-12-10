package lesson20241107.maps;

import java.util.*;

public class Pizza {

    private String name;
    private int size;
    private String cookName;
    private boolean isPresent;

    public Pizza(String name, int size, String cookName, boolean isPresent) {
        this.name = name;
        this.size = size;
        this.cookName = cookName;
        this.isPresent = isPresent;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", 2, "Peter", true);
        Pizza pizza2 = new Pizza("4 Cheese", 5, "Mark", false);
        Pizza pizza3 = new Pizza("Pepperoni", 6, "Mark", true);
        Pizza pizza4 = new Pizza("Diablo", 2, "Peter", false);
        Pizza pizza5 = new Pizza("Spicy", 2, "Steve", true);
        Pizza pizza6 = new Pizza("With Pork", 2, "Peter", false);
        Pizza pizza7 = new Pizza("Vegatarian", 2, "Steve", true);
        List<Pizza> pizzas = List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7);


//  На основе тестового списка экземпляров данного класса List<Pizza> pizzas
//   a. Получить Map<String, Boolean> имя / информация, в наличии ли пицца
//   b. Получить Map<String, Integer> повар / количество пиц, приготовленных этим поваром
//   c. Получить Map<String, Set<String>> повар / список имен пиц, приготовленных этим поваром
        Map<String, Set<String>> pizzasByCook = new HashMap<>();
        for (Pizza pizza : pizzas) {
            Set<String> pizzaSet = pizzasByCook.getOrDefault(pizza.cookName, new HashSet<>());
            pizzaSet.add(pizza.name);
            pizzasByCook.put(pizza.cookName, pizzaSet);

//            if (!pizzasByCook.containsKey(pizza.cookName)) {
//                Set<String> pizzaSet = new HashSet<>();
//                pizzaSet.add(pizza.name);
//                pizzasByCook.put(pizza.cookName, pizzaSet);
//            } else {
//                Set<String> pizzaSet = pizzasByCook.get(pizza.cookName);
//                pizzaSet.add(pizza.name);
//            }
        }

        System.out.println(pizzasByCook);
    }


}
