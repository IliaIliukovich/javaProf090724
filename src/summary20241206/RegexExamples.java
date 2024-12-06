package summary20241206;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {
        String text = "Hello world!!! One, two, three";
        String[] s = text.split("o");
        System.out.println(Arrays.toString(s));

        s = text.split("\\W+");
        System.out.println(Arrays.toString(s));

        System.out.println(text.matches("[a-zA-Z!, ]+"));

        String result = text.replaceAll("o", "1");
        System.out.println(result);

        String novel = "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife.";
        String regex = "\\b[a-zA-Z]{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(novel);

//        while (matcher.find()) {
//            System.out.println("Found: " + matcher.group() + ", start: " + matcher.start() + ", end: " + matcher.end());
//        }

        matcher.results()
                .forEach(r -> System.out.println("Found: " + r.group() + ", start: " + r.start() + ", end: " + r.end()));

        pattern = Pattern.compile("\\ba\\b");
        matcher = pattern.matcher(novel);
        result = matcher.replaceAll("not a");
        System.out.println(result);

        String html = "<h1>Title1</h1><div>Text</div><h1>Title2</h1><h1>Title3</h1>";
        regex = "(<h1>)([a-zA-Z0-9]+)(</h1>)";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(html);

//        matcher.results()
//                .forEach(r -> {
//                    System.out.println("Found: " + r.group() + ", start: " + r.start() + ", end: " + r.end());
//                    System.out.println("Group1: " + r.group(1) + ", start: " + r.start(1) + ", end: " + r.end(1));
//                    System.out.println("Group2: " + r.group(2) + ", start: " + r.start(2) + ", end: " + r.end(2));
//                    System.out.println("Group3: " + r.group(3) + ", start: " + r.start(3) + ", end: " + r.end(3));
//                });

        List<String> titles = matcher.results().map(matchResult -> matchResult.group(2)).toList();
        System.out.println(titles);

        String text2 = "111-text1-111   222-text2-222 777-text3-777 ngd adfbda 361 sdb ";
        regex = "(\\d)\\1\\1-([a-zA-Z0-9]+)-\\1\\1\\1";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(text2);
        List<String> texts = matcher.results().map(matchResult -> matchResult.group(2)).toList();
        System.out.println(texts);
    }


}
