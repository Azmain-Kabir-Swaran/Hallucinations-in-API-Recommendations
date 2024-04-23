package org.example;


import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        // Test case 1
        int num1 = 5;
        int num2 = 10;
        Assert.assertEquals("Test Case 1 Failed", num1 + num2, 15);
        System.out.println("Test Case 1 Passed");

        // Test case 2
        String str1 = "Hello";
        String str2 = "World";
        Assert.assertEquals("Test Case 2 Failed", str1 + " " + str2, "Hello World");
        System.out.println("Test Case 2 Passed");

        // Test case 3
        boolean condition = true;
        Assert.assertTrue("Test Case 3 Failed", condition);
        System.out.println("Test Case 3 Passed");
    }
}