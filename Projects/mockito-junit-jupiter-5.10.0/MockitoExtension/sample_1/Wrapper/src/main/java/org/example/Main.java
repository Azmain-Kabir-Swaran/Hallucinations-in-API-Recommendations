package org.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Main {
   @Mock
   private ArrayList mockedList;

   public void testSomething() {
      mockedList.add("one");
      verify(mockedList).add("one");
      int size = mockedList.size();
      assertEquals(1, size);
   }
}