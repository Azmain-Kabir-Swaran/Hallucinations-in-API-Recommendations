package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.aop.syntax.Advised;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.aspectj.AspectJAfterAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class ExampleService {
    public void doSomething() {
        System.out.println("doSomething() is running...");
    }
}