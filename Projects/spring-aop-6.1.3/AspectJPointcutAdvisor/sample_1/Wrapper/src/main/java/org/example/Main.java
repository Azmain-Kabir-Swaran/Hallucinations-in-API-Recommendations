package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.aop.support.SyntheticMethodMatcher;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.ClassFilterAdapter;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.DefaultClassFilter;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // AspectJ Expression Pointcut
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.example.service.*Service.*(..))");
        
        // NameMatchMethodPointcut
        NameMatchMethodPointcut methodPointcut = new NameMatchMethodPointcut();
        methodPointcut.addName("invoke");

        // StaticMethodMatcherPointcut
        StaticMethodMatcherPointcut staticMatcherPointcut = new StaticMethodMatcherPointcut() {
            @Override
            public boolean matches(Method method, Class targetClass) {
                return method.getName().startsWith("start") || method.getName().startsWith("stop");
            }
        };

        // SyntheticMethodMatcher
        SyntheticMethodMatcher syntheticMatcher = new SyntheticMethodMatcher() {
            @Override
            public boolean matches(Method method) {
                return AopUtils.isSyntheticMethod(method);
            }
        };

        // JdkRegexpMethodPointcut
        JdkRegexpMethodPointcut regexpMethodPointcut = new JdkRegexpMethodPointcut();
        regexpMethodPointcut.setPattern(".*start.*");

        // ClassFilterAdapter
        ClassFilterAdapter classFilterAdapter = new ClassFilterAdapter(new DefaultClassFilter() {
            @Override
            public boolean matches(Class targetClass) {
                return targetClass.getSimpleName().startsWith("Service");
            }
        });

        // Advisor
        Advisor advisor = new DefaultPointcutAdvisor(pointcut, classFilterAdapter);

        // Other way is by using AspectJPointcutAdvisor from spring-aop-6.1.3
        // AspectJPointcutAdvisor aspectJPointcutAdvisor = new AspectJPointcutAdvisor(pointcut);

        System.out.println("Pointcut classes compiled correctly.");
    }
}