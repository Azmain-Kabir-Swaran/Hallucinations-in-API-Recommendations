package org.example;


import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseWrapper;
import org.apache.http.HttpStatus;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpCoreContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;

public class Main {

    public static void main(String[] args) {
        HttpResponse originalResponse = ... // assume you already have an instance of HttpResponse
        HttpResponseWrapper responseWrapper = new HttpResponseWrapper(originalResponse);

        // use responseWrapper in your code as the HttpResponse instance
        // ...
    }
}