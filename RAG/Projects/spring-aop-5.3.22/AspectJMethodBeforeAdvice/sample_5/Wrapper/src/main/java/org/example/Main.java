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

class you want to be method intercepted
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =  new AnnotationConfigApplicationContext(Application.class);
        MyBean myBean = ctx.getBean(MyBean.class);
        // You will intercept the following method call, assuming that it's annotated with @loggable
        myBean.someMethod();
    }
}