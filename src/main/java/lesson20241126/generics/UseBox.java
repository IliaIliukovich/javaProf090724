package lesson20241126.generics;

import java.util.List;
import java.util.Optional;

public class UseBox {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.put(100);
        System.out.println(box.get());
        System.out.println(box.remove());
        System.out.println(box);

        Box<String> stringBox = new Box<>();
        stringBox.put("string");
        System.out.println(stringBox.get());
        System.out.println(stringBox.remove());
        System.out.println(stringBox);

        Optional<Double> doubleOptional = Optional.of(20.0);
        doubleOptional.get();
        doubleOptional.orElse(1.0);

        Box<List<String>> listBox = new Box<>();
        listBox.put(List.of("A", "B", "C"));
    }



}
