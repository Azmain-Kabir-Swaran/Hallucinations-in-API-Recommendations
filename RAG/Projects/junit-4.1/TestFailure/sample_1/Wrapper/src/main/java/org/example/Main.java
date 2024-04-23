package org.example;

import org.junit.Test;
import static org.junit.Assert.fail;

public class Main {

  @Test
  public void myTest() {
    try {
      fail("This should fail");
    } catch (Exception e) {
      System.out.println("Exception caught");
      return;
    }
  }
}