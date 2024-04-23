package org.example;


import org.easymock.EasyMock;

public class Main {
    public static void main(String[] args) {
        // Create a mock object
        IMyInterface myInterface = EasyMock.createMock(IMyInterface.class);

        // Stubbing
        EasyMock.expect(myInterface.someMethod()).andReturn("Some return value");

        // Activate the mock
        EasyMock.replay(myInterface);

        // Now you can call methods on your mock
        System.out.println(myInterface.someMethod());

        // verify your expectations
        EasyMock.verify(myInterface);
    }
}