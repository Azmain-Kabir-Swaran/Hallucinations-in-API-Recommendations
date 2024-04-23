package org.example;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import java.util.EventListener;

public class Main implements ServletContextAttributeListener {

    public void attributeReplaced(ServletContextAttributeEvent evt) {
        // Do something after attribute is replaced.
    }

    public void attributeAdded(ServletContextAttributeEvent evt) {
        // Do something after attribute is added.
    }

    public void attributeRemoved(ServletContextAttributeEvent evt) {
        // Do something after attribute is removed.
    }

    // Other necessary APIs such as ServletContext, ServletConfig etc could be used here

    public static void main(String[] args) {
        // Call the servletContext.setAttribute(String, Object) method when needed.
        System.out.println("ServletContextAttributeEvent Example");
    }
}