package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
  
    @Test
    public void exampleTest() {
        String str = "TestNG";
        Assert.assertEquals(str, "TestNG");
    }
}