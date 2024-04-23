package org.example;


import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        // Instantiate the class
        MyClass myClass = new MyClass();

        // Create the advised object
        AdvisedSupport config = new AdvisedSupport();
        config.setTargetSource(new TargetSource(myClass));

        // Create the Advice
        MethodBeforeAdvice advice = new MethodBeforeAdvice() {
            @Override
            public void before(Method method, Object[] args, Object target) throws Throwable {
                System.out.println("Method: " + method + " was called");
            }
        };

        config.setMethodBeforeAdvice(advice);

        // Create the proxy with the advised object
        MyClass proxy = (MyClass) new ProxyFactory(config).getProxy();

        // Call the method from the proxy
        proxy.doSomething();
    }
}