package org.example;


import org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.http.MediaType;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.http.HttpInputMessage;

public class Main {

    HandlerMethodReturnValueHandlerComposite compositeHandler;

    public Main(HandlerMethodReturnValueHandlerComposite compositeHandler) {
        this.compositeHandler = compositeHandler;
    }

    public void handleReturnValue(Object returnValue,
                                  NativeWebRequest webRequest) {
        this.compositeHandler.handleReturnValue(returnValue, webRequest);
    }

    public static void main(String[] args) {
        Main main = new Main(new HandlerMethodReturnValueHandlerComposite());
        main.handleReturnValue(new Object(), new ServletWebRequest(MediaType.APPLICATION_JSON_VALUE));
    }
}