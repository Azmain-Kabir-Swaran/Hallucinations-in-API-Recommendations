package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3Response;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://publicobject.org/helloworld.txt")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}