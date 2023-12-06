package JAExercise19;

import java.time.OffsetDateTime;

public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime modifiableDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime newYear = modifiableDate.plusYears(1);
        OffsetDateTime subtractMonth = modifiableDate.minusMonths(1);
        OffsetDateTime addDays = modifiableDate.plusWeeks(1);
        System.out.println(newYear);
        System.out.println(subtractMonth);
        System.out.println(addDays);
    }
}
