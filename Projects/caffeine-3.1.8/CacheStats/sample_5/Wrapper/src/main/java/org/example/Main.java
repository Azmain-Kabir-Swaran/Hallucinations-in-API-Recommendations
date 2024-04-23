package org.example;


import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.stats.CacheStats;

public class Main {

  public static void main(String[] args) {
    Cache<String, Integer> cache = Caffeine.newBuilder().maximumSize(100).build();
    
    for (int i = 0; i < 50; i++) {
      cache.get("key-" + i, k -> computeValue());
    }

    CacheStats stats = cache.stats();
    
    System.out.println("Cache stats: " + stats);
  }

  private static int computeValue() {
    try {
      Thread.sleep(50);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return 42;
  }
}