package JAExercise22;

import Exercise4.Main;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    private Main mainTest = new Main();

    @Test
    void dateTester() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dateFull= date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String dateMedium= date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        assertEquals("1 marzo 2002",dateFull);
        assertEquals("01/03/02", dateShort);
        assertEquals("1 mar 2002", dateMedium);
    }
}