package lesson20241210.datetimeapi;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

public class DateFormatExamples {

    public static void main(String[] args) {
        Locale locale = Locale.of("ru");
        Locale.setDefault(locale);
        String formattedDate = String.format(locale, "%tc\n", ZonedDateTime.now()) + // длинная строка
                String.format(locale, "%tD\n", ZonedDateTime.now()) + //(MM/DD/YY)
                String.format(locale, "%tF\n", ZonedDateTime.now()) + //(YYYY-MM-DD)
                String.format(locale, "%tr\n", ZonedDateTime.now()) + //Full 12-hour time
                String.format(locale, "%tz\n", ZonedDateTime.now()) + //Time zone GMT offset
                String.format(locale, "%tZ\n", ZonedDateTime.now());//Localized time zone abbreviation
        System.out.println(formattedDate);

        // DateTimeFormatter
        LocalDateTime conferenceDateTime = LocalDateTime.now();

        System.out.println("Formatting data and time:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        String formatted = dateTimeFormatter.format(conferenceDateTime);
        System.out.println(formatted);

        System.out.println(DateTimeFormatter.ofPattern("dd---MM---yyyy").format(conferenceDateTime));
        DateTimeFormatter localizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(localizedDate.withLocale(Locale.GERMAN).format(conferenceDateTime));
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        System.out.println(localizedDate.withLocale(Locale.of("en_NU")).format(conferenceDateTime));
    }


}
