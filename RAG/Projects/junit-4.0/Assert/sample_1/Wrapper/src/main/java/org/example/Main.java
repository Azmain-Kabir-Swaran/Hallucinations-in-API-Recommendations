package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        Assert.assertEquals(3, add(1, 2));
    }

    private static int add(int a, int b) {
        return a + b;
    }
}