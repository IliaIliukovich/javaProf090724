package lesson20241001;

public class AutoBoxingUnboxing {

    public static void main(String[] args) {

        int number = 10;
        Integer number2;
        number2 = number; // int ---> Integer autoboxing
        number2 = (Integer) number; // int ---> Integer boxing

        number = number2; // Integer ---> int autounboxing
        number = (int) number2; // Integer ---> int autounboxing

        operation(number);
        operation(number2);
        operation2(number);
        operation2(number2);

        System.out.println(operationWithObject(new Cat("Cat", 1)));
        System.out.println(operationWithObject("String"));
        System.out.println(operationWithObject(number));

        int i = 10;
        long j = 2147483648L; // от -2147483648 до 2147483647 possible
//        j = (long) i; // save
        i = (int) j; // unsave
        System.out.println(i);

        System.out.println(53 / 13);
        System.out.println((double) 53 / 13);
    }

    public static Integer operation(Integer integer) {
        return integer + 1;
    }

    public static int operation2(int i) {
        return i + 1;
    }

    public static int operationWithObject(Object object) {
        if (object instanceof Cat) {
            return 1;
        } else if (object instanceof Number) {
            return 2;
        } else if (object instanceof String) {
            return 3;
        } else {
            return 0;
        }
    }

}
