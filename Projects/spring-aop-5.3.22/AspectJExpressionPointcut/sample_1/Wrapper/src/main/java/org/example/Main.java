package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression("execution(* get*(..))");

        Advice advice = new DefaultPointcutAdvisor(aspectJExpressionPointcut, new Advice() {
            public void execute(Advice.Invocation invocation) throws Throwable {
                // Perform some operation
                System.out.println("Advice executed!");
                // Now call the intercepted method
                invocation.proceed();
            }
        });

        // Use the `advice` object as needed, such as registering it with a target object or adding to another PointcutAdvisor.
    }
}