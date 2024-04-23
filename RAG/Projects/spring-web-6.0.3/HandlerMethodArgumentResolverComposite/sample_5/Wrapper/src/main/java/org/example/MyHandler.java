package org.example;

import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

class MyHandler implements HandlerMethodArgumentResolver {
    @Autowired
    private MyService myService;

    public boolean supportsParameter(MethodParameter parameter) {
        return MyService.class.equals(parameter.getParameterType());
    }

    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
            NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return myService;
    }
}