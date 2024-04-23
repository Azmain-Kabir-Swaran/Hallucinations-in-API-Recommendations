package org.example;


import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* *(..))");

        System.out.println("Pointcut matches: " + pointcut.matches(Main.class, "methodName", new Object[0], null));
    }

    @Aspect
    static class Aspect {
        @Pointcut("execution(* *(..))")
        public void anyMethod() {}

        @Before("anyMethod()")
        public void before(JoinPoint joinPoint) {
            System.out.println("Called method: " + joinPoint.getSignature().getName());
        }
    }

    public void methodName() {
        System.out.println("I am a method.");
    }
}