package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {

        // Put a name-value pair into the MDC
        MDC.put("myMDCCtx", "Hello, World!");

        // Retrieve the value from the MDC under the given key
        System.out.println(MDC.get("myMDCCtx"));

        // Clear the MDC
        MDC.clear();

    }
}