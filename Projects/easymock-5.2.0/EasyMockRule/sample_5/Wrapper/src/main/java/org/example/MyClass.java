package org.example;

import org.easymock.EasyMockRule;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

class MyClass {
    private MyService myService;

    void setMyService(MyService myService) {
        this.myService = myService;
    }

    String myMethodUnderTest() {
        return myService.doSomething();
    }
}