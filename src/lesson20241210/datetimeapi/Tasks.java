package lesson20241210.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Tasks {
    public static void main(String[] args) {
        // 1) создать любую дату
        // - вывести на консоль на немецком / английском языках
        // - найти, на какой день недели она выпала
        // - вычесть 10 лет из созданной даты, вывести на консоль
        // - посчитать количество дней до нее (ChronoUnit.DAYS)
        LocalDate date = LocalDate.of(1222, Month.SEPTEMBER, 1);
        date = date.minusYears(10);
        System.out.println(date);
        System.out.println(ChronoUnit.YEARS.between(date, LocalDate.now()));

        // 2) Найти дату последнего четверга ноября 2024 / второй среды мая 2025
        LocalDate lastThursdayInNovember = LocalDate.of(2024, Month.NOVEMBER, 1)
                .with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
        System.out.println(lastThursdayInNovember);
        LocalDate secondWednesdayInMay = LocalDate.of(2025, Month.MAY, 1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY)).plusDays(7);
        System.out.println(secondWednesdayInMay);
    }



}
