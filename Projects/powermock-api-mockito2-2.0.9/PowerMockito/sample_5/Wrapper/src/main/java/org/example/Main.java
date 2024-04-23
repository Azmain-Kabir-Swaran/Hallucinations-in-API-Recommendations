package org.example;

import org.junit.jupiter.api.Test;
import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    @Test
    public void testExternalLib() {
        // Stubs a static method
        mockStatic(ExternalLib.class);
        when(ExternalLib.staticMethod()).thenReturn(1);
        
        // Calling the actual method
        assertEquals(1, ExternalLib.staticMethod());
    }
}