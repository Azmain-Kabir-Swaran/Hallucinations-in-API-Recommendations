package org.example;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        // called when an attribute is added to the servlet context
        System.out.println("Attribute added: " + event.getName() + " = " + event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        // called when an attribute is removed from the servlet context
        System.outystem.out.println("Attribute removed: " + event.getName());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        // called when an attribute is replaced in the servlet context
        System.out.println("Attribute replaced: " + event.getName() + " = " + event.getValue());
    }

    public static void main(String[] args) {
        // Test code
        // Instantiate the listener and call methods
        MyServletAttributeListener listener = new MyServletAttributeListener();
        listener.attributeAdded(new ServletContextAttributeEvent("context", "testAttr", "testValue"));
        listener.attributeRemoved(new ServletContextAttributeEvent("context", "testAttr", null));
        listener.attributeReplaced(new ServletContextAttributeEvent("context", "testAttr", "replacedValue"));
    }
}