package org.example;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

public class Main extends EasyMockSupport {
    @Rule
    public EasyMockRule mocks = new EasyMockRule(this);

    @Mock
    private Service service;

    @TestSubject
    private Main main = new Main();

    @Test
    public void myTest() {
        // write your test here...
    }
}