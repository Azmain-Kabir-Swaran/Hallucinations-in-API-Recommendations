package org.example;

import org.easymock.EasyMockSupport;
import org.easymock.EasyMock;
import org.easymock.Mock;

public class Main extends EasyMockSupport {
  
    private Calculator calculator;
  
    @Mock
    private Calculator calculator;

    public void setUp() {
        EasyMock.reset(calculator);
        replayAll();
    }

    public void testAdd() {
        // Setting up the expectation
        EasyMock.expect(calculator.add(10, 20)).andReturn(30);
        // Replay all
        replayAll();
        
        // Testing the code
        int result = calculator.add(10, 20);
        
        // Verifying if expectation was met
        verifyAll();

        // Validating results
        assertEquals(30, result);
    }
}