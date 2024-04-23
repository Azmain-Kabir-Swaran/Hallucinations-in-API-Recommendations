package org.example;


import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {
    public static void main(String[] args) {
        // Main logic here
    }
}
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTest {
    @Test
    public void testMain() {
        // Test Logic here
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MainTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Result : " + result.wasSuccessful());
    }
}