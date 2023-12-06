package JAExercise16;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date {
    public static void main(String[] args) {
        OffsetDateTime pastDate= OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(pastDate);

        String dateString = pastDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateString1= pastDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString2= pastDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(dateString);
        System.out.println(dateString1);
        System.out.println(dateString2);
    }
}
