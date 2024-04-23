package org.example;


import org.junit.ComparisonFailure;
import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        // test method
        compareIntegers(1, 2);
    }

    public static void compareIntegers(int a, int b) {
        try {
            Assert.assertEquals(a, b);
            System.out.println("Integers are equal");
        } catch (ComparisonFailure ex) {
            System.out.println("Integers are not equal: " + ex.getMessage());
        }
    }
}