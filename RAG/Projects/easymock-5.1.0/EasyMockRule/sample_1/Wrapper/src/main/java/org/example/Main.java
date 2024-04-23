package org.example;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.junit.Rule;
import org.junit.Test;
import java.util.Random;

public class Main {

    @Rule
    public EasyMockRule mocker = new EasyMockRule(this);

    public class MyClass {
        public int getRandomNumber() {
            return new Random().nextInt();
        }
    }

    @Test
    public void testRandomNumber() {
        MyClass mock = EasyMock.createMock(MyClass.class);
        expect(mock.getRandomNumber()).andReturn(10);
        replay(mock);

        Assert.assertEquals(10, mock.getRandomNumber());
    }
}