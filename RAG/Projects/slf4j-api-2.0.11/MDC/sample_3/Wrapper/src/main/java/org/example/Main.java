package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // setting up a new thread context
        MDC.put("key1", "value1");
        MDC.put("key2", "value2");

        // access the values
        System.out.println("value1: " + MDC.get("key1"));
        System.out.println("value2: " + MDC.get("key2"));

        // removing values from MDC
        MDC.remove("key1");
        MDC.remove("key2");
    }
}