package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MyTestCase extends TestCase {
    
    public MyTestCase(String testName) {
        super(testName);
    }
    
    public void testSomething() {
        Map<String, String> testMap = new HashMap<>();
        testMap.put("testKey", "testValue");
        assertEquals(1, testMap.size());
        assertTrue(testMap.containsKey("testKey"));
        assertEquals("testValue", testMap.get("testKey"));
    }
}