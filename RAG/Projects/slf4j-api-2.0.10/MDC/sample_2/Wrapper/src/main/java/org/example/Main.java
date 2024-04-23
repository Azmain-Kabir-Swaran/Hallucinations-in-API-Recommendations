package org.example;


import org.slf4j.MDC;

public class Main {

    public static void main(String[] args) {
        //Put some information to the thread context
        MDC.put("userId", "user1");
        MDC.put("context", "global context");
        
        //Call methods that do logging with MDC context
        logSomeMessage();
        
        //Clear MDC
        MDC.clear();
    }

    private static void logSomeMessage() {
        //Use MDC data to log messages about the user and context
        System.out.println(MDC.get("userId") + " in " + MDC.get("context") + " is doing something.");
    }

}