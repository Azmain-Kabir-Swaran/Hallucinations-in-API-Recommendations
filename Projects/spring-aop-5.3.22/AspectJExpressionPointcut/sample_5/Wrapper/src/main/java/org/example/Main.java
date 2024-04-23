package org.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        ExpressionParser parser = new SpelExpressionParser();
        pointcut.setExpression("execution(* com.package.**(..))");
        boolean matches = pointcut.matches(Main.class, Main.class.getMethod("main", String[].class), null);
        System.out.println(matches ? "Method matches pointcut" : "Method does not match pointcut");
    }
}