package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        // put data to the current thread's MDC
        MDC.put("user", "user1");
        
        // you can get data from the current thread's MDC
        String user = MDC.get("user");
        System.out.println("User: " + user);
    }
}