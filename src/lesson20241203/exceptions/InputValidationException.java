package lesson20241203.exceptions;

public class InputValidationException extends Exception {

    public InputValidationException() {
    }

    public InputValidationException(String message) {
        super(message);
    }
}
