package org.example;


import org.junit.Assert;
import org.junit.Test;

public class Main {

    @Test
    public void testPositive() {
        Assert.assertThat(2 + 2, org.hamcrest.CoreMatchers.is(4));
    }

    @Test
    public void testNegative() {
        Assert.assertThat(2 + 2, org.hamcrest.CoreMatchers.is(5));
    }

    public static void main(String[] args) {
        // Call JUnit tests
        Test test = new Test();
        test.testPositive();
        test.testNegative();
    }
}