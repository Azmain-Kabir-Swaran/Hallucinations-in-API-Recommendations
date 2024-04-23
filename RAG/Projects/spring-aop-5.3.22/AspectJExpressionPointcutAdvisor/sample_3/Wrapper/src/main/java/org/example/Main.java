package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("execution(* com.example..*(..))"); // Replace with your actual pointcut
        advisor.setAdvice(new BeforeAdvice());

        System.out.println("AspectJExpressionPointcutAdvisor created successfully");
    }
}