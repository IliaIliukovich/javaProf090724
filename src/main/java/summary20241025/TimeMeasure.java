package summary20241025;

public class TimeMeasure {

    public static void main(String[] args) {
        long nanoTime = System.nanoTime();
        long start = System.currentTimeMillis();
        someMethod();
        long end = System.currentTimeMillis();
        System.out.println("Time elapsed: " + (end - start));

    }

    private static void someMethod() {
        for (int i = 0; i < 1_000_000; i++) {

        }
        //
    }


}
