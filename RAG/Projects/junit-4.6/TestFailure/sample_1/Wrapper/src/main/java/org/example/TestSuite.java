package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import java.util.Arrays;
import java.util.List;

public class TestSuite {
    public static void main(String args[]) throws InitializationError {
        JUnitCore runner = new JUnitCore();
        List<Failure> failures = runner.run(TestSuite.class);
        for (Failure failure : failures) {
            System.out.println(failure.getTestHeader() + ": " + failure.getMessage());
        }
        if (failures.isEmpty()) {
            System.out.println("All tests passed");
        }
    }
}