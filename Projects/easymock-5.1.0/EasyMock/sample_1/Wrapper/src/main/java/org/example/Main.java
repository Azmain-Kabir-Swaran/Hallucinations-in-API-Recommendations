package org.example;


import org.easymock.EasyMock;

public class Main {
    
    public static void main(String[] args) {
        // Create mock object
        Object mockObject = EasyMock.createMock(Object.class);

        // Expecting a method
        EasyMock.expect(mockObject.toString()).andReturn("Hello EasyMock");

        // Replay to switch to record mode for the following expect and then automatically switches back to expect mode.
        EasyMock.replay(mockObject);
        
        // Use the mock object
        String result = mockObject.toString();
        System.out.println(result); // it will print "Hello EasyMock"
        
        // Verify that all expectations were matched
        EasyMock.verify(mockObject);
    }
}