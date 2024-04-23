package org.example;


import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("pathToApplicationContext.xml");
        context.refresh();
        
        // Now you can get beans from the context...
        // Object myBean = context.getBean("myBeanName");
    }
}