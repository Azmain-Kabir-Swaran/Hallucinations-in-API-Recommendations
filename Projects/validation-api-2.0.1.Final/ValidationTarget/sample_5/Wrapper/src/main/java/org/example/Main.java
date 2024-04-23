package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotNull;

public class Main {

    public static class NumberChecker {

        @NotNull
        public Integer number;

        public NumberChecker(Integer number) {
            this.number = number;
        }

        public boolean isNumberEven() {
            return number % 2 == 0;
        }
    }

    public static void main(String[] args) {
        NumberChecker numberChecker = new NumberChecker(null);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        System.out.println("Is even: " + numberChecker.isNumberEven());
        // Check for validation
        Set<ConstraintViolation<NumberChecker>> violations = validator.validate(numberChecker);
        if (!violations.isEmpty()) {
            for (ConstraintViolation<NumberChecker> violation : violations) {
                System.out.println("Constraint violation: " + violation.getMessage());
            }
        }
    }
}