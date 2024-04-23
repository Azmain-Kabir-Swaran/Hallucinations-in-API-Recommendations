package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;

public class Main {

    public static void main(String[] args) {

        // Create a Caffeine cache with an initial maximum size of 100 entries
        Cache<String, String> cache = Caffeine.newBuilder().maximumSize(100).build();

        // put some values into the cache
        cache.put("key1", "value1");
        cache.put("key2", "value2");

        // print cache size and hit/miss ratio
        printCacheStats(cache);
    }

    // Utility method to print cache statistics
    private static void printCacheStats(Cache<String, String> cache) {
        CacheStats stats = cache.stats();
        System.out.println("Cache size: " + stats.cacheSize());
        System.out.println("Hit rate: " + stats.hitRate());
        System.out.println("Miss rate: " + stats.missRate());
    }
}