package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Main extends TestListenerAdapter {

  @Override
  public void onTestStart(ITestResult result) {
    System.out.println("Test started: " + result.getName());
  }

  @Override
  public void onTestFailure(ITestResult result) {
    System.outerr.println("Test failed: " + result.getName());
  }

  @Test
  public void testMethod() {
    Assert.assertTrue(false, "This test should fail");
  }
}