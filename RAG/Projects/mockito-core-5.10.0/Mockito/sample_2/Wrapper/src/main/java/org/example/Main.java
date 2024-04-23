package org.example;

import org.junit.Test;
import org.mockito.*;

public class Main {
    
    // Define a Mockito-powered mock
    @Mock 
    private List<String> mockList;

    // The Mockito.inOrder() function helps to verify the sequence of method calls. 
    @InOrder
    @Mock private MockitoSession session;
    
    @Test
    public void sampleTest() {
        // Create an instance of the class with dependencies
        YourClass testObj = new YourClass(mockList);
        
        // Use the "when"-"then" or "given" APIs to define the behavior of the mock
        // The when(object.method()).thenReturn(value) statement defines a mocked method's expected behavior
        when(mockList.get(0)).thenReturn("mocked");
        
        // Verify the behavior of the mock
        // The verify(object).method() statement ensures a certain behavior
        verify(mockList).get(0);
    }
    
    private static class YourClass {
        
        private List<String> list;
        
        public YourClass(List<String> list) {
            this.list = list;
        }
        
        public String getListValue(int index) {
            return list.get(index);
        }
    }
}