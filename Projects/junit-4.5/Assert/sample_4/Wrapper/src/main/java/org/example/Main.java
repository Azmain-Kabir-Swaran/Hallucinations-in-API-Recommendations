package org.example;


import org.junit.Assert;

public class Main {

    public static void main(String[] args) {
        // Test case 1: Equality Check
        Assert.assertEquals("Message", 1, 1);
        
        // Test case 2: Non-Equality Check
        Assert.assertNotEquals("Message", 1, 2);
        
        // Test case 3: Null Check
        String nullString = null;
        Assert.assertNull("Message", nullString);
        
        // Test case 4: Not Null Check
        String notNullString = "Test";
        Assert.assertNotNull("Message", notNullString);
        
        // Test case 5: True Check
        boolean condition = true;
        Assert.assertTrue("Message", condition);
        
        // Test case 6: False Check
        boolean falseCondition = false;
        Assert.assertFalse("Message", falseCondition);
    }
}