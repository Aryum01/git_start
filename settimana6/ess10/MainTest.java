package java_advanced.settimana6.ess10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
    @Test
    public void testDate() {
        String actString = Main.date();
        String expString = "Nuovo anno: 01 marzo 2024 13:00:00\nMese scorso: 01 febbraio 2023 13:00:00\nFra 7 giorni: 08 marzo 2023 13:00:00";
        assertEquals(expString, actString);
    }
}
