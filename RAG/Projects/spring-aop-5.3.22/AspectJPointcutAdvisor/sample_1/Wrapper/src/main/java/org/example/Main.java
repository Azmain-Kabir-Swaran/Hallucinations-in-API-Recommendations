package org.example;


import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AspectJExpressionPointcut;
import org.springframework.aop.support.AroundAdvice;
import org.springframework.aop.support.AspectJPointcutAdvisor;

public class Main {

    public static void main(String[] args) {
        // create AspectJExpressionPointcut
        Pointcut pointcut = new AspectJExpressionPointcut("execution(public String getName())");
        // create AroundAdvice
        AroundAdvice advice = new AroundAdvice();
        // create AspectJPointcutAdvisor
        AspectJPointcutAdvisor advisor = new AspectJPointcutAdvisor(pointcut, advice);
        // use AspectJPointcutAdvisor to weave aspect(advice) to the target object
        // Here we can't do that in a simple java application but the process will be similar for real applications
    }
}