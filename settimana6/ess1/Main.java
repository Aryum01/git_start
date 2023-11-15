package java_advanced.settimana6.ess1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        date();
    }

    public static void date() {
        String dateString = "2002-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        String full = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String medium = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortFormatter = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Full Format: " + full);
        System.out.println("Medium Format: " + medium);
        System.out.println("Short Format: " + shortFormatter);
    }
}
