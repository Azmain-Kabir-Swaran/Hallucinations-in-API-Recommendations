package org.example;


import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Set up the OkHttpClient
        OkHttpClient client = new OkHttpClient();

        // Prepare the request to send
        Request request = new Request.Builder()
                .url("http://publicobject.org/helloworld.txt")
                .build();

        try {
            // Send the request
            Response response = client.newCall(request).execute();

            // Check the response
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            // Extract the body
            String body = response.body().string();
            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}