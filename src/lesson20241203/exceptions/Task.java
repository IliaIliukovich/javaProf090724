package lesson20241203.exceptions;

public class Task {

    public static void main(String[] args) {
    // 1. Напишите метод, который принимает целое число
    // в качестве параметра и выдает проверяемое исключение, если число нечетное.
//        throw new RuntimeException("Unchecked");
//        throw new Exception("Checked");
        try {
            method(2);
            method(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    // 2. Написать метод проверки введенного пароля. Если пароль неверен, выбрасывается проверяемое исключение
    // WrongPasswordException с сообщением "Password is wrong".
        try {
            validatePassword("12345");
            validatePassword("1234");
        } catch (WrongPasswordException e) {
            System.out.println("Password is wrong. Try again");
        }

        System.out.println("Some logic");

    }

    public static void method(int number) throws Exception {
        if (number % 2 == 1) {
            throw new Exception("Exception");
        }
        System.out.println(number);
    }

    public static void validatePassword(String password) throws WrongPasswordException{
        String correctPassword = "12345";
        if (!correctPassword.equals(password)) {
            throw new WrongPasswordException();
        }
        System.out.println("Password is correct");
    }


}
