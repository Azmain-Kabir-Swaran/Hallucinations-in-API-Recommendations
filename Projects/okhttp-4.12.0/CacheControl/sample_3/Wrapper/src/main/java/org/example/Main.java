package org.example;


import okhttp3.*;
import okhttp3.Request;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient.Builder()
                .cache(new Cache(new File("cache"), 1024 * 1024))
                .build();

        Request request = new Request.Builder()
                .url("http://example.com")
                .cacheControl(CacheControl.FORCE_NETWORK)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}