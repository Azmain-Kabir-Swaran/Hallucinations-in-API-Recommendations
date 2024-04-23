package org.example;


import org.springframework.aop.aspectj.AspectJPointcutAdvisor;
import org.springframework.aop.framework.Advised;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class Main {
    public static void main(String[] args) {
        AspectJPointcutAdvisor advisor = new AspectJPointcutAdvisor();
        advisor.setAdviceBeanName("myAdvice");
        advisor.setPointcut("execution(* example.pointcut.*())");
        
        // Use your own instance or create new instance
        Advised advised = new Advised();
        advised.addAdvisor(advisor);
        
        // Now call a method on the advised object.
    }
}