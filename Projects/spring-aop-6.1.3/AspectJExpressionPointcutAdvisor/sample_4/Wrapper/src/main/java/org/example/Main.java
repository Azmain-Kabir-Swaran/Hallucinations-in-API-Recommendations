package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.aop.support.DefaultIntroductionInterceptor;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("execution(void com.acme.somePackage.*.*(..))");
        advisor.setAdvice(new DefaultIntroductionAdvisor(new DefaultIntroductionInterceptor()));
    }
}