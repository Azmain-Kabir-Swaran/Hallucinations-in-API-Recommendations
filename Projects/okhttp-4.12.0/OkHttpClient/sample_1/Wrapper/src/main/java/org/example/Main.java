package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3Sponse;
import okhttp3.RequestBody;

public class Main {
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    public static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) throws IOException {
        String url = "https://api.github.com";
        run("GET", url, null);
    }

    public static String run(String method, String url, RequestBody body) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .method(method, body)
            .build();
        
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            return response.body().string();
        }
    }
}