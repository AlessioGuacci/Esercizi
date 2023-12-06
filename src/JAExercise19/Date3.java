package JAExercise19;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime modifiableDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime newYear = modifiableDate.plusYears(1);
        OffsetDateTime subtractMonth = modifiableDate.minusMonths(1);
        OffsetDateTime addDays = modifiableDate.plusWeeks(1);

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                .withLocale(Locale.ITALIAN).withZone(ZoneId.of("Europe/Rome"));

        System.out.println(newYear.format(formatter));
        System.out.println(subtractMonth.format(formatter));
        System.out.println(addDays.format(formatter));
    }
}
