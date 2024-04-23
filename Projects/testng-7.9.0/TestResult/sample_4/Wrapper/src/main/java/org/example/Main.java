package org.example;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;
import java.util.logging.Logger;

public class Main extends TestListenerAdapter {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    @Test
    void test() {
        System.out.println("Hello world");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        super.onTestSuccess(tr);
        logger.info("Test " + tr.getName() + " PASSED.");
    }

    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        logger.warning("Test " + tr.getName() + " FAILED.");
    }
}