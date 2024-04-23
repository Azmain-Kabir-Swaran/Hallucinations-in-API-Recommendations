package org.example;


import java.lang.reflect.Method;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        Method m = aspectJExpressionPointcut.getClass().getMethod("setExpression", String.class);
        m.invoke(aspectJExpressionPointcut, "execution(* com.*.*(..))");
        System.out.println("AspectJExpressionPointcut set with expression 'execution(* com.*.*(..))'");
    }
}