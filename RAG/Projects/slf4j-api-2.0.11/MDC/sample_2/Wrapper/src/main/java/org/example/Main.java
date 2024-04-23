package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Put a key-value pair into the context
        MDC.put("user", "user123");

        // Get the value corresponding to the key we just used
        String userID = MDC.get("user");
        System.out.println("The user ID is: " + userID);

        // Clear the map, remove any values put into it with MDC.put
        MDC.clear();
    }
}