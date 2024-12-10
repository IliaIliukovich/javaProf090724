package lesson20241121;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tasks {

    public static void main(String[] args) {
        // 1. Посчитать количество чисел от 1 до 1000, которые делятся на 7.

        // 2. Посчитать сумму квадратов чисел от 1 до 100

        // 3. Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
        // С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.

        // 4. Переписать через стримы фрагменты кода:
        List<String> strings = List.of("A", "B", "C");
        for (String s : strings) {
        	System.out.println(s);
        }

        strings.forEach(System.out::println);
        strings.stream().forEach(System.out::println);

    }

    public static List<String> method(List<String> strings) {
//    	List<String> result = new ArrayList<>(); // O(n^2)
//    	for (String s : strings) { // n
//    		if (!result.contains(s)) { // n
//    			result.add(s);
//    		}
//    	}
    	return strings.stream().distinct().collect(Collectors.toCollection(ArrayList::new));  // O(n)
    }

    public static void feed(List<Cat> catList) {
//        for (int i = 0; i < catList.size(); i++) {
//            if (catList.get(i).isHungry()) {
//                catList.get(i).setHungry(false);
//            }
//        }
        catList.stream().filter(Cat::isHungry).forEach(cat -> cat.setHungry(false)); // read -> write
//        catList.forEach(cat -> cat.setHungry(false)); // write
    }

    static class Cat {
        private boolean isHungry;

        public boolean isHungry() {
            return isHungry;
        }

        public void setHungry(boolean hungry) {
            isHungry = hungry;
        }
    }


}
