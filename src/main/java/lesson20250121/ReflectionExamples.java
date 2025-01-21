package lesson20250121;

import java.util.ArrayList;
import java.util.List;

public class ReflectionExamples {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list.getClass() == ArrayList.class);
        System.out.println(list.getClass().equals(ArrayList.class));

        System.out.println(list.getClass() == List.class);
        System.out.println(list.getClass().equals(List.class));

        Number i = 10;
        System.out.println(i.getClass() == Integer.class);
        i = 10.0;
        System.out.println(i.getClass() == Double.class);

        System.out.println(list instanceof List);
        System.out.println(list instanceof ArrayList);

    }



}
