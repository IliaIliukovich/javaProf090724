package lesson20241112.functionalinterfaces;

public class ApplyAction {

    public static void main(String[] args) {

        String data = "Data from main"; // effectively final
//        data = "new data";

        Action multiplyBy10 = new Action() {
            @Override
            public void doAction(Integer integer) {
                int result = integer * 10;
                System.out.println("Result: " + result + " " + data);
            }
        };

        multiplyBy10.doAction(7);
        multiplyBy10.doAction(10);

        Action integerPlus10 = new Action() {
            @Override
            public void doAction(Integer integer) {
                int result = integer + 10;
                System.out.println("Result: " + result);
            }
        };

        integerPlus10.doAction(7);
        integerPlus10.doAction(10);

        Action integerMinus10 = integer -> {
            int result = integer - 10;
            System.out.println("Result: " + result +  " " + data);
        };

        integerMinus10.doAction(7);
        integerMinus10.doAction(10);

        Action printInteger = integer -> System.out.println(integer);
        printInteger.doAction(5);

    }



}
