package java_advanced.settimana6.ess7;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        date(null);
    }

    public static String date(FormatStyle style) {
        String data = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(data);

        return offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(style));
    }
}
