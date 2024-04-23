package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;
import javax.validation.ConstraintViolationException;

public class Main {

    public static class Employee {
        @NotNull(message = "Employee name can't be null")
        private String name;

        public Employee(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Employee emp = new Employee(null);
        
        try {
            validator.validate(emp);
        } catch (ConstraintViolationException e) {
            for (ConstraintViolation<?> violation : e.getConstraintViolations()) {
                System.out.println(violation.getMessage());
            }
        }
    }
}