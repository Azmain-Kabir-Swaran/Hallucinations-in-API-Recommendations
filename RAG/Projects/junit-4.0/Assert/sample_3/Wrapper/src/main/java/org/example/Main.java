package org.example;


import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        String expected = "JUnit";
        String actual = "JUnit";

        Assert.assertEquals(expected, actual);
    }
}