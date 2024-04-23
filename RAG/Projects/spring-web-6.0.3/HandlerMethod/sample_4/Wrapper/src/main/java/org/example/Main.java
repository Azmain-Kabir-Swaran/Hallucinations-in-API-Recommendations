package org.example;


import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class Main {
    public static void main(String[] args) {
        // instantiate RequestMappingHandlerMapping and RequestMappingHandlerAdapter
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
        
        // use methods from RequestMappingHandlerMapping and RequestMappingHandlerAdapter 
        // like handling getHandledMethods(), getHandlerMethods(), etc.
    }
}