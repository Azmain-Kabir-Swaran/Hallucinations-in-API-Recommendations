package org.example;


import okhttp3.Cache;
import okhttp3.OkHttpClient;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int cacheSize = 10 * 1024 * 1024; // 10 MB
        Cache cache = new Cache(new File("path/to/cache-dir"), cacheSize);

        OkHttpClient client = new OkHttpClient.Builder()
                .cache(cache)
                .build();
    }
}