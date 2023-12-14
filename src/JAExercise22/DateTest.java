package JAExercise22;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;


class DateTest {



    @Test
    void dateTester() {
        Date date= new Date();
        OffsetDateTime date1 = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String [] formattedDates= date.dateFormater(date1);
        assertEquals("1 marzo 2002",formattedDates[0]);
        assertEquals("1 mar 2002", formattedDates[1]);
        assertEquals("01/03/02",formattedDates[2]);
    }
}