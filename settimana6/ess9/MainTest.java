package settimana6.ess9;

import static org.junit.Assert.assertEquals;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import org.junit.Test;

public class MainTest {
    @Test
    public void testDate() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int year = offsetDateTime.getYear();
        int month = offsetDateTime.getMonthValue();
        int day = offsetDateTime.getDayOfMonth();
        String dayOfWeek = offsetDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        assertEquals(2023, year);
        assertEquals(3, month);
        assertEquals(1, day);
        assertEquals("mercoledì", dayOfWeek);
    }
}
