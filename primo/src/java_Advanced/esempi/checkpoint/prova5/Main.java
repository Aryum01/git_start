package java_Advanced.esempi.checkpoint.prova5;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        AbstractEvent event1 = new AbstractEvent("asd", OffsetDateTime.of(2001, 01, 03, 0, 0, 0, 0, ZoneOffset.UTC),
                OffsetDateTime.of(2001, 01, 03, 0, 0, 0, 0, ZoneOffset.UTC));
        AbstractEvent event2 = new AbstractEvent("dfhfd", OffsetDateTime.of(2002, 02, 03, 0, 0, 0, 0, ZoneOffset.UTC),
                OffsetDateTime.of(2001, 01, 03, 0, 0, 0, 0, ZoneOffset.UTC));
        AbstractEvent event3 = new AbstractEvent("null", OffsetDateTime.of(2003, 03, 05, 0, 0, 0, 0, ZoneOffset.UTC),
                OffsetDateTime.of(2001, 01, 03, 0, 0, 0, 0, ZoneOffset.UTC));

        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);

        System.out.println("lista iniziale");
        eventManager.printEvent();

        System.out.println("lista senza un elemento ");
        eventManager.removeEvent(event3);
        eventManager.printEvent();

    }
}
