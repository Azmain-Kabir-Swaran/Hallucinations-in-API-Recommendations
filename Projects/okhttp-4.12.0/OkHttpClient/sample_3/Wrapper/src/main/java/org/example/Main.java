package org.example;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.google.common.base.Strings;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        
        Request request = new Request.Builder()
                                    .url("http://example.com")
                                    .build();

        Response response;
        try {
            response = client.newCall(request).execute();
            if (response.isSuccessful() && !Strings.isNullOrEmpty(response.body().string())) {
                System.out.println(response.body().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}