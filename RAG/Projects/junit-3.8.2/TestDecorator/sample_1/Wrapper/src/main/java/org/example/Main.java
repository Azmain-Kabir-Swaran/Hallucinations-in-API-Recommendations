package org.example;

import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class Main {

    @Test(timeout = 5000)
    public void testTimeout() throws Exception {
        Thread.sleep(2000); // This test should fail due to timeout
    }
    
    @Test(expected = ArithmeticException.class)
    public void testException() {
        int i = 1 / 0;
    }
    
    @Test
    public void testAssertions() {
        assertTrue("assertTrue failed: ", true);
        assertEquals("assertEquals failed: ", 5, 5);
        assertThat("assertThat failed: ", 10, allOf(greaterThan(5), lessThan(15)));
        assertFalse("assertFalse failed: ", false);
        fail("This test failed");
    }
}