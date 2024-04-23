package org.example;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.s;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("within(java.lang.String)");  // Set the pointcut expression, for example, for all methods in String class.
        MethodExecution aMethod = new MethodExecution(); // Assume it's a method that you want to wrap

        if (pointcut.matches(aMethod, Main.class.getName(), "main")) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }
    }
}