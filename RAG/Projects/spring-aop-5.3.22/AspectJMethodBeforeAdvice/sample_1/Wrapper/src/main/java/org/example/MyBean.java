package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.langmework.aspects.AspectJMethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

class MyBean {
    public void someMethod() {
        System.out.println("Some method is being executed");
    }
}