package java_advanced.settimana6.ess10;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        date();

    }

    public static String date() {
        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        OffsetDateTime addYear = offsetDateTime.plusYears(1);
        OffsetDateTime RemoveMonth = offsetDateTime.minusMonths(1);
        OffsetDateTime addDay = offsetDateTime.plusDays(7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy HH:mm:ss").withLocale(Locale.ITALY);

        return "Nuovo anno: " + addYear.format(formatter) + "\nMese scorso: " + RemoveMonth.format(formatter)
                + "\nFra 7 giorni: " + addDay.format(formatter);

    }
}
