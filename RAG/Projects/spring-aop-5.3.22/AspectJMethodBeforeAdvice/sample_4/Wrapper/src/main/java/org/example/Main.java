package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class Main {
    @Before("execution(* *(..))")
    public void beforeAdvice(JoinPoint jp) throws Throwable {
        System.out.println("Before method: " + jp.getSignature().getName());
    }
}