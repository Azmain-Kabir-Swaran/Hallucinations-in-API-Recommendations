package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.exampleFunction();
    }

    public String exampleFunction() {
        return "Hello AspectJ";
    }
}