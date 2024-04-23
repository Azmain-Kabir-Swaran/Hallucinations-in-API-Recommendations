package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

public class ExampleAspect {

    @AfterReturning(value = "execution(* main.Main.exampleFunction(*))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("Method '" + joinPoint.getSignature().getName() + "' returned value: " + result);
    }
}