package org.example;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

public class Main {

    @GetMapping("/test")
    public String handleRequest(NativeWebRequest request) {
        HandlerMethod handlerMethod = (HandlerMethod) request.getHandler();

        if (handlerMethod.getMethod().isAnnotationPresent(GetMapping.class)) {
            GetMapping getMapping = handlerMethod.getMethod().getAnnotation(GetMapping.class);
            for (String value : getMapping.value()) {
                System.out.println("Mapping value: " + value);
            }
        }

        return "Method annotated with @GetMapping received and handled successfully";
    }
}