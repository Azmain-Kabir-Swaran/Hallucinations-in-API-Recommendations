package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {
        // set MDC values
        MDC.put("key1", "value1");
        MDC.put("key2", "value2");

        // retrieve MDC values
        System.out.println("key1 = " + MDC.get("key1"));
        System.out.println("key2 = " + MDC.get("key2"));

        // clear MDC values
        MDC.clear();
    }
}