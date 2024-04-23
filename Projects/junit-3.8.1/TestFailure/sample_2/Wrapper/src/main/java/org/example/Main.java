package org.example;


import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.Test;
import junit.framework.TestCase;

public class Main {

    public static void main(String[] args) {
        TestFailure failure = new TestFailure(new SimpleTestCase("testFailure"));
        TestResult result = failure.result();

        if(result.failureCount() > 0) {
            System.out.println("Failure");
        } else {
            System.out.println("No failure");
        }
    }
}