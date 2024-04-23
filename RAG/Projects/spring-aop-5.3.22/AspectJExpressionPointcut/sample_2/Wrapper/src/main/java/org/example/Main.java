package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

        pointcut.setExpression("execution(* com.xyz..*(..))"); // modify as per requirement

        boolean matches = pointcut.matches(Main.class, Main.class.getDeclaredMethods()[0], null);
        System.out.println("Method matches pointcut: " + matches);
    }
}