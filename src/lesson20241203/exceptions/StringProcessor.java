package lesson20241203.exceptions;

public class StringProcessor {


    public String process(String input) throws InputValidationException {
        if (input == null || input.length() < 5) {
            throw new InputValidationException("Input string cannot be null or less then 5 symbols");
        }
        return "<h1>" + input + "</h1>";
    }



}
