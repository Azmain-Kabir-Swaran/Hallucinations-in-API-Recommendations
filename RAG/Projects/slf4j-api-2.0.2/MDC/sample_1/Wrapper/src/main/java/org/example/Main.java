package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        MDC.put("user", "user1");
        MDC.put("password", "pass1");

        String user = MDC.get("user");
        String password = MDC.get("password");

        System.out.println("User = " + user + " and Password = " + password);

        MDC.clear(); // clears the MDC and removes entries made so far.
    }
}