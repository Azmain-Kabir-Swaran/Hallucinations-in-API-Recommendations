package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Set the context for MDC
        MDC.put("username", "john");
        MDC.put("transaction-id", "ab123");

        // Get the context for MDC
        String user = MDC.get("username");
        String transactionId = MDC.get("transaction-id");

        System.out.println("Username: " + user);
        System.out.println("Transaction ID: " + transactionId);

        // Clean up MDC context
        MDC.clear();
    }
}