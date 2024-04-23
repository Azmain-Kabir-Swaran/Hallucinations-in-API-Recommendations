package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.mockito.Mockito.when;

public class Main {

    @Mock
    private SomeDependency dependency;

    @Test
    @PrepareForTest(SomeDependency.class)
    public void test(){

        // mock method
        PowerMockito.mockStatic(SomeDependency.class);
        when(SomeDependency.staticMethod(1)).thenReturn("1");

        // use method
        String result = SomeDependency.staticMethod(1);

        // check result
        org.junit.Assert.assertEquals("1", result);
    }
}