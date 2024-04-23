package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Main {

  @Test
  public void testNGTest1() {
    Assert.assertEquals(2,2);
  }

  @BeforeTest
  public void beforeTest() {
    System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
    System.out.println("After Test");
  }
}