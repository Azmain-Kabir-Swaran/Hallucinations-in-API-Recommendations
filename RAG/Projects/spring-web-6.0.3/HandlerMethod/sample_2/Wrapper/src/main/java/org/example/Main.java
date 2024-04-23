package org.example;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.handler.HandlerMethodMapping;
import org.springframework.web.server.ServerWebExchange;

public class Main {

    private ServerWebExchange exchange;
    private HandlerMethod handler;

    public Main() {
        this.exchange = ServerWebExchange.from(new HttpServerRequest());
        this.handler = new HandlerMethod(new Object());
    }

    public void getHandlerMethods() {
        HandlerMethodMapping mapping = new HandlerMethodMapping();
        mapping.detectHandlerMethods(this.handler);

        HandlerMethod handlerMethod = new HandlerMethod();

        // Use the mapping to find handler methods
        handlerMethod.getMethod();
    }
}