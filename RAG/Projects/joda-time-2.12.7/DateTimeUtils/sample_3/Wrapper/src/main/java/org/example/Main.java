package org.example;


import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

public class Main {
    public static void main(String[] args) {
        DateTime now = new DateTime();
        DateTime later = now.plusDays(3);

        Duration duration = new Duration(now, later);
        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix(" year ", " years ")
                .appendMonths().appendSuffix(" month ", " months ")
                .appendDays().appendSuffix(" day ", " days ")
                .appendHours().appendSuffix(" hour ", " hours ")
                .appendMinutes().appendSuffix(" minute ", " minutes ")
                .appendSeconds().appendSuffix(" second ", " seconds ")
                .toFormatter();

        String durationFormatted = formatter.print(duration.toPeriod());

        System.out.println("Difference between now and three days later: " + durationFormatted);
    }
}