package org.example;


import org.springframework.web.method.HandlerMethod;

public class Main {
    public static void main(String[] args) {
        HandlerMethod handlerMethod = new HandlerMethod(new Object(), "methodName");
        System.out.println("The HandlerMethod is: " + handlerMethod);
    }
}