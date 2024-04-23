package org.example;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servletervletContextAttributeListener;

public class ContextListener implements ServletContextAttributeListener {
    
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        ServletContext context = event.getServletContext();
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("Attribute added: " + name + " = " + value);
    }
    
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        ServletContext context = event.getServletContext();
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("Attribute removed: " + name);
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        ServletContext context = event.getServletContext();
        String name = event.getName();
        Object value = event.getValue();
        System.out.println("Attribute replaced: " + name + " = " + value);
    }
}