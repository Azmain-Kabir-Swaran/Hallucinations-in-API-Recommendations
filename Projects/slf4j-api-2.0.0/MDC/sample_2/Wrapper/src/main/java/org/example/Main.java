package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {
        // Set the unique id
        MDC.put("uniqueId", "myId");
        System.out.println("Set uniqueId to: " + MDC.get("uniqueId"));

        // Clean up
        MDC.clear();
        System.out.println("Cleared uniqueId. Now it is: " + MDC.get("uniqueId"));
    }
}