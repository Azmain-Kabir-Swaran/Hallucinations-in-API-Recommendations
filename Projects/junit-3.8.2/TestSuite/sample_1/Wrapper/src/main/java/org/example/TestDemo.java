package org.example;

import junit.framework.*;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestDemo {
     public static Test suite() {
          TestSuite suite = new TestSuite();
          suite.addTest(new TestCase( "testSum") {
              public void testSum(){
                  int a = 2;
                  int b = 3;
                  int expected = 5;
                  assertEquals(expected, a + b);
              }
          });
          return suite;
     }
     public static void main(String args[]) {
         TestRunner.run(suite());
     }
}