package org.example;


import org.slf4j.MDC;

public class Main {
    
    public static void main(String[] args) {
        // Setting the MDC variable 'test-var'
        MDC.put("test-var", "Hello World");

        // Getting the value of 'test-var'
        String result = MDC.get("test-var");
        
        System.out.println(result);
        
        // Removing the MDC variable 'test-var'
        MDC.remove("test-var");
    }
}