package org.example;


import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String[] args) {
        final Greeting greeting = new GreetingImpl();
        
        AfterReturningAdvice advice = new AfterReturningAdviceImpl();
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new AlwaysRunRule(), advice);
        
        ProxyFactory factory = new ProxyFactory();
        factory.addAdvisor(advisor);
        factory.setTarget(greeting);
        
        Greeting greetingProxy = (Greeting) factory.getProxy();
        
        greetingProxy.greet();
    }
}