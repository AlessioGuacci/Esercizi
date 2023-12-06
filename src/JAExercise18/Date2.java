package JAExercise18;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Date2 {
    public static void main(String[] args) {
        OffsetDateTime settingTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year= settingTime.getYear();
        Month month = settingTime.getMonth();
        int day = settingTime.getDayOfMonth();
        DayOfWeek dayOfWeek= settingTime.getDayOfWeek();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
