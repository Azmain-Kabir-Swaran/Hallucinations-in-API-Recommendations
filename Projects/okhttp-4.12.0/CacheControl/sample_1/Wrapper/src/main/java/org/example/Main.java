package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Main {
    OkHttpClient client = new OkHttpClient();

    public void run() throws IOException {
        Request request = new Request.Builder()
                .url("http://publicobject.org/octopage/")
                .cacheControl(CacheControl.Builder()
                        .maxStale(3600, TimeUnit.SECONDS)
                        .build())
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            System.out.println(response.body().string());
        }
    }
}