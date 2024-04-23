package org.example;


import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create cache directory
        File cacheDir = new File(System.getProperty("java.io.tmpdir"), "okhttp-cache");
        Cache cache = new Cache(cacheDir, 1024); // 1024 * 1024 bytes = 1MiB

        // Create OkHttpClient with the cache
        OkHttpClient client = new OkHttpClient.Builder()
                .cache(cache)
                .build();

        // Define your URL to request
        String url = "https://www.example.com";

        // Create a request
        Request request = new Request.Builder()
                .url(url)
                .build();

        // Make a call using the OkHttpClient
        try {
            Response response = client.newCall(request).execute();

            // Print the response
            System.out.println(response.body().string());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}