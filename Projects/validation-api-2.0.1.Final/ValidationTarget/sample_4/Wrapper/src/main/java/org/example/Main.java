package org.example;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Set;

public class ValidationTarget {

    @NotEmpty
    private String property;

    @NotNull
    private Integer otherProperty;

    public ValidationTarget(String property, Integer otherProperty) {
        this.property = property;
        this.otherProperty = otherProperty;
    }

    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        ValidationTarget validationTarget = new ValidationTarget("", null);

        Set<ConstraintViolation<ValidationTarget>> violations = validator.validate(validationTarget);

        for (ConstraintViolation<ValidationTarget> violation : violations) {
            System.out.println(violation.getMessage());
        }
    }
}