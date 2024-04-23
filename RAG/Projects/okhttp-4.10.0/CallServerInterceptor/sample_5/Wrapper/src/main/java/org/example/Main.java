package org.example;


import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Prepare your OkHttpClient instance
        OkHttpClient client = new OkHttpClient.Builder()
                // Add the CallServerInterceptor to your OkHttpClient
                .addInterceptor(new CallServerInterceptor())
                .build();

        // Prepare your Request instance
        Request request = new Request.Builder()
                .url("https://www.google.com")
                .build();

        // Execute the request
        try (Response response = client.newCall(request).execute()) {
            // Use the interceptor to get the response
            System.out.println("Response: " + response);
        }
    }

    // Implement CallServerInterceptor
    private static class CallServerInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            // Print the URL of the request
            System.out.println("Request URL: " + request.url());

            // Let the chain continue
            Response response = chain.proceed(request);

            // Print the response code and message
            System.out.println("Response code: " + response.code() + ", Message: " + response.message());

            return response;
        }
    }
}