package lesson20241010.arrays;

import lesson20241001.interfaces.SomeImplementation;
import lesson20241001.interfaces.SomeImplementation2;
import lesson20241001.interfaces.SomeInterface;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] ints = new int[10];
        System.out.println(ints.getClass().getName());
        System.out.println(ints.getClass().getCanonicalName());

        Integer[] integers = new Integer[10];
        System.out.println(integers.getClass().getName());
        System.out.println(integers.getClass().getCanonicalName());

        int[] ints1;
        int ints2[];
        ints1 = new int[10];
        ints1 = new int[] {1, 2, 3, 4};
        int[] ints3 = {1, 2, 3, 4};

        SomeInterface[] someInterfaces = new SomeInterface[2];
        someInterfaces[0] = new SomeImplementation();
        someInterfaces[1] = new SomeImplementation2();
        System.out.println(someInterfaces);
        System.out.println(Arrays.toString(someInterfaces));

        for (int i = 0; i < ints3.length; i++) {
            System.out.println(ints3[i]);
        }

        for (int value : ints3) {
            System.out.println(value);
        }

        String[][] arayOfArray = new String[3][4];
        arayOfArray[0][0] = "A";
        arayOfArray[0][1] = "A";
        arayOfArray[0][2] = "A";
        arayOfArray[0][3] = "A";

        arayOfArray[1][0] = "B";
        arayOfArray[1][1] = "B";
        arayOfArray[1][2] = "B";
        arayOfArray[1][3] = "B";

        arayOfArray[2][0] = "C";
        arayOfArray[2][1] = "C";
        arayOfArray[2][2] = "C";
        arayOfArray[2][3] = "C";

        System.out.println(Arrays.toString(arayOfArray));
        System.out.println(Arrays.deepToString(arayOfArray));

        print2DArray(arayOfArray);

        Integer[][] intArrayOfArray = new Integer[3][];
        intArrayOfArray[0] = new Integer[1];
        intArrayOfArray[1] = new Integer[5];
        intArrayOfArray[2] = new Integer[2];
        print2DArray(intArrayOfArray);
        intArrayOfArray[0][0] = 10;
        intArrayOfArray[1][3] = 50;
        print2DArray(intArrayOfArray);

        String[] strings = new String[]{"A", "B", "C"};
        String[] copy = Arrays.copyOf(strings, 10);
        System.out.println(Arrays.toString(copy));

        String[] copy2 = Arrays.copyOfRange(strings, 1, 3);
        System.out.println(Arrays.toString(copy2));

        System.out.println(Arrays.compare(ints1, ints3));
    }

    private static void print2DArray(String[][] arayOfArray) {
        for (int i = 0; i < arayOfArray.length; i++) {
            for (int j = 0; j < arayOfArray[i].length; j++) {
                System.out.print(arayOfArray[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }

    private static void print2DArray(Integer[][] arayOfArray) {
        for (int i = 0; i < arayOfArray.length; i++) {
            for (int j = 0; j < arayOfArray[i].length; j++) {
                System.out.print(arayOfArray[i][j] + ", ");
            }
            System.out.print("\n");
        }
    }


}
