package java_Advanced.settimana6.ess10;

import org.junit.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDate() {
        String inputDateString = "2023-03-01T13:00:00Z";
        OffsetDateTime manipulatedDate = Main.date(inputDateString);

        assertEquals(2024, manipulatedDate.getYear());

        assertEquals(2, manipulatedDate.getMonthValue());

        assertEquals(8, manipulatedDate.getDayOfMonth());

        String formattedDate = Main.format(manipulatedDate);
        String expectedDate = "giovedì 8 febbraio 2024";
        assertEquals(expectedDate, formattedDate);
    }
}
