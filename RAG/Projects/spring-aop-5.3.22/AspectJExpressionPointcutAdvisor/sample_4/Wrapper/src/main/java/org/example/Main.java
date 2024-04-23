package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AspectJExpressionPointcut pointcut = (AspectJExpressionPointcut) context.getBean("myPointcut");
        DefaultPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor(pointcut, "myAdvisor");
        // continue with advisor's use
    }
}