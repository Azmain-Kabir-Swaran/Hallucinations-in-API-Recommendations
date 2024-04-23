package org.example;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

class MyTestSubject {
    public String myMethod() {
        return "Hello";
    }
}