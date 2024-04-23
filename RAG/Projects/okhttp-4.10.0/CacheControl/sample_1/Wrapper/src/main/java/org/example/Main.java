package org.example;


import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .cache(new Cache(new File("/path-to-cache-dir"), 10 * 1024 * 1024)) // 10 MB cache
                .build();
        
        Request request = new Request.Builder()
                .cacheControl(CacheControl.Builder().maxStale(7, TimeUnit.DAYS).build())
                .url("http://publicobject.com/helloworld.txt")
                .build();
        
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            System.out.println(response.body().string());
        }
    }
}