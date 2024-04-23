package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AroundAdvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.lang.reflect.Method;

public class Main {
    // AspectJ after returning advice
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = joinPoint.proceed();
        System.out.println("Executing after returning method");
        return result;
    }

    // Method that will be called after aroundAdvice()
    public void afterMethod(JoinPoint joinPoint) throws NoSuchMethodException {
        Advised advised = (Advised) joinPoint.getThis();
        Object proxy = advised.getActiveProxies().get(0);
        Method specificMethod = advised.getTarget().getClass().getDeclaredMethod("<insert method name>");
        specificMethod.setAccessible(true);

        System.out.println("Calling specific method on proxy "+proxy.getClass().getName());
        specificMethod.invoke(proxy);
    }

    // Main method
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    }
}