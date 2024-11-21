package lesson20241121;

import java.util.ArrayList;
import java.util.List;

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

    }

    public static List<String> method(List<String> strings) {
    	List<String> result = new ArrayList<>();
    	for (String s : strings) {
    		if (!result.contains(s)) {
    			result.add(s);
    		}
    	}
    	return result;
    }

    public static void feed(List<Cat> catList) {
        for (int i = 0; i < catList.size(); i++) {
            if (catList.get(i).isHungry()) {
                catList.get(i).setHungry(false);
            }
        }
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
