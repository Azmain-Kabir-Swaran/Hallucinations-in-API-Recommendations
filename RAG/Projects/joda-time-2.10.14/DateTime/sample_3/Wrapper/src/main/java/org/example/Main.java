package org.example;


import org.joda.time.DateTime;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {

        // Instantiate DateTime from Joda Time
        DateTime dateTime = new DateTime();
        System.out.println("Current DateTime is: " + dateTime);

        // Use Apache Commons Lang3 StringUtils class
        String str = "Hello Joda Time!";
        System.out.println("Is string empty? " + StringUtils.isEmpty(str));

        // Use built-in Math class
        System.out.println("Square root of 4 is: " + Math.sqrt(4));
    }
}