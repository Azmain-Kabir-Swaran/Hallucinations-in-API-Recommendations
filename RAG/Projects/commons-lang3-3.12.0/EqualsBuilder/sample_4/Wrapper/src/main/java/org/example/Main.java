package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("John", "Doe", 30);
        Person person3 = new Person("Jane", "Doe", 20);

        System.out.println(person1.equals(person2)); // Expected output is true
        System.out.println(person1.equals(person3)); // Expected output is false
    }
}