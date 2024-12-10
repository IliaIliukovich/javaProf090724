package lesson20241128;

import java.util.ArrayList;
import java.util.List;

public class WildCards {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        List objectList2 = new ArrayList<>();

//        objectList = stringList; // impossible
        objectList2 = stringList;
        List<?> link3 = stringList;
        link3 = objectList;
        link3 = objectList2;

        List<? extends Number> link4;
        link4 = new ArrayList<Integer>();
        link4 = new ArrayList<Double>();
//        link4 = new ArrayList<String>(); // impossible

        List<? super Double> link5;
        link5 = new ArrayList<Double>();
        link5 = new ArrayList<Number>();
        link5 = new ArrayList<Object>();
//        link5 = new ArrayList<Integer>(); // impossible

        // PECS rule: Producer extends Consumer super





    }



}
