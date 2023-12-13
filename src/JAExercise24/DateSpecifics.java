package JAExercise24;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class DateSpecifics {

    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dateYear= date.getYear();
        Month dateMonth= date.getMonth();
        int dateDay= date.getDayOfMonth();
        DayOfWeek dateDayOfTheWeek = date.getDayOfWeek();
        System.out.println(dateYear);
        System.out.println(dateMonth);
        System.out.println(dateDay);
        System.out.println(dateDayOfTheWeek);

    }
}
