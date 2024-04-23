package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.example..*.*(..))");

        System.out.println(pointcut.getClassFilter().matches(Main.class));  // true
    }
}