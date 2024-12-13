package lesson20241212;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void findCommonElements() {
        int[] a = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] b = {1, 0, 6, 15, 6, 4, 7, 0};
        int[] result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[]{1, 7}, result);

        a = new int[]{2, 5, 5, 8, 9, 7, 10};
        b = new int[]{1, 0, 6, 15, 6, 4, 0};
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[0], result);

        a = new int[]{};
        b = new int[]{1, 0, 6, 15, 6, 4, 0};
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[0], result);

        a = null;
        b = new int[]{1, 0, 6, 15, 6, 4, 0};
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[0], result);

        b = null;
        a = new int[]{1, 0, 6, 15, 6, 4, 0};
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[0], result);

        a = null;
        b = null;
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[0], result);

        a = new int[]{1};
        b = new int[]{1};
        result = Tasks.findCommonElements(a, b);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void findUniqueElements() {
        assertArrayEquals(new int[]{1, 2}, Tasks.findUniqueElements(new int[]{1, 2, 1}));
        assertArrayEquals(new int[]{1, 3, 2}, Tasks.findUniqueElements(new int[]{1, 3, 2, 2, 3}));
        assertThrows(NullPointerException.class, () -> Tasks.findUniqueElements(null));
        assertArrayEquals(new int[0], Tasks.findUniqueElements(new int[0]));
        assertArrayEquals(new int[]{1}, Tasks.findUniqueElements(new int[]{1}));
    }
}