package org.example;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create GenericXmlApplicationContext
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("path/to/your/config/file.xml"); // Load the configuration file for beans
        context.refresh(); // Start the application context

        // Now you can get bean instances from the application context
        Object myBean = context.getBean("myBeanId");

        // You can do whatever you need to do with myBean...
    }
}