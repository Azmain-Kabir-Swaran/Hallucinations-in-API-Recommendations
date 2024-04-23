package org.example;

import org.springframework.aop.aspectj.AspectJPointcutAdvisor;
import org.springframework.aop.framework.Advised;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

class MyAdvice {
    @Before("execution(* example.pointcut.*())")
    public void myAdviceMethod() {
        System.out.println("Executing method from MyAdvice class");
    }
}