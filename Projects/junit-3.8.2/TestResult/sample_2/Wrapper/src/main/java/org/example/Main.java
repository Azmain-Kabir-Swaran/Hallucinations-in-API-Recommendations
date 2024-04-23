package org.example;


import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a test suite
        ArrayList<Class<?>> suite = new ArrayList<>();

        // Add test cases to the suite
        suite.add(ClassOne.class);
        suite.add(ClassTwo.class);

        // Create a JUnit Core Runner with the given suite
        JUnitCore runner = new JUnitCore();

        // Add the TextListener to show test results
        runner.addListener(new TextListener(System.out));

        // Run the test suite and get the result
        Result result = runner.run(suite.toArray(new Class[suite.size()]));

        // Print the total test run and the number of tests failed
        System.out.println("Tests run: " + result.runCount() + ", Failures: " + result.getFailureCount());

        // Print the failure messages
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}