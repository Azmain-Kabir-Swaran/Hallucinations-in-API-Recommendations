package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Main {
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        String dateTimeStr = dt.toString();

        // Using joda-time DateTimeFormatter to convert LocalDateTime to a specific format
        org.joda.time.format.DateTimeFormatter formatter =
              DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.print(dt);
        
        System.out.println("Current date and time is: " + dateTimeStr);
        System.out.println("Current date and time (formatted) is: " + formattedDate);
    }
}