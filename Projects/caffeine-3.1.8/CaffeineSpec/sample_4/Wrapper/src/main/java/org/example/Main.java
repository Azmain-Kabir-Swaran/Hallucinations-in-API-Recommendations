package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Creating a CaffeineCache
        CaffeineSpec caffeineSpec = Caffeine.newBuilder()
                .initialCapacity(100)
                .maximumSize(500)
                .expireAfterAccess(10, TimeUnit.SECONDS)
                .build();
    }
}