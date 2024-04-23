package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Put a value into MDC context map using put() method
        MDC.put("key1", "value1");
        
        // Getting the value from MDC context map using get() method
        String value1 = MDC.get("key1");
        System.out.println(value1);
        
        // Clearing the MDC context map using remove() method
        MDC.remove("key1");
        
        // Checking the MDC context map is empty using the size() method
        if(MDC.getCopyOfContextMap().size() == 0) {
            System.out.println("The MDC context map is empty.");
        }
        else {
            System.out.println("The MDC context map is not empty.");
        }
    }
}