package org.example;


import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.easymock.IMocksControl;

public class Main {

    public static void main(String[] args) {

        //Create mocks control object
        IMocksControl mocks = EasyMock.strictControl();

        //Mock a new object using the mocks control object
        Object mockedObject = mocks.mock(Object.class);

        //Start recording
        mocks.startRecording();

        //Here you would add expectations and return values to your mock. 

        mocks.stopRecording();

        //Replay all recorded calls
        mocks.replayAll();

        //Here you would call methods on your mock and test them

        //Verify all recorded calls
        mocks.verifyAll();
    }
}