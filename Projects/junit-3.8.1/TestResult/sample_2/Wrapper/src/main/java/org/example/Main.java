package org.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.TestResult;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.Test;

public class Main {

    private TestResult testResult;

    @Before
    public void setUp() {
        testResult = new TestResult();
    }

    @Test
    public void testAddition() {
        int sum = 2 + 3;
        if (sum != 5) {
            testResult.addFailure(new Throwable("Addition test failed"), new Throwable("2 + 3 is not 5"));
        }
        assertTrue(sum == 5);
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Condition is false");
        }
    }
}