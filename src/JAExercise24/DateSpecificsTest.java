package JAExercise24;

import JAExercise22.Date;
import org.junit.jupiter.api.Test;


import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;



class DateSpecificsTest {

    @Test
    void main() {
        OffsetDateTime dateTest= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String [] formattedDate= DateSpecifics.dateFormater(dateTest);
        assertEquals("2023",formattedDate[0]);
        assertEquals("MARCH", formattedDate[1]);
        assertEquals("1",formattedDate[2]);
        assertEquals("WEDNESDAY",formattedDate[3]);

    }
}