package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://api.github.com")
                    .build();

            Response response = client.newCall(request).execute();

            System.out.println(response.body().string());

            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}