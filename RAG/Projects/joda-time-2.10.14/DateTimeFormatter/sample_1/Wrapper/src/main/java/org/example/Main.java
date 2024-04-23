package org.example;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Create a date
        DateTime dateTime = new DateTime();
        
        // Define the format
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        
        // Format the date
        String formattedDate = fmt.print(dateTime);
        
        // Output the result
        System.out.println(formattedDate);
    }
}