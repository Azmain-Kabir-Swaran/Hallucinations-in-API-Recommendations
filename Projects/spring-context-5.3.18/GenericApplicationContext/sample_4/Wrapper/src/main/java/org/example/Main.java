package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        // Add beans here
        context.registerBean("myBean", MyBean.class);
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean.toString());
        context.close();
    }
}