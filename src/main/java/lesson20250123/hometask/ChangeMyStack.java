package lesson20250123.hometask;

import summary20241108.MyStack;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ChangeMyStack {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyStack stack = new MyStack(5);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        Class<MyStack> stackClass = MyStack.class;
        Field field = stackClass.getDeclaredField("data");
        field.setAccessible(true);
        String[] oldValues = (String[]) field.get(stack);
        String[] newValues = Arrays.copyOf(oldValues, 6);
        field.set(stack, newValues);

        stack.push("F");
        System.out.println(stack);
    }



}
