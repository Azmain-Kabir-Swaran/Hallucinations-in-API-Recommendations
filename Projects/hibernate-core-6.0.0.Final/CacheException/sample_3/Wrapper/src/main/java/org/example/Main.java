package org.example;


import org.hibernate.cache.CacheException;

public class Main {

    public static void main(String[] args) {
        // Create a sample exception
        Throwable exception = new Exception("Sample Cache Exception");

        // Check if it's an Hibernate cache exception
        if (exception instanceof CacheException) {
            CacheException cacheException = (CacheException) exception;
            System.out.println("Caught Hibernate CacheException: " + cacheException.getMessage());
        }
        else {
            System.out.println("Caught exception: " + exception.getMessage());
        }
    }
}