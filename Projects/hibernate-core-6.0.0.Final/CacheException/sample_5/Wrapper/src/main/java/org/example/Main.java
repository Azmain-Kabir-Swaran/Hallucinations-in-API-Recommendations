package org.example;


import org.hibernate.cache.CacheException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new CacheException("Array index out of bounds", e);
        }
    }
}