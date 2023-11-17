package java_advanced.settimana6.ess9;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        date();

    }

    public static String date() {
        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        int year = offsetDateTime.getYear();
        int month = offsetDateTime.getMonthValue();
        int day = offsetDateTime.getDayOfMonth();
        String dayOfWeek = offsetDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        return "Anno: " + year + "\nMese: " + month + "\nGiorno: " + day + "\nGiorno della Settimana: " + dayOfWeek;
    }
}
