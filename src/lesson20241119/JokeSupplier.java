package lesson20241119;

import java.util.Random;
import java.util.function.Supplier;

public class JokeSupplier {

    public static void main(String[] args) {
        Supplier<String> randomJoke = () -> {
            Jokes jokes = new Jokes();
            Random random = new Random();
            return jokes.getJokeList().get(random.nextInt(jokes.getJokeList().size()));
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(randomJoke.get());
        }

        MyInterface myInterface = () -> System.out.println("My action");
        myInterface.method();

    }

    @FunctionalInterface
    static interface MyInterface {
        void method();
    }


}
