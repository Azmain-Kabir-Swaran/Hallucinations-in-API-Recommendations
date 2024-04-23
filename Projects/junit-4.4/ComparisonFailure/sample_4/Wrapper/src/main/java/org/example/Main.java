package org.example;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.ComparisonFailure;

public class Main {

    public static void main(String[] args) {
        try {
            assertEquals("This should pass", 5, 5);
        } catch (ComparisonFailure ex) {
            fail("Comparison failure occurred: " + ex.getMessage());
        }
    }
}