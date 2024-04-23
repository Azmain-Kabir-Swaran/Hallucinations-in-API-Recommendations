package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {
   @Test
   public void testSample() {
      Assert.assertTrue(true);
   }
   
   @Test
   public void testSample2() {
      Assert.assertEquals("Testing Sample 2", 1, 1);
   }
   
   public static void main(String args[]) {
      // The JUnit test runner will automatically find and run all the tests in this class.
   }
}