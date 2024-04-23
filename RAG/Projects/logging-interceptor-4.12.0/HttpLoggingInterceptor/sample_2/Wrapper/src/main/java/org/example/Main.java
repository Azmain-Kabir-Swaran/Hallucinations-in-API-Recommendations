package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(logging)
            .build();

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://example.com")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        YourService yourService = retrofit.create(YourService.class);

        Request request = new Request.Builder()
            .url("https://api.github.com/repos/square/retrofit/issues")
            .build();

        try {
            String response = client.newCall(request).execute().body().string();
            System.out.println(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}