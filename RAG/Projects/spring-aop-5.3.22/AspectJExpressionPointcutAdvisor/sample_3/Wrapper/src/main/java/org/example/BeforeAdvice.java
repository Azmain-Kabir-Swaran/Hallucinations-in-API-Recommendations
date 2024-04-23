package org.example;

import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

class BeforeAdvice {
    @Before("execution(* com.example..*(..))") // Replace with your actual pointcut
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Executing advice before: " + joinPoint.getSignature().toLongString());
    }
}