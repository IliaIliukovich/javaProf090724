package lesson20241107.maps;

import java.util.*;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("G", 15);
        System.out.println(map.get("G"));
        map.put("G", 20);
        System.out.println(map.get("G"));

        System.out.println(map);

        System.out.println(map.containsKey("B"));
        System.out.println(map.get("B")); // O(1)

        Set<String> strings = map.keySet();
        System.out.println(strings);
        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println(map.containsValue(20)); // O(n)

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + " , value: " + value);
        }

        map.remove("G");
        System.out.println(map);
    }


}
