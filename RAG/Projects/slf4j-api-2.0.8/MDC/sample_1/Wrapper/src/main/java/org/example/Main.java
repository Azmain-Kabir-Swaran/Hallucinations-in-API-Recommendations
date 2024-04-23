package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Put data into MDC
        MDC.put("userName", "John");

        System.out.println("Logging with MDC data...");

        // Get data from MDC and log it
        String userName = MDC.get("userName");
        System.out.println("User name is: " + userName);

        // Clear MDC when done
        MDC.clear();
    }
}