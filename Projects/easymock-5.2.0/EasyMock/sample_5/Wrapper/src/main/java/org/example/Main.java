package org.example;


import org.easymock.EasyMock;

public class Main {
    public static void main(String[] args) {
        // create mock object of MyService class
        MyService myServiceMock = EasyMock.mock(MyService.class);
        // set expectations
        EasyMock.expect(myServiceMock.addNumbers(1, 2)).andReturn(3);
        EasyMock.expect(myServiceMock.multiplyNumbers(10, 20)).andReturn(200);
        // replay the expectations
        EasyMock.replay(myServiceMock);

        // call methods on the mock object
        int sum = myServiceMock.addNumbers(1, 2);
        int product = myServiceMock.multiplyNumbers(10, 20);

        System.out.println("1 + 2 = " + sum);
        System.out.println("10 * 20 = " + product);

        // verify
        EasyMock.verify(myServiceMock);
    }
}