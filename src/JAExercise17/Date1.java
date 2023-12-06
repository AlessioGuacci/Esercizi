package JAExercise17;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date1 {
    public static void main(String[] args) {
        OffsetDateTime marchDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String newDate = marchDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG
        ));
        System.out.println(newDate);
    }
}
