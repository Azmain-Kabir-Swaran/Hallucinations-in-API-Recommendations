package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;

public class Main {

    public static void main(String[] args) {
        // Initialize two DateTime instances
        DateTime date1 = new DateTime(2022, 10, 20, 10, 30);
        DateTime date2 = new DateTime(2022, 10, 20, 11, 40);

        // Instantiate a DateTimeComparator
        DateTimeComparator dateTimeComparator = DateTimeComparator.getDateTimeComparator();

        // Compare the two dates
        int result = dateTimeComparator.compare(date1, date2);

        // Output the comparison result
        if (result == 0) {
            System.out.println("Both dates are the same");
        } else if (result < 0) {
            System.out.println("date1 is earlier than date2");
        } else {
            System.out.println("date1 is later than date2");
        }
    }
}