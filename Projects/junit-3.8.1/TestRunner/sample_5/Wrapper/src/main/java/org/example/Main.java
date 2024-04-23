package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.lang.Exception;

public class Main {

    // A sample test class
    public static class SampleTest {
        @Test
        public void testMethod() {
            System.out.println("Testing sample test method");
            // Add your test logic here
        }
    }

    public static void main(String[] args) throws Exception {
        // Run the tests
        Result result = JUnitCore.runClasses(SampleTest.class);
        System.out.println("Tests run: " + result.getRunCount() + ", Failures: " + result.getFailureCount());

        // If tests failed, throw an exception
        if(result.getFailureCount() > 0) {
            throw new Exception("Tests failed");
        }
    }
}