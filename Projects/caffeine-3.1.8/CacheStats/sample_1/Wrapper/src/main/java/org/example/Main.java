package org.example;


import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Cache;

public class Main {
  public static void main(String[] args) {

    Cache<String, String> cache = Caffeine.newBuilder()
      .maximumSize(100)
      .build();

    // Put a value in the cache
    cache.put("key1", "value1");

    // Get a value from the cache
    String value = cache.getIfPresent("key1");
    System.out.println(value); // "value1"
  }
}