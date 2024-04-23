package org.example;


import okhttp3.*;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Main {
    private static final OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        String url = "http://publicobject.org/helloworld.txt";
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            System.out.println(response.body().string());
        }
    }
}