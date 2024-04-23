package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.CaffeineSpec;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CaffeineSpec spec = CaffeineSpec.parse("initialCapacity=100, maximumSize=500, expireAfterAccess=10, refreshAfterWrite=10");
        var cache = Caffeine.from(spec).build();
        
        // Add keys
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        
        // Get keys
        String value1 = cache.getIfPresent("key1");
        String value2 = cache.getIfPresent("key2");
        
        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);
    }
}