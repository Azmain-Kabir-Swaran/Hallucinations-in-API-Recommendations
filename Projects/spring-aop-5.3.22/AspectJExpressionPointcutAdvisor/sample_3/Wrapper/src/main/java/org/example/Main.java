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

public class Main {

    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MessageService.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("Logging before method call");
                Object res = proxy.invokeSuper(obj, args);
                System.out.println("Logging after method call");
                return res;
            }
        });
        MessageService messageServiceWithLogging = (MessageService) enhancer.create();
        messageServiceWithLogging.sendMessage("Hello World");
    }
}