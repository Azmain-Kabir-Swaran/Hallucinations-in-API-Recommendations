package org.example;


import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println("Year: " + dt.getYear());
        System.out.println("Month of year: " + dt.getMonthOfYear());
        System.out.println("Day of week: " + dt.getDayOfWeek());
        System.out.println("Day of year: " + dt.getDayOfYear());
        
        // For example to get the end of day
        System.out.println("End of day: " + dt.withTimeAtStartOfDay().plusDays(1).minusSeconds(1));
        
        // Format the date in the desired pattern
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.print(dt);
        System.out.println("Formatted Date: " + formattedDate);
    }
}