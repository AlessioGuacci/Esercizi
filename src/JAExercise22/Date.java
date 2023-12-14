package JAExercise22;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Date {
    public static void main(String[] args) {

        Date myDate= new Date();
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        myDate.dateFormater(date);

    }
        public  String[] dateFormater(OffsetDateTime date) {
            String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

            System.out.println(dateFull);
            System.out.println(dateMedium);
            System.out.println(dateShort);
            return new String[] {dateFull,dateMedium,dateShort};
        }
}