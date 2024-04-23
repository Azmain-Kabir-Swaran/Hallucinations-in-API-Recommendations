package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        String url = "https://example.com/";  // replace this with your URL

        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                System.out.println("Unexpected code " + response);
                return;
            }
            System.out.println("Response: " + response.body().string());  // print the body
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}