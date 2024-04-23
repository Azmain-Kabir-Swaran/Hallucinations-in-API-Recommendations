package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.lang.annotation.Aspect;

public class MethodLoggerAspect {

    @Around("execution(* *(..))")
    public Object logMethodInvocation(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Entering method: " + methodName);
        try {
            Object result = joinPoint.proceed();
            System.out.println("Exiting method: " + methodName);
            return result;
        } catch (Throwable t) {
            System.out.println("Error in method: " + methodName);
            throw t;
        }
    }
}