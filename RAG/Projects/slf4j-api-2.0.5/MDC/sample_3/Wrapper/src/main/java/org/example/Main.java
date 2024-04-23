package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {
        MDC.put("key", "value");
        System.out.println(MDC.get("key")); // Should print "value"
        MDC.clear();
    }
}