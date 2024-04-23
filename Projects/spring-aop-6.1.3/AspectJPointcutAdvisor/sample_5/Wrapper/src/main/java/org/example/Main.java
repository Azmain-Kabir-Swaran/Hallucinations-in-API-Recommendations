package org.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJPointcutAdvisor;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* BusinessService.*(..))");
        AspectJPointcutAdvisor advisor = new AspectJPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(new BusinessServiceAdvice());
    }
}