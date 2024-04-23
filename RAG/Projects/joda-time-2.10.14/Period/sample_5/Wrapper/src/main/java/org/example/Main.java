package org.example;


import org.joda.time.Period;
import org.joda.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    LocalDate start = new LocalDate(2000, 2, 2);
    LocalDate end = new LocalDate(2004, 3, 3);
    
    Period p = new Period(start, end);
    System.out.println("Period in days : " + p.getDays());
    System.outc.out.println("Period in months : " + p.getMonths());
    System.out.println("Period in years : " + p.getYears());
  }
}