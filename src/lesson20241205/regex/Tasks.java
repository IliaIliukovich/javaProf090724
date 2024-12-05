package lesson20241205.regex;

import java.util.regex.Pattern;

public class Tasks {

    public static void main(String[] args) {
    //  1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
        System.out.println(Pattern.matches("[\\d]{4}", "1234"));

    //  2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
        // F1-F9
        // F10-F12
        System.out.println(Pattern.matches("(F[1-9])|(F1[0-2])", "F1"));
        System.out.println(Pattern.matches("(F[1-9])|(F1[0-2])", "F9"));
        System.out.println(Pattern.matches("(F[1-9])|(F1[0-2])", "F10"));
        System.out.println(Pattern.matches("(F[1-9])|(F1[0-2])", "F12"));

    //  3) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
        System.out.println(Pattern.matches("https://[a-zA-Z]+[//.][a-zA-Z]+", "https://test.com"));

    }



}
