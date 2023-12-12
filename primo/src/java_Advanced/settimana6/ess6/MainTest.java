package java_Advanced.settimana6.ess6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MainTest {
    @Test
    public void testOperation() {
        boolean result = Main.operation();
        assertEquals(true, result);
    }

    @Test
    public void testDate() {
        boolean result = Main.date();
        assertTrue("Il risultato di date() dovrebbe essere true", result);
    }

}
