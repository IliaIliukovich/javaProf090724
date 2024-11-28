package lesson20241128;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RefactoringHomeTask {

    public static void main(String[] args) {

        List<Double> doubleList = List.of(1.0, 2.0, 3.0, 4.0);

//        List<Double> doubles = new ArrayList<>();
//        for (Double d : doubleList) {
//            if (d % 2 == 1) {
//                doubles.add(d);
//            }
//        }
//        System.out.println(doubles);

        List<Double> doubles = doubleList.stream().filter(d -> d % 2 == 1).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(doubles);


        List<String> list = List.of("One", "Two", "Three", "Four", "Five");
        String word = null;
        for (String t : list){
            if (t.length() == 3) {
                word = t;
                break;
            }
        }

        System.out.println(word);




    }


}
