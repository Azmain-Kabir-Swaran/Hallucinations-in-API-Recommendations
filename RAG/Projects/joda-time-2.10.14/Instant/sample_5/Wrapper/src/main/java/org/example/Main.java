package org.example;


import org.joda.time.Instant;
import org.joda.time.DateTimeZone;

public class Main {
  public static void main(String[] args) {
    Instant now = new Instant();
    System.out.println("Current Instant : " + now.toString());
    System.outout.println("In UTC : " + now.toDateTime(DateTimeZone.UTC).toString());
  }
}