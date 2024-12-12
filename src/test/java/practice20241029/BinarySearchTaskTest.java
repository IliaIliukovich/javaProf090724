package practice20241029;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BinarySearchTaskTest {

    @Test
    public void searchWithFoundData() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        int index = BinarySearchTask.search(list, "C");
        assertEquals(2, index);
        assertEquals(0, BinarySearchTask.search(list, "A"));
        assertEquals(5, BinarySearchTask.search(list, "F"));

        list = new ArrayList<>();
        list.add("A");
        assertEquals(0, BinarySearchTask.search(list, "A"));
        assertEquals(-1, BinarySearchTask.search(list, "B"));
    }

    @Test
    public void searchWithNotFoundData() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        assertEquals(-1, BinarySearchTask.search(list, "G"));
    }

    @Test
    public void searchWithEmptyList() {
        List<String> list = new ArrayList<>();
        assertEquals(-1, BinarySearchTask.search(list, "G"));
    }

    @Test
    public void searchWithIncorrectData() {
        List<String> list = null;
        assertThrows(NullPointerException.class, () -> BinarySearchTask.search(list, "G"));
        assertThrows(NullPointerException.class, () -> BinarySearchTask.search(List.of("A", "B", "C"), null));
    }

}
