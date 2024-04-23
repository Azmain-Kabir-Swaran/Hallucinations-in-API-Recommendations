package org.example;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
        // You can access beans created in the XML file using the context 
        // Here's an example:
        //MyBean myBean = (MyBean) context.getBean("myBean");
    }
}