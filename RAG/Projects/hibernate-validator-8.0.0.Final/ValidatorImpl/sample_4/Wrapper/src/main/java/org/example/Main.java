package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.NotBlank;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        User user = new User();
        user.name = " ";

        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

        for (ConstraintViolation<User> violation : constraintViolations) {
            System.out.println(violation.getMessage());
        }
    }

    static class User {
        @NotBlank(message = "Name cannot be empty")
        String name;
    }
}