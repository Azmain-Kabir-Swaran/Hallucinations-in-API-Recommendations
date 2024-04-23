package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class Main {
    public static void main(String[] args) {
        User user = new User(null);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        System.out.println("Validation results:");
        for (ConstraintViolation<User> violation : validator.validate(user)) {
            System.out.println(violation.getPropertyPath() + ": " + violation.getMessage());
        }

        factory.close();
    }
}