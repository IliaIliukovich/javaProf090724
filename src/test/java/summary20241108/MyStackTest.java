package summary20241108;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private static MyStack myStack;

//    @BeforeAll
//    public static void init() {
//        myStack = new MyStack(5);
//    }

    @BeforeEach
    public void init(){
        myStack = new MyStack(5);
    }

    @Test
    public void push() {
        assertEquals(0, myStack.size());
        myStack.push("A");
        assertEquals(1, myStack.size());
        myStack.push("B");
        assertEquals(2, myStack.size());
        myStack.push("C");
        assertEquals(3, myStack.size());
        myStack.push("D");
        assertEquals(4, myStack.size());
        myStack.push("E");
        assertEquals(5, myStack.size());

        assertThrows(RuntimeException.class, () -> myStack.push("F"));
    }

    @Test
    public void pop() {
        assertThrows(RuntimeException.class, () -> myStack.pop());
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");
        myStack.push("D");
        myStack.push("E");
        assertEquals("E", myStack.pop());
        assertEquals("D", myStack.pop());
        assertEquals("C", myStack.pop());
        assertEquals("B", myStack.pop());
        assertEquals("A", myStack.pop());
        assertThrows(RuntimeException.class, () -> myStack.pop());
    }

    @Test
    public void peek() {
        assertThrows(RuntimeException.class, () -> myStack.peek());
        myStack.push("A");
        myStack.push("B");
        assertEquals("B", myStack.peek());
    }

    @Test
    public void size() {
        assertEquals(0, myStack.size());
        myStack.push("A");
        assertEquals(1, myStack.size());
    }

    @Test
    public void isEmpty() {
        assertTrue(myStack.isEmpty());
        myStack.push("A");
        assertFalse(myStack.isEmpty());
    }
}