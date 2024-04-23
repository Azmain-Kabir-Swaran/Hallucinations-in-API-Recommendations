package org.example;


import org.joda.time.DateTime;
import org.joda.time.Instant;

public class Main {
    public static void main(String[] args) {
        // Get the current date and time.
        DateTime now = new DateTime();
        System.out.println("Current date and time is: " + now.toString());

        // Get the current date in Unix timestamp format.
        long unixTimestamp = now.getMillis() / 1000L;
        System.out.println("Current Unix timestamp is: " + unixTimestamp);

        // Alternatively, you can use Instant API in Joda-Time.
        Instant nowInstant = new Instant();
        System.out.println("Current instant is: " + nowInstant.toString());
    }
}