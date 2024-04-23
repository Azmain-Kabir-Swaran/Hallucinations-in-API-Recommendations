package org.example;


import org.slf4j.MDC;

public class Main {
    public static void main(String[] args) {
        MDC.put("key", "value"); // add a new entry
        MDC.get("key"); // return the entry
        MDC.remove("key"); // remove the entry
    }
}