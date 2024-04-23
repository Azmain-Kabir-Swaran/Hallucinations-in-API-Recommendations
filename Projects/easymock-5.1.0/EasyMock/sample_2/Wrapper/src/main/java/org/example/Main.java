package org.example;


import org.easymock.EasyMock;

public class Main {

    public interface SomeInterface {
        void aMethod(String s, int i);
        void anotherMethod();
    }

    public static void main(String[] args) {
        SomeInterface mock = EasyMock.createMock(SomeInterface.class);

        mock.aMethod("Hi", 1);
        EasyMock.expectLastCall();

        mock.anotherMethod();
        EasyMock.expectLastCall();

        // call replay method
        EasyMock.replay(mock);

        // use mock here
        mock.aMethod("Hi", 1);
        mock.anotherMethod();

        // verify all expected calls were called
        EasyMock.verify(mock);
    }
}