package org.example;


import static org.junit.Assert.fail;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class Main {

    @Test
    public void testComparison() {
        String expected = "expected";
        String actual = "actual";
        if(!expected.equals(actual)) {
            fail(new ComparisonFailure("testComparison", expected, actual).getMessage());
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.testComparison();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}