package org.example;


import okhttp3.*;
import okhttp3.Request;
import okhttp3.Response;
import com.google.gson.Gson;

public class Main {
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {
        Post post = new Post(); // create an instance of post
        Gson gson = new Gson();
        String jsonPost = gson.toJson(post);

        RequestBody requestBody = RequestBody.create(JSON, jsonPost);
        Request request = new Request.Builder()
                .url("https://url-you-want-to-post-to")
                .post(requestBody)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}