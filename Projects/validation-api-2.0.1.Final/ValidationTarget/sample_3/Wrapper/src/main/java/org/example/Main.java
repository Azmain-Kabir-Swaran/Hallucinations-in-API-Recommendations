package org.example;


import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.groups.Default;

public class Main {
    public static void main(String[] args) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Car car = new Car();
        Set<ConstraintViolation<Car>> violations = validator.validate(car, Default.class);
        for (ConstraintViolation<Car> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}