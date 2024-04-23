package org.example;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import java.lang.reflect.Method;

class MyClass {

    void doSomething() {
        System.outOut.println("Doing something");
    }
}