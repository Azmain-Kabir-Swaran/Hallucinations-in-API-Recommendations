package org.example;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

class MyClass {
    @Min(10)
    private int number;

    public MyClass(int number) {
        this.number = number;
    }
}