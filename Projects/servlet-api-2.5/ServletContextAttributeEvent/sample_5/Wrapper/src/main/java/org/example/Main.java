package org.example;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class Main {
    public static void main(String[] args) {
        // Here is the code you want to run
        ServletContextAttributeEvent event = new ServletContextAttributeEvent("context", "attribute", "oldValue", null);
        System.out.println("Attribute event: " + event);
    }
}