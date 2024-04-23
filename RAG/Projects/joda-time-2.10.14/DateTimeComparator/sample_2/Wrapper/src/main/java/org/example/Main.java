package org.example;


import org.joda.time.DateTime;
import org.joda.time.comparator.DateTimeComparator;

public class Main {

    public static void main(String[] args) {

        DateTime dateTime1 = new DateTime();
        DateTime dateTime2 = new DateTime();
        
        DateTimeComparator dateTimeComparator = DateTimeComparator.getInstance();

        int comparisonResult = dateTimeComparator.compare(dateTime1, dateTime2);

        if (comparisonResult < 0) {
            System.out.println("dateTime1 is before dateTime2");
        } else if (comparisonResult > 0) {
            System.out
            out.println("dateTime1 is after dateTime2");
        } else {
            System.out.println("dateTime1 is equal to dateTime2");
        }
    }
}