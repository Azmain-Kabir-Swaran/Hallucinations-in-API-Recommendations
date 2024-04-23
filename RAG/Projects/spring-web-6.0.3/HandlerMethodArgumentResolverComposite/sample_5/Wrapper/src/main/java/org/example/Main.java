package org.example;

import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class Main {
    @Autowired
    private HandlerMethodArgumentResolverComposite resolver;

    @RequestMapping("/example")
    public String example(@RequestParam String param1, @RequestParam String param2) {
        return "Hello World!";
    }
}