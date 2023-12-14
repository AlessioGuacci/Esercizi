package JAExercise23;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date2023 {
    public static void main(String[] args) {
        Date2023 myDate= new Date2023();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate.dateFormater(date);
    }
        public String dateFormater(OffsetDateTime date) {
            String datePrint = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println(datePrint);
            return datePrint;
        }
}
