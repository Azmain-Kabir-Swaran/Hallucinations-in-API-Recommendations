package org.example;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class Main implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed");
    }
}