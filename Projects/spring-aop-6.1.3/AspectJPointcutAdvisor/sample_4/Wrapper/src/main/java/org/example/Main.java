package org.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.AspectJPointcutAdvisor;

public class Main {
    
    AspectJPointcutAdvisor advisor = new AspectJPointcutAdvisor();

    public static void main(String[] args) {
        // Your main method here
    }

    @Before("execution(* your.specific.package.*.*(..))")
    public void advise(){
        // Your advise method here
    }
}