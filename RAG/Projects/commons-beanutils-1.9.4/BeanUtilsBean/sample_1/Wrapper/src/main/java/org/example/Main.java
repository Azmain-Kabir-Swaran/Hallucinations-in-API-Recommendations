package org.example;


import java.lang.reflect.InvocationTargetException;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        // create two person objects
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(30);

        Person person2 = new Person();

        // copy values from person1 to person2 using BeanUtilsBean
        BeanUtilsBean notNull = new BeanUtilsBean(new DateLocaleConverter());
        notNull.copyProperties(person2, person1);

        // print person2's values
        System.out.println("Person2's name: " + person2.getName());
        System.out.println("Person2's age: " + person2.getAge());
    }
}