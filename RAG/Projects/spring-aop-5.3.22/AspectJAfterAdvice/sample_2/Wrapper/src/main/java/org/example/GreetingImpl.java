package org.example;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

class GreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello, world!");
    }
}