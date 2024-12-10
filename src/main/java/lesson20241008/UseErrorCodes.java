package lesson20241008;

public class UseErrorCodes {

    public static void main(String[] args) {
        ErrorCode errorCode = ErrorCode.NOT_FOUND;

        System.out.println(errorCode);
        int code = errorCode.getCode();
        String message = errorCode.getMessage();

    }


}
