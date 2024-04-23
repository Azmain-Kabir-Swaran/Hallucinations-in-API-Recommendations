package org.example;


import org.springframework.context.support.StaticApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Create a StaticApplicationContext object
        StaticApplicationContext context = new StaticApplicationContext();

        // Add a bean to the context
        context.registerSingleton("myBean", MyBean.class);

        // Start the context and refresh it (equivalent to spring's context.refresh() method)
        context.refresh();

        // Check if the bean was created and added to the context
        if (context.containsBean("myBean")) {
            System.out.println("myBean exists in the context.");
        } else {
            System.out.println("myBean does not exist in the context.");
        }

        // Close the context (equivalent to spring's context.close() method)
        context.close();
    }
}