package org.example;


import org.easymock.EasyMock;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class Main {

    @Test
    public void testMain() {
        // Mocking an object
        IMockObject mockObject = EasyMock.mock(IMockObject.class);
        
        // Setting expectations
        EasyMock.expect(mockObject.getAnswer()).andReturn(42);
        
        // Reset mock and verify expectations
        EasyMock.replay(mockObject);
        
        // Call method to be tested
        int actual = mockObject.getAnswer();
        
        // Check if expected outcome
        assertThat(actual, is(42));
    }
    
    interface IMockObject {
        int getAnswer();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}