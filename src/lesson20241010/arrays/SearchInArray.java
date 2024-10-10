package lesson20241010.arrays;

import java.util.Arrays;

public class SearchInArray {

    public static void main(String[] args) {
        int[] ints = {1, 0, 3, 2, 9};

        boolean isPresent = searchLinear(ints, 20);
        System.out.println(isPresent);

        int[] sortedInts = {0, 1, 3, 6, 9};
        System.out.println(searchLinear(sortedInts, 9));

        System.out.println(Arrays.binarySearch(sortedInts, 9));
        // sort -- n^2
        // n * log n --- quickSort, mergeSort
        Arrays.sort(ints); // quickSort -- неустойчивый

        String[] strings = {"A", "D", "C"};
        Arrays.sort(strings); // mergeSort -- устойчивая

    }

    public static boolean searchLinear(int[] ints, int i) {
        for (int j = 0; j < ints.length; j++) {
            if (i == ints[j]) return true;
        }
        return false;
    }


}
