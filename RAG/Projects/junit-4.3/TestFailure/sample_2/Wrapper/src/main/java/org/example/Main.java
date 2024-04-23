package org.example;


import org.junit.Assert;
import org.junit.Test;

public class Main {
    
    @Test
    public void test() {
        Assert.assertEquals(4, 2 + 2);
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (AssertionError e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }

    public static void test() {
        Assert.assertEquals(4, 2 + 2);
    }
}