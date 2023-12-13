package JAExercise23;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;




class Date2023Test {

    @Test
    void main() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
       Date2023.dateFormater(date);
    }
}