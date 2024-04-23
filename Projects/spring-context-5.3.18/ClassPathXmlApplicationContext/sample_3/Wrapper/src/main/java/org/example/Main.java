package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Create a new application context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        
        // Get the bean from the context
        String helloWorldBean = (String)ctx.getBean("helloWorldBean");
        
        // Use the bean
        LOGGER.info(helloWorldBean);
        
        // Close the application context
        ctx.close();
    }
}