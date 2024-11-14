package lesson20241114.hometask;

import java.util.HashMap;
import java.util.Map;

public class TicketsTask {

    public static void main(String[] args) {

        Map<String, String> ticketsMap = new HashMap<>();
        ticketsMap.put("Berlin", "London");
        ticketsMap.put("Tokyo", "Seoul");
        ticketsMap.put("Mumbai", "Berlin");
        ticketsMap.put("Seoul", "Mumbai");

        printTicketsInOrder(ticketsMap);

//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
//        map.put("A", "A");
//        map.put("B", "B");
//        map.put("C", "C");
//        System.out.println(map);
//        System.out.println(map.entrySet().iterator().next());
    }

    public static void printTicketsInOrder(Map<String, String> ticketsMap) { // O(n)
        Map<String, String> reverseMap = new HashMap<>();
        for (Map.Entry<String, String> entry : ticketsMap.entrySet()) { // O(n)
            reverseMap.put(entry.getValue(), entry.getKey());
        }

        String currentCity = reverseMap.entrySet().iterator().next().getKey();
        String firstCity = currentCity;
        while (firstCity != null) { // O(n)
            currentCity = firstCity;
            firstCity = reverseMap.get(currentCity);
        }
        System.out.println("First city: " + currentCity);

        while (currentCity != null) { // O(n)
            String destinationCity = ticketsMap.get(currentCity);
            System.out.println(currentCity + " ----> " + destinationCity);
            currentCity = destinationCity;
        }
    }


}
