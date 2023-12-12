package java_Advanced.settimana6.ess5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        date();

    }

    public static void date() {
        String dateString = "2023-03-01T13:00:00Z";
        String dateString2 = "2024-03-01T13:00:00Z";

        OffsetDateTime date1 = OffsetDateTime.parse(dateString);
        OffsetDateTime date2 = OffsetDateTime.parse(dateString2);

        boolean before = date1.isBefore(date2);
        boolean after = date2.isAfter(date1);
        boolean areEqualNow = date1.isEqual(OffsetDateTime.now()) && date2.isEqual(OffsetDateTime.now());
        if (before && after) {
            System.out.println("La prima data è precedente alla seconda e la seconda è successiva alla prima ");
        }
        System.out.println("Le due date sono uguali ? : " + areEqualNow);
    }
}
