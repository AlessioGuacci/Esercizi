package JAExercise20;

import java.time.OffsetDateTime;

public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime firstDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime secondDate= OffsetDateTime.parse("2024-03-01T13:00:00Z");

        int comparingDates= firstDate.compareTo(secondDate);
        if (comparingDates < 0){
            System.out.println("The first date comes before the second date");
        } else if (comparingDates > 0) {
            System.out.println("The second date come before the first date");
        } else {
            System.out.println("the two date are equal");
        }
    }
}

