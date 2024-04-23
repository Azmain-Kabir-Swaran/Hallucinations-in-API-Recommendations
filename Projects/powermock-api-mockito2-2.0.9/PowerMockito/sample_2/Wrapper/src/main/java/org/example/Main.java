package org.example;


import org.junit.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import java.util.Random;

public class Main {

    @PrepareForTest({Random.class})
    @Test
    public void testMockRandomClass() {
        Random random = PowerMockito.mock(Random.class);
        PowerMockito.when(random.nextInt(10)).thenReturn(5);
        // Test code here
    }

    public static void main(String[] args) {
        // Main method to call your test method
        JUnitCore.runClasses(Main.class);
    }
}