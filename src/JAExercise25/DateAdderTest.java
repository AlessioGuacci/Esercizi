package JAExercise25;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

//2024-03-01T13:00:00Z
//        2023-02-01T13:00:00Z
//        2023-03-08T13:00:00Z
class DateAdderTest {

    @Test
    void dateformator() {
        DateAdder myDate= new DateAdder();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String [] formattedDate= myDate.dateformator(date);
        assertEquals("2024-03-01T13:00:00Z",formattedDate[0]);
        assertEquals("2023-02-01T13:00:00Z",formattedDate[1]);
        assertEquals("2023-03-08T13:00:00Z",formattedDate[2]);
    }
}