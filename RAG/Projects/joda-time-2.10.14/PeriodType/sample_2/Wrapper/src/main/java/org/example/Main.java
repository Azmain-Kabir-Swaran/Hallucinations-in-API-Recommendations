package org.example;


import org.joda.time.PeriodType;
import org.joda.time.Period;

public class Main {
    public static void main(String[] args) {
        Period p = new Period(PeriodType.days());
        System.out.println("Period is: " + p);
    }
}