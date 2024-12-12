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
        assertArrayEquals(null, result);

        a = new int[]{};
        b = new int[]{1, 0, 6, 15, 6, 4, 0};
        assertArrayEquals(null, result);

        a = null;
        b = new int[]{1, 0, 6, 15, 6, 4, 0};
        assertArrayEquals(null, result);

        b = null;
        a = new int[]{1, 0, 6, 15, 6, 4, 0};
        assertArrayEquals(null, result);


    }

    @Test
    void findUniqueElements() {
    }
}