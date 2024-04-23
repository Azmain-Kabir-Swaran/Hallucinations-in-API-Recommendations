package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.CaffeineSpec;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class Main {

    public static void main(String[] args) {
        // Parse Caffeine Spec (like "initialCapacity=100, maximumSize=500, expireAfterAccess=60s")
        String spec = "initialCapacity=100, maximumSize=500, expireAfterAccess=60s";
        Caffeine<Object, Object> parser = Caffeine.from(CaffeineSpec.parse(spec));

        // Generate a Cache
        ConcurrentMap<Integer, String> cache = parser.build();

        // Use cache
        cache.put(1, "one");
        System.out.println(cache.get(1)); // Print: one

        // Clear cache
        cache.clear();

        // Adding another object
        cache.put(2, "two");
        System.out.println(cache.get(2)); // Print: two
    }
}