package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

public class LogAfterThrowingAspect {

    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "ex")
    public void afterThrowingAdvice(JoinPoint joinPoint, Throwable ex) {
        System.out.println("Throwable exception: " + ex.getMessage());
    }

}