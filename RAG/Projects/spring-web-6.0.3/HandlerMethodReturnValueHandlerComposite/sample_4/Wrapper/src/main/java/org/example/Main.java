package org.example;


import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.HandlerMethodReturnValueHandlerComposite;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;

public class Main {
    public static void main(String[] args) {
        // Create RequestMappingHandlerMapping instance
        RequestMappingHandlerMapping requestMappingHandlerMapping = new RequestMappingHandlerMapping();
        
        // Get the HandlerMethodReturnValueHandlerComposite instance
        HandlerMethodReturnValueHandlerComposite returnValueHandler = requestMappingHandlerMapping.getReturnValueHandlers();
        
        // Now you can use returnValueHandler like this
        for (HandlerMethodReturnValueHandler handler : returnValueHandler.getHandlers()) {
            System.out.println(handler.getClass().getName());
        }
    }
}