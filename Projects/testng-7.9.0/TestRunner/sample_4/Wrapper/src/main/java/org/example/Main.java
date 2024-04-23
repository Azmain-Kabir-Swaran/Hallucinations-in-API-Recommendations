package org.example;


import org.testng.TestRunner;
import org.testng.TestNG;

public class Main {

   public static void main(String[] args) {
      TestNG tng = new TestNG();
      TestRunner testRunner = new TestRunner(tng);
      testRunner.runTest("classpath:your-test-suite.xml");
   }
}