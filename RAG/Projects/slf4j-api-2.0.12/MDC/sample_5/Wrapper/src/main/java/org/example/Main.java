package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        MDC.put("userId", "1234");
        
        System.out.println("Log message with userId=" + MDC.get("userId"));
        
        MDC.clear();
    }
}