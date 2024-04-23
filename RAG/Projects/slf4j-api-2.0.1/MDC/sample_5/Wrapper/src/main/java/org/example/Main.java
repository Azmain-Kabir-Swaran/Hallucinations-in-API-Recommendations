package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // Setting a key-value pair in MDC
        MDC.put("user", "john");
        
        // Getting value from MDC
        String user = MDC.get("user");
        System.out.println(user);
        
        // Removing key from MDC
        MDC.remove("user");
    }
}