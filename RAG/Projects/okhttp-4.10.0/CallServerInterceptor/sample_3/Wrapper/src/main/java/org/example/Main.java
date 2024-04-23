package org.example;


import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        Interceptor interceptor = new Interceptor() {
            @Override public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                // do something with the request
                return chain.proceed(request);
            }
        };
    }
}