package JAExercise24;

import org.junit.jupiter.api.Test;


import java.time.OffsetDateTime;


class DateSpecificsTest {

    @Test
    void main() {
        OffsetDateTime dateTest= OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateSpecifics.dateFormater(dateTest);
    }
}