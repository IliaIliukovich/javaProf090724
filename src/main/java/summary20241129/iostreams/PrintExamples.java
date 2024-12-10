package summary20241129.iostreams;

import java.io.PrintStream;
import java.util.Date;

public class PrintExamples {

    public static void main(String[] args) {
        PrintStream out = System.out;
        out.println("1");
        System.err.println("2");
        out.println("3");
        System.err.println("4");
//        System.out.println(1 / 0);
//        System.out.println("some info");



        //        printf example
        double x = 1.0 / 3.0;
        out.println(x);
        out.printf("%2.2f%n", x);
        out.printf("%e\n", x);
        out.println(String.format("%6.3e",223.45654543434)); // альтернатива printf

    //%a Шестнадцатеричное значение с плавающей точкой
    //%b Логическое (булево) значение аргумента
    //%c Символьное представление аргумента
    //%d Десятичное целое значение аргумента
    //%e Экспоненциальное представление аргумента
    //%f Десятичное значение с плавающей точкой
    //%o Восьмеричное целое значение аргумента
    //%n Вставка символа новой строки
    //%s Строковое представление аргумента
    //%t Время и дата
    //%x Шестнадцатеричное целое значение аргумента

        out.printf("one%ntwo%nthree%n");
        out.printf("%b%n", null);
        out.printf("%B%n", false);
        out.printf("%B%n", 2);
        out.printf("%b%n", "text");
        out.printf("%2.4s%n", "Hi guys!");
        out.printf("%c%n", 'a');
        out.printf("%C%n", 'a');

        int z = 100;
        out.printf("Printing simple integer: x = %d\n", z);
        out.printf("Formatted with precision: PI = %.2f\n", Math.PI);

        float y = 3.14f;
        out.printf("Formatted to specific width: n = %.6f\n", y);

        y = 1234567.3f;
        out.printf("Formatted to right margin: n = %50.4f\n", y);

        Date date = new Date();
        out.printf("%tT%n", date); // Символы H, M, S отвечают за часы, минуты и секунды

        out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);

    }



}
