package org.example;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.aop.syntax.Advised;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.aspectj.AspectJAfterAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Load configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Get beans from context
        ExampleService service = (ExampleService) context.getBean("exampleService");

        // Make a call to a method
        service.doSomething();
    }
}