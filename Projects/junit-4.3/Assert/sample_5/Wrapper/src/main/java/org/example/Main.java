package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        int num1 = 5, num2 = 3;
        int sum = num1 + num2;
        Assert.assertEquals(8, sum); //This asserts that the sum of num1 and num2 is equal to 8. If not, an AssertionFailedError will be thrown.
        System.out.println("Sum is " + sum);
    }
}