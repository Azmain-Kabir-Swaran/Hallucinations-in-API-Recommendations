package org.example;


import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        String expectedResult = "Java";
        String actualResult = "Java";

        // this will pass
        Assert.assertEquals(expectedResult, actualResult);

        expectedResult = "Java";
        actualResult = "Python";

        // this will fail
        Assert.assertEquals(expectedResult, actualResult);
    }
}