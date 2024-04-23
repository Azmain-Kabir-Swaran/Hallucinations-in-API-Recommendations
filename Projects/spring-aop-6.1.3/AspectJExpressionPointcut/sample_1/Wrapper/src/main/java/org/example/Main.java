package org.example;


import org.aspectj.lang.Aspects;
import org.aspectj.lang.Pointcut;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.util.Assert;

public class Main {
    public static void main(String[] args) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.package..*(..))");

        CodeSignature signature = (CodeSignature) Aspects.aspectOf(pointcut);

        System.out.println("Pointcut expression: " + pointcut.getExpression());
        System.out.println("Code signature: " + signature.getMethod());
    }
}