package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AopUtils;

public class Main {

    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* set*(int))");
        
        Pointcut pc = AopUtils.canonical(pointcut);
        
        System.out.println(pc.getClass().getName());
        System.out.println(pc.getExpression());
    }
}