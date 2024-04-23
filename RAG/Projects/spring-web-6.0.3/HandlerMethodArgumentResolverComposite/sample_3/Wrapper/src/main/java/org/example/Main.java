package org.example;


import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import java.util.ArrayList;
import java.util.List;

public class MyMain {

    public static void main(String[] args) {
        List<HandlerMethodArgumentResolver> resolvers = new ArrayList<>();
        HandlerMethodArgumentResolverComposite composite = new HandlerMethodArgumentResolverComposite();
        composite.addResolvers(resolvers);

        // Your additional code here...
    }
}