package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.jang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class LoggingAspect {

    @Pointcut("execution(* com.example..*(..))")  // pointcut expression
    public void anyPublicMethod(){}

    @After("anyPublicMethod()")
    public void afterAdvice() {
        System.out.println("Executed after advice");
    }
}