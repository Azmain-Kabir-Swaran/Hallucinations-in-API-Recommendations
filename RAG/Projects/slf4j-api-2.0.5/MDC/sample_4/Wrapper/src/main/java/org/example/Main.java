package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {

        MDC.put("username", "someuser");
        MDC.put("transactionId", "12345");

        System.out.println("User '" + MDC.get("username") + "' is doing a transaction with id '" + MDC.get("transactionId") + "'");

        MDC.clear();
    }
}