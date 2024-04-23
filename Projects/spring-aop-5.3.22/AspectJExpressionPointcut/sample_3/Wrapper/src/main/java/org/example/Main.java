package org.example;


import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

public class Main {
    public static void main(String[] args) {
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern("execution(public void com..*.*(..))");

        MyAdvisor advisor = new MyAdvisor();
        advisor.setPointcut(pointcut);

        MyClass myClass = new MyClass();

        System.out.println(AopUtils.findAdvisorsThatCanApply(myClass, advisor));
    }

    static class MyAdvisor extends AbstractBeanFactoryPointcutAdvisor {
    }

    static class MyClass {
        public void myMethod() {
            System.out.println("Inside myMethod");
        }
    }
}