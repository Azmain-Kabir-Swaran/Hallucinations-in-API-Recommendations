package org.example;


import org.joda.time.*;
import org.joda.time.format.*;
import org.joda.time.PeriodType;

public class Main {

    public static void main(String[] args) {
        // Create a DateTime object representing the current date and time
        DateTime now = new DateTime();
        System.out.println("Now: " + now);

        // Create a DateTime object representing the next week's date
        DateTime nextWeek = now.plus(Period.weeks(1));
        System.out.println("Next week: " + nextWeek);

        // Calculate the difference between now and the next week's date
        Period period = new Period(now, nextWeek, PeriodType.forFields(DateTimeFieldType.days(),
                                                                DateTimeFieldType.hours(),
                                                                DateTimeFieldType.minutes(),
                                                                DateTimeFieldType.seconds()));

        System.out.println("Difference in days:hours:minutes:seconds = " + period.getDays() + ":" + period.getHours() + ":" + period.getMinutes() + ":" + period.getSeconds());
    }
}