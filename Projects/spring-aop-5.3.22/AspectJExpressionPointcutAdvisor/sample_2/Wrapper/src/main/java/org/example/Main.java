package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.support.AspectJExpressionPointcutAdvisor;
import org.springframework.util.ClassUtils;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        // Define the AspectJ expression for the pointcut.
        String expression = "execution(* example.service.*(..))";

        // Create the pointcut itself.
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(expression);

        // Create an advisor to apply the pointcut on.
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setPointcut(pointcut);

        // Test whether the advisor applies the pointcut.
        Class<?> type = Class.forName("example.service.ExampleService");
        Method method = type.getMethod("foo", new Class[0]);

        boolean matches = advisor.getPointcut().getClassFilter().matches(type) && advisor.getPointcut().getMethodMatcher().matches(method, type);
        System.out.println("Method " + method + " matches the pointcut: " + matches);
    }
}