package org.example;


import javax.servlet.*;
import javax.servlet.ServletContextEvent;

public class Main implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext initialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out("ServletContext destroyed");
    }

    public static void main(String[] args) {
        System.out.println("This is a test main() method");
    }

}