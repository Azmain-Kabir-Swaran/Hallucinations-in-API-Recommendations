package org.example;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Toyota", "Corolla");
        Car car3 = new Car("Toyota", "Celica");

        System.out.println(car1.equals(car2)); // Returns true
        System.out.println(car1.equals(car3)); // Returns false
    }
}