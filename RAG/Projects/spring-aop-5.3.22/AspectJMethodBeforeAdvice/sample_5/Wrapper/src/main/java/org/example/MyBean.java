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

public class MyBean {
    @Autowired
    SomeOtherBean someOtherBean;
    
    @Loggable
    public void someMethod() {
        System.out.println("Method is called");
    }
}