package lesson20250116.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class ReflectionInStandardLibrary {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        // vm options to make this code execute: --add-opens java.base/java.util=ALL-UNNAMED

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");

        Class<? extends ArrayList> arrayListClass = arrayList.getClass();
        Field field = arrayListClass.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] innnerArray = (Object[]) field.get(arrayList);
        System.out.println(Arrays.toString(innnerArray));

        Method method = arrayListClass.getDeclaredMethod("grow");
        method.setAccessible(true);
        method.invoke(arrayList);
        innnerArray = (Object[]) field.get(arrayList);
        System.out.println(Arrays.toString(innnerArray));
    }



}
