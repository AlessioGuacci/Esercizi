package JAExercise24;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateSpecificsTest {

    @Test
    void main() {
        OffsetDateTime dateTest= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dateYear= dateTest.getYear();
        Month dateMonth= dateTest.getMonth();
        int dateDay= dateTest.getDayOfMonth();
        DayOfWeek dateDayOfTheWeek = dateTest.getDayOfWeek();

        assertEquals(2023,dateYear);
        assertEquals(Month.MARCH,dateMonth);
        assertEquals(1,dateDay);
        assertEquals(DayOfWeek.WEDNESDAY,dateDayOfTheWeek);
    }
}