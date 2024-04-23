package org.example;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

class Main {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Person person = new Person("", 19);  // person is invalid
        String message = validator.validateProperty(person, "name").get(0).getMessage();
        System.out.println(message);  // Output: name must not be empty
    }
}