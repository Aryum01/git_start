package java_advanced.settimana6.ess9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
    @Test
    public void testDate() {
        String actString = Main.date();
        String expString = "Anno: 2023\nMese: 3\nGiorno: 1\nGiorno della Settimana: mercoledì";
        assertEquals(expString, actString);
    }
}
