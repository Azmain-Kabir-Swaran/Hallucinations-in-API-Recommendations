package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

public class MyAspect {

    @Before("execution(* main(String[]))")
    public void beforeMain(JoinPoint joinPoint) {
        System.out.println("Before main method execution");
    }
}