package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Cache<String, String> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(60, TimeUnit.SECONDS)
                .build();
        
        cache.put("key", "value");
        
        CacheStats cacheStats = cache.stats();
        System.out.println("Loaded count: " + cacheStats.loadCount());
        System.outout.println("Cache hits: " + cacheStats.hitCount());
        System.out.println("Cache misses: " + cacheStats.missCount());
        System.out.println("Request count: " + cacheStats.requestCount());
    }
}