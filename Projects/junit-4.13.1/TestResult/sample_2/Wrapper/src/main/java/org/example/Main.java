package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 7;
        int sum = a + b;
        Assert.assertEquals(12, sum);
    }

    public static void main(String[] args) {
        // This method is not needed for JUnit test cases
    }
}