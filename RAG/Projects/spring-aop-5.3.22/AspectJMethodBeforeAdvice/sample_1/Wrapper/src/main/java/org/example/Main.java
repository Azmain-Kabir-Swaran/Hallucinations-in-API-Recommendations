package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.langmework.aspects.AspectJMethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class Main {
    public static void main(String[] args) {
        AspectJMethodBeforeAdvice aspectJMethodBeforeAdvice = new AspectJMethodBeforeAdvice();
        aspectJMethodBeforeAdvice.setAdvice(new ThrowsAdvice() {
            @Before("execution(* *(..))")
            public void beforeAdvice(JoinPoint joinPoint) {
                System.out.println("Before method: " + joinPoint.getSignature().getName());
            }
        });

        MyBean myBean = new MyBean();
        AspectJAwareAdvisor advisor = new AspectJAwareAdvisor(aspectJMethodBeforeAdvice);
        ProxyFactory factory = new ProxyFactory(myBean);
        factory.addAdvisor(advisor);
        MyBean proxy = (MyBean) factory.getProxy();

        proxy.someMethod(); // The "beforeAdvice" method will print out a message before executing "someMethod"
    }
}