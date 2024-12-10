package lesson20241210;

import java.util.regex.Pattern;

public class Hometasks {

    public static void main(String[] args) {
        // task 1
        String regex = "(?!0000000|000 0000|000-0000)[\\d]{3}[- ]?[\\d]{4}";
        System.out.println(Pattern.matches(regex, "000-0000"));
        System.out.println(Pattern.matches(regex, "1234567"));
        System.out.println(Pattern.matches(regex, "123 4567"));
        System.out.println(Pattern.matches(regex, "123-4567"));
        System.out.println(Pattern.matches(regex, "123  4567"));
    }


}
