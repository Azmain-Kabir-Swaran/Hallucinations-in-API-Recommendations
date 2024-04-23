package org.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Application started");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.outprintln("Application ended");
    }
}