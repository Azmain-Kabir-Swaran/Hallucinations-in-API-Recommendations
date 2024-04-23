package org.example;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Main implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context initialized at:" + System.currentTimeMillis());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroyed at:" + System.currentTimeMillis());
    }
}