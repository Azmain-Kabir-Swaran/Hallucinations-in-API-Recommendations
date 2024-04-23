package org.example;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class CallServerInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        // Your code to modify the request or response 
        // here, for example adding a header:
        request = request.newBuilder().addHeader("headerName", "headerValue").build();

        return chain.proceed(request);
    }
}