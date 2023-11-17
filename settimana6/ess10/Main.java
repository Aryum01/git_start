package settimana6.ess10;


import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        date(null);
    }

    public static OffsetDateTime date(String inputDateString) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputDateString);
        OffsetDateTime addYear = offsetDateTime.plus(1, ChronoUnit.YEARS);
        OffsetDateTime RemoveMonth = addYear.minus(1, ChronoUnit.MONTHS);
        OffsetDateTime addDays = RemoveMonth.plus(7, ChronoUnit.DAYS);

        return addDays;
    }

    public static String format(OffsetDateTime manipulatedDate) {
        return manipulatedDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ITALY));
    }
}
