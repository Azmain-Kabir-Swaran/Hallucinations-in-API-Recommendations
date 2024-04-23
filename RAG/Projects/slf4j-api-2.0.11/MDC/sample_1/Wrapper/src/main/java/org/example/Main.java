package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {
        // Setting a key-value pair
        MDC.put("user", "John Doe");

        System.out.println("User accessed the system: " + MDC.get("user"));

        // Removing the key-value pair
        MDC.remove("user");
    }
}