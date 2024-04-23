package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.model.TestFailure;
import org.junit.internal.runners.model.TestMethodFailure;

public class Main {
    @Test
    public void testPass() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFail() {
        Assert.assertTrue(false);
    }

    public static void main(String[] args) {
        EachTestNotifier testNotifier = new EachTestNotifier();
        testNotifier.run(new JUnit4.JUnit4TestClassRunner(Main.class));

        for (TestFailure testFailure : testNotifier.getFailures()) {
            System.out.println(testFailure.failedTestHeaderMessage() + " -> " + testFailure.getExceptionMessage());
        }
    }
}