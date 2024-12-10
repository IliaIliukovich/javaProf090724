package lesson20241210.datetimeapi;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class DateTimeExamples {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        date = LocalDate.of(2024, 12, 10);
        System.out.println(date);
        LocalDate tenDaysAfter = date.plus(30, ChronoUnit.DAYS);
        System.out.println(tenDaysAfter);
        LocalDate fiveMonthsAfter = date.plus(5, ChronoUnit.MONTHS);
        System.out.println(fiveMonthsAfter);

        System.out.println(date.getDayOfWeek());
        List<LocalDate> list = date.datesUntil(LocalDate.of(2024, 12, 20), Period.ofDays(7)).toList();
        System.out.println(list);

        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));

        LocalTime time = LocalTime.of(9, 30);
        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("CET"));
        System.out.println(zonedDateTime);

//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        ZonedDateTime australiaTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Victoria"));
        System.out.println(australiaTime);


    }


}
