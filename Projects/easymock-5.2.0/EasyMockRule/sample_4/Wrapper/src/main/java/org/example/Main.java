package org.example;

import org.easymock.*;
import org.junit.Rule;
import org.junit.Test;

public class Main {
   
   @Rule
   public EasyMockRule mockRule = new EasyMockRule(this);

   @Test
   public void testEasyMock() {
      UserDao mockUserDao = mockRule.mock(UserDao.class);
      expect(mockUserDao.getName()).andReturn("John");
      expect(mockUserDao.getAge()).andReturn(20);
      replay(mockUserDao);

      User user = new User(mockUserDao);
      assertEquals("John", user.getName());
      assertEquals(20, user.getAge());
   }
}