package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(public * *(..))");

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(pointcut);
        advisor.setAdvice(new MyAdvice());

        // Now you can use advisor...
    }
}