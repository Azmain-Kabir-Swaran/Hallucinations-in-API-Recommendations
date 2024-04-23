package org.example;

import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;
import java.lang.reflect.Method;
import org.cglib.proxy.Enhancer;
import org.cglib.proxy.MethodInterceptor;
import org.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

class MessageServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}