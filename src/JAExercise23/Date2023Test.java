package JAExercise23;


import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

//1 marzo 2023



class Date2023Test {

    @Test
    void main() {
        Date2023 date2023= new Date2023();
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattedDate = date2023.dateFormater(date);
        assertEquals("1 marzo 2023",formattedDate);



    }
}