package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {

    public static void main(String[] args) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        
        Request request = new Request.Builder()
            .url("https://example.com")  // Change this to your desired url
            .build();

        Response response = client.newCall(request).execute();
        System.out.println("Response from server: " + response.body().string());
    }
}