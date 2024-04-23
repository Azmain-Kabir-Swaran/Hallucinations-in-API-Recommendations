package org.example;


import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;

public class Main {
    @Test
    public void exampleTest() {
        // Test setup
        String expected = "hello world";
        String actual = "hello world";

        // Test assertion
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void anotherTest() {
        // Test setup
        int sum = 2 + 2;
        int expected = 4;

        // Test assertion
        Assert.assertEquals(expected, sum);
    }

    @Test
    public void listTest() {
        // Test setup
        List<String> expectedList = Arrays.asList("one", "two", "three");
        List<String> actualList = Arrays.asList("one", "two", "three");

        // Test assertion
        Assert.assertEquals(expectedList, actualList);
    }

    public static void main(String[] args) {
        // This is the main method.
        // You can add test execution logic here.
        System.out.println("Running JUnit tests in Main...");
        // Add your TestRunner implementation here
        TestRunner.runTests(Main.class);
    }
}