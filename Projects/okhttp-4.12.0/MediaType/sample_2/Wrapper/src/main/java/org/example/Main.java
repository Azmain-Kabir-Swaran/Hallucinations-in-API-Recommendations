package org.example;


import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

public class Main {

    public static void main(String[] args) {
        MediaType mediaType = MediaType.get("text/plain; charset=utf-8");
        Request request = new Request.Builder()
                .url("https://example.com")
                .post(RequestBody.create(mediaType, "body"))
                .build();
        
        System.out.println(request);
    }
}