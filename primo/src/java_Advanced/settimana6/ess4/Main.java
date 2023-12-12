package java_Advanced.settimana6.ess4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        date();

    }

    public static void date() {
        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        OffsetDateTime addYear = offsetDateTime.plusYears(1);
        OffsetDateTime RemoveMonth = offsetDateTime.minusMonths(1);
        OffsetDateTime addDay = offsetDateTime.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss").withLocale(Locale.ITALY);

        System.out.println(" nuovo Anno: " + addYear.format(formatter));
        System.out.println(" Mese scorso: " + RemoveMonth.format(formatter));
        System.out.println(" fra 7 giorni: " + addDay.format(formatter));
       
    }
}
