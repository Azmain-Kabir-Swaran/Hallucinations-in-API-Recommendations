package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;

public class Main {
    public static void main(String[] args) {
        DateTime date1 = new DateTime(2019, 1, 1, 0, 0);
        DateTime date2 = new DateTime(2020, 1, 1, 0, 0);
        
        DateTimeComparator dateTimeComparator = DateTimeComparator.getDateOnlyInstance();
        int comparisonResult = dateTimeComparator.compare(date1, date2);
        
        if (comparisonResult > 0) {
            System.out.println("Date1 is after date2.");
        } else if (comparisonResult < 0) {
            System.outystem.out.println("Date1 is before date2.");
        } else {
            System.out.println("Date1 and date2 are the same day.");
        }
    }
}