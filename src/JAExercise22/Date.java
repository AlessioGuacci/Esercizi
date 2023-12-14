package JAExercise22;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//se non e giusto mi puoi mandare un esempio su discord di come risolvere lesercizio cosi capisco dove sbaglio,
//non capisco per niente come va spiegato nel video scusami Nicola

public class Date {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        dateFormater(date);

    }
        public static String[] dateFormater(OffsetDateTime date) {
            String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
            String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

            System.out.println(dateFull);
            System.out.println(dateMedium);
            System.out.println(dateShort);
            return new String[] {dateFull,dateMedium,dateShort};
        }
}