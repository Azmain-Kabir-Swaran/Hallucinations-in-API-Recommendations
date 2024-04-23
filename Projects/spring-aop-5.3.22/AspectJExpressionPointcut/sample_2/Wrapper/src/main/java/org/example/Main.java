package org.example;


import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.aspectj.lang.reflect.CodeSignature;

public class Main {
    public static void main(String[] args) {
        // create a new AspectJExpressionPointcut
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("execution(* com.mypackage..*(..))");
        
        // create a signature to be used with the pointcut
        CodeSignature codeSignature = new CodeSignature(null, "void method(int, int)", null);
        
        // check if the signature matches the pointcut
        boolean matches = pointcut.matches(codeSignature, Test.class);
        System.out.println("Signature matches pointcut: " + matches);
    }
}