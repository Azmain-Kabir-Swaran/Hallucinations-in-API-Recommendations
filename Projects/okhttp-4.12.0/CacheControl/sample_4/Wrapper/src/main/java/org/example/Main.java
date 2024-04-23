package org.example;


import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp33.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class Main {

    public static final String URL = "http://example.com";

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        CacheControl cacheControl = new CacheControl.Builder().maxStale(60, TimeUnit.SECONDS).build();

        Request request = new Request.Builder().cacheControl(cacheControl).url(URL).build();

        Call call = client.newCall(request);

        try {
            Response response = call.execute();

            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response);
            }

            System.out.println(response.body().string());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}