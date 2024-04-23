package org.example;

import org.easymock.*;
import org.junit.Rule;
import org.junit.Test;

class User {
   private UserDao userDao;

   public User(UserDao userDao) {
      this.userDao = userDao;
   }

   public String getName() {
      return userDao.getName();
   }

   public int getAge() {
      return userDao.getAge();
   }
}