package java_advanced.settimana6.ess7;

import static org.junit.Assert.assertEquals;

import java.time.format.FormatStyle;

import org.junit.Test;

public class MainTest {
    @Test
    public void testDate() {
        String expectedFull = "venerdì 1 marzo 2002";
        String expectedMedium = "1 mar 2002";
        String expectedShortFormat = "01/03/02";

        String actualFull = Main.date(FormatStyle.FULL);
        String actualMedium = Main.date(FormatStyle.MEDIUM);
        String actualShortFormat = Main.date(FormatStyle.SHORT);

        assertEquals(expectedFull, actualFull);
        assertEquals(expectedMedium, actualMedium);
        assertEquals(expectedShortFormat, actualShortFormat);
    }
}
