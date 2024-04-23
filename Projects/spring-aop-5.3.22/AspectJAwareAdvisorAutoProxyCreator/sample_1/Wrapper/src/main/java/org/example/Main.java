package org.example;


import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.framework.autoproxy.AspectJAwareAdvisorAutoProxyCreator;

public class Main {

    public static void main(String[] args) {
        AspectJAwareAdvisorAutoProxyCreator creator = new AspectJAwareAdvisorAutoProxyCreator();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.example..*.*(..))");
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, new MyAspect());
        creator.addAdvisor(advisor);

        // The following line demonstrates the use of aspectj:weaving attribute
        // To be able to use this attribute in a real-world project, 
        // you should understand how to properly configure build tools like Maven/Gradle.
        creator.addAdvisor(advisor); 
    }

}