package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class MainTest {
    @Test
    public void testDoSomething() {
        Main main = new Main();
        Instant start = Instant.now();

        main.doSomething();

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        // This test is expected to be much faster than a second, even if the method under test actually takes a second to complete.
        // The time difference should only be a couple of hundredths of a second, or in some cases, much less than that.
        // The failure will be due to assertion, not due to the execution time.
        org.junit.Assert.assertTrue(timeElapsed < 1000);
    }
}