package org.example;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.stats.CacheStats;
import org.springframework.cache.annotation.Cacheable;

public class Main {

    public static void main(String[] args) {

        Cache<Integer, String> cache = Caffeine.newBuilder()
                .build();

        for (int i = 0; i < 10; i++) {
            cache.put(i, "value" + i);
        }

        CacheStats cacheStats = cache.stats();

        System.out.println("Cache Stats: " + cacheStats);
    }
}