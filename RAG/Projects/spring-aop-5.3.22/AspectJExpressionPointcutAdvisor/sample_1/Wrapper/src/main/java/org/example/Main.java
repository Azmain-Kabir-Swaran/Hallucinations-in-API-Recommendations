package org.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.support.JdkDynamicAutoProxyCreator;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Main {
    public static void main(String[] args) {
        StaticApplicationContext context = new StaticApplicationContext();
        context.refresh();
        context.registerShutdownHook();

        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("execution(* set*(int))");

        TargetClass targetClass = new TargetClass();
        targetClass.setName("Alice");
        targetClass.setAge(15);

        // Proceeding with creating the proxy with dynamic proxy
        JdkDynamicAutoProxyCreator creator = new JdkDynamicAutoProxyCreator();
        creator.setInterceptorNames("advisor");
        creator.setBeanFactory(context);

        Advised advised = (Advised) creator.getObject();
        advised.getAdvisors().add(advisor);
        TargetClass proxy = (TargetClass) advised.getProxy();

        proxy.setName("Alice");
        proxy.setAge(15);

        System.out.println(proxy.getName());
        System.out.println(proxy.getAge());
    }
}