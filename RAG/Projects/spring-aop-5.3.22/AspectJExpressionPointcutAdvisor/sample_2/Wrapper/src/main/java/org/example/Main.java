package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework(aop.aspectj.AspectJExpressionPointcutAdvisor;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.example..*(..))");

        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(new LoggingInterceptor());

        // Enable auto proxy creation
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setAdvisors(Collections.singletonList(advisor));
        // now auto-proxies will be created based on the advisors you set

        // Test if the pointcut is working
        boolean result = advisor.getPointcut().matches(null, Object.class);
        System.out.println(result);
    }
}