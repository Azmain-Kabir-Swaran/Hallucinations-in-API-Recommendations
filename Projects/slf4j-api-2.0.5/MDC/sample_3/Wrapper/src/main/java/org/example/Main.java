package org.example;


import org.slf4j.MDC;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Put a value into the MDC against the key "key"
        MDC.put("key", "value");
        
        // Retrieve the value from the MDC and print it
        System.out.println(MDC.get("key"));
        
        // Clear the MDC
        MDC.clear();
        
        // Outputs an empty map as there are no values in the MDC
        Map<String, String> map = MDC.getCopyOfContextMap();
        System.out.println(map);
    }
}