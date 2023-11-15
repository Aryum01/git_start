package settimana6.ess2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        date();

    }

    public static void date() {
        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        String dayMonthYear = offsetDateTime.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
        

        System.out.println(dayMonthYear);
        
    }
}
