package org.example;

import junit.framework.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void testMethod() {
        int num = 10;
        Assert.assertEquals(10, num);
        Assert.assertTrue(num > 0);
        Assert.assertFalse("A string".length() == 0);
    }
}