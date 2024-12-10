package lesson20241210.datetimeapi;

import java.time.Duration;
import java.time.Instant;

public class MeasureTimeExamples {

    public static void main(String[] args) {

        System.nanoTime();
        System.currentTimeMillis();

        Instant before = Instant.now();
        method();
        Instant after = Instant.now();
        Duration duration = Duration.between(before, after);
        System.out.println(duration);
        System.out.println(duration.getNano());


    }

    public static void method() {
        for (int i = 0; i < 10_000_000; i++) {
            for (int j = 0; j < 10_000_000; j++) {
                // some action
            }
        }
    }



}
