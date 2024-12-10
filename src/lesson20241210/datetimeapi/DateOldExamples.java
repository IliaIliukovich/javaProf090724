package lesson20241210.datetimeapi;

import java.util.Calendar;
import java.util.Date;

public class DateOldExamples {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date someDate = new Date(100);
        System.out.println(someDate.getTime());
        System.out.println(someDate);

        Date today = new Date(124, Calendar.DECEMBER, 10);
        System.out.println(today);
        today.setTime(1_000_000);
        System.out.println(today);


    }


}
