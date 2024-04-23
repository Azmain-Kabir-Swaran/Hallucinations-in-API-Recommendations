package org.example;


import java.util.Arrays;
import java.util.List;
import org.springframework.core.MethodParameter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class Main {

    public static void main(String[] args) {
        // You can create a handler method argument resolver here
        MyHandlerMethodArgumentResolver handlerMethodArgumentResolver = new MyHandlerMethodArgumentResolver();

        HandlerMethodArgumentResolverComposite resolvers = new HandlerMethodArgumentResolverComposite();
        resolvers.addResolver(handlerMethodArgumentResolver);

        ModelAndViewContainer modelAndViewContainer = null; // you can pass your ModelAndViewContainer here
        MethodParameter methodParameter = null; // you can pass your MethodParameter here

        // Resolve the argument
        resolvers.resolveArgument(methodParameter, modelAndViewContainer, null, null);
    }

    private static class MyHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

        @Override
        public boolean supportsParameter(MethodParameter parameter) {
            return parameter.getParameterType().equals(String.class);
        }

        @Override
        public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
            return "Hello, World!";
        }
    }
}