package summary20241206;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Hometasks {

    public static void main(String[] args) {
        try {
            method();
        } catch (MyAppException e) {
//            e.printStackTrace();
            logToFile(e);
        }
        System.out.println("Some other logic");
    }

    public static void logToFile(MyAppException e) {
        try (PrintWriter pr = new PrintWriter(new FileWriter("src/main/resources/errors.log", true))){
            pr.print(new Date() + " :" );
            e.printStackTrace(pr);
        } catch (IOException ignore) {
        }
    }

    public static void method() throws MyAppException {
        try {
            method1();
            method2();
            method3();
        } catch (IOException | ArithmeticException | NullPointerException e) {
            throw new MyAppException("Exception", e);
        }
    }
    public static void method1() {
        System.out.println(1 / 0);
    }
    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }
    public static void method3() throws IOException {
        throw new IOException("File not found");
    }



}
