package lesson20250116;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class UseData {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, InstantiationException {
        Data data = new Data("Laptop", 10);

        data.publicMethod();
        System.out.println(data);

        Class<? extends Data> dataClass = data.getClass();
        System.out.println(Arrays.toString(dataClass.getDeclaredFields()));
        Field field = dataClass.getDeclaredField("name");
        field.setAccessible(true);
        String dataFromField = (String) field.get(data);
        System.out.println(dataFromField);
        field.set(data, "Home computer");
        System.out.println(data);

        System.out.println(Arrays.toString(dataClass.getDeclaredMethods()));
        Method method = dataClass.getDeclaredMethod("processData");
        method.setAccessible(true);
        String result = (String) method.invoke(data);
        System.out.println(result);

        Method method2 = dataClass.getDeclaredMethod("privateMethod", String.class);
        method2.setAccessible(true);
        method2.invoke(data, "input string");

        Class<?> forName = Class.forName("lesson20250116.Data");
//        forName.newInstance(); // deprecated - not safe
        Constructor<?> constructor = forName.getConstructor(String.class, int.class);
        Data iphone = (Data) constructor.newInstance("Iphone", 5);
        System.out.println(iphone);


//        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
    }



}
