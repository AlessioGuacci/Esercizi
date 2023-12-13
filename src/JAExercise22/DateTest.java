package JAExercise22;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;


class DateTest {

    @Test
    void dateTester() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        Date.dateFormater(date);
    }
}