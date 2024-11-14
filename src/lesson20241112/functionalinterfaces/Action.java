package lesson20241112.functionalinterfaces;

@FunctionalInterface
public interface Action {

    void doAction(Integer integer);

//    void doAction2(); // impossible

    default void defaultMethod() {


    }

    static void staticMethod() {

    }


}
