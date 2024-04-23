package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("springdemo");
        ctx.refresh();

        GreetingService greetingService = (GreetingService)ctx.getBean("greetingService");
        System.out.println(greetingService.greet());

        ctx.close();
    }
}