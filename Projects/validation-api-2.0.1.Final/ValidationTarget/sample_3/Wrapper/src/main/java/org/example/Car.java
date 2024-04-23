package org.example;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.groups.Default;

class Car {
    @NotNull
    String color;
}