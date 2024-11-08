package summary20241108;

public class UseMyStack {

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
//        stack.push("Q"); // Stack is full

        System.out.println(stack.size());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // Stack is empty

        System.out.println(stack.isEmpty());
//        System.out.println(stack.peek()); // Stack is empty

        MyStack stack2 = new MyStack(0);
        System.out.println(stack2);

    }


}
