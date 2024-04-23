package org.example;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        JUnitCore junit = new JUnitCore();
        Result result = junit.run(TestClass.class);

        System.out.println("Test results:");
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getTestHeader() + ": " + failure.getMessage());
        }

        System.out.println("Tests ran: " + result.runCount());
        System.out.println("Successes: " + result.wasSuccessful());
    }
}