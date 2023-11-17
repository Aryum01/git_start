package java_advanced.settimana6.ess6;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        operation();
        date();

    }

    public static boolean operation() {
        int a = 10;
        boolean b = false;
        if (a % 2 == 0) {
            b = true;
        }
        return b;
    }

    public static boolean date() {
        String dateString = "2023-03-01T13:00:00Z";
        String dateString2 = "2024-03-01T13:00:00Z";

        OffsetDateTime date1 = OffsetDateTime.parse(dateString);
        OffsetDateTime date2 = OffsetDateTime.parse(dateString2);

        boolean isAfter = false;
        if (date1.isBefore(date2) && date2.isAfter(date1)) {
            isAfter = true;
        }
        boolean areEqualNow = date1.isEqual(OffsetDateTime.now()) && date2.isEqual(OffsetDateTime.now());
        System.out.println("Le due date sono uguali ? : " + areEqualNow);

        return isAfter;
    }

}
