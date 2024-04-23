package org.example;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTests.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Number of tests run: " + result.runCount());
        System.out.println("Number of tests failed: " + result.getFailureCount());
        System.out.println("Number of tests ignored: " + result.getIgnoreCount());
    }
}