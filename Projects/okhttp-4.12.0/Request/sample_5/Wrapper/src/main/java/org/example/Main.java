package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3response;
import java.io.*;

public class Main {
    private static final OkHttpClient client = new OkHttpClient();

    public static void main(String args[]) throws IOException {
        String url = "http://www.google.com";
        run(url);
    }

    public static void run(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            System.out.println(response.body().string());
        }
    }
}