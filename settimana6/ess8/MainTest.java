package java_advanced.settimana6.ess8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
    @Test
    public void testDate() {
        String actualResult = Main.date();
        String expectedResult = "01-marzo-2023";
        assertEquals("risultato :  ", expectedResult, actualResult);
    }
}
