package org.example;


import org.apache.commons.lang3.RandomUtils;
import org.joda.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        // Using joda-time's Period API
        LocalDate today = new LocalDate();
        LocalDate birthDate = today.minusYears(30);
        Period period = new Period(birthDate, today, 0);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        
        // Using Apache Commons Lang's RandomUtils API
        int randomNumber = RandomUtils.nextInt();
        System.out.println("Random Number: " + randomNumber);

        // Using java.time.LocalDate and java.time.LocalDateTime
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDateTime.toLocalDate());
        System.out.println("Current Time: " + currentDateTime.toLocalTime());
        
        // Using java.time.temporal.ChronoUnit
        LocalDateTime future = LocalDateTime.of(2025, 1, 1, 12, 0);
        long years = ChronoUnit.YEARS.between(currentDateTime, future);
        long months = ChronoUnit.MONTHS.between(currentDateTime, future);
        long days = ChronoUnit.DAYS.between(currentDateTime, future);
        System.out.println("Years until 2025: " + years);
        System.out.println("Months until 2025: " + months);
        System.out.println("Days until 2025: " + days);
    }
}