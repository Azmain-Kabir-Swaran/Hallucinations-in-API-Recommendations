package org.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class Main {

  @Test
  public void simpleTest() {
    Assert.assertEquals(2, 1 + 1);
  }

  @Test
  public void testFailure() {
    Assert.assertEquals(3, 1 + 1);
  }

  public static void main(String[] args) {
    System.out.println("This is the main method.");
  }
}