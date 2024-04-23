package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Call;
import okhttp3.RequestBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // Create a client
        OkHttpClient client = new OkHttpClient().newBuilder()
                                                .connectTimeout(10, TimeUnit.SECONDS)
                                                .writeTimeout(10, TimeUnit
                                                .readTimeout(30, TimeUnit.SECONDS)
                                                .retryOnConnectionFailure(true)
                                                .build();

        // Create a request
        Request request = new Request.Builder()
                .url("https://www.example.com")
                .build();
        
        // Create call
        Call call = client.newCall(request);
        
        try (Response response = call.execute()) {
            // Handle response
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}