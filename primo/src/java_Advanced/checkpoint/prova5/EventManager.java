package java_Advanced.checkpoint.prova5;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void removeEvent(Event event) {
        eventList.remove(event);
    }

    public void printEvent() {
        for (Event event : eventList) {
            System.out.println("nome evento : " + event.getNome() + "dara inizio : " + event.getDataInizio()
                    + "data fine : " + event.getDataFine());
        }
    }

}
