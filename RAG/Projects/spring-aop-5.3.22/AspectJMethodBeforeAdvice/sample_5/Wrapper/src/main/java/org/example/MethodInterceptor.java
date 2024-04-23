package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.langlang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.aspectj.MethodBeforeAdvice;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import java.lang.annotation.*;

public class MethodInterceptor implements MethodBeforeAdvice {

    @Before(value="@annotation(loggable)", argNames="joinPoint,loggable")
    public void checkInput(ProceedingJoinPoint joinPoint, Loggable loggable) throws Throwable {
        // Add code here to check input of the method being invoked
        System.out.println("Checking input before calling " + joinPoint.getSignature().getName());
        joinPoint.proceed();
    }
    
    @Around(value="@annotation(loggable)", argNames="joinPoint,loggable")
    public void around(ProceedingJoinPoint joinPoint, Loggable loggable) throws Throwable {
        // Add code here for what to do before and after the method being invoked
        System.out.println("Before invoking " + joinPoint.getSignature().getName());
        joinPoint.proceed();
        System.out.println("After invoking " + joinPoint.getSignature().getName());
    }
}