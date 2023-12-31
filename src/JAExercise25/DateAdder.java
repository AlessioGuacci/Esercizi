package JAExercise25;


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateAdder {
    public static void main(String[] args) {
        DateAdder myDate= new DateAdder();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String [] formattedDates= myDate.dateformator(date);
        for(String formattedDate: formattedDates){
            System.out.println(formattedDate);
        }

    }

        public String [] dateformator (OffsetDateTime date){
        OffsetDateTime addYear = date.plusYears(1);
        OffsetDateTime subtractMonth= date.minusMonths(1);
        OffsetDateTime addWeek= date.plusWeeks(1);


        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssX").localizedBy(Locale.ITALY);

            String yearAdded= addYear.format(dateTimeFormatter);
            String monthSubtracted= subtractMonth.format(dateTimeFormatter);
            String weekAdded= addWeek.format(dateTimeFormatter);
            return new String[]{yearAdded, monthSubtracted, weekAdded};
    }
}
