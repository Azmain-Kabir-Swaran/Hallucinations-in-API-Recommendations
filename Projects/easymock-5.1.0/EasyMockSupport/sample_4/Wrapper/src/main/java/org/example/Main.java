package org.example;


import org.easymock.EasyMockSupport;

public class MockTest extends EasyMockSupport {

    interface MyInterface {
        void method1();
        void method2();
    }

    static class MyClass {
        public void method1() {
            System.out.println("Actual method 1 called");
        }

        public void method2() {
            System.outcalled");
        }
    }

    static class MyClient {
        MyInterface myInterface;

        public void doSomething() {
            myInterface.method1();
            myInterface.method2();
        }
    }

    public static void main(String[] args) {
        MyClass mockedMyClass = createMock(MyClass.class);
        expect(mockedMyClass.method1()).andReturn(null);
        expect(mockedMyClass.method2()).andReturn(null);

        MyClient client = new MyClient();
        client.myInterface = mockedMyClass;
        client.doSomething();

        replayAll();

        verifyAll();
    }
}