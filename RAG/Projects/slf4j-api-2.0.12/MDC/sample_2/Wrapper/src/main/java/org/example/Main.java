package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Puts data in the MDC
        MDC.put("key", "value");
        
        // Retrieves data from the MDC and logs it
        String mdcValue = MDC.get("key");
        System.out.println("MDC value for key 'key': " + mdcValue);
    }
}