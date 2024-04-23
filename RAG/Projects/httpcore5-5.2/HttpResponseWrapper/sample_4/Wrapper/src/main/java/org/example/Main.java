package org.example;


import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.impl.bootstrap.HttpClientBuilder;
import org.apache.hc.core5.http.impl.bootstrap.HttpServerBuilder;
import org.apache.hc.core5.http.io.HttpMessageParserFactory;
import org.apache.hc.core5.http.message.BasicHttpResponse;
import org.apache.hc.core5.http.nio.ContentEncoder;

public class Main {

    public static void main(String[] args) {
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        HttpServerBuilder httpServerBuilder = httpClientBuilder.buildServer();
        ContentEncoder encoder = ContentEncoder.getWireFormat(httpServerBuilder.getHttpEngine(), true, null);
        HttpResponse response = new BasicHttpResponse(null, null, -1);
        HttpMessageParserFactory<HttpResponse> factory = httpServerBuilder.getHttpEngine().getMessageFactory().newHttpResponseParser(encoder);
        HttpResponseWrapper wrapper = new HttpResponseWrapper(response);
        
        // Further usage of the wrapper
    }
}