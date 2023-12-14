package JAExercise24;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class DateSpecifics {

    public static void main(String[] args) {
        DateSpecifics myDate= new DateSpecifics();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        myDate.dateFormater(date);


    }

    public String[] dateFormater(OffsetDateTime date){
        int dateYear= date.getYear();
        Month dateMonth= date.getMonth();
        int dateDay= date.getDayOfMonth();
        DayOfWeek dateDayOfTheWeek = date.getDayOfWeek();
        System.out.println(dateYear);
        System.out.println(dateMonth);
        System.out.println(dateDay);
        System.out.println(dateDayOfTheWeek);
        return new String[]{String.valueOf(dateYear), String.valueOf(dateMonth),
                String.valueOf(dateDay), String.valueOf(dateDayOfTheWeek)};
    }
}
