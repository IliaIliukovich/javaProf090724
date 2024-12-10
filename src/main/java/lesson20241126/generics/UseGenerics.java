package lesson20241126.generics;

import java.util.ArrayList;
import java.util.List;

public class UseGenerics {

    public static void main(String[] args) {
        GenericClass<String, Integer> genericClass = new GenericClass<>("String value");

        String result = genericClass.nonStaticMethod();
        System.out.println(result);
        genericClass.nonStaticMethod2("string data", 20);

        GenericClass<Double, Boolean> genericClass2 = new GenericClass<>(20.0);
        System.out.println(genericClass2.nonStaticMethod());
        genericClass2.nonStaticMethod2(10.0, true);

//        genericClass2.nonStaticMethod2("string", 20); // impossible

        List<String> list = new ArrayList<>();
        list.add("string");
//        list.add(1);

        List<Object> objectList = new ArrayList<>();
        objectList.add(1);
        objectList.add(2.0);
        objectList.add("string");
        Integer object = (Integer) objectList.get(0);


        System.out.println(staticGenericMethod(1));
        staticGenericMethod("input string");
        staticGenericMethod(false);

    }

    public static <T> T staticGenericMethod(T t) {
        if (t instanceof Integer) {
            System.out.println("Logic for integer");
            return (T) (Integer)((Integer) t + 100);
        } else if (t instanceof String) {
        System.out.println("String action with : " + t);
            return t;
        }
        return null;
    }


}
