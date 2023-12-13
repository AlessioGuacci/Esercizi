package JAExercise25;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAdder {
    public static void main(String[] args) {
        OffsetDateTime date= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime addYear = date.plusYears(1);
        OffsetDateTime subtractMonth= date.minusMonths(1);
        OffsetDateTime addWeek= date.plusWeeks(1);


        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX").localizedBy(Locale.ITALY);

        String addYearToFormat= addYear.format(dateTimeFormatter);
        String subtractMonthFormat= subtractMonth.format(dateTimeFormatter);
        String addWeekFormat= addWeek.format(dateTimeFormatter);
        System.out.println(addYearToFormat);
        System.out.println(subtractMonthFormat);
        System.out.println(addWeekFormat);


    }
}
