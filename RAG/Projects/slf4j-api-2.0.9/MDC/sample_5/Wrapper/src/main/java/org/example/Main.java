package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        MDC.put("myKey", "myValue");

        String value = MDC.get("myKey");
        System.out.println("Value retrieved: " + value);

        MDC.remove("myKey");

        // Test again to ensure the key is removed.
        String valueAfterRemoval = MDC.get("myKey");
        System.out.println("Value after removal: " + valueAfterRemoval);
    }
}