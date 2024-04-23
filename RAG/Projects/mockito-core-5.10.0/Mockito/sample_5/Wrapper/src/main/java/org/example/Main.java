package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Collection;
import java.util.Collections;

public class Main {
    @Test
    public void testCollectionsIsEmpty() {
        // Mock creation
        Collection mockCollection = mock(Collection.class);
        when(mockCollection.isEmpty()).thenReturn(true);

        // Test the method
        assertEquals(true, Collections.isEmpty(mockCollection));
    }
}