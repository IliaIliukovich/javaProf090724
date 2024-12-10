package lesson20241105.stack;

import java.util.LinkedList;

public class CustomStack {

    // На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
    //Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.

    private LinkedList<String> list = new LinkedList<>();

    public void push(String data){
        list.addLast(data);
    }

    public String pop() {
        return list.removeLast();
    }

    public String peek() {
        return list.getLast();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
