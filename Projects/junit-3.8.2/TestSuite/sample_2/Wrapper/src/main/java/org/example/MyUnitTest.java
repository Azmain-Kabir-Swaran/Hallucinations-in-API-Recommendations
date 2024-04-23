package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testMethod() {
        // Here we could test different aspects of our method
        // The Assert class provides static methods to compare the expected result with the actual output
        assertEquals("Not returning expected result", expectedResult, actualResult);
    }

    @Test
    public void testOtherMethod() {
        // Here we could test another method
        assertEquals("This is a test", "This is a test"); // This will pass
    }

}