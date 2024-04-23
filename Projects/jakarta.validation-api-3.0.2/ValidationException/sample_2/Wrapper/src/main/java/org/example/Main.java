package org.example;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        try {
            validateInput("Hello");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateInput(String input) throws ValidationException {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<String>> violations = validator.validate(input, MaxLength.class);

        if(!violations.isEmpty()) {
            throw new ValidationException("Input validation failed. Input exceeds max length");
        }
    }
}