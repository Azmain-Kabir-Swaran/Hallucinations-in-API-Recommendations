package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

public class Main {

    @Test
    public void testMockPrivateMethod() throws Exception {
        TargetClass target = PowerMockito.mock(TargetClass.class);

        PowerMockito.when(target, "privateMethod", "someArg").thenReturn("mockedOutput");

        String actual = target.privateMethod("someArg");
        Assert.assertEquals("mockedOutput", actual);
    }
}