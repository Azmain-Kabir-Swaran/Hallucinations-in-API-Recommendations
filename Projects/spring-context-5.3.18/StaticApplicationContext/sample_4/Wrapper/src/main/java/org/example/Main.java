package org.example;


import org.springframework.context.support.StaticApplicationContext;

public class Main {
    public static void main(String[] args) {
        StaticApplicationContext context = new StaticApplicationContext();

        // Define beans here, for example:
        // context.registerSingleton("myBean", MyBean.class);

        context.refresh();

        // Retrieve beans from the context:
        // MyBean myBean = (MyBean) context.getBean("myBean");
    }
}