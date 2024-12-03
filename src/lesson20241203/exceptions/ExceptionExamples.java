package lesson20241203.exceptions;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class ExceptionExamples {

    public static void main(String[] args) {

        // unchecked exceptions

//        System.out.println(1 / 0); // ArithmeticException
//        String s = null;

//        System.out.println(s.toLowerCase()); // NullPointerException

//        int[] i = new int[2]; // ArrayIndexOutOfBoundsException
//        i[2] = 1;

//        List<Integer> integers = List.of(1, 2, 3);
//        integers.get(3);

//        throw new IllegalArgumentException("Wrong argument");

        // unchecked exceptions with try-catch block
//        try {
//            try {
//                throw new NullPointerException();
//            } catch (NullPointerException e) {
//                throw new RuntimeException("Something went wrong", e);
//            }
//        } catch (RuntimeException e) {
//            System.out.println(e.getCause());
//            e.printStackTrace();
//        }

        // checked exceptions - try-catch block is obligatory
//        fileMethod();


        recursion();

    }

    private static void recursion() {
        recursion();
    }

    private static void fileMethod() {

        try {
            // open file
            System.out.println("In try block");
            if (true) {
                throw new FileNotFoundException("File not found");
            }
        } catch (FileNotFoundException e) {
            // actions when file not found
            System.out.println(e.getMessage());
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println(Arrays.toString(stackTrace));
//            e.printStackTrace();
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("After try block");

    }


}
