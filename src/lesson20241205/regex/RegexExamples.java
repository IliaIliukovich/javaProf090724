package lesson20241205.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {
        String text = "world";
        String regex = "worl.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        System.out.println(Pattern.matches("world\\.", "world.")); // . in the end
        System.out.println(Pattern.matches("world.", "world!")); // any symbol in the end
        System.out.println(Pattern.matches("[ws]orld", "world")); // w or s
        System.out.println(Pattern.matches("[ws]orld", "sorld")); // w or s
        System.out.println(Pattern.matches("world[!?.]", "world?")); // ! or ? or .
        System.out.println(Pattern.matches("world[^!?.]", "world1")); // any except ! ? .
        System.out.println(Pattern.matches("[0]{3}[0-9]{5}", "00012345")); //
        System.out.println(Pattern.matches("[a-zA-Züäö]{3}[0-9]{5}", "aöC12345"));
        System.out.println(Pattern.matches("[\\w]{3}", "a_1")); // a-zA-Z_0-9
        System.out.println(Pattern.matches("[\\W]{3}", ",?."));
        System.out.println(Pattern.matches("[\\s]{3}", "  \n"));
        System.out.println(Pattern.matches("[\\d]{3,5}", "111")); // 111 1234 12345
        System.out.println(Pattern.matches("wo[ ]{3}", "wo   "));

        System.out.println(Pattern.matches("world[s]?", "world")); // one time or zero
        System.out.println(Pattern.matches("world[s]?", "worlds"));

        System.out.println(Pattern.matches("world[!]*", "world")); // zero or many times
        System.out.println(Pattern.matches("world[!]*", "world!"));
        System.out.println(Pattern.matches("world[!]*", "world!!!"));

        System.out.println(Pattern.matches("world[!]+", "world!")); // one or many times
        System.out.println(Pattern.matches("world[!]+", "world!!!"));

    }



}
